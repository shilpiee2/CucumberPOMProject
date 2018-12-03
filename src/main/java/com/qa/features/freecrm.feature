Feature: Application Test of FREECRM

Scenario: Validate login application successfully.

Given user is on login Page
When user logged in to application by entering username and password
Then user validate homepage Title
Then user validate logged in username label 


Scenario: user is able to create new contact


Given user is logged into FREECRM application using username and password
When user is on Your HomePage
Then user click on Contacts Link and select New Contacts
And user landed on new Contact page
Then user enters details of the new contact and save
         | firstname | surname |
          | john | Kerry |
          | Salma | sheikh |
          | Arja | Das |
          | Akhil | Bose |
          | Madhabi| Bose |

          

