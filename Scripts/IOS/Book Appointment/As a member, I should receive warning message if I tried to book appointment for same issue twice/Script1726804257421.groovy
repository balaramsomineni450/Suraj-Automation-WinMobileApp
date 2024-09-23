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
import com.kms.katalon.core.testobject.MobileTestObject as MobileTestObject
import com.kms.katalon.core.testobject.MobileTestObject.MobileLocatorStrategy as MobileLocatorStrategy
import groovy.time.TimeCategory as TimeCategory

Mobile.tap(findTestObject('ios/Home/menu_Support'), 0)

Mobile.tap(findTestObject('ios/Book Appointment/biopic'), 0)

Mobile.tap(findTestObject('ios/Book Appointment/connect_with_advocate'), 0)

Mobile.tap(findTestObject('ios/Book Appointment/view_behavioral_health_advocate_schedule'), 0)

Mobile.tap(findTestObject('ios/Book Appointment/button_okay'), 0)

Mobile.tap(findTestObject('ios/Book Appointment/schedule_phone_consultation'), 0)

MobileTestObject mobileTestObject = findTestObject('ios/Book Appointment/selectDate')

mobileTestObject.setMobileLocatorStrategy(MobileLocatorStrategy.XPATH)

def now = new Date().format('dd/mm/yyyy')

day = now.substring(0, 2)

day = day.replaceFirst('^0*', '')

newxpath = (('//XCUIElementTypeStaticText[@name="' + day) + '"]')

println(newxpath)

mobileTestObject.setMobileLocator(newxpath)

Mobile.tap(mobileTestObject, 0)

Mobile.tap(findTestObject('ios/Book Appointment/button_next'), 0)

int a = day.toInteger()

while (Mobile.verifyElementVisible(findTestObject('ios/Book Appointment/errortxt_Please_Clickon_Available_Date'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('ios/Book Appointment/button_okay'), 0)

    a++

    newxpath = (('//XCUIElementTypeStaticText[@name="' + a.toString()) + '"]')

    println(newxpath)

    mobileTestObject.setMobileLocator(newxpath)

    Mobile.tap(mobileTestObject, 60)

    Mobile.tap(findTestObject('ios/Book Appointment/button_next'), 0)
}

Mobile.tap(findTestObject('ios/Book Appointment/timeslot'), 0)

Mobile.tap(findTestObject('ios/Book Appointment/button_BookAppointment'), 0)

Mobile.verifyElementVisible(findTestObject('ios/Book Appointment/errorTxt_DuplicateTypeAppointment'), 10)

