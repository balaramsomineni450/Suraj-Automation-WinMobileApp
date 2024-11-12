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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testobject.MobileTestObject as MobileTestObject
import com.kms.katalon.core.testobject.MobileTestObject.MobileLocatorStrategy as MobileLocatorStrategy
import groovy.time.TimeCategory as TimeCategory

Mobile.tap(findTestObject('IOS/Menu/Benefits'), 0)

Mobile.tap(findTestObject('IOS/Benefits/menu_RxAuthorization'), 0)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.30

int endY = device_Height * 0.70

if (Mobile.verifyElementVisible(findTestObject('IOS/Benefits/RX Authorizations/text_pendedStatus'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('IOS/Benefits/RX Authorizations/text_pendedStatus'), 0)
} else {
    Mobile.swipe(startX, endY, endX, startY)

    if (Mobile.verifyElementVisible(findTestObject('IOS/Benefits/RX Authorizations/text_pendedStatus'), 0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('IOS/Benefits/RX Authorizations/text_pendedStatus'), 0)
    } else {
        Mobile.swipe(startX, endY, endX, startY)

        if (Mobile.verifyElementVisible(findTestObject('IOS/Benefits/RX Authorizations/text_pendedStatus'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('IOS/Benefits/RX Authorizations/text_pendedStatus'), 0)
        } else {
            Mobile.swipe(startX, endY, endX, startY)
        }
    }
}

if (Mobile.verifyElementVisible(findTestObject('Android/Benefits/Rx Authorization/text_RXReview'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/button_Next'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/selectDate'), 0)

    MobileTestObject mobileTestObject = findTestObject('IOS/Book Appointment/selectDate')

    mobileTestObject.setMobileLocatorStrategy(MobileLocatorStrategy.XPATH)

    def now = new Date().format('dd/mm/yyyy')

    day = now.substring(0, 2)

    day = day.replaceFirst('^0*', '')

    newxpath = (('//XCUIElementTypeStaticText[@name="' + day) + '"]')

    println(newxpath)

    mobileTestObject.setMobileLocator(newxpath)

    Mobile.tap(mobileTestObject, 60)

    Mobile.tap(findTestObject('IOS/Benefits/RX Authorizations/button_Save'), 0)

    Mobile.setText(findTestObject('IOS/Benefits/RX Authorizations/input_HomeQuantity'), MedQuantity, 0)

    Mobile.hideKeyboard(FailureHandling.OPTIONAL)

    Mobile.swipe(startX, endY, endX, startY)

    Mobile.tap(findTestObject('IOS/Benefits/RX Authorizations/button_Submit'), 0)

    Mobile.verifyElementVisible(findTestObject('IOS/Benefits/RX Authorizations/successTxt_SubmitRx'), 5)
} else {
    KeywordUtil.markFailed('RX with Pended status doesn\'t found')
}

