$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("deals.feature");
formatter.feature({
  "line": 1,
  "name": "Application test for deal page test",
  "description": "",
  "id": "application-test-for-deal-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8917122453,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user able to create new deal",
  "description": "",
  "id": "application-test-for-deal-page-test;user-able-to-create-new-deal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on home",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on deals tab and select New deal option",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user lands on Deal Page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter deal details and save",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify new deal created successfully",
  "keyword": "And "
});
formatter.match({
  "location": "DealPageSteps.user_is_on_home()"
});
formatter.result({
  "duration": 161581324,
  "status": "passed"
});
formatter.match({
  "location": "DealPageSteps.user_clicks_on_deals_tab_and_select_New_deal_option()"
});
formatter.result({
  "duration": 18903,
  "status": "passed"
});
formatter.match({
  "location": "DealPageSteps.user_lands_on_Deal_Page()"
});
formatter.result({
  "duration": 29164,
  "status": "passed"
});
formatter.match({
  "location": "DealPageSteps.user_enter_deal_details_and_save()"
});
formatter.result({
  "duration": 19443,
  "status": "passed"
});
formatter.match({
  "location": "DealPageSteps.verify_new_deal_created_successfully()"
});
formatter.result({
  "duration": 22144,
  "status": "passed"
});
formatter.after({
  "duration": 796543245,
  "status": "passed"
});
formatter.uri("freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Application Test of FREECRM",
  "description": "",
  "id": "application-test-of-freecrm",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6322201838,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate login application successfully.",
  "description": "",
  "id": "application-test-of-freecrm;validate-login-application-successfully.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user logged in to application by entering username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user validate homepage Title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user validate logged in username label",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_Page()"
});
formatter.result({
  "duration": 82746846,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 4140958747,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_validate_homepage_Title()"
});
formatter.result({
  "duration": 10815187,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_validate_logged_in_username_label()"
});
formatter.result({
  "duration": 178030129,
  "status": "passed"
});
formatter.after({
  "duration": 748423899,
  "status": "passed"
});
formatter.before({
  "duration": 6524993208,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "user is able to create new contact",
  "description": "",
  "id": "application-test-of-freecrm;user-is-able-to-create-new-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user is logged into FREECRM application using username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user is on Your HomePage",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user click on Contacts Link and select New Contacts",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user landed on new Contact page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enters details of the new contact and save",
  "rows": [
    {
      "cells": [
        "firstname",
        "surname"
      ],
      "line": 19
    },
    {
      "cells": [
        "john",
        "Kerry"
      ],
      "line": 20
    },
    {
      "cells": [
        "Salma",
        "sheikh"
      ],
      "line": 21
    },
    {
      "cells": [
        "Arja",
        "Das"
      ],
      "line": 22
    },
    {
      "cells": [
        "Akhil",
        "Bose"
      ],
      "line": 23
    },
    {
      "cells": [
        "Madhabi",
        "Bose"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_logged_into_FREECRM_application_using_username_and_password()"
});
formatter.result({
  "duration": 2599590724,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Your_HomePage()"
});
formatter.result({
  "duration": 97755,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_click_on_Contacts_Link_and_select_New_Contacts()"
});
formatter.result({
  "duration": 1439939122,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_landed_on_new_Contact_page()"
});
formatter.result({
  "duration": 61049502,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_and_and_save(DataTable)"
});
formatter.result({
  "duration": 11361444898,
  "status": "passed"
});
formatter.after({
  "duration": 786227636,
  "status": "passed"
});
});