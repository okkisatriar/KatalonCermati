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

WebUI.click(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_07804f/a_Daftar'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Email_email'), GlobalVariable.Email)

WebUI.setText(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_No. Handphone_mobilePhone'), GlobalVariable.PhoneNumber)

WebUI.setEncryptedText(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Kata Sandi_password'), 'hoUeL5BiszMeXCk//7i6Gg==')

WebUI.setEncryptedText(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Ulangi Kata Sandi_confirmPassword'), 
    'hoUeL5BiszMeXCk//7i6Gg==')

WebUI.setText(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Depan_firstName'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Belakang_lastName'), GlobalVariable.LastName)

WebUI.setText(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_KabupatenKota_cityAndProvince'), 
    'Jakarta Pusat')

WebUI.click(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_KabupatenKota_cityAndProvince'))

WebUI.click(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/button_KOTA JAKARTA PUSAT'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()