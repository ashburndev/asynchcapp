package ashburncode.asynchcapp;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.DefaultAsyncHttpClientConfig;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.Request;
import org.asynchttpclient.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AsynchcappApplication {

  // https://www.baeldung.com/spring-boot-logging
  // -Dlogging.level.org.springframework=TRACE
  // -Dlogging.level.com.baeldung=TRACE

  static Logger log = LoggerFactory.getLogger(AsynchcappApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(AsynchcappApplication.class, args);
    // System.setProperty("javax.net.debug", "ssl:handshake");

    // String urlString = "http://www.baeldung.com";
    // String urlString = "https://www.google.com";
    // String urlString = "https://start.spring.io";
    // String urlString = "https://start.spring.io/actuator";
    String urlString = "https://start.spring.io/actuator/health";
    String content = createClientAndMakeGetRequest(urlString);
    log.info("  content = " + content);

    log.trace("A TRACE Message");
    log.debug("A DEBUG Message");
    log.info("An INFO Message");
    log.warn("A WARN Message");
    log.error("An ERROR Message");
  }

  private static String createClientAndMakeGetRequest(String urlString) {
    // AsyncHttpClient client = Dsl.asyncHttpClient();
    // AsyncHttpClientConfig config = client.getConfig();
    // DefaultAsyncHttpClientConfig.Builder clientBuilder = Dsl.config();
    String[] protocolArray2 = { "TLSv1.2" };
    String[] protocolArray3 = { "TLSv1.3" };
    String[] protocolArray32 = { "TLSv1.3", "TLSv1.2" };
    List<String> protocolList3 = Arrays.asList(protocolArray3);
    String[] cipherSuiteArray1 = { "TLS_AES_256_GCM_SHA384" };
    // SslContext sslContext = null;
    DefaultAsyncHttpClientConfig.Builder clientBuilder = Dsl.config()
        // .setEnabledProtocols(protocolList)
        // .setEnabledProtocols(protocolArray3)
        // .setEnabledProtocols(cipherSuiteArray)
        // .setEnabledCipherSuites(cipherSuiteArray1)
        // .setSslContext(sslContext)
        // .setSslEngineFactory
        .setConnectTimeout(500);
    // .setProxyServer(new ProxyServer(...));
    AsyncHttpClient client = Dsl.asyncHttpClient(clientBuilder);
    AsyncHttpClientConfig config = client.getConfig();
    showConfigInfo(config);
    Request getRequest = client.prepareGet(urlString).build();

    // Request getRequest = new RequestBuilder(HttpConstants.Methods.GET)
    // .setUrl("http://www.baeldung.com")
    // .build();

    // Request getRequest = Dsl.get(urlString).build();

    // Future<Response> responseFuture = getRequest.execute();
    // responseFuture.get();

    Future<Response> responseFuture = client.executeRequest(getRequest);
    String content = null;
    try {
      Response response = responseFuture.get();
      int statusCode = response.getStatusCode();
      log.info("  statusCode = " + statusCode);
      content = response.getResponseBody();
      // log.info(" content = " + content);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return content;
  }

  public static void showConfigInfo(AsyncHttpClientConfig config) {
    log.info("  config.getAhcVersion() = " + config.getAhcVersion());
    log.info("  config.getUserAgent() = " + config.getUserAgent());
    log.info("  config.getConnectTimeout() = " + config.getConnectTimeout());
    String[] enabledProtocols = config.getEnabledProtocols();
    if (enabledProtocols == null || enabledProtocols.length == 0) {
      log.info("  config.getEnabledProtocols() = " + enabledProtocols);
    } else {
      for (String enabledProtocol : enabledProtocols)
        log.info("  enabledProtocol = " + enabledProtocol);
    }
    String[] enabledCipherSuites = config.getEnabledCipherSuites();
    if (enabledCipherSuites == null || enabledCipherSuites.length == 0) {
      log.info("  config.getEnabledCipherSuites() = " + enabledCipherSuites);
    } else {
      for (String enabledCipherSuite : enabledCipherSuites)
        log.info("  enabledCipherSuite = " + enabledCipherSuite);
    }
  }

}
