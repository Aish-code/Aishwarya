$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Tag.feature");
formatter.feature({
  "name": "checking login fucntionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User enters Username and Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Functionaltest"
    }
  ]
});
formatter.step({
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters lalitha as username",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters password123 as password",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user will   Finds a testmeapp homepage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});