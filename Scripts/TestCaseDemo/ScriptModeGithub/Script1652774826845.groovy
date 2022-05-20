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

//GROOVY
//membuka halaman web
WebUI.openBrowser('')

//menuju link web
WebUI.navigateToUrl('https://github.com/')

//klik tombol navigate url
WebUI.click(findTestObject('Object Repository/ManualGithub/Page_GitHub Where the world builds software  GitHub/a_Sign in'))

//mengisi text username
WebUI.setText(findTestObject('Object Repository/ManualGithub/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), "Luthfitatianandayasin@gmail.com")

//mengisi password
//encrypt-nya lewat menu -> help -> encrypt text
WebUI.setEncryptedText(findTestObject('Object Repository/ManualGithub/Page_Sign in to GitHub  GitHub/input_Password_password'), "Wk4UeWs85TxodDhrD6XgXHkx3fC/MWtp")

//click tombol login
WebUI.click(findTestObject('Object Repository/ManualGithub/Page_Sign in to GitHub  GitHub/input_Password_commit'))

//close the browser
WebUI.closeBrowser()