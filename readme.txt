 Volume in drive C is OS
 Volume Serial Number is 38E4-68D8

 Directory of C:\Users\DavidHolberton\sbprojs\asynchcapp

06/30/2024  09:02 AM    <DIR>          gradle
06/30/2024  09:02 AM    <DIR>          src
07/14/2024  06:18 PM    <DIR>          ..
07/14/2024  06:19 PM    <DIR>          .
06/30/2024  09:02 AM                32 settings.gradle
06/30/2024  09:02 AM             2,918 gradlew.bat
06/30/2024  09:02 AM             2,414 HELP.md
06/30/2024  09:02 AM             8,706 gradlew
06/30/2024  09:02 AM               444 .gitignore
06/30/2024  09:02 AM             1,169 build.gradle
07/14/2024  06:19 PM                 0 readme.txt
               7 File(s)         15,683 bytes
               4 Dir(s)  488,775,786,496 bytes free
Folder PATH listing for volume OS
Volume serial number is 38E4-68D8
C:.
|   .gitignore
|   build.gradle
|   gradlew
|   gradlew.bat
|   HELP.md
|   readme.txt
|   settings.gradle
|   
+---gradle
|   \---wrapper
|           gradle-wrapper.jar
|           gradle-wrapper.properties
|           
\---src
    +---main
    |   +---java
    |   |   \---ashburncode
    |   |       \---asynchcapp
    |   |               AsynchcappApplication.java
    |   |               
    |   \---resources
    |       |   application.properties
    |       |   
    |       +---static
    |       \---templates
    \---test
        \---java
            \---ashburncode
                \---asynchcapp
                        AsynchcappApplicationTests.java
                        
= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 
= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 

7:15 AM 7/18/2024

= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 

https://start.spring.io
https://start.spring.io/actuator
https://start.spring.io/actuator/health
https://start.spring.io/actuator/info

C:\Users\DavidHolberton>curl https://start.spring.io/actuator/health
{"status":"UP","groups":["liveness","readiness"]}
C:\Users\DavidHolberton>

C:\Users\DavidHolberton>curl -k http://localhost:8080/asynchc/actuator/info
{"java":{"version":"17.0.7","vendor":{"name":"Oracle Corporation"},"runtime":{"name":"Java(TM) SE Runtime Environment","version":"17.0.7+8-LTS-224"},"jvm":{"name":"Java HotSpot(TM) 64-Bit Server VM","vendor":"Oracle Corporation","version":"17.0.7+8-LTS-224"}},"os":{"name":"Windows 11","version":"10.0","arch":"amd64"}}
C:\Users\DavidHolberton>
C:\Users\DavidHolberton>curl -k http://localhost:8080/asynchc/actuator/health
{"status":"UP"}
C:\Users\DavidHolberton>

cd C:\Users\DavidHolberton\sbprojs\
cd C:\Users\DavidHolberton\sbprojs\asynchcapp
cd C:\Users\DavidHolberton\sbprojs\ahcapp

= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 

https://github.com/AsyncHttpClient/async-http-client/blob/main/client/src/main/resources/org/asynchttpclient/config/ahc-default.properties

org.asynchttpclient.userAgent=AHC/2.1
org.asynchttpclient.enabledProtocols=TLSv1.2, TLSv1.1, TLSv1
org.asynchttpclient.enabledCipherSuites=

= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 

cd C:\Users\DavidHolberton\sbprojs\asynchcapp
.\gradlew --version
.\gradlew dependencies
.\gradlew dependencies | findstr /i "async"
.\gradlew dependencies | findstr /i "async" | sort /unique
.\gradlew clean
.\gradlew bootJar
.\gradlew bootRun
dir build\libs
jar tvf build\libs\asynchcapp-0.0.1-SNAPSHOT.jar | findstr -i "async"
jar tvf build\libs\asynchcapp-0.0.1-SNAPSHOT.jar | findstr -i "netty"

java -jar build\libs\asynchcapp-0.0.1-SNAPSHOT.jar
java -Djavax.net.debug=ssl:handshake -jar build\libs\asynchcapp-0.0.1-SNAPSHOT.jar

