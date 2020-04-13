$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("JPetStore_Login4.feature");
formatter.feature({
  "line": 2,
  "name": "JPetStoreLogin searching an item and purchasing",
  "description": "",
  "id": "jpetstorelogin-searching-an-item-and-purchasing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "searching an item and making payment",
  "description": "",
  "id": "jpetstorelogin-searching-an-item-and-purchasing;searching-an-item-and-making-payment",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "open browser and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter valid \"\u003cusernameNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user able to login",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user searches for an item",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "payment has to be done",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user has to sign out",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "jpetstorelogin-searching-an-item-and-purchasing;searching-an-item-and-making-payment;",
  "rows": [
    {
      "cells": [
        "usernameNumber"
      ],
      "line": 16,
      "id": "jpetstorelogin-searching-an-item-and-purchasing;searching-an-item-and-making-payment;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 17,
      "id": "jpetstorelogin-searching-an-item-and-purchasing;searching-an-item-and-making-payment;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "searching an item and making payment",
  "description": "",
  "id": "jpetstorelogin-searching-an-item-and-purchasing;searching-an-item-and-making-payment;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "open browser and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter valid \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user able to login",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user searches for an item",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "payment has to be done",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user has to sign out",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "application should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.open_browser_and_start_application()"
});
formatter.result({
  "duration": 14384492400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "StepDefinition.i_enter_valid(String)"
});
formatter.result({
  "duration": 2766931100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_able_to_login()"
});
formatter.result({
  "duration": 2768512700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_searches_for_an_item()"
});
formatter.result({
  "duration": 3783343000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.payment_has_to_be_done()"
});
formatter.result({
  "duration": 4394448300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_has_to_sign_out()"
});
formatter.result({
  "duration": 3523869800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.application_should_be_closed()"
});
formatter.result({
  "duration": 2289666700,
  "status": "passed"
});
});