package testScripts;

import org.testng.annotations.Test;

import Base.TestBase;

import pages.HomePage;
import pages.ItemDetailPage;
import pages.SearchResultPage;
import pages.ShoppingCart_checkOut;

public class PlaceOrderTest extends TestBase {
	
	HomePage homePage;
	SearchResultPage resultPage;
	ItemDetailPage itemDetailsPage;
	ShoppingCart_checkOut Checkoutpage;
  @Test(priority = 1)
  public void searchItemTest() {
	  initialize();
	  homePage = new HomePage();
	  resultPage = homePage.searchItem("Parry Hotter");
	  resultPage.selectItem();
	  
  }
  
  @Test(priority = 2)
  public void addItemToCart() {
	  
	  itemDetailsPage = new ItemDetailPage();
	  itemDetailsPage.addItemtoCart();
  }
  @Test(priority = 3)
  public void checkout() {
	  Checkoutpage = new ShoppingCart_checkOut();
	  Checkoutpage.checkoutbutton();
	  
  }
}