java -Djavax.net.debug=ssl:handshake -jar build\libs\asynchcapp-0.0.1-SNAPSHOT.jar > startspringio-20240718a.txt 2>&1
java -Dorg.asynchttpclient.enabledProtocols=TLSv1.3 -Djavax.net.debug=ssl:handshake -jar build\libs\asynchcapp-0.0.1-SNAPSHOT.jar > startspringio-20240718b.txt 2>&1
java -Dorg.asynchttpclient.enabledProtocols=TLSv1.2 -Djavax.net.debug=ssl:handshake -jar build\libs\asynchcapp-0.0.1-SNAPSHOT.jar > startspringio-20240718c.txt 2>&1
java -Dorg.asynchttpclient.enabledProtocols=TLSv1.3 -Dorg.asynchttpclient.enabledCipherSuites=TLS_AES_256_GCM_SHA384 -Djavax.net.debug=ssl:handshake -jar build\libs\asynchcapp-0.0.1-SNAPSHOT.jar > startspringio-20240718d.txt 2>&1
java -Dorg.asynchttpclient.enabledProtocols=TLSv1.3,TLSv1.2 -Djavax.net.debug=ssl:handshake -jar build\libs\asynchcapp-0.0.1-SNAPSHOT.jar > startspringio-20240718e.txt 2>&1

C:\Users\DavidHolberton\sbprojs\asynchcapp>dir /o:gd
 Volume in drive C is OS
 Volume Serial Number is 38E4-68D8

 Directory of C:\Users\DavidHolberton\sbprojs\asynchcapp

06/30/2024  09:02 AM    <DIR>          gradle
06/30/2024  09:02 AM    <DIR>          src
07/14/2024  08:45 PM    <DIR>          ..
07/18/2024  07:24 AM    <DIR>          .vscode
07/18/2024  07:36 AM    <DIR>          .gradle
07/18/2024  07:54 AM    <DIR>          build
07/18/2024  10:29 AM    <DIR>          .
06/30/2024  09:02 AM                32 settings.gradle
06/30/2024  09:02 AM             2,918 gradlew.bat
06/30/2024  09:02 AM             2,414 HELP.md
06/30/2024  09:02 AM             8,706 gradlew
06/30/2024  09:02 AM               444 .gitignore
07/14/2024  06:19 PM             1,556 readme.txt
07/18/2024  07:24 AM             1,656 build.gradle
07/18/2024  08:53 AM            23,293 startspringio-20240718a.txt
07/18/2024  08:54 AM            25,134 startspringio-20240718b.txt
07/18/2024  08:54 AM            22,330 startspringio-20240718c.txt
07/18/2024  10:35 AM            25,421 startspringio-20240718d.txt
07/18/2024  10:35 AM            29,005 startspringio-20240718e.txt
              12 File(s)        142,909 bytes
               7 Dir(s)  483,150,147,584 bytes free

C:\Users\DavidHolberton\sbprojs\asynchcapp>

= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 

C:\Users\DavidHolberton\sbprojs\asynchcapp>.\gradlew --version

------------------------------------------------------------
Gradle 8.8
------------------------------------------------------------

Build time:   2024-05-31 21:46:56 UTC
Revision:     4bd1b3d3fc3f31db5a26eecb416a165b8cc36082

Kotlin:       1.9.22
Groovy:       3.0.21
Ant:          Apache Ant(TM) version 1.10.13 compiled on January 4 2023
JVM:          17.0.7 (Oracle Corporation 17.0.7+8-LTS-224)
OS:           Windows 11 10.0 amd64

C:\Users\DavidHolberton\sbprojs\asynchcapp>dir /o:gd
 Volume in drive C is OS
 Volume Serial Number is 38E4-68D8

 Directory of C:\Users\DavidHolberton\sbprojs\asynchcapp

06/30/2024  09:02 AM    <DIR>          gradle
06/30/2024  09:02 AM    <DIR>          src
07/14/2024  08:45 PM    <DIR>          ..
07/18/2024  07:24 AM    <DIR>          .vscode
07/18/2024  07:36 AM    <DIR>          .gradle
07/18/2024  11:59 AM    <DIR>          .
07/18/2024  11:59 AM    <DIR>          build
06/30/2024  09:02 AM                32 settings.gradle
06/30/2024  09:02 AM             2,918 gradlew.bat
06/30/2024  09:02 AM             2,414 HELP.md
06/30/2024  09:02 AM             8,706 gradlew
06/30/2024  09:02 AM               444 .gitignore
07/18/2024  07:24 AM             1,656 build.gradle
07/18/2024  08:53 AM            23,293 startspringio-20240718a.txt
07/18/2024  08:54 AM            25,134 startspringio-20240718b.txt
07/18/2024  08:54 AM            22,330 startspringio-20240718c.txt
07/18/2024  10:35 AM            25,421 startspringio-20240718d.txt
07/18/2024  10:35 AM            29,005 startspringio-20240718e.txt
07/18/2024  11:26 AM            12,127 readme.txt
              12 File(s)        153,480 bytes
               7 Dir(s)  480,922,300,416 bytes free

