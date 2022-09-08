package testNG_Demo.RegistrationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegiserDemo {
	public WebDriver driver;

	//Input path
	String pageTitle="Register For Demo";
	String firstNameInputValue="Chandraprakash";
	String lastNameInputValue="Gunasekaran";
	String addressOneInputValue="S/o. K.Gunasekaran,33A";
	String addressStreetInputValue="Sethu street, Nehru Nagar";
	String addressCityInputValue="Tiruchengode";
	String addressStateInputValue="Tamilnadu";
	String pincodeInputValue="637211";
	String countryOneInputValue="India";
	String emailInputValue="chandar@gmail.com";
	String dateInputValue="07/28/2022";
	String hourOneInputValue="17";
	String minuteOneInputValue="15";
	String mobileInputValue="9500271349";
	String courseInputValue="Selenium WebDriver";
	String courseSecondInputValue="TestNG";
	String queryInputValue="Thanks for giving opportunity.No more Query";
	String verifyInputValue="//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label";
	//String verifyInputValue="34";
	String successfulPageTextDisplay="Registration Form is Successfully Submitted";


	//WebElement path
	String registrationFormTitleLoactor ="//*[@id=\"item-vfb-1\"]/div/h3";
	String firstNameLocator="vfb-5";
	String lastNameLocator="vfb-7";
	String maleGenderLocator="vfb-8-1";
	String femaleGenderLocator="vfb-8-2";
	String addressOneLocator="vfb-13-address";
	String addressStreetLocator="vfb-13-address-2";
	String addressCityLocator="vfb-13-city";
	String addressStateLocator="vfb-13-state";
	String pincodeLocator="vfb-13-zip";
	String countryLocator="vfb-13-country";
	String emailLocator="vfb-14";
	String dateLocator="vfb-18";
	String hourLocator="vfb-16-hour";
	String minuteLocator="vfb-16-min";
	String mobileLocator="vfb-19";
	String courseLocator="vfb-20-0";
	String courseSecondLocator="vfb-20-2";
	String queryLocator="vfb-23";
	String verifyLocator="vfb-3";
	String submitLocator="vfb-4";
	String succInputValueLocator="//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div[1]/div/div/div/div/div";


	@Test(priority=1)
	public void LaunchApplication() {

		//Setting system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");		
		driver = new ChromeDriver();

		String url ="https://nxtgenaiacademy.com";
		//Registration page Launch URL
		driver.get(url);

		// Maximize the application
		driver.manage().window().maximize();
		System.out.println("Launch Application");

	}

	@Test(priority=2)
	public void SelectRegistrationForm() {
		
		System.out.println("Select Registration");

		//Action class
		Actions action = new Actions(driver);

		//Perform Mouse hover above QA Automation
		//Declare WebElement Object
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();

		//Perform Mouse hover above practice Automation from QA Automation
		//Declare WebElement Object
		WebElement practAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practAutomation).perform();

		//Click Registration Form
		//Declare WebElement Object
		WebElement regForm = driver.findElement(By.linkText("Demo Site – Registration Form"));
		regForm.click();

		System.out.println("Welcome to Registration Form. Registration Form is Successfully Opened");
		System.out.println("----------------------------------------");
		System.out.println("Registration Page End to End Automation Demo ");
		System.out.println("----------------------------------------");
		
		



	}

	@Test(priority=3)
	public void RegisterUser() {
		
		System.out.println("Register User");

		//Registration Page title 
		//Declare WebElement Object
		WebElement registerPageTitle=driver.findElement(By.xpath(registrationFormTitleLoactor));


		//Verify the Registration page title is Displayed or Not
		if(registerPageTitle.isDisplayed())
		{
			System.out.println("Registration Page Title is Displayed");
		}
		else {
			System.out.println("Registration Page Title is not Displayed");
		}

		//Verify the Registration page title is Enabled or Not
		if(registerPageTitle.isEnabled())
		{
			System.out.println("Registration Page Title is Enabled");
		}
		else {
			System.out.println("Registration Page Title is Not Enabled");
		}

		//Validating the Registration Page title text
		String actualRegPageTitleText=registerPageTitle.getText();
		String exceptedRegPageTitleText=pageTitle;
		if(actualRegPageTitleText.equals(exceptedRegPageTitleText))
		{
			System.out.println("Actual and Excepted Title Page Text is Same");
			System.out.println("Registration Page Title is \""+actualRegPageTitleText+"\"");
		}
		else
		{
			System.out.println("Actual and Excepted Title Page Text is Not Same");
			System.out.println("Actual Page Title is \""+actualRegPageTitleText+"\"");
			System.out.println("Register Page Title is \""+exceptedRegPageTitleText+"\"");
		}

		System.out.println("----------------------------------------");
		//Enter First Name Text Box
		//Declare WebElement Object
		WebElement firstNameElement =driver.findElement(By.id(firstNameLocator));

		//Verify the First Name Text box is Displayed or Not
		if(firstNameElement.isDisplayed())
		{
			System.out.println("First Name Text Box is Displayed");
		}
		else
		{
			System.out.println("First Name Text Box is Not Displayed");
		}

		//Verify the First Name Text box is Enabled or Not
		if(firstNameElement.isEnabled())
		{
			System.out.println("First Name Text Box is Enabled");
			//Enabled mean Passing Input Value
			firstNameElement.sendKeys(firstNameInputValue);
			System.out.println("First Name is "+firstNameInputValue);
		}
		else
		{
			System.out.println("First Name Text Box is Not Enabled");
		}

		System.out.println("----------------------------------------");


		//Enter Last Name Text Box
		//Declare WebElement Object
		WebElement lastNameElement =driver.findElement(By.id(lastNameLocator));

		//Verify the Last Name Text box is Displayed or Not
		if(lastNameElement.isDisplayed())
		{
			System.out.println("Last Name Text Box is Displayed");
		}
		else
		{
			System.out.println("Last Name Text Box is Not Displayed");
		}

		//Verify the Last Name Text box is Enabled or Not
		if(lastNameElement.isEnabled())
		{
			System.out.println("Last Name Text Box is Enabled");
			//Enabled mean Passing Input Value
			lastNameElement.sendKeys(lastNameInputValue);
			System.out.println("Last Name is "+lastNameInputValue);
		}
		else
		{
			System.out.println("Last Name Text Box is Not Enabled");
		}
		System.out.println("----------------------------------------");



		//Select Gender Radio Button
		//Declare WebElement Object
		WebElement maleElement = driver.findElement(By.id(maleGenderLocator));
		WebElement femaleElement = driver.findElement(By.id(femaleGenderLocator));


		//Verify Male Button is Displayed or Not
		if(maleElement.isDisplayed())
		{
			System.out.println("Male Radio Button is Displayed");

		}
		else
		{
			System.out.println("Male Radio Button is Not Displayed");
		}

		//Verify Male Button is Enabled or Not
		if(maleElement.isEnabled())
		{
			System.out.println("Male Radio Button is Enabled");
			//Enabled mean Passing Input Value
			maleElement.click();
		}
		else
		{
			System.out.println("Male Radio Button is Not Enabled");
		}



		//Verify Female Button is Displayed or Not
		if(femaleElement.isDisplayed())
		{
			System.out.println("Female Radio Button is Displayed");

		}
		else
		{
			System.out.println("Female Radio Button is Not Displayed");
		}

		//Verify Female Button is Enabled or Not
		if(femaleElement.isEnabled())
		{
			System.out.println("Female Radio Button is Enabled");
		}
		else
		{
			System.out.println("Female Radio Button is Not Enabled");
		}

		//Validate that Which Radio button selected
		if(maleElement.isSelected())
		{
			System.out.println("Male Gender is Selected");
		}
		else if(femaleElement.isSelected()){
			System.out.println("Female Gender is Selected");
		}
		else {
			System.out.println("Gender is Not Selected");
		}

		System.out.println("----------------------------------------");
		//Enter Street Address Text box
		//Declare WebElement Object
		WebElement addressOneElement =driver.findElement(By.id(addressOneLocator));


		//Verify the Address Text box is Displayed or Not
		if(addressOneElement.isDisplayed())
		{
			System.out.println("Street Address Text Box is Displayed");
		}
		else
		{
			System.out.println("Street Address Text Box is Not Displayed");
		}

		//Verify the Address Text box is Enabled or Not
		if(addressOneElement.isEnabled())
		{
			System.out.println("Street Address Text Box is Enabled");
			//Enabled mean Passing Input Value
			addressOneElement.sendKeys(addressOneInputValue);
			System.out.println("Street Address is "+addressOneInputValue);
		}
		else
		{
			System.out.println("Street Address Text box is Not Enabled");
		}

		System.out.println("----------------------------------------");


		//Enter Apartment Address Text box
		//Declare WebElement Object
		WebElement addressStreetElement =driver.findElement(By.id(addressStreetLocator));


		//Verify the Apartment Address Text box is Displayed or Not
		if(addressStreetElement.isDisplayed())
		{
			System.out.println("Apartment Address Text Box is Displayed");
		}
		else
		{
			System.out.println("Apartment Address Text Box is Not Displayed");
		}

		//Verify the Apartment Address Text box is Enabled or Not
		if(addressStreetElement.isEnabled())
		{
			System.out.println("Apartment Address Text Box is Enabled");
			//Enabled mean Passing Input Value
			addressStreetElement.sendKeys(addressStreetInputValue);
			System.out.println("Apartment Address is "+addressStreetInputValue);
		}
		else
		{
			System.out.println(" Apartment Address Text Box is Not Enabled");
		}
		System.out.println("----------------------------------------");


		//Enter City Text box
		//Declare WebElement Object
		WebElement addressCityElement =driver.findElement(By.id(addressCityLocator));



		//Verify the City Address Text box is Displayed or Not
		if(addressCityElement.isDisplayed())
		{
			System.out.println("City Address Text Box is Displayed");
		}
		else
		{
			System.out.println("City Address Text Box is Not Displayed");
		}


		//Verify the city Address Text box is Enabled or Not
		if(addressCityElement.isEnabled())
		{
			System.out.println("City Address Text Box is Enabled");
			//Enabled mean Passing Input Value
			addressCityElement.sendKeys(addressCityInputValue);
			System.out.println("City Address is "+addressCityInputValue);
		}
		else
		{
			System.out.println("City Address Text Box is Disabled");
		}
		System.out.println("----------------------------------------");


		//Enter State Text box
		//Declare WebElement Object
		WebElement addressStateElement =driver.findElement(By.id(addressStateLocator));

		//Verify the State Address Text box is Displayed or Not
		if(addressStateElement.isDisplayed())
		{
			System.out.println("State Address Text Box is Displayed");
		}
		else
		{
			System.out.println("State Address Text Box is Not Displayed");
		}

		//Verify the State Address Text box is Enabled or Not
		if(addressStateElement.isEnabled())
		{
			System.out.println("State Address Text Box is Enabled");
			//Enabled mean Passing Input Value
			addressStateElement.sendKeys(addressStateInputValue);
			System.out.println("State Address is "+addressStateInputValue);
		}
		else
		{
			System.out.println("State Address Text box is Disabled");
		}

		System.out.println("----------------------------------------");


		//Enter Pincode Text box
		//Declare WebElement Object
		WebElement pincodeElement =driver.findElement(By.id(pincodeLocator));



		//Verify the Pincode Text box is Displayed or Not
		if(pincodeElement.isDisplayed())
		{
			System.out.println("Pincode Text Box is Displayed");
		}
		else
		{
			System.out.println("Pincode Text Box is Not Displayed");
		}

		//Verify the Pincode Text box is Enabled or Not
		if(pincodeElement.isEnabled())
		{
			System.out.println("Pincode Text Box is Enabled");
			//Enabled mean Passing Input Value
			pincodeElement.sendKeys(pincodeInputValue);
			System.out.println("Pincode is "+pincodeInputValue);
		}
		else
		{
			System.out.println("Pincode Text Box is Not Enabled");
		}
		System.out.println("----------------------------------------");





		//Select Country from Dropdown
		//Declare WebElement Object
		WebElement countryDropDownElement =driver.findElement(By.id(countryLocator));

		//using select
		Select cyDropDown=new Select(countryDropDownElement);




		//Verify the Country Dropdown is Displayed or Not
		if(countryDropDownElement.isDisplayed())
		{
			System.out.println("Country Dropdown is Displayed");
		}
		else
		{
			System.out.println("Country Dropdown is Not Displayed");
		}

		//Verify the Country Dropdown is Enabled or Not
		if(countryDropDownElement.isEnabled())
		{
			System.out.println("Country Dropdown is Enabled");

			//Enabled mean Passing Input Value
			//pass select by Visible Text method
			cyDropDown.selectByVisibleText(countryOneInputValue);
			System.out.println("Country is "+countryOneInputValue);

		}
		else
		{
			System.out.println("Country Dropdown is Not Enabled");
		}


		System.out.println("----------------------------------------");



		//Enter email Text Box
		//Declare WebElement Object
		WebElement emailElement =driver.findElement(By.id(emailLocator));



		//Verify the email Text box is Displayed or Not
		if(emailElement.isDisplayed())
		{
			System.out.println("email Text Box is Displayed");
		}
		else
		{
			System.out.println("email Text Box is Not Displayed");
		}

		//Verify the email Text box is Enabled or Not
		if(emailElement.isEnabled())
		{
			System.out.println("email Text Box is Enabled");
			//Enabled mean Passing Input Value
			emailElement.sendKeys(emailInputValue);
			System.out.println("email ID is "+emailInputValue);
		}
		else
		{
			System.out.println("email Text Box is Not Enabled");
		}
		System.out.println("----------------------------------------");



		//Enter date 
		//Declare WebElement Object
		WebElement dateElement =driver.findElement(By.id(dateLocator));


		//Verify the Date Dropdown is Displayed or Not
		if(dateElement.isDisplayed())
		{
			System.out.println("Date Dropdown is Displayed");
		}
		else
		{
			System.out.println("Date Dropdown is Not Displayed");
		}

		//Verify the Date Dropdown is Enabled or Not
		if(dateElement.isEnabled())
		{
			System.out.println("Date Dropdown is Enabled");
			//Enabled mean Passing Input Value
			dateElement.sendKeys(dateInputValue);
			System.out.println("Selected Date is "+dateInputValue);
		}
		else
		{
			System.out.println("Date Dropdown is Not Enabled");
		}
		System.out.println("----------------------------------------");






		//Select Time
		//select Hour
		//Declare WebElement Object
		WebElement hourDropDownElement =driver.findElement(By.id(hourLocator));

		//using Select
		Select hrDropDown=new Select(hourDropDownElement);

		//Verify the Hour Dropdown is Displayed or Not
		if(hourDropDownElement.isDisplayed())
		{
			System.out.println("Hour Dropdown is Displayed");
		}
		else
		{
			System.out.println("Hour Dropdown is Not Displayed");
		}

		//Verify the Hour Dropdown is Enabled or Not
		if(hourDropDownElement.isEnabled())
		{
			System.out.println("Hour Dropdown is Enabled");

			//Enabled mean Passing Input Value
			//pass select by Visible Text method
			hrDropDown.selectByVisibleText(hourOneInputValue);
			System.out.println("Hour is "+hourOneInputValue);

		}
		else
		{
			System.out.println("Hour Dropdown is Not Enabled");
		}


		System.out.println("----------------------------------------");



		//Select Minute
		//Declare WebElement Object
		WebElement minuteDropDownElement =driver.findElement(By.id(minuteLocator));


		//using Select
		Select minDropDown=new Select(minuteDropDownElement);


		//Verify the Minute Dropdown is Displayed or Not
		if(minuteDropDownElement.isDisplayed())
		{
			System.out.println("Minute Dropdown is Displayed");
		}
		else
		{
			System.out.println("Minute Dropdown is Not Displayed");
		}

		//Verify the Minute Dropdown is Enabled or Not
		if(minuteDropDownElement.isEnabled())
		{
			System.out.println("Minute Dropdown is Enabled");

			//Enabled mean Passing Input Value
			//pass select by Visible Text method
			minDropDown.selectByVisibleText(minuteOneInputValue);
			System.out.println("Minute is "+minuteOneInputValue);

		}
		else
		{
			System.out.println("Minute Dropdown is Not Enabled");
		}


		System.out.println("----------------------------------------");


		//Enter Mobile number Text Box
		//Declare WebElement Object
		WebElement mobileElement =driver.findElement(By.id(mobileLocator));


		//Verify the Mobile Number Text box is Displayed or Not
		if(mobileElement.isDisplayed())
		{
			System.out.println("Mobile Number Text Box is Displayed");
		}
		else
		{
			System.out.println("Mobile Number Text Box is Not Displayed");
		}

		//Verify the Mobile Number Text box is Enabled or Not
		if(mobileElement.isEnabled())
		{
			System.out.println("Mobile Number Text Box is Enabled");
			//Enabled mean Passing Input Value
			mobileElement.sendKeys(mobileInputValue);
			System.out.println("Mobile Number is "+mobileInputValue);
		}
		else
		{
			System.out.println("Mobile Number Text Box is Disabled");
		}
		System.out.println("----------------------------------------");

		//Selecting Two courses from Check box
		//Select First Course 
		//Declare WebElement Object
		WebElement courseElement = driver.findElement(By.id(courseLocator));


		//Verify the Course check box is Displayed or Not
		if(courseElement.isDisplayed())
		{
			System.out.println("Course Check Box is Displayed");
		}
		else
		{
			System.out.println("Course Check Box is Not Displayed");
		}

		//Verify the Course First check box is Enabled or Not
		if(courseElement.isEnabled())
		{
			System.out.println("Course First Check Box is Enabled");
			//Enabled mean Passing Input Value
			courseElement.click();

			if(courseElement.isSelected())
			{

				System.out.println("First Course Check Box is selected");
				System.out.println("Selected First Course is "+courseInputValue);
			}
			else {
				System.out.println("First Course Check Box is Not Selected");
			}

		}
		else
		{
			System.out.println("First Course Check Box is Not Enabled");
		}



		System.out.println("----------------------------------------");

		//Select Course Second
		//Declare WebElement Object
		WebElement courseSecondElement = driver.findElement(By.id(courseSecondLocator));



		//Verify the Second Course check box  is Displayed or Not
		if(courseSecondElement.isDisplayed())
		{
			System.out.println("Second Course Check Box is Displayed");
		}
		else
		{
			System.out.println("Second Course Check Box is Not Displayed");
		}

		//Verify the Course check box is Enabled or Not
		if(courseSecondElement.isEnabled())
		{
			System.out.println("Second Course Check box is Enabled");
			//Enabled mean Passing Input Value
			courseSecondElement.click();
			if(courseSecondElement.isSelected())
			{
				System.out.println("Second Course Check Box is Selected");
				System.out.println("Selected Second Course is "+courseSecondInputValue);
			}
			else {
				System.out.println("Second Course Check Box is Not Selected");
			}

		}
		else
		{
			System.out.println("Second Course Check Box is Not Enabled");
		}



		System.out.println("----------------------------------------");




		//Enter Query Text Box
		//Declare WebElement Object
		WebElement queryElement =driver.findElement(By.id(queryLocator));


		//Verify the Query Text box is Displayed or Not
		if(queryElement.isDisplayed())
		{
			System.out.println("Query Text Box is Displayed");
		}
		else
		{
			System.out.println("Query Text Box is Not Displayed");
		}

		//Verify the Query Text box is Enabled or Not
		if(queryElement.isEnabled())
		{
			System.out.println("Query Text Box is Enabled");
			//Enabled mean Passing Input Value
			queryElement.sendKeys(queryInputValue);
			System.out.println("Query Text is "+queryInputValue);
		}
		else
		{
			System.out.println("Query Text box is Not Enabled");
		}
		System.out.println("----------------------------------------");



		//Enter Verification Text Box
		//Declare WebElement Object
		WebElement verifyFinalInput=driver.findElement(By.xpath(verifyInputValue));

		//Getting text from Xpath
		String valueGet= verifyFinalInput.getText();
		//System.out.println(ValueGet);

		//split the value from string

		String valueSplit[]=valueGet.split(":");
		for(String count : valueSplit)
		{
			//Printing value
			//System.out.println(count);
		}
		WebElement verifyElement =driver.findElement(By.id(verifyLocator));


		//Verify the Verification Text box is Displayed or Not
		if(verifyElement.isDisplayed())
		{
			System.out.println("Verification Text Box is Displayed");
		}
		else
		{
			System.out.println("Verification Text Box is Not Displayed");
		}

		//Verify the Verification Text box is Enabled or Not
		if(verifyElement.isEnabled())
		{
			System.out.println("Verification Text Box is Enabled");
			//Enabled mean Passing Input Value
			verifyElement.sendKeys(valueSplit[1].trim());
			System.out.println("Verification Text is "+valueSplit[1].trim());
		}
		else
		{
			System.out.println("Verification Text Box is Not Enabled");
		}
		System.out.println("----------------------------------------");






		//Click Submit Button
		//Declare WebElement Object
		WebElement submitElement =driver.findElement(By.id(submitLocator));



		//Verify the Submit Button is Displayed or Not
		if(submitElement.isDisplayed())
		{
			System.out.println("Submit Button is Displayed");
		}
		else
		{
			System.out.println("Submit Button is Not Displayed");
		}

		//Verify the Successful Button is Enabled or Not
		if(submitElement.isEnabled())
		{
			System.out.println("Submit Button is Enabled");
			//Enabled mean Passing Input Value
			//Click option
			submitElement.click();
			System.out.println("Submit Button is Successfully Clicked");

		}
		else
		{
			System.out.println("Submit Button is Not Enabled");
		}
		System.out.println("----------------------------------------");


	}

	@Test(priority=4)
	public void ValidationMessage() {
		
		System.out.println("Validation Message");
		// Validate the Successful Registration Text

		//Declare WebElement Object
		WebElement successfulPath=driver.findElement(By.xpath(succInputValueLocator));

		//Getting text
		String actualSuccessfulText=successfulPath.getText();
		//System.out.println("actual "+actualSuccessfulText);

		String exceptedSuccessfulText=successfulPageTextDisplay;

		if(actualSuccessfulText.contains(exceptedSuccessfulText))
		{
			System.out.println("Registration Form is Successfully Submitted");

			//Print the Transaction Id from the text
			//split the value from string

			String valueSuccessSplit[]=actualSuccessfulText.split(":");
			for(String countValue : valueSuccessSplit)
			{
				//Printing value for verification
				//System.out.println(countValue);
			}
			//printing the transaction id in successful page
			System.out.println("Transaction ID is : "+valueSuccessSplit[1].trim());
			System.out.println("Actual and Excepted Registration Successful Text Message is Same");

		}
		else
		{
			System.out.println("Actual and Excepted Registration Successful Text Message is Not Same");
			System.out.println("Actual Successful Message is \""+actualSuccessfulText+"\"");
			System.out.println("Excepted Successful Message is \""+exceptedSuccessfulText+"\"");
		}
		System.out.println("----------------------------------------");
	}

	@Test(priority=5)
	public void CloseApplication() {
		
		System.out.println("Close Application");
		//Close the application
		driver.close();

	}

}
