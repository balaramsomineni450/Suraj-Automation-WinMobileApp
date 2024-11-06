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

Mobile.tap(findTestObject('Android/Menu/Benefits'), 0)

Mobile.tap(findTestObject('Android/Benefits/menu_RxAuthorization'), 0)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.30

int endY = device_Height * 0.70

if (Mobile.verifyElementVisible(findTestObject('Android/Benefits/Rx Authorization/txt_PendedStatus'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/txt_PendedStatus'), 0)
} else {
    Mobile.swipe(startX, endY, endX, startY)

    if (Mobile.verifyElementVisible(findTestObject('Android/Benefits/Rx Authorization/txt_PendedStatus'), 0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/txt_PendedStatus'), 0)
    } else {
        Mobile.swipe(startX, endY, endX, startY)

        if (Mobile.verifyElementVisible(findTestObject('Android/Benefits/Rx Authorization/txt_PendedStatus'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/txt_PendedStatus'), 0)
        } else {
            Mobile.swipe(startX, endY, endX, startY)

            if (Mobile.verifyElementVisible(findTestObject('Android/Benefits/Rx Authorization/txt_PendedStatus'), 0, FailureHandling.OPTIONAL)) {
                Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/txt_PendedStatus'), 0)
            } else {
                Mobile.swipe(startX, endY, endX, startY)

                if (Mobile.verifyElementVisible(findTestObject('Android/Benefits/Rx Authorization/txt_PendedStatus'), 0, 
                    FailureHandling.OPTIONAL)) {
                    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/txt_PendedStatus'), 0)
                } else {
                    KeywordUtil.markFailed('RX with Pended status doesn\'t found')
                }
            }
        }
    }
}

if (Mobile.verifyElementVisible(findTestObject('Android/Benefits/Rx Authorization/text_RXReview'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/button_Next'), 0)

    Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/selectDate'), 0)

    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/nextDate'), 0)

    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/nextDate'), 0)

    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/button_Ok_ForSelectDate'), 0)

    Mobile.setText(findTestObject('Android/Benefits/Rx Authorization/input_HomeQuantity'), MedQuantity, 0)

    Mobile.hideKeyboard(FailureHandling.OPTIONAL)

    Mobile.swipe(startX, endY, endX, startY)

    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/button_Submit'), 0)

    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/button_Yes'), 0)

    Mobile.verifyElementVisible(findTestObject('Android/Benefits/Rx Authorization/text_Title-BookAppointment'), 15)
} else {
    KeywordUtil.markFailed('RX with Pended status doesn\'t found')
}

