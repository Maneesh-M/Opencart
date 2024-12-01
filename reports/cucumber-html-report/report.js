$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/844888/Opencart/src/main/resources/Feature/Project.feature");
formatter.feature({
  "line": 2,
  "name": "Open Cart - Smoke Testing",
  "description": "",
  "id": "open-cart---smoke-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OpenCart"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Register and Login",
  "description": "",
  "id": "open-cart---smoke-testing;register-and-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC01_Opencart"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The user opens the Opencart page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User register on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on the register button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User login on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Def_Login.user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 6240122607,
  "status": "passed"
});
formatter.match({
  "location": "Def_Login.the_user_opens_the_Opencart_page()"
});
formatter.result({
  "duration": 32996,
  "status": "passed"
});
formatter.match({
  "location": "Def_Login.user_register_on_the_page()"
});
formatter.result({
  "duration": 53096,
  "status": "passed"
});
formatter.match({
  "location": "Def_Login.click_on_the_register_button()"
});
formatter.result({
  "duration": 2799401758,
  "status": "passed"
});
formatter.match({
  "location": "Def_Login.user_login_on_the_page()"
});
formatter.result({
  "duration": 3244675219,
  "error_message": "org.openqa.selenium.JavascriptException: javascript error: Failed to execute \u0027elementsFromPoint\u0027 on \u0027Document\u0027: The provided double value is non-finite.\n  (Session info: chrome\u003d80.0.3987.132)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027BLT144\u0027, ip: \u0027192.168.0.144\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\BLTUSE~1.BLT\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:52009}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 273c89a6e2d5cf5a951b0f18ccedc42f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:618)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:639)\r\n\tat org.openqa.selenium.interactions.Actions.perform(Actions.java:595)\r\n\tat com.Pages.Reglog_Page.Logincredentials(Reglog_Page.java:47)\r\n\tat com.StepDefinition.Def_Login.user_login_on_the_page(Def_Login.java:43)\r\n\tat ✽.Then User login on the page(C:/844888/Opencart/src/main/resources/Feature/Project.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Def_Login.click_on_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
});