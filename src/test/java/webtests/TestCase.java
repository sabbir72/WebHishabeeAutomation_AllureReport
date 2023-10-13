package webtests;
import org.testng.annotations.Test;
import pages.*;
import utilities.DriverSetup;

public class TestCase extends DriverSetup{
	HomePage WebHomePage = new HomePage();
	MfContactPage WebContactPage = new MfContactPage();
	ProductListPage WebProductPage= new ProductListPage();




	@Test
	public void loginTest() throws InterruptedException {
		getDriver().get("https://hishabee.business/");
		Thread.sleep(3000);
		WebHomePage.WebLoginBtn();
		Thread.sleep(5000);
		WebHomePage.InsertNumber("01681387906");
		WebHomePage.SubmitBtn();
		System.out.println("Login Done");
		Thread.sleep(3000);

	}
	@Test
	public void pinSetupAndSingIn() throws InterruptedException {
		WebHomePage.PINtext("12121");
		WebHomePage.SinginBtn();
		WebHomePage.MF_shop();
		System.out.println("Pin Done");
		Thread.sleep(5000);
	}

	@Test
	public void ContactAdd() throws InterruptedException {
		WebContactPage.ContactOption();
		Thread.sleep(3000);
		WebContactPage.Add_New();
		WebContactPage.A_Name("Sorif Miah");
		WebContactPage.A_Number("01551191153");
		WebContactPage.A_Email("Sorifa@gmail.com");
		WebContactPage.A_Address("BD, Khilgon");
		WebContactPage.SaveBtn();
		System.out.println("Add Contact Done");
		Thread.sleep(3000);
	}
@Test
	public void ContactRead() throws InterruptedException {
		System.out.println("Contact Read");
	    WebContactPage.R_Name();
		WebContactPage.R_Number();
        Thread.sleep(3000);
}
@Test
	public void ContactUpDate() throws InterruptedException {
	    WebContactPage.SelectPerson();
		WebContactPage.editIcon();
		Thread.sleep(3000);
		WebContactPage.U_Name("Sorifull Islam");
		WebContactPage.U_Number("01912010020");
		WebContactPage.U_Email("soriful@gmail.com");
		WebContactPage.U_Address("Kishoregoaj");
		WebContactPage.U_SubmitBtn();
	   System.out.println("Contact updated");
	   Thread.sleep(3000);
  }

  @Test
	public void DeleteContact() throws InterruptedException {
		WebContactPage.SelectDeleteCustomer();
		WebContactPage.SelectEditIcon();
		WebContactPage.SelectDeleteIcon();
		WebContactPage.SureBtn();
	    System.out.println("Contact delete");
	    Thread.sleep(3000);

  }

  @Test
	public void CreateProduct() throws InterruptedException {
		WebProductPage.standardOption();
		WebProductPage.PoductListOption();
		WebProductPage.P_CreateBtn();
		Thread.sleep(3000);
		WebProductPage.P_Name("Shirt");
	    Thread.sleep(1000);
		WebProductPage.P_Wholesale_price("410");
		WebProductPage.P_Wholesale_quantity("700");
		WebProductPage.P_Wholesale_stock("9000");
		WebProductPage.P_SalePrice("300");
		WebProductPage.P_Stock("60");
	    Thread.sleep(3000);
		WebProductPage.P_Price("300");
		WebProductPage.P_Vat("65");
		WebProductPage.P_Price("550");
	    WebProductPage.P_Warranty("2");
		WebProductPage.P_Details("This is good. Brand Name MFT.");
	    WebProductPage.ScrollByXY(0,100);
//		WebProductPage.P_online();
		WebProductPage.P_Discount("10");
	    WebProductPage.P_Scroll();
		WebProductPage.P_Category();
	    Thread.sleep(3000);
		WebProductPage.P_SCategory();
		WebProductPage.P_Scroll_addBtn();
		WebProductPage.P_Unit();
		WebProductPage.P_addBtn();
	  System.out.println("Add Product Done");

  }

	@Test
	public void UpdateProduct() throws InterruptedException {
		WebProductPage.U_SelectProduct();

		Thread.sleep(2000);
		WebProductPage.scr_Up();
		WebProductPage.U_EditProduct();
		Thread.sleep(3000);
		WebProductPage.U_P_Name("Bay");
		Thread.sleep(1000);
		WebProductPage.U_P_Wholesale_price("510");
		WebProductPage.U_P_Wholesale_quantity("600");
		WebProductPage.U_P_Wholesale_stock("7000");
		WebProductPage.U_P_SalePrice("400");
		WebProductPage.U_P_Stock("70");
		Thread.sleep(3000);
		WebProductPage.U_P_Price("450");
		WebProductPage.U_P_Vat("35");
		WebProductPage.U_P_Price("550");
		WebProductPage.U_P_Scroll();
		Thread.sleep(3000);
		WebProductPage.U_P_Details("This is good. Brand Name BAY.");
		WebProductPage.U_Pro_Scroll();
		WebProductPage.U_P_online();
		Thread.sleep(3000);
		WebProductPage.U_P_Discount("100");
		WebProductPage.U_P_Category();
		Thread.sleep(3000);
		WebProductPage.U_P_SCategory();
		WebProductPage.U_P_Scroll_addBtn();
		WebProductPage.U_P_Unit();
		WebProductPage.U_P_addBtn();
		System.out.println("update Product Done");
		Thread.sleep(3000);

	}

	@Test
	public void ReadProduct() throws InterruptedException {
		WebProductPage.R_Product();
		WebProductPage.R_Name();
		WebProductPage.R_StockNumber();
		WebProductPage.R_SellingPrice();
		WebProductPage.R_PurchasePrice();
		WebProductPage.R_Discount();
		Thread.sleep(3000);
		WebProductPage.R_S_category();
		WebProductPage.R_Vat();
		WebProductPage.R_Warranty();
		WebProductPage.R_Number();
		System.out.println("Read Product Done");
		Thread.sleep(5000);
	}
	@Test
	public void DeleteProductItem(){
		WebProductPage.D_ProductPage();
		WebProductPage.D_selectPro();
		WebProductPage.D_selectProIcon();
		WebProductPage.D_selectProSure();
		System.out.println("Add Product Done");
	}

	}




