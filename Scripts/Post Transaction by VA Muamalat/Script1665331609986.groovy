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

def signature = GlobalVariable.secret_key + GlobalVariable.merchant_id + GlobalVariable.amount + GlobalVariable.customer_info + GlobalVariable.payment_info + GlobalVariable.order_id;

responseHast = WS.sendRequestAndVerify(findTestObject('API/Generate sha256', [('signatureValue') : signature]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(responseHast.getResponseBodyContent())

def data = result.Digest

responseTransaction = WS.sendRequestAndVerify(findTestObject('API/Post Transactions', [('signature') : data]))

def resultTransaction = slurper.parseText(responseTransaction.getResponseBodyContent())

responseTransaction = WS.sendRequestAndVerify(findTestObject('API/Post Transactions', [('signature') : data]))

