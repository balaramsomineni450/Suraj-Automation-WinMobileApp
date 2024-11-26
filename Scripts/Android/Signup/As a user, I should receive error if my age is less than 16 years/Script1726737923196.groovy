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

Mobile.callTestCase(findTestCase('Test Cases/Android/Signup/As a new user, I should able to fill up details at signup screen and proceed next'), 
    null)

Mobile.tap(findTestObject('Android/Signup/Account Setup/dob'), 0)

int a = 1

while (a < 16) {
    Mobile.tap(findTestObject('Android/Signup/Account Setup/previousYear'), 0)

    a++
}

Mobile.tap(findTestObject('Android/Signup/Account Setup/button_ok_DateSelect1'), 0)

Mobile.setText(findTestObject('Android/Signup/Account Setup/phoneNumber'), PhoneNumber, 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Android/Signup/Account Setup/agree_ReceiveText'), 0)

Mobile.tap(findTestObject('Android/Signup/Account Setup/country'), 0)

device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.20

'Storing the endY value'
int endY = device_Height * 0.40

Mobile.swipe(startX, endY, endX, startY)

Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Android/Signup/Account Setup/selectCountry'), 0)

Mobile.setText(findTestObject('Android/Signup/Account Setup/zipCode'), ZipCode, 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Android/Signup/Account Setup/language'), 0)

Mobile.tap(findTestObject('Android/Signup/Account Setup/selectEngLanguage'), 0)

Mobile.tap(findTestObject('Android/Signup/Account Setup/race'), 0)

Mobile.tap(findTestObject('Android/Signup/Account Setup/selectRace'), 0)

Mobile.tap(findTestObject('Android/Signup/Account Setup/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('Android/Signup/Account Setup/errorTxt_MinimumAge'), 10)

