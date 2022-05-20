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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon.com/')

WebUI.click(findTestObject('Object Repository/TestRecordKatalon/Page_Katalon  Simplify Web, API, Mobile, De_2f1b85/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/TestRecordKatalon/Page_Sign in  Katalon Solution/input_Get back to Katalon_user_email'), 
    'Luthfitatianandayasin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TestRecordKatalon/Page_Sign in  Katalon Solution/input_Valid email is required to activate p_255484'), 
    'Wk4UeWs85TxodDhrD6XgXHkx3fC/MWtp')

WebUI.click(findTestObject('Object Repository/TestRecordKatalon/Page_Sign in  Katalon Solution/input_Incorrect email or password. Please t_566e02'))

WebUI.click(findTestObject('Object Repository/TestRecordKatalon/Page_Tell Us More About Yourself  Katalon Solution/div_Free                            Dont te_9d033b'))

WebUI.click(findTestObject('Object Repository/TestRecordKatalon/Page_Tell Us More About Yourself  Katalon Solution/div_Start now'))

