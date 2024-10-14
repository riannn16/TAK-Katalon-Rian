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

WebUI.verifyElementPresent(findTestObject('Record Web Exercise 1 s.d 4/Page_Login/label_make-appointment'), 0)

WebUI.verifyElementPresent(findTestObject('Record Web Exercise 1 s.d 4/Page_Booking-Appointment/dropdown_facility'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/dropdown_facility'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/checkbox_readmission'))

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/radiobutton_medicare'))

WebUI.click(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_isi-date'))

WebUI.click(findTestObject('Record Web Exercise 1 s.d 4/Page_Booking-Appointment/date-30'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/textbox_comment'), 
    'testing')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/button_book-appointment'))

WebUI.verifyElementPresent(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_appointment-confirmation'), 
    0)

WebUI.verifyElementText(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_isi-facility'), 
    'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_yes_no'), 'Yes')

WebUI.verifyElementText(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_visit-date'), '30/09/2024')

WebUI.verifyElementText(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_isi-comment'), 'testing')

