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
WebUI.navigateToUrl('https://www.berrybenka.com/')

//klik tombol navigate url
WebUI.click(findTestObject('Object Repository/TestCaseBerrybenka/Page_Toko Fashion Wanita dan Pria Online.  Berrybenka.com/a_Masuk  daftar'))

//mengisi text username
WebUI.setText(findTestObject('Object Repository/TestCaseBerrybenka/Page_Toko Fashion Wanita dan Pria Online.  Berrybenka.com/input_login_customer_email'), 
    'Luthfitatianandayasin@gmail.com')

//mengisi password
//encrypt-nya lewat menu -> help -> encrypt text
WebUI.setEncryptedText(findTestObject('Object Repository/TestCaseBerrybenka/Page_Toko Fashion Wanita dan Pria Online.  Berrybenka.com/input_login_password'), 
    'aTuQeF6FLWYewMiJz1MJvA==')

WebUI.click(findTestObject('Object Repository/TestCaseBerrybenka/Page_Toko Fashion Wanita dan Pria Online.  Berrybenka.com/input'))

//click tombol login
WebUI.click(findTestObject('Object Repository/TestCaseBerrybenka/Page_Toko Fashion Wanita dan Pria Online.  Berrybenka.com/a_Luthfita Tiananda Yasin'))

WebUI.click(findTestObject('Object Repository/TestCaseBerrybenka/Page_Toko Fashion Wanita dan Pria Online.  Berrybenka.com/a_Keluar'))

//close the browser
WebUI.closeBrowser()

