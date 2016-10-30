$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6989412481,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should not be able to login with invalid credentials",
  "description": "",
  "id": "login-functionality;user-should-not-be-able-to-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on Vodafone home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user tries to login with invalid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "login should be unsuccessful",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "prompt following message to user",
  "keyword": "And ",
  "doc_string": {
    "content_type": "",
    "line": 10,
    "value": "Your mobile number is not registered for My Vodafone."
  }
});
formatter.match({
  "location": "Steps.user_is_on_Vodafone_home_page()"
});
formatter.result({
  "duration": 26044818577,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_tries_to_login_with_invalid_credentials()"
});
formatter.result({
  "duration": 14233049015,
  "status": "passed"
});
formatter.match({
  "location": "Steps.login_should_be_unsuccessful()"
});
formatter.result({
  "duration": 25771128,
  "status": "passed"
});
formatter.match({
  "location": "Steps.prompt_following_message_to_user(String)"
});
formatter.result({
  "duration": 51695757,
  "status": "passed"
});
formatter.after({
  "duration": 777948582,
  "status": "passed"
});
});