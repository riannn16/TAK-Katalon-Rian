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

WebUI.navigateToUrl(GlobalVariable.siteUrl)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Record Web Exercise 1 dan 2/Page_Home/label_CURA Healthcare Service'), 
    0)

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 dan 2/Page_Home/a_menu-toggle'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 dan 2/Page_Login/a_login'))

WebUI.verifyElementPresent(findTestObject('Record Web Exercise 1 dan 2/Page_Login/label_login'), 0)

WebUI.setText(findTestObject('Object Repository/Record Web Exercise 1 dan 2/Page_Login/input_username'), username)

WebUI.setEncryptedText(findTestObject('Record Web Exercise 1 dan 2/Page_Login/input_password'), password)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 dan 2/Page_Login/button_login'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Record Web Exercise 1 dan 2/Page_Login/label_make-appointment'), 
    0)

WebUI.delay(2)

WebUI.closeBrowser()

