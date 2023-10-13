package pages;

import org.openqa.selenium.By;

public class ProductListPage extends BasicPage {

    public By Standard = By.xpath("//span[normalize-space()='Standard']");
    public By ProductPage = By.xpath("//span[normalize-space()='Product List']");
    public By ProductCreate = By.xpath("//a[normalize-space()='Add New Products']");

//    p_create-----------
    public By ProductName=By.xpath("//input[@placeholder='Product Name']");
    public By Product_Wholesale_price=By.xpath("//input[@placeholder='wholesale price']");
    public By Product_Wholesale_quantity=By.xpath("//input[@placeholder='minimum quantity']");
    public By Product_Wholesale_stock=By.xpath("//input[@placeholder='Minimum available stock']");




    public By ProductSalePrice=By.xpath("//input[@placeholder='Sale Price']");
    public By ProductQuantity=By.xpath("//input[@placeholder='stock available']");
    public By ProductPrice=By.xpath("//input[@placeholder='Purchase Price']");
    public By ProductVat=By.xpath("//input[@placeholder='vat amount (%)']");
    public By ProductDetails=By.xpath("//div[@class='ql-editor ql-blank']");
    public By ProductWarranty=By.xpath("//input[@placeholder='Warranty']");
    public By ProductDiscount=By.xpath("//input[@placeholder='Discount']");
    public By Product_publish_online=By.xpath("//input[@id='onlineProduct']");
    public By ProductCategory=By.xpath("//select[contains(.,'Category Name')]");
    public By ProductS_Category=By.xpath("//select[contains(.,'Sub - category Name')]");
    public By Product_Unit=By.xpath("//select[contains(.,'Select a item')]");
    public By Product_ADDBtn=By.xpath("//button[normalize-space()='Add products']");

//    ---- update-----------------------------
    public By ScrUp=By.xpath("//h5[normalize-space()='Product info']");
    public By UpSelectProduct =By.xpath("//tbody//tr//th[1]");
    public By UpEditProduct =By.xpath("//img[@src='/assets/images/hishabee/edit-blue.svg']");
    public By UpTextProduct =By.xpath("//div[@class='ql-editor']");
    public By dropBoxProduct =By.xpath("//input[@id='onlineProduct']");
    public By CProduct =By.xpath("//div[@class='col-md-8']//div[5]//div[1]//div[1]//select[1]");
    public By UpBtnProduct =By.xpath("//button[contains(.,'Update the product')]");


//    --------Delete-------------------------

    public By DeleteProSelect=By.xpath("//tbody/tr[2]/th[1]");
    public By DeleteProIcon=By.xpath("//img[@src='/assets/images/hishabee/delete-bg-none.svg']");
    public By DeleteProSure=By.xpath("//button[normalize-space()='Yes']");

//----------- read /get -------------------------

    public By ReadSelectPro= By.xpath("//tbody//tr[1]//th[1]");
    public By ProName= By.xpath("//div[@class='col-11']//h5[contains(text(),'Bay')]");
    public By ProStockNumber= By.xpath("//h5[normalize-space()='70']");
    public By ProSellingPrice= By.xpath("//h5[@class='fw-bolder'][contains(text(),'৳ 400')]");
    public By ProPurchasePrice= By.xpath("//h5[contains(text(),'৳ 550')]");
    public By ProDiscount= By.xpath("//h5[normalize-space()='% 1100']");
    public By ProSub_Category= By.xpath("//h5[normalize-space()='Women Formal Shoes']");
    public By ProVat= By.xpath("//h5[normalize-space()='35']");
    public By ProWarranty= By.xpath("//span[normalize-space()='DAY']");
    public By ProNumber= By.xpath("//h5[contains(text(),'৳ 7000')]");
//    ------method ============

    public void standardOption(){
        click(Standard);
    }
    public void PoductListOption(){
        click(ProductPage);
    }

    public void P_CreateBtn(){
        click(ProductCreate);
    }

//----------p create or add --------------------------
    public void P_Name(String PName){
        writeText(ProductName, PName);

    }

    public void P_Wholesale_price(String wSalePrice){
        writeText(Product_Wholesale_price,wSalePrice);
    }
    public void P_Wholesale_quantity(String wSaleQ){
        writeText(Product_Wholesale_quantity,wSaleQ);

    } public void P_Wholesale_stock(String wStock){
        writeText(Product_Wholesale_stock,wStock);
    }
    public void P_SalePrice(String PSprice){
        writeText(ProductSalePrice,PSprice);

    }
    public void P_Stock(String PStock){
      writeText(ProductQuantity,PStock);
    }
    public void P_Price(String PPrice){
      writeText(ProductPrice,PPrice);
    }
    public void P_Vat(String Pvat){
      writeText(ProductVat,Pvat);
    }

