$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HeatclinicLogin.feature");
formatter.feature({
  "id": "broadleaf-commerce-login-functionality",
  "description": "",
  "name": "Broadleaf Commerce Login Functionality",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 3182755000,
  "status": "passed"
});
formatter.scenario({
  "id": "broadleaf-commerce-login-functionality;1.-valid-user-valid-password",
  "description": "",
  "name": "1. Valid user valid password",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "As a not valid  user",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "Browse to the application",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "Broadleaf home page should show",
  "keyword": "Then ",
  "line": 6
});
formatter.step({
  "name": "User click login button",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "I fill in the followin:",
  "keyword": "And ",
  "line": 10,
  "comments": [
    {
      "value": "#login Info",
      "line": 9
    }
  ],
  "rows": [
    {
      "cells": [
        "emailAdd",
        "grt_rb@hotmail.com"
      ],
      "line": 11
    },
    {
      "cells": [
        "pass",
        "12345"
      ],
      "line": 12
    }
  ]
});
formatter.step({
  "name": "Click login",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "location": "Mysteps.as_a_not_valid_user()"
});
formatter.result({
  "duration": 81640000,
  "status": "passed"
});
formatter.match({
  "location": "Mysteps.browse_to_the_application()"
});
formatter.result({
  "duration": 2983365000,
  "status": "passed"
});
formatter.match({
  "location": "Mysteps.broadleaf_home_page_should_show()"
});
formatter.result({
  "duration": 26899000,
  "status": "passed"
});
formatter.match({
  "location": "Mysteps.user_click_login_button()"
});
formatter.result({
  "duration": 1145102000,
  "status": "passed"
});
formatter.match({
  "location": "Mysteps.i_fill_in_the_followin(DataTable)"
});
formatter.result({
  "duration": 104173000,
  "status": "passed"
});
formatter.match({
  "location": "Mysteps.click_login()"
});
formatter.result({
  "duration": 711995000,
  "status": "passed"
});
formatter.after({
  "duration": 16000,
  "status": "passed"
});
});