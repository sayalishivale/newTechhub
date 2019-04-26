$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/MyFeature.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "  Verify if user is able to Login in to the site",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as a authenticated user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enters_username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.success_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User wants to logout",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Clicks on Logout",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Clicks_on_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User LogsOut",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_LogsOut()"
});
formatter.result({
  "status": "passed"
});
});