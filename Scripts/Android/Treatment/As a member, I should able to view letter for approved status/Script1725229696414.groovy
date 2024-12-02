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

Mobile.tap(findTestObject('Android/Home/Treatment'), 10)

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

Mobile.delay(30)

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

if (Mobile.verifyElementExist(findTestObject('Android/Treatment/viewLetter'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Android/Treatment/viewLetter'), 5)
} else {
    Mobile.swipe(startX, endY, endX, startY)

    if (Mobile.verifyElementExist(findTestObject('Android/Treatment/viewLetter'), 0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Android/Treatment/viewLetter'), 5)
    } else {
        Mobile.swipe(startX, endY, endX, startY)

        if (Mobile.verifyElementVisible(findTestObject('Android/Treatment/viewLetter'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Android/Treatment/viewLetter'), 5)
        } else {
            Mobile.swipe(startX, endY, endX, startY)

            if (Mobile.verifyElementVisible(findTestObject('Android/Treatment/viewLetter'), 0, FailureHandling.OPTIONAL)) {
                Mobile.tap(findTestObject('Android/Treatment/viewLetter'), 5)
            } else {
                KeywordUtil.markError('View Letter link not found')
            }
        }
    }
}

