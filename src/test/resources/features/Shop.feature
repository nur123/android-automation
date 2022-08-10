           Feature: Shop

             @AddToCart @TBSI-2
             Scenario: User able to add item to cart
               Given user click shop button
               When user add to cart item "Happy Go Lash Mascara 10ml"
               And user select 1st color
               And user click button add to cart on pop up
               Then user see item added into cart