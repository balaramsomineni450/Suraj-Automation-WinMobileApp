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

Mobile.scrollToText('Fertility Tracker')

Mobile.tap(findTestObject('Android/Fertility Tracker/android.widget.TextView - Fertility Tracker'), 0)

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
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/Android/Fertility Tracker/android.widget.TextView - Log your menstruation and ovulation windows, current symptoms, mood changes, and more'), 
    0)

MobileTestObject mobileTestObject = findTestObject('Object Repository/Android/Fertility Tracker/selectDate')

mobileTestObject.setMobileLocatorStrategy(MobileLocatorStrategy.XPATH)

def now = new Date().format('dd/mm/yyyy')

day = now.substring(0, 2)

day = day.replaceFirst('^0*', '')

newxpath = (('//android.widget.TextView[@resource-id="com.win.winfertility:id/vw_text" and @text="' + day) + '"]')

println(newxpath)

mobileTestObject.setMobileLocator(newxpath)

Mobile.tap(mobileTestObject, 0)

Mobile.tap(findTestObject('Object Repository/Android/Fertility Tracker/Set Reminder/android.widget.TextView - Set a Reminder'), 
    0)

Mobile.tap(findTestObject('Object Repository/Android/Fertility Tracker/android.widget.TextView -  Add a Reminder'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Fertility Tracker/Set Reminder/android.widget.TextView - Start Time'), 0)

Mobile.tap(findTestObject('Android/Fertility Tracker/Set Reminder/nextHour'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Fertility Tracker/Set Reminder/android.widget.Button - OK (3)'), 0)

startY = (device_Height * 0.35)

endY = (device_Height * 0.75)

Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/Android/Fertility Tracker/Set Reminder/android.widget.TextView - Save'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android/Fertility Tracker/Set Reminder/android.widget.TextView - Please enter reminder title'), 
    0)

Mobile.tap(findTestObject('Object Repository/Android/Fertility Tracker/Set Reminder/android.widget.Button - OK'), 0)

Mobile.swipe( endX, startY, startX, endY,)

Mobile.setText(findTestObject('Object Repository/Android/Fertility Tracker/Set Reminder/android.widget.TextView - Title'), 'Reminder 1', 
    0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)


Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/Android/Fertility Tracker/Set Reminder/android.widget.TextView - Save'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android/Fertility Tracker/Set Reminder/android.widget.TextView - Please enter reminder type (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Android/Fertility Tracker/Set Reminder/android.widget.Button - OK'), 0)

