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

WebUI.verifyElementPresent(findTestObject('Record Web Exercise 1 s.d 4/Page_Home/label_CURA Healthcare Service'), 0)

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Home/a_menu-toggle'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Login/a_login'))

WebUI.verifyElementPresent(findTestObject('Record Web Exercise 1 s.d 4/Page_Login/label_login'), 0)

WebUI.setText(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Login/input_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Login/input_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Login/button_login'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Login/label_make-appointment'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/dropdown_facility'), 
    facility, true)

//WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/checkbox_readmission'))
'Step 16'
if (hospital_readmission == true) {
    WebUI.check(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/checkbox_readmission'))
}

'Step 17'
//WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/radiobutton_medicare'))
def select_radio = program
switch (select_radio) {
	case select_radio = 'Madicare':
		printIn(select_radio)
		WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/radiobutton_medicare'))
		
		break
	case select_radio = 'Madicaid':
		printIn(select_radio)
		WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/radiobutton_medicaid'))
		
		break
		case select_radio = 'None':
			printIn(select_radio)
			WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/radiobutton_none'))
}

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/textbox_visit-date'))

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/date_30'))

WebUI.setText(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/textbox_comment'), 
    'testing')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Booking-Appointment/button_book-appointment'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_appointment-confirmation'), 
    0)

WebUI.verifyElementText(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_isi-facility'), 
    facility)

//WebUI.verifyElementText(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_yes_no'), hospital_readmission)
'Step 26'
if (hospital_readmission == true) {
    WebUI.verifyElementText(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_yes_no'), 'Yes')
} else {
    WebUI.verifyElementText(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_yes_no'), 'No')
}

WebUI.verifyElementText(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_isi-program'), healthcare_program)

WebUI.verifyElementText(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_isi-date'), visit_date)

WebUI.verifyElementText(findTestObject('Record Web Exercise 1 s.d 4/Page_Confirmation-Appointment/label_isi-comment'), comment)

WebUI.delay(2)

WebUI.closeBrowser()

