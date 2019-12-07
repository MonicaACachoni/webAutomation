$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Submarino.feature");
formatter.feature({
  "line": 2,
  "name": "Select a product at Submarino",
  "description": "User should be able to acess submarino page",
  "id": "select-a-product-at-submarino",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "1 - \"SEARCH” a product",
  "description": "",
  "id": "select-a-product-at-submarino;1---\"search”-a-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "the user \"\u003cuser\u003e\" is logged in to Submarino Site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "product \"\u003cproduct\u003e\" are searched",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "product in shown as available",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "select-a-product-at-submarino;1---\"search”-a-product;",
  "rows": [
    {
      "cells": [
        "user",
        "product"
      ],
      "line": 11,
      "id": "select-a-product-at-submarino;1---\"search”-a-product;;1"
    },
    {
      "cells": [
        "Pedro",
        "Harry Potter"
      ],
      "line": 12,
      "id": "select-a-product-at-submarino;1---\"search”-a-product;;2"
    },
    {
      "cells": [
        "Joao",
        "Star Wars"
      ],
      "line": 13,
      "id": "select-a-product-at-submarino;1---\"search”-a-product;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "1 - \"SEARCH” a product",
  "description": "",
  "id": "select-a-product-at-submarino;1---\"search”-a-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user \"Pedro\" is logged in to Submarino Site",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "product \"Harry Potter\" are searched",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "product in shown as available",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Pedro",
      "offset": 10
    }
  ],
  "location": "StepDefinition.the_user_is_logged_in_to_Submarino_Site(String)"
});
formatter.result({
  "duration": 16939283300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter",
      "offset": 9
    }
  ],
  "location": "StepDefinition.product_are_searched(String)"
});
formatter.result({
  "duration": 4392726700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.clicks_On_Add_Button()"
});
formatter.result({
  "duration": 35100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "1 - \"SEARCH” a product",
  "description": "",
  "id": "select-a-product-at-submarino;1---\"search”-a-product;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user \"Joao\" is logged in to Submarino Site",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "product \"Star Wars\" are searched",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "product in shown as available",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Joao",
      "offset": 10
    }
  ],
  "location": "StepDefinition.the_user_is_logged_in_to_Submarino_Site(String)"
});
formatter.result({
  "duration": 4246754500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Star Wars",
      "offset": 9
    }
  ],
  "location": "StepDefinition.product_are_searched(String)"
});
formatter.result({
  "duration": 5135017300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.clicks_On_Add_Button()"
});
formatter.result({
  "duration": 30600,
  "status": "passed"
});
});