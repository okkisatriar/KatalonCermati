import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.urlCermati)

WebUI.click(findTestObject('Main_Page/a_Masuk'))

WebUI.setText(findTestObject('SignIn_Page/input_No. HandphoneEmail_identifier'), GlobalVariable.Email)

WebUI.setText(findTestObject('SignIn_Page/input_Kata Sandi_password'), GlobalVariable.PasswordEmail)

WebUI.click(findTestObject('SignIn_Page/button_Masuk'))

if (WebUI.verifyElementNotPresent(findTestObject('Dasboard Cermati/div_Beli reksadana mulai dari Rp 100.000'), 10) == true)
{
	String response = CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent'(GlobalVariable.Email, GlobalVariable.PasswordEmailOTP,
	GlobalVariable.LabelName)
	
	String dataCode = (response.split('CERMATI.COM : *')[1]).substring(1, 7)
	
	println(dataCode + ' data code')
	
	WebUI.click(findTestObject('OTP Cermati/input_b.sgmail.com_otp'))
	
	WebUI.setText(findTestObject('OTP Cermati/input_b.sgmail.com_otp'), dataCode)
	
	WebUI.takeFullPageScreenshot()
} else {
	WebUI.delay(5)
	
	WebUI.takeFullPageScreenshot()
}




