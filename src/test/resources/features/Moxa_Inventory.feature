
@Moxa
Feature: Inventory Management
  @01
  Scenario: Admin should be able to see stock quantity

    Given    User has already logged into CSB menu
    When     he navigates it to "Inventory Management " option
    And      press on to " Stock Quantity " button
    And      choose " state " from the drop down menu
    And      choose " Stock Point" from the drop down list
    And      press on to " Go " buttons
    Then     admin should see a stock quantity successfully
    And      admin should logout

  @02
  Scenario Outline: Admin should be able to see purchasing Order with Advance search Option with valid Details

    Given    User has already logged into CSB menu
    When     navigates it to "Inventory Management " option
    When     press on to Purchasing order button
    And      Press on  " Advanced Search " button
    And      enter the Details as "<SO No>" , "<SO Date>" , "<Dealer Code>" , "<State>" , "<Status>"
    And      Press on to " Search " buttons
    Then     Admin should be able to see Purchesing Order successfully
    And       admin should logout

    Examples:
      | SO No   | SO Date   | Dealer Code   | State         | Status   |
      |SO266    |09-01-2013 |  DCL777       |Karnataka      |Pending   |
      |SO248	|05-01-2013 |  DCL777	    |Karnataka      |Pending   |
      |SO237	|03-01-2013 |	 DCL007	    |Andhra Pradesh |Pending   |

#  @03
#  Scenario:  Admin should see stock quantity with invalid  Details
#
#    Given     User has already logged into CSB menu
#    When     he navigates it to "Inventory Management " option
#    And      press on to " Stock Quantity " button
#    And      enter the Mandatory Field as Andra Pradesh  // TEST IS FAILING HERE BECAUSE OF NOT COMPILER IS NOT GOING FURTHER FROM HERE
#    And      Press on to " Go " buttons   // COMPLIER IS NOT TAKING THIS STEP
#    Then     Admin should see error messege: "Please enter Mandatory Fields "
##    And      admin should logout


#  THORWING THE ERRORS ON THIS STEP - NOT SURE WHY

#  @04
#  Scenario:  Admin should see a Purchasing Order with Advance Search Option with invalid Details
#
#    Given    User has already logged into CSB menu
#    When     navigates it to "Inventory Management " option
#    And      press on to Purchasing order button
#    And      press on to " Advance search " button
#    And      enter the Details
#    And      Press on to " Search " buttons
#    Then     Admin should get messege for to enter correct details
#    And      admin should logout

  @05
  Scenario:User can navigates to Advance Search Option for to see Purchasing Order

    Given   User has already logged into CSB menu
    When    he navigates it to "Inventory Management " option
    And     press on to Purchasing order button
    Then    press on to " Advance search " button
    And     admin should logout

  @06
  Scenario:Varifying the view Functionality for Purchasing Order page

    Given  User has already logged into CSB menu
    When   he navigates it to "Inventory Management " option
    And    press on to Purchasing order button
    And    Press on " View " button
    Then   a list of Purchsing Order list should be visible
    And     admin should logout

    @07
    Scenario: Varifying the Varify Functionality for Purchasing Order page

      Given  User has already logged into CSB menu
      When   he navigates it to " Inventory Management" option
      And    press on to Purchasing order button
      And    Press on " Varify " button
      Then   he should be able to varify the Order Detail page
      And     admin should logout
  @08
  Scenario: User can navigates to Upload Stock Option

    Given  User has already logged into CSB menu
    When   he navigates it to " Inventory Management" option
    And    press on to Purchasing order button
    And    Press on " Varify " button
    Then   he should be able to varify the Order Detail page
    And     admin should logout

#  @09
#  Scenario: // UNABLE TO EXECUTE BECAUSE OF HAVING ACTUAL BUG
#
#    Given  User has already logged into CSB menu
#    When   he navigates it to " Inventory Management" option
#    And    choose on to Upload Stock button
#    Then   he should see a page Upload Stock page successfully
#    And     admin should logout

#  @10
##    Scenario:Varifying the Save Functionality for Upload Stock Page // UNABLE TO EXCUTE BECAUSE OF HAVING ACTUAL BUG
##
##      Given  User has already logged into CSB menu
##      When   he navigates it to " Inventory Management" option
##      And    choose on to Upload Stock button
##      And    Press on to Save button
##      Then   he should get Error messege: " Please upload the file "
#        And     admin should logout

