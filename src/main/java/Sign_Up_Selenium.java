import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


   public class Sign_Up_Selenium {
       public static void main(String[] args) {
           System.setProperty("webdriver.gecko.driver", "./src/main/resources/browsers/geckodriver.exe");

           // WebDriver driver = new HtmlUnitDriver();
           WebDriver driver = new FirefoxDriver();
           String text_case_id_01 = "TC-001.01";
           String text_case_id_02 = "TC-001.02";
           String text_case_id_03 = "TC-001.03";
           String text_case_id_04 = "TC-001.04";
           String text_case_id_05 = "TC-001.05";
           String url = "http://alex.academy/exercises/signup/v1/";
           String title_sign_up_expected = "Welcome to Sign Up";
           String title_facebook_expected = "Welcome to Facebook - Log In, Sign Up or Learn More";
           String error_fname_empty_expected = "Please enter First Name";
           String fname = "Alex";
           String lname = "Moore";
           String email = "alexmoore@gmail.com";
           String phone = "415 555-1212";
           // TC-001.01

           driver.get(url);
           driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

           String title_sign_up_actual = driver.getTitle();

           if (title_sign_up_expected.equals(title_sign_up_actual)) {
               System.out.println("Test Case ID: \t\t" + text_case_id_01
                       + " - PASSED");
               System.out.println("Title Expected/Actual: \t"
                       + title_sign_up_expected + "/" + title_sign_up_actual);
               System.out.println("=======================================");
           } else {
               System.out.println("Test Case ID: \t\t" + text_case_id_01
                       + " - FAILED");
               System.out.println("Title Expected/Actual: \t"
                       + title_sign_up_expected + "/" + title_sign_up_actual);
               System.out.println("=======================================");
           }

           // TC-001.02

           driver.findElement(By.id("id_img_facebook")).click();
           driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
           ArrayList<String> allTabs = new ArrayList<String>(
                   driver.getWindowHandles());
           driver.switchTo().window(allTabs.get(1));
           String title_facebook_actual = driver.getTitle();
           driver.close();
           driver.switchTo().window(allTabs.get(0));

           if (title_facebook_expected.equals(title_facebook_actual)) {
               System.out.println("Test Case ID: \t\t" + text_case_id_02
                       + " - PASSED");
               System.out.println("Title Expected/Actual: \t"
                       + title_facebook_expected + "/" + title_facebook_actual);
               System.out.println("=======================================");
           } else {
               System.out.println("Test Case ID: \t\t" + text_case_id_02
                       + " - FAILED");
               System.out.println("Title Expected/Actual: \t"
                       + title_facebook_expected + "/" + title_facebook_actual);
               System.out.println("=======================================");
           }

           // TC-001.03

           driver.findElement(By.id("id_quotes")).getText();
           String quote = driver.findElement(By.id("id_quotes")).getText();
           if (quote != null && quote.length() < 103 && quote.length() > 36) {
               System.out.println("Test Case ID: \t\t" + text_case_id_03
                       + " - PASSED");
               System.out.println("Quote length: " + quote.length());
               System.out.println("=======================================");
           } else {
               System.out.println("Test\"C:\\Program Files\\Java\\jdk1.8.0_112\\bin\\java\" -Didea.launcher.port=7533 \"-Didea.launcher.bin.path=C:\\Program Files (x86)\\JetBrains\\IntelliJ IDEA Community Edition 2016.3.2\\bin\" -Dfile.encoding=UTF-8 -classpath \"C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\charsets.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\deploy.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\access-bridge-64.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\cldrdata.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\dnsns.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\jaccess.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\jfxrt.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\localedata.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\nashorn.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\sunec.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\sunjce_provider.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\sunmscapi.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\sunpkcs11.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\ext\\zipfs.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\javaws.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\jce.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\jfr.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\jfxswt.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\jsse.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\management-agent.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\plugin.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\resources.jar;C:\\Program Files\\Java\\jdk1.8.0_112\\jre\\lib\\rt.jar;C:\\Users\\Stepa\\IdeaProjects\\HM45\\target\\classes;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-server\\3.0.1\\selenium-server-3.0.1.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-java\\3.0.1\\selenium-java-3.0.1.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\3.0.1\\selenium-chrome-driver-3.0.1.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-remote-driver\\3.0.1\\selenium-remote-driver-3.0.1.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-api\\3.0.1\\selenium-api-3.0.1.jar;C:\\Users\\Stepa\\.m2\\repository\\cglib\\cglib-nodep\\3.2.4\\cglib-nodep-3.2.4.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\apache\\commons\\commons-exec\\1.3\\commons-exec-1.3.jar;C:\\Users\\Stepa\\.m2\\repository\\com\\google\\code\\gson\\gson\\2.3.1\\gson-2.3.1.jar;C:\\Users\\Stepa\\.m2\\repository\\com\\google\\guava\\guava\\19.0\\guava-19.0.jar;C:\\Users\\Stepa\\.m2\\repository\\net\\java\\dev\\jna\\jna-platform\\4.1.0\\jna-platform-4.1.0.jar;C:\\Users\\Stepa\\.m2\\repository\\net\\java\\dev\\jna\\jna\\4.1.0\\jna-4.1.0.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-edge-driver\\3.0.1\\selenium-edge-driver-3.0.1.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-firefox-driver\\3.0.1\\selenium-firefox-driver-3.0.1.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-ie-driver\\3.0.1\\selenium-ie-driver-3.0.1.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-opera-driver\\3.0.1\\selenium-opera-driver-3.0.1.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-safari-driver\\3.0.1\\selenium-safari-driver-3.0.1.jar;C:\\Users\\Stepa\\.m2\\repository\\io\\netty\\netty\\3.5.7.Final\\netty-3.5.7.Final.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-support\\3.0.1\\selenium-support-3.0.1.jar;C:\\Users\\Stepa\\.m2\\repository\\net\\sourceforge\\htmlunit\\htmlunit\\2.23\\htmlunit-2.23.jar;C:\\Users\\Stepa\\.m2\\repository\\xalan\\xalan\\2.7.2\\xalan-2.7.2.jar;C:\\Users\\Stepa\\.m2\\repository\\xalan\\serializer\\2.7.2\\serializer-2.7.2.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\apache\\commons\\commons-lang3\\3.4\\commons-lang3-3.4.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\apache\\httpcomponents\\httpclient\\4.5.2\\httpclient-4.5.2.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\apache\\httpcomponents\\httpcore\\4.4.4\\httpcore-4.4.4.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\apache\\httpcomponents\\httpmime\\4.5.2\\httpmime-4.5.2.jar;C:\\Users\\Stepa\\.m2\\repository\\commons-codec\\commons-codec\\1.10\\commons-codec-1.10.jar;C:\\Users\\Stepa\\.m2\\repository\\net\\sourceforge\\htmlunit\\htmlunit-core-js\\2.23\\htmlunit-core-js-2.23.jar;C:\\Users\\Stepa\\.m2\\repository\\net\\sourceforge\\htmlunit\\neko-htmlunit\\2.23\\neko-htmlunit-2.23.jar;C:\\Users\\Stepa\\.m2\\repository\\xerces\\xercesImpl\\2.11.0\\xercesImpl-2.11.0.jar;C:\\Users\\Stepa\\.m2\\repository\\xml-apis\\xml-apis\\1.4.01\\xml-apis-1.4.01.jar;C:\\Users\\Stepa\\.m2\\repository\\net\\sourceforge\\cssparser\\cssparser\\0.9.20\\cssparser-0.9.20.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\w3c\\css\\sac\\1.3\\sac-1.3.jar;C:\\Users\\Stepa\\.m2\\repository\\commons-io\\commons-io\\2.5\\commons-io-2.5.jar;C:\\Users\\Stepa\\.m2\\repository\\commons-logging\\commons-logging\\1.2\\commons-logging-1.2.jar;C:\\Users\\Stepa\\.m2\\repository\\com\\codeborne\\phantomjsdriver\\1.3.0\\phantomjsdriver-1.3.0.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\eclipse\\jetty\\websocket\\websocket-client\\9.2.15.v20160210\\websocket-client-9.2.15.v20160210.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\eclipse\\jetty\\jetty-util\\9.2.15.v20160210\\jetty-util-9.2.15.v20160210.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\eclipse\\jetty\\jetty-io\\9.2.15.v20160210\\jetty-io-9.2.15.v20160210.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\eclipse\\jetty\\websocket\\websocket-common\\9.2.15.v20160210\\websocket-common-9.2.15.v20160210.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\eclipse\\jetty\\websocket\\websocket-api\\9.2.15.v20160210\\websocket-api-9.2.15.v20160210.jar;C:\\Users\\Stepa\\.m2\\repository\\com\\beust\\jcommander\\1.48\\jcommander-1.48.jar;C:\\Users\\Stepa\\.m2\\repository\\net\\jcip\\jcip-annotations\\1.0\\jcip-annotations-1.0.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\jetty-repacked\\9.2.13.v20160825\\jetty-repacked-9.2.13.v20160825.jar;C:\\Users\\Stepa\\.m2\\repository\\javax\\servlet\\javax.servlet-api\\3.1.0\\javax.servlet-api-3.1.0.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\seleniumhq\\selenium\\htmlunit-driver\\2.23\\htmlunit-driver-2.23.jar;C:\\Users\\Stepa\\.m2\\repository\\org\\yaml\\snakeyaml\\1.15\\snakeyaml-1.15.jar;C:\\Program Files (x86)\\JetBrains\\IntelliJ IDEA Community Edition 2016.3.2\\lib\\idea_rt.jar\" com.intellij.rt.execution.application.AppMain Sign_Up_Selenium\n" +
                       "1485207074065\tgeckodriver\tINFO\tListening on 127.0.0.1:47130\n" +
                       "Jan 23, 2017 1:31:14 PM org.openqa.selenium.remote.ProtocolHandshake createSession\n" +
                       "INFO: Attempting bi-dialect session, assuming Postel's Law holds true on the remote end\n" +
                       "1485207074731\tmozprofile::profile\tINFO\tUsing profile path C:\\Users\\Stepa\\AppData\\Local\\Temp\\rust_mozprofile.BntdgbmRLblm\n" +
                       "1485207074736\tgeckodriver::marionette\tINFO\tStarting browser C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\n" +
                       "1485207074748\tgeckodriver::marionette\tINFO\tConnecting to Marionette on localhost:3490\n" +
                       "1485207076186\tMarionette\tINFO\tListening on port 3490\n" +
                       "Jan 23, 2017 1:31:20 PM org.openqa.selenium.remote.ProtocolHandshake createSession\n" +
                       "INFO: Detected dialect: W3C Case ID: \t\t" + text_case_id_03
                       + " - FAILED");
               assert quote != null;
               System.out.println("Quote length: " + quote.length());
               System.out.println("=======================================");
           }

           // TC-001.04

           driver.findElement(By.id("id_submit_button")).click();
           String error_fname_empty_actual = driver
                   .findElement(By.id("ErrorLine")).getText();

           if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
               System.out.println("Test Case ID: \t\t" + text_case_id_04
                       + " - PASSED");
               System.out.println("Error Expected/Actual: \t"
                       + error_fname_empty_expected + "/"
                       + error_fname_empty_actual);
               System.out.println("=======================================");
           } else {
               System.out.println("Test Case ID: \t\t" + text_case_id_04
                       + " - FAILED");
               System.out.println("Error Expected/Actual: \t"
                       + error_fname_empty_expected + "/"
                       + error_fname_empty_actual);
               System.out.println("=======================================");
           }

           // TC-001.05

           driver.findElement(By.id("id_fname")).sendKeys(fname);
           driver.findElement(By.id("id_lname")).sendKeys(lname);
           driver.findElement(By.id("id_email")).sendKeys(email);
           driver.findElement(By.id("id_phone")).sendKeys(phone);
           driver.findElement(By.id("id_submit_button")).click();

           String fname_conf_actual = driver.findElement(By.id("id_fname_conf"))
                   .getText();
           String lname_conf_actual = driver.findElement(By.id("id_lname_conf"))
                   .getText();
           String email_conf_actual = driver.findElement(By.id("id_email_conf"))
                   .getText();
           String phone_conf_actual = driver.findElement(By.id("id_phone_conf"))
                   .getText();

           if (fname.equals(fname_conf_actual) && lname.equals(lname_conf_actual)
                   && email.equals(email_conf_actual)
                   && phone.equals(phone_conf_actual)) {
               System.out.println("Test Case ID: \t\t" + text_case_id_05
                       + " - PASSED");
               System.out.println("First Expected/Actual: \t" + fname + "/"
                       + fname_conf_actual);
               System.out.println("Last Expected/Actual: \t" + lname + "/"
                       + lname_conf_actual);
               System.out.println("Email Expected/Actual: \t" + email + "/"
                       + email_conf_actual);
               System.out.println("Phone Expected/Actual: \t" + phone + "/"
                       + phone_conf_actual);
               System.out.println("=======================================");
           } else {
               System.out.println("Test Case ID: \t\t" + text_case_id_05
                       + " - FAILED");
               System.out.println("First Expected/Actual: \t" + fname + "/"
                       + fname_conf_actual);
               System.out.println("Last Expected/Actual: \t" + lname + "/"
                       + lname_conf_actual);
               System.out.println("Email Expected/Actual: \t" + email + "/"
                       + email_conf_actual);
               System.out.println("Phone Expected/Actual: \t" + phone + "/"
                       + phone_conf_actual);
               System.out.println("=======================================");
           }

           driver.close();

       }
   }







