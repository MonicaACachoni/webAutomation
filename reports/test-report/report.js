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
        "Monica",
        "Harry Potter"
      ],
      "line": 12,
      "id": "select-a-product-at-submarino;1---\"search”-a-product;;2"
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
  "name": "the user \"Monica\" is logged in to Submarino Site",
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
      "val": "Monica",
      "offset": 10
    }
  ],
  "location": "StepDefinition.the_user_is_logged_in_to_Submarino_Site(String)"
});
formatter.result({
  "duration": 12904239900,
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
  "duration": 111800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.clicks_On_Add_Button()"
});
formatter.result({
  "duration": 34500,
  "status": "passed"
});
});