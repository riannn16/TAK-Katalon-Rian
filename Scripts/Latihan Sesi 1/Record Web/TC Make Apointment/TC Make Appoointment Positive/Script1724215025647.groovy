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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page-Login/Login/a_Login'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Spy Web Latihan 1/Login Page/lbl_login'))

WebUI.setText(findTestObject('null'), 'John Doe')

WebUI.setEncryptedText(findTestObject('null'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.verifyElementVisible(findTestObject('Spy Web Latihan 1/Appoinment Page/a_make-appointment'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('null'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'test')

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()

