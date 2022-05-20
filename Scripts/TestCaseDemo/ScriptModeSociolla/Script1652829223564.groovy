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
WebUI.navigateToUrl('https://www.sociolla.com/')

//klik tombol navigate url
WebUI.click(findTestObject('Object Repository/TestCaseSociolla/Page_Situs Kosmetik Terlengkap  Terpercaya 1 di Indonesia - Sociolla/button_'))

WebUI.click(findTestObject('Object Repository/TestCaseSociolla/Page_Situs Kosmetik Terlengkap  Terpercaya 1 di Indonesia - Sociolla/a_LOGIN WITH'))

//mengisi text username
WebUI.setText(findTestObject('Object Repository/TestCaseSociolla/Page_Situs Kosmetik Terlengkap  Terpercaya 1 di Indonesia - Sociolla/input_Alamat Email  Username_username'), "Luthfitatianandayasin@gmail.com")

//mengisi password
//encrypt-nya lewat menu -> help -> encrypt text
WebUI.setEncryptedText(findTestObject('Object Repository/TestCaseSociolla/Page_Situs Kosmetik Terlengkap  Terpercaya 1 di Indonesia - Sociolla/input_Password_password'), "aTuQeF6FLWYewMiJz1MJvA==")

WebUI.click(findTestObject('Object Repository/TestCaseSociolla/Page_Situs Kosmetik Terlengkap  Terpercaya 1 di Indonesia - Sociolla/button_MASUK KE SOCIOLLA'))
//click tombol login
WebUI.click(findTestObject('Object Repository/TestCaseSociolla/Page_Situs Kosmetik Terlengkap  Terpercaya 1 di Indonesia - Sociolla/span_Luthfita TianandaYasin'))

WebUI.click(findTestObject('Object Repository/TestCaseSociolla/Page_Situs Kosmetik Terlengkap  Terpercaya 1 di Indonesia - Sociolla/a_LOG OUT'))
//close the browser
WebUI.closeBrowser()