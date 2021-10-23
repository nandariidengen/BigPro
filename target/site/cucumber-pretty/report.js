$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/01-AddList.feature");
formatter.feature({
  "line": 2,
  "name": "Add New List",
  "description": "",
  "id": "add-new-list",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddList"
    },
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.before({
  "duration": 8339723400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add List on the Board",
  "description": "",
  "id": "add-new-list;add-list-on-the-board",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@AddListPostive"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User already Sign In on the Cicle App",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click card on the teams",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User will be direct on the Teams Page and click Board",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Add List on the Board and input \"In Progress\" as list name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "List is already created",
  "keyword": "Then "
});
formatter.match({
  "location": "AddListSteps.ciclePage()"
});
formatter.result({
  "duration": 345940200,
  "status": "passed"
});
formatter.match({
  "location": "AddListSteps.openTeams()"
});
formatter.result({
  "duration": 8264898900,
  "status": "passed"
});
formatter.match({
  "location": "AddListSteps.openBoard()"
});
formatter.result({
  "duration": 11038124900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "In Progress",
      "offset": 38
    }
  ],
  "location": "AddListSteps.addList(String)"
});
formatter.result({
  "duration": 1071022900,
  "status": "passed"
});
formatter.match({
  "location": "AddListSteps.List()"
});
formatter.result({
  "duration": 5087973300,
  "status": "passed"
});
formatter.after({
  "duration": 1010017600,
  "status": "passed"
});
formatter.before({
  "duration": 4732209600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Create new List on the Board",
  "description": "",
  "id": "add-new-list;create-new-list-on-the-board",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@AddListNegative"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User open the Cicle App and click card on the teams",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User go to teams page and click Board",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User create new list on the board and input \"\" as list name",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Error message will appears",
  "keyword": "Then "
});
formatter.match({
  "location": "AddListNegativeSteps.openCiclePage()"
});
formatter.result({
  "duration": 10268924400,
  "status": "passed"
});
formatter.match({
  "location": "AddListNegativeSteps.openBoardPage()"
});
formatter.result({
  "duration": 19712168400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 45
    }
  ],
  "location": "AddListNegativeSteps.addList(String)"
});
formatter.result({
  "duration": 5412042500,
  "status": "passed"
});
formatter.match({
  "location": "AddListNegativeSteps.List()"
});
formatter.result({
  "duration": 3091321200,
  "status": "passed"
});
formatter.after({
  "duration": 971886700,
  "status": "passed"
});
formatter.uri("features/02-ArchiveList.feature");
formatter.feature({
  "line": 2,
  "name": "User want to archive list",
  "description": "",
  "id": "user-want-to-archive-list",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Archive"
    },
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.before({
  "duration": 5071291400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Archive List on the Board",
  "description": "",
  "id": "user-want-to-archive-list;archive-list-on-the-board",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@ArchiveList"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User have been sign in on the Cicle App and click card",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click Board and will be direct on the Board Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User create new List on the board and input \"Archive\" as listname",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click toggle on the list and click archive this list",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "List will be archive",
  "keyword": "Then "
});
formatter.match({
  "location": "ArchiveListSteps.cicleApp()"
});
formatter.result({
  "duration": 700279400,
  "status": "passed"
});
formatter.match({
  "location": "ArchiveListSteps.openBoard()"
});
formatter.result({
  "duration": 17784588400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Archive",
      "offset": 45
    }
  ],
  "location": "ArchiveListSteps.addNewList(String)"
});
formatter.result({
  "duration": 6891457200,
  "status": "passed"
});
formatter.match({
  "location": "ArchiveListSteps.archiveList()"
});
formatter.result({
  "duration": 22409510000,
  "status": "passed"
});
formatter.match({
  "location": "ArchiveListSteps.archiveSuccess()"
});
formatter.result({
  "duration": 76481700,
  "status": "passed"
});
formatter.after({
  "duration": 995153500,
  "status": "passed"
});
formatter.uri("features/03-Restore.feature");
formatter.feature({
  "line": 2,
  "name": "Restore List",
  "description": "",
  "id": "restore-list",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Restore"
    },
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.before({
  "duration": 4661917400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Restore List on the Board",
  "description": "",
  "id": "restore-list;restore-list-on-the-board",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@RestoreList"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User open Cicle App and click card on the Teams",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click Board and will be direct on the Board age",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click archive adn click switch to list",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click restore one of the list",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User see the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "RestoreSteps.openTeams()"
});
formatter.result({
  "duration": 3217234600,
  "status": "passed"
});
formatter.match({
  "location": "RestoreSteps.openBoard()"
});
formatter.result({
  "duration": 15101045200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//body/div[@id\u003d\u0027root\u0027]/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/a[1]/div[1]/div[1]\"}\n  (Session info: chrome\u003d95.0.4638.54)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ASUS-NANDA\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 95.0.4638.54, chrome: {chromedriverVersion: 95.0.4638.17 (a9d0719444d4b..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:65002}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2ed039575ffb64a9895e84c929bd642b\n*** Element info: {Using\u003dxpath, value\u003d//body/div[@id\u003d\u0027root\u0027]/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/a[1]/div[1]/div[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat page_object.TeamsPage.clickBoardTeams(TeamsPage.java:68)\r\n\tat step_definition.RestoreSteps.openBoard(RestoreSteps.java:36)\r\n\tat ✽.When User click Board and will be direct on the Board age(features/03-Restore.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RestoreSteps.archive()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RestoreSteps.restoreList()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RestoreSteps.successRestore()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1121752000,
  "status": "passed"
});
formatter.before({
  "duration": 7804634700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Restore Card on the Board",
  "description": "",
  "id": "restore-list;restore-card-on-the-board",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@RestoreCard"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User already login to the Cicle and click card",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User open Board Page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click button archive and click restore one of the card",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Card success restore",
  "keyword": "Then "
});
formatter.match({
  "location": "RestoreCardSteps.openCicle()"
});
formatter.result({
  "duration": 3337755000,
  "status": "passed"
});
formatter.match({
  "location": "RestoreCardSteps.openTeams()"
});
formatter.result({
  "duration": 14355881800,
  "status": "passed"
});
formatter.match({
  "location": "RestoreCardSteps.restoreCard()"
});
formatter.result({
  "duration": 6298617800,
  "status": "passed"
});
formatter.match({
  "location": "RestoreCardSteps.successRestore()"
});
formatter.result({
  "duration": 4073990000,
  "status": "passed"
});
formatter.after({
  "duration": 1060348200,
  "status": "passed"
});
formatter.uri("features/04-SignIn.feature");
formatter.feature({
  "line": 2,
  "name": "Sign In",
  "description": "User want to Sign In",
  "id": "sign-in",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SignIn"
    },
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.before({
  "duration": 5329676700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User Sign in with Google Account",
  "description": "",
  "id": "sign-in;user-sign-in-with-google-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@SignInGoogle"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User on the Cicle App Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Sign In with Google Account",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User will be direct on the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.openCicleApp()"
});
formatter.result({
  "duration": 81459200,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.signIn()"
});
formatter.result({
  "duration": 15717905800,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.dashboardCicleApp()"
});
formatter.result({
  "duration": 1563100,
  "status": "passed"
});
formatter.after({
  "duration": 947705400,
  "status": "passed"
});
formatter.uri("features/05-GroupChat.feature");
formatter.feature({
  "line": 2,
  "name": "Send Message",
  "description": "",
  "id": "send-message",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@groupChat"
    },
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.before({
  "duration": 4785094900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Send message with valid text",
  "description": "",
  "id": "send-message;send-message-with-valid-text",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SendMessage"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User already login on the Cicle App and click card on the Teams",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User on the Teams Page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click group chat and input \"Big Project\" as a message",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click attach File and input \"test.png\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Message already sent",
  "keyword": "Then "
});
formatter.match({
  "location": "GroupChatSteps.cicleApp()"
});
formatter.result({
  "duration": 4212287100,
  "status": "passed"
});
formatter.match({
  "location": "GroupChatSteps.teamsPage()"
});
formatter.result({
  "duration": 10083042400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[.\u003d\u0027Soal B\u0027]\"}\n  (Session info: chrome\u003d95.0.4638.54)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ASUS-NANDA\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 95.0.4638.54, chrome: {chromedriverVersion: 95.0.4638.17 (a9d0719444d4b..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:64361}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 8e9777a4f92f6293fbfcda0a61a2f8c2\n*** Element info: {Using\u003dxpath, value\u003d//h1[.\u003d\u0027Soal B\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\r\n\tat page_object.TeamsPage.getTitleTeams(TeamsPage.java:56)\r\n\tat step_definition.GroupChatSteps.teamsPage(GroupChatSteps.java:40)\r\n\tat ✽.And User on the Teams Page(features/05-GroupChat.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Big Project",
      "offset": 33
    }
  ],
  "location": "GroupChatSteps.Message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "test.png",
      "offset": 34
    }
  ],
  "location": "GroupChatSteps.uploadFile(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GroupChatSteps.sendMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1263424000,
  "status": "passed"
});
formatter.before({
  "duration": 6969000700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Send empty message",
  "description": "",
  "id": "send-message;send-empty-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@SendEmptyMessage"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User on the Cicle App and click card on the Teams",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User open the group chat and input \"HaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHalo\" as a message",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Cannot send message",
  "keyword": "Then "
});
formatter.match({
  "location": "GroupChatNegativeSteps.cardTeams()"
});
formatter.result({
  "duration": 360052300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHalo",
      "offset": 36
    }
  ],
  "location": "GroupChatNegativeSteps.message(String)"
});
formatter.result({
  "duration": 22507960700,
  "status": "passed"
});
formatter.match({
  "location": "GroupChatNegativeSteps.sendMessage()"
});
formatter.result({
  "duration": 4145459000,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton type\u003d\"button\" class\u003d\"rounded-circle btn btn-warning btn-sm\"\u003e...\u003c/button\u003e is not clickable at point (1163, 562). Other element would receive the click: \u003cdiv class\u003d\"col-1\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d95.0.4638.54)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ASUS-NANDA\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 95.0.4638.54, chrome: {chromedriverVersion: 95.0.4638.17 (a9d0719444d4b..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:59598}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 8a9168b8a97598f48fe33126064de96d\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.GeneratedMethodAccessor6.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat page_object.GroupChatPage.clickSend(GroupChatPage.java:86)\r\n\tat step_definition.GroupChatNegativeSteps.sendMessage(GroupChatNegativeSteps.java:40)\r\n\tat ✽.Then Cannot send message(features/05-GroupChat.feature:17)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 1727957500,
  "status": "passed"
});
formatter.uri("features/06-AddCard.feature");
formatter.feature({
  "line": 2,
  "name": "Add New Card",
  "description": "",
  "id": "add-new-card",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddCard"
    },
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.before({
  "duration": 10373988700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Create New Card",
  "description": "",
  "id": "add-new-card;create-new-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@CardPositive"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User login into the cicle app and click card on the teams",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User direct into teams page and click Board",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User create new list and input \"In Progress\" as list name",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click add Card on the List and input \"Register\" as card name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Card already created",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCardSteps.openDashboard()"
});
formatter.result({
  "duration": 376943500,
  "status": "passed"
});
formatter.match({
  "location": "AddCardSteps.openTeams()"
});
formatter.result({
  "duration": 13501653200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "In Progress",
      "offset": 32
    }
  ],
  "location": "AddCardSteps.addList(String)"
});
formatter.result({
  "duration": 10425706600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 43
    }
  ],
  "location": "AddCardSteps.addCard(String)"
});
formatter.result({
  "duration": 5025444100,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat page_object.CardPage.clickAddCard(CardPage.java:38)\r\n\tat step_definition.AddCardSteps.addCard(AddCardSteps.java:72)\r\n\tat ✽.And User click add Card on the List and input \"Register\" as card name(features/06-AddCard.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddCardSteps.card()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 1116869800,
  "status": "passed"
});
formatter.before({
  "duration": 4924173100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Empty Card Name",
  "description": "",
  "id": "add-new-card;empty-card-name",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@CardNegative"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User already on the Cicle App and click card on the teams",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User click Board on the teams page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User add new list and input \"In Progress\" as list name",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User create new card and input \"\" as card name",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User see the new card",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCardNegative.openCicle()"
});
formatter.result({
  "duration": 416512700,
  "status": "passed"
});
formatter.match({
  "location": "AddCardNegative.openTeams()"
});
formatter.result({
  "duration": 15060652400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "In Progress",
      "offset": 29
    }
  ],
  "location": "AddCardNegative.addList(String)"
});
formatter.result({
  "duration": 9473951800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 32
    }
  ],
  "location": "AddCardNegative.addCard(String)"
});
formatter.result({
  "duration": 3014616100,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat page_object.CardPage.clickAddCard(CardPage.java:38)\r\n\tat step_definition.AddCardNegative.addCard(AddCardNegative.java:65)\r\n\tat ✽.And User create new card and input \"\" as card name(features/06-AddCard.feature:17)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddCardNegative.send()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 1345229600,
  "status": "passed"
});
formatter.uri("features/07-Schedule.feature");
formatter.feature({
  "line": 2,
  "name": "Create New Event",
  "description": "",
  "id": "create-new-event",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@schedule"
    },
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.before({
  "duration": 4696806600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add new event with valid data",
  "description": "",
  "id": "create-new-event;add-new-event-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SchedulePositive"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User open cicle App and click card on the Teams",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click Schedule and user will be direct on the schedule page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click create event",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User fills in the data event and input \"Sekolah QA\" as notes",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Event will be created",
  "keyword": "Then "
});
formatter.match({
  "location": "ScheduleSteps.openCicle()"
});
formatter.result({
  "duration": 3177960900,
  "status": "passed"
});
formatter.match({
  "location": "ScheduleSteps.schedule()"
});
formatter.result({
  "duration": 5038262200,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat page_object.SchedulePage.clickSchedule(SchedulePage.java:163)\r\n\tat step_definition.ScheduleSteps.schedule(ScheduleSteps.java:39)\r\n\tat ✽.When User click Schedule and user will be direct on the schedule page(features/07-Schedule.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ScheduleSteps.event()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sekolah QA",
      "offset": 40
    }
  ],
  "location": "ScheduleSteps.createEvent(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "duration": 1161221200,
  "status": "passed"
});
formatter.uri("features/08-Notification.feature");
formatter.feature({
  "line": 2,
  "name": "View Notification",
  "description": "",
  "id": "view-notification",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@notification"
    },
    {
      "line": 1,
      "name": "@Dev"
    }
  ]
});
formatter.before({
  "duration": 4662130400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "View all of notification",
  "description": "",
  "id": "view-notification;view-all-of-notification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User already on the Cicle Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click lbl bell and click View all notification",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User will be view all of the notification",
  "keyword": "Then "
});
formatter.match({
  "location": "NotificationSteps.openCicle()"
});
formatter.result({
  "duration": 656700,
  "status": "passed"
});
formatter.match({
  "location": "NotificationSteps.viewNotif()"
});
formatter.result({
  "duration": 10004355100,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat page_object.NotificationPage.clickBell(NotificationPage.java:24)\r\n\tat step_definition.NotificationSteps.viewNotif(NotificationSteps.java:28)\r\n\tat ✽.And User click lbl bell and click View all notification(features/08-Notification.feature:7)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.embedding("image/png", "embedded6.png");
formatter.after({
  "duration": 1212855200,
  "status": "passed"
});
});