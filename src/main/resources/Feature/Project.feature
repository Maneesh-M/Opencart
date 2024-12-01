
Feature: Open Cart - Smoke Testing

@TC01_Register 
Scenario: Registering a User
Given the Opencart application opens in browser
When the user clicks on register
Then the user fills all the details
And the user clicks on submit 

@TC02_ValidLogin
Scenario: Logging a User
Given the application opens in browser
When the user clicks on Login
Then the user gives valid credentials
And clicks on Login button

@TC03_InvalidLogin
Scenario: Logging with invalid credentials
Given the application opens in browser
When the user clicks on login
Then the user tries to login with invalid details
And click on login button

@TC04_MandatoryFields
Scenario:
Given the application opens in browser
When the user clicks on register button
Then the user fills the details by leaving one mandatory field
And clicks on submit button

@TC05_Search
Scenario: Search Functionality
Given the user launches the chrome browser and opens application
When the user searches for the product
And clicks Search button
Then application should display the product searched

@TC06_AddToCart
Scenario:
Choose a product and add to cart
Given the application opens in browser
When the user clicks on phones 
Then the user selects the product
And clicks on add to cart

@TC07_CartChecking
Scenario:
Checking the Cart
Given the application opens in browser
When the user clicks on Cart option
Then the user checks the product
And confirms the presence of the product

@TC08_ExcelWriteProduct
Scenario:
The product details are stored in excel
Given the application opens in browser 
When the user clicks on cart option
Then clicks on the selected product
And store the product name into excel

@TC09_RemoveProductFromCart
Scenario: Remove the product from cart
Given the application opens in browser
When the user click on cart option
Then  user selects the product
And clicks on remove

@TC10_ExcelWriteDetails
Scenario: Storing product details in excel
Given  the application opens in browser
When the user clicks on cart option
Then clicks on the selected product
And store the product name into excel

@TC11_WishList
Scenario: Adding to wishlist
Given the user launch the chrome session
When the user opens the OpenCart application page
Then the user select desktop buttonclick
And the item to wishlist

@TC12_SelectAnItem
Scenario: Select an item in desktop
Given the user launch the chrome browser
When the user opens the OpenCart homepage
Then the user select desktop
And the user select on the item 

@TC13_NumberOfProduct
Scenario: Select the number of items to be shown
Given the user launch the chrome browser
When the user opens the Opencart application page
Then the user select desktop icon
And the user selects the number

@TC14_PriceUpdation
Scenario: The price is updating or not when increasing the quantity
Given the application opens in browser
When user click on cart option
Then increase the quantity of the product
And click on refresh button

@TC15_ProductSorting
Scenario: Sorting the number of products
Given the user launch the chrome browser
When the user opens the OpenCart application page
Then the user select desktop tab
And the user selects the type of sorting

@TC16_ListView
Scenario: List View of Products
Given the user launches the opens browser and opens OpenCart application
When the user searches for products on application
And clicks on search button and click on List View
Then Results should be viewed in List View

@TC17_Filter
Scenario: Filter Products
Given the user launches the chrome browser and opens OpenCart application
When the user searches the his product 
And clicks on Search button and selects the the sort by filter
Then the user should see modified results