C:\Users\DavidHolberton\sbprojs\asynchcapp>dir build\libs
 Volume in drive C is OS
 Volume Serial Number is 38E4-68D8

 Directory of C:\Users\DavidHolberton\sbprojs\asynchcapp\build\libs

07/18/2024  11:59 AM    <DIR>          .
07/18/2024  11:59 AM    <DIR>          ..
07/18/2024  11:59 AM        27,099,777 asynchcapp-0.0.1-SNAPSHOT.jar
               1 File(s)     27,099,777 bytes
               2 Dir(s)  480,922,103,808 bytes free

C:\Users\DavidHolberton\sbprojs\asynchcapp>

= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 

https://mvnrepository.com/artifact/org.asynchttpclient/async-http-client

2.12.3		Central	Mar 27, 2021   transitive dependency on netty 4.1.60.Final
2.12.2		Central	Jan 02, 2021
2.12.1		Central	Apr 08, 2020
2.12.0		Central	Apr 03, 2020
2.11.0		Central	Mar 04, 2020
2.10.5		Central	Feb 07, 2020   transitive dependency on netty 4.1.45.Final
2.10.4		Central	Oct 12, 2019
2.10.3		Central	Sep 27, 2019
2.10.2		Central	Sep 05, 2019
2.10.1		Central	Jun 25, 2019
2.10.0		Central	Jun 03, 2019
2.9.0		Central	May 21, 2019     transitive dependency on netty 4.1.33.Final
2.8.1		Central	Feb 28, 2019
2.8.0		Central	Feb 27, 2019
2.7.0		Central	Jan 24, 2019
2.6.0		Central	Oct 30, 2018     transitive dependency on netty 4.1.30.Final
2.5.4		Central	Oct 05, 2018
2.5.3		Central	Sep 04, 2018
2.5.2		Central	Jul 12, 2018
2.5.1		Central	Jul 11, 2018
2.5.0		Central	Jul 11, 2018
2.4.9		Central	Jun 04, 2018     transitive dependency on netty 4.1.25.Final
2.4.8		Central	May 29, 2018
2.4.7		Central	Apr 29, 2018
2.4.6		Central	Apr 29, 2018
2.4.5		Central	Apr 06, 2018
2.4.4		Central	Mar 08, 2018
2.4.3		Central	Feb 27, 2018
2.4.2		Central	Feb 21, 2018
2.4.1		Central	Feb 16, 2018
2.4.0		Central	Feb 12, 2018
2.3.0		Central	Feb 05, 2018
2.2.1		Central	Jan 29, 2018
2.2.0		Central	Jan 22, 2018
2.1.2		Central	Jan 18, 2018
2.1.1		Central	Jan 18, 2018     transitive dependency on netty 4.1.19.Final

= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 

use vscode to search for TLS_AES_256_GCM_SHA384

6 results - 4 files

startspringio-20240718b.txt:
  42    "session id"          : "599BF45D446EA238D10E2510C3348A58EE44F3F80547A5C9C1CD665BA850F1F0",
  43:   "cipher suites"       : "[TLS_AES_128_GCM_SHA256(0x1301), TLS_AES_256_GCM_SHA384(0x1302)]",
  44    "compression methods" : "00",

startspringio-20240718d.txt:
   25  2024-07-18T10:35:14.507-04:00  INFO 11992 --- [asynchcapp] [           main] a.asynchcapp.AsynchcappApplication       :   enabledProtocol = TLSv1.3
   26: 2024-07-18T10:35:14.507-04:00  INFO 11992 --- [asynchcapp] [           main] a.asynchcapp.AsynchcappApplication       :   enabledCipherSuite = TLS_AES_256_GCM_SHA384
   27  javax.net.ssl|DEBUG|30|Finalizer|2024-07-18 10:35:14.556 EDT|SSLSocketImpl.java:577|duplex close of SSLSocket

   42    "session id"          : "59B9BD6024957C75DF8743A3C1AB2B1EE849657AE82908104B23683FD624C36A",
   43:   "cipher suites"       : "[TLS_AES_256_GCM_SHA384(0x1302)]",
   44    "compression methods" : "00",

  101    "session id"          : "59B9BD6024957C75DF8743A3C1AB2B1EE849657AE82908104B23683FD624C36A",
  102:   "cipher suite"        : "TLS_AES_256_GCM_SHA384(0x1302)",
  103    "compression methods" : "00",