    public void P_Scroll(){
      Scroll(ProductCategory);
    }
    public void P_Details(String Pdetails){
       writeText(ProductDetails,Pdetails);
    }
     public void P_Warranty(String Pw){
       writeText(ProductWarranty,Pw);
    }
     public void P_Discount(String PD){
       writeText(ProductDiscount,PD);
    }


    public void P_online(){
       click(Product_publish_online);
    }
    public void P_Category(){
      Dropdown(ProductCategory,"Clothes");
    }
    public void P_SCategory(){
        Dropdown(ProductS_Category,"Men Clothing");

    }
    public void P_Scroll_addBtn(){
        Scroll(Product_ADDBtn);
    }

     public void P_Unit(){
        Dropdown(Product_Unit,"inch");

    }


public void P_addBtn(){
      click(Product_ADDBtn);
    }

//----------------- update part ----------------------

    public void U_SelectProduct(){
        click(UpSelectProduct);
    }
    public void U_EditProduct(){
        click(UpEditProduct);
    }


    public void U_P_Name(String PName){
        Clear(ProductName);
        writeText(ProductName, PName);

    }

    public void U_P_Wholesale_price(String wSalePrice){
        Clear(Product_Wholesale_price);
        writeText(Product_Wholesale_price,wSalePrice);
    }

    public void scr_Up(){
        Scroll(ScrUp);
    }
    public void U_P_Wholesale_quantity(String wSaleQ){
        Clear(Product_Wholesale_quantity);
        writeText(Product_Wholesale_quantity,wSaleQ);

    } public void U_P_Wholesale_stock(String wStock){
        Clear(Product_Wholesale_stock);
        writeText(Product_Wholesale_stock,wStock);
    }
    public void U_P_SalePrice(String PSprice){
        Clear(ProductSalePrice);
        writeText(ProductSalePrice,PSprice);

    }
    public void U_P_Stock(String PStock){
        Clear(ProductQuantity);
        writeText(ProductQuantity,PStock);
    }
    public void U_P_Price(String PPrice){
        Clear(ProductPrice);
        writeText(ProductPrice,PPrice);
    }
    public void U_P_Vat(String Pvat){
        Clear(ProductVat);
        writeText(ProductVat,Pvat);
    }

    public void U_P_Scroll(){
        Scroll(dropBoxProduct);
    }
    public void U_Pro_Scroll(){
        Scroll(CProduct);
    }
    public void U_P_Details(String Pdetails){
//        Clear(UpTextProduct);
        writeText(UpTextProduct,Pdetails);
    }
    public void U_P_Warranty(String Pwarranty){
        Clear(ProductWarranty);
        writeText(ProductWarranty,Pwarranty);
    }
    public void U_P_Discount(String PD){
//        Clear(ProductDiscount);
        writeText(ProductDiscount,PD);
    }

    public void U_P_online(){
        click(Product_publish_online);
    }
    public void U_P_Category(){
        Dropdown(ProductCategory,"Shoes");
    }
    public void U_P_SCategory(){
        Dropdown(ProductS_Category,"Women Formal Shoes");

    }
    public void U_P_Scroll_addBtn(){
        Scroll(UpBtnProduct);
    }

    public void U_P_Unit(){
        Dropdown(Product_Unit,"inch");

    }
    public void U_P_addBtn(){
        click(UpBtnProduct);
    }


//    ----------read method ---------------

    public void R_Product(){
        click(ReadSelectPro);
    }
   public void R_Name(){
        System.out.println("Product Name :" + getText(ProName));
   }
   public void R_StockNumber(){
        System.out.println("Stock Number :" +getText(ProStockNumber));
   }
   public void R_SellingPrice(){
        System.out.println("Selling Price :" +getText(ProSellingPrice));
   }
   public void R_PurchasePrice(){
        System.out.println("Purchase Price :" +getText(ProPurchasePrice));
    }
public void R_Discount(){
        System.out.println("Discount :" +getText(ProDiscount));
   }
public void R_S_category(){
        System.out.println("Product Sub-Category :" +getText(ProSub_Category));
   }
public void R_Vat(){
        System.out.println("Product Vat :" +getText(ProVat));
   }
public void R_Warranty(){
        System.out.println("Product Warranty :" +getText(ProWarranty));
   }
   public void R_Number(){
        System.out.println("Product Number :" +getText(ProNumber));
   }


//----------delete mahod---------------

    public void D_ProductPage(){
        click(ProductPage);

    }public void D_selectPro(){
        click(DeleteProSelect);
    }
    public void D_selectProIcon(){
        click(DeleteProIcon);
    }
 public void D_selectProSure(){
        click(DeleteProSure);
    }


}
