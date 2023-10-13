package pages;

import org.openqa.selenium.By;

public class MfContactPage extends BasicPage{
    public By Contacts = By.xpath("//img[@src='/assets/images/dashboard/tally/contacts.svg']");
    public By AddNew_Customer=By.xpath("//div//a//p[.='Add new customer']");

    public By AddName=By.xpath("//input[@placeholder='Name']");
    public By AddNumber=By.xpath("//input[@placeholder='Mobile Number']");
    public By AddEmail=By.xpath("//input[@placeholder='Email']");
    public By AddAddress=By.xpath("//input[@placeholder='Address']");
    public By AddSaveButton=By.xpath("//button[.='Save']");

//      Read
//   public  By NAME= By.xpath("//td[normalize-space()='Sorif Vai']");
   public  By NAME= By.xpath("//tbody//tr[3]/td[1]");
    public  By NUMBER= By.xpath("//tbody//tr[3]/td[2]");
//    public  By NUMBER= By.xpath("//td[normalize-space()='01551191152']");

//    update
//    public  By UpdatePerson = By.xpath("//td[normalize-space()='Sorif Vai']");
    public  By UpdatePerson = By.xpath("//tbody//tr[3]/td[1]");
    public  By EditIcon= By.xpath("//button[@class='btn btn-primary']");
    public  By UpdateNAME= By.xpath("//input[@placeholder='নাম']");
    public  By UpdateNUMBER= By.xpath("//input[@placeholder='মোবাইল নাম্বার']");
    public  By UpdateEMAIL= By.xpath("//input[@placeholder='ইমেইল']");
    public  By UpdateADDRESS= By.xpath("//input[@placeholder='ঠিকানা']");
    public  By UpdateSubmit= By.xpath("//button[.='সেভ করুন']");


// -------Delete -----------
    public By DeletePerson=By.xpath("//tbody//tr[3]/td[1]");
    public By DeleteEditIcon=By.xpath("//img[@src='/assets/images/hishabee/edit-contact.png']");
    public By DeleteIcon=By.xpath("//img[@src='/assets/images/hishabee/delelte.png']");
    public By SureDeletepop=By.xpath("//button[normalize-space()='Yes']");

//    -------method ------------
// add
    public void ContactOption(){
        click(Contacts);
    }
    public void Add_New(){click(AddNew_Customer);}
    public void A_Name(String name){writeText(AddName,name);}
    public void A_Number(String number){writeText(AddNumber,number);}
    public void A_Email(String email){writeText(AddEmail,email);}
    public void A_Address(String address){writeText(AddAddress,address);}
    public void SaveBtn(){click(AddSaveButton);}

//-------read------

   public void R_Name(){
   System.out.println("Name :"+ getText(NAME));
   }
   public void R_Number(){
   System.out.println("Number :"+ getText(NUMBER));
   }
//-------update------

    public void SelectPerson(){
        click(UpdatePerson);
    }
    public void editIcon(){
        click(EditIcon);
    }

    public void U_Name(String Uname){
        Clear(UpdateNAME);
        writeText(UpdateNAME,Uname);
    }
     public void U_Number(String Unumber){
        Clear(UpdateNUMBER);
        writeText(UpdateNUMBER,Unumber);
    }
     public void U_Email(String Uemail){
        Clear(UpdateEMAIL);
        writeText(UpdateEMAIL,Uemail);
    }
     public void U_Address(String Uaddress){
        Clear(UpdateADDRESS);
        writeText(UpdateADDRESS,Uaddress);
    }
    public void U_SubmitBtn(){
        click(UpdateSubmit);
    }

//----------Delete--------------

    public void SelectDeleteCustomer(){
        click(DeletePerson);
    }
    public void SelectEditIcon(){
        click(DeleteEditIcon);
    }
    public void SelectDeleteIcon(){
        click(DeleteIcon);
    }
 public void SureBtn(){
        click(SureDeletepop);
    }

//    public void ToAcc(){
//        Dropdown(FromAccount,"13788");
//    }
//    public void FromAcc(){
//     Dropdown(FromAccount ,"13455");
//    }
//
//
//    public void SubmitFund(){
//        click(TransferSubmit);
//    }
}
