$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/GmailLogin.feature");
formatter.feature({
  "line": 1,
  "name": "This feature is for login functionality",
  "description": "",
  "id": "this-feature-is-for-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User logs in with valid username and password",
  "description": "",
  "id": "this-feature-is-for-login-functionality;user-logs-in-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters the username as \"sukumarmunusamy\" and password as \"Numeric@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user should be getting error message",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailLoginSteps.user_is_on_Login_page()"
});
formatter.result({
  "duration": 13202785000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sukumarmunusamy",
      "offset": 29
    },
    {
      "val": "Numeric@123",
      "offset": 63
    }
  ],
  "location": "GmailLoginSteps.user_enters_the_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 3538521200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027password\u0027]\"}\n  (Session info: chrome\u003d93.0.4577.82)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027LAPTOP-F0GMDFRG\u0027, ip: \u0027192.168.1.105\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.82, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\Sukum\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:8380}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f5ae8c9f6abb3f132fbc507ffed8f36c\n*** Element info: {Using\u003dname, value\u003dpassword}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:397)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat stepDefinitions.GmailLoginSteps.user_enters_the_username_as_and_password_as(GmailLoginSteps.java:29)\r\n\tat ✽.When User enters the username as \"sukumarmunusamy\" and password as \"Numeric@123\"(featureFiles/GmailLogin.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GmailLoginSteps.clicks_on_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GmailLoginSteps.user_should_be_getting_error_message()"
});
formatter.result({
  "status": "skipped"
});
});