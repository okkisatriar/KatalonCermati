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

WebUI.click(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/button_Daftar'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('OTP Cermati/button_Kirim via Email'))

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

String response = CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent'(GlobalVariable.Email, 
    GlobalVariable.PasswordEmailOTP, GlobalVariable.LabelName)

println(response + ' data response')

String dataCode = (response.split('CERMATI.COM : *')[1]).substring(1, 7)

println(dataCode + ' data code')

WebUI.click(findTestObject('OTP Cermati/input_b.sgmail.com_otp'))

WebUI.setText(findTestObject('OTP Cermati/input_b.sgmail.com_otp'), dataCode)

WebUI.takeFullPageScreenshot()

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

