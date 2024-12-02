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

Mobile.tap(findTestObject('Android/Signin/createNewAccount'), 0)

device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.80

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('Android/Signup/Signup screen/errortxt_EnterFirstName'), 0)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Ok'), 0)

Mobile.setText(findTestObject('Android/Signup/Signup screen/firstName'), 'Test', 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('Android/Signup/Signup screen/errortxt_EnterLastName'), 0)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Ok'), 0)

Mobile.setText(findTestObject('Android/Signup/Signup screen/lastName'), 'Test', 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('Android/Signup/Signup screen/errortxt_PreferredName'), 0)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Ok'), 0)

Mobile.setText(findTestObject('Android/Signup/Signup screen/preferredName'), 'test', 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('Android/Signup/Signup screen/errortxt_EnterEmail'), 0)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Ok'), 0)

Mobile.setText(findTestObject('Android/Signup/Signup screen/emailAddress'), 'test23@gmailcom', 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('Android/Signup/Signup screen/errortxt_EnterPassword'), 0)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Ok'), 0)

Mobile.setText(findTestObject('Android/Signup/Signup screen/password'), 'Test@1234', 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('Android/Signup/Signup screen/errortxt_EnterConfirmPassword'), 0)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Ok'), 0)

Mobile.setText(findTestObject('Android/Signup/Signup screen/confirmPassword'), 'Test@1234', 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('Android/Signup/Signup screen/errortxt_SelectTnC'), 0)