startspringio-20240718e.txt:
  44    "session id"          : "77F58B5C1A2AAFCC9351DF0482C74D760B1D61BC2DD790E7232FFA143CFF9B9B",
  45: ⟪ 257 characters skipped ⟫C013), TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA(0xC014), TLS_RSA_WITH_AES_128_GCM_SHA256(0x009C), TLS_RSA_WITH_AES_128_CBC_SHA(0x002F), TLS_RSA_WITH_AES_256_CBC_SHA(0x0035), TLS_AES_128_GCM_SHA256(0x1301), TLS_AES_256_GCM_SHA384(0x1302)]",
  46    "compression methods" : "00",

src\main\java\ashburncode\asynchcapp\AsynchcappApplication.java:
  53  		List<String> protocolList3 = Arrays.asList(protocolArray3);
  54: 		String[] cipherSuiteArray1 = { "TLS_AES_256_GCM_SHA384" };
  55  		// SslContext sslContext = null;

= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 
= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 

7:25 AM 7/19/2024

= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 

cd C:\Users\DavidHolberton\sbprojs\asynchcapp
.\gradlew dependencies > asynchcapp-dependencies-20240719.txt

Microsoft Windows [Version 10.0.22631.3880]
(c) Microsoft Corporation. All rights reserved.

C:\Users\DavidHolberton>
C:\Users\DavidHolberton>cd C:\Users\DavidHolberton\sbprojs\asynchcapp

C:\Users\DavidHolberton\sbprojs\asynchcapp>.\gradlew dependencies > asynchcapp-dependencies-20240719.txt
C:\Users\DavidHolberton\sbprojs\asynchcapp>code .

C:\Users\DavidHolberton\sbprojs\asynchcapp>dir /o:gd
 Volume in drive C is OS
 Volume Serial Number is 38E4-68D8

 Directory of C:\Users\DavidHolberton\sbprojs\asynchcapp

06/30/2024  09:02 AM    <DIR>          src
06/30/2024  09:02 AM    <DIR>          gradle
07/14/2024  08:45 PM    <DIR>          ..
07/18/2024  07:24 AM    <DIR>          .vscode
07/18/2024  07:36 AM    <DIR>          .gradle
07/18/2024  11:59 AM    <DIR>          build
07/19/2024  07:28 AM    <DIR>          .
06/30/2024  09:02 AM                32 settings.gradle
06/30/2024  09:02 AM               444 .gitignore
06/30/2024  09:02 AM             8,706 gradlew
06/30/2024  09:02 AM             2,918 gradlew.bat
06/30/2024  09:02 AM             2,414 HELP.md
07/18/2024  07:24 AM             1,656 build.gradle
07/18/2024  08:53 AM            23,293 startspringio-20240718a.txt
07/18/2024  08:54 AM            25,134 startspringio-20240718b.txt
07/18/2024  08:54 AM            22,330 startspringio-20240718c.txt
07/18/2024  10:35 AM            25,421 startspringio-20240718d.txt
07/18/2024  10:35 AM            29,005 startspringio-20240718e.txt
07/19/2024  07:28 AM            60,488 asynchcapp-dependencies-20240719.txt
07/19/2024  07:32 AM            12,198 readme.txt
              13 File(s)        214,039 bytes
               7 Dir(s)  484,189,822,976 bytes free

C:\Users\DavidHolberton\sbprojs\asynchcapp>
C:\Users\DavidHolberton\sbprojs\asynchcapp>findstr -i "async" build.gradle
  // https://mvnrepository.com/artifact/org.asynchttpclient/async-http-client/2.12.3
  // https://mvnrepository.com/artifact/org.asynchttpclient/async-http-client
  // implementation 'org.asynchttpclient:async-http-client:2.12.3'
  // https://mvnrepository.com/artifact/org.asynchttpclient/async-http-client/2.1.1
  // https://mvnrepository.com/artifact/org.asynchttpclient/async-http-client
  implementation 'org.asynchttpclient:async-http-client:2.1.1'

C:\Users\DavidHolberton\sbprojs\asynchcapp>

= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 


