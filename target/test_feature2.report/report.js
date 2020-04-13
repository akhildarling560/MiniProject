$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/multipleitems.feature");
formatter.feature({
  "line": 2,
  "name": "JPetStore",
  "description": "",
  "id": "jpetstore",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@multipleitems"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Selecting Multiple Items into Cart",
  "description": "",
  "id": "jpetstore;selecting-multiple-items-into-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "open browser and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"\u003cusernameNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user able to login",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user selects an item from menu",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user selects multiple items",
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
  "id": "jpetstore;selecting-multiple-items-into-cart;",
  "rows": [
    {
      "cells": [
        "usernameNumber"
      ],
      "line": 16,
      "id": "jpetstore;selecting-multiple-items-into-cart;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 17,
      "id": "jpetstore;selecting-multiple-items-into-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Selecting Multiple Items into Cart",
  "description": "",
  "id": "jpetstore;selecting-multiple-items-into-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@multipleitems"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open browser and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user able to login",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user selects an item from menu",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user selects multiple items",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});