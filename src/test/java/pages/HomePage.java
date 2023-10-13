package pages;

import org.openqa.selenium.By;

public class HomePage extends BasicPage {
	public By WebLogin = By.xpath("//a[.='Web login']");
	public By InsertNum=By.xpath("//input[@placeholder='01521xxxxxx']");
	public By ContinueButton =By.xpath("//button[@type='submit']");
	public By PIN=By.xpath("//input[@placeholder='00xxx']");

	public By Sing_IN = By.xpath("//button[@type='submit']");

	public By MIND_FRESH_SHOP =By.xpath("(//button[@type='button'][normalize-space()='Select Shop'])[1]");

	//----------Method ----------------
	public void WebLoginBtn() {
		click(WebLogin);
	}

    public void InsertNumber(String number){
		writeText(InsertNum,number);
	}
	public void SubmitBtn(){
		click(ContinueButton);
	}

	public void PINtext(String pin){
		writeText(PIN, pin);
	}

	public void SinginBtn(){
		click(Sing_IN);
	}

	public void MF_shop(){
		click(MIND_FRESH_SHOP);
	}
}
