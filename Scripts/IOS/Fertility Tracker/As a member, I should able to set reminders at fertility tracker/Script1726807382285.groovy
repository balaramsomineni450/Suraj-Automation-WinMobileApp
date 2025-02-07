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
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.WaitOptions as WaitOptions
import io.appium.java_client.touch.offset.PointOption as PointOption
import org.openqa.selenium.Dimension as Dimension
import java.time.Duration as Duration

Mobile.tap(findTestObject('IOS/Home/fertilityTracker'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/selectCurrentDate'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/button_SetReminder'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/button_AddReminder'), 0)

Mobile.setText(findTestObject('IOS/Fertility Tracker/Set Reminder/input_ReminderTitle'), ReminderName, 0)

Mobile.tap(findTestObject('IOS/keyboard_Done'), 5)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/reminderType'), 0)

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Set Reminder/selectType'), 'Doctor’s Appointment')

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/button_Done'), 5)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/startTime'), 5)

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Set Reminder/nextHour'), '9')

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/button_Done'), 0)

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Set Reminder/vertical_scrollbar'), '5%')

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/endTime'), 0)

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Set Reminder/nextHour'), '12')

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Set Reminder/vertical_scrollbar'), '5%')

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/button_Done'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/remindMe'), 0)

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Set Reminder/selectRemindOption'), '5 Minutes')

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Set Reminder/vertical_scrollbar'), '5%')

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/button_Done'), 5)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/repeat'), 0)

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Set Reminder/vertical_scrollbar'), '25%')

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Set Reminder/selectRepeatOption'), 'Every Day')

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/button_Done'), 0)

Mobile.setText(findTestObject('IOS/Fertility Tracker/Set Reminder/notes'), 'this is for testing purpose', 0)

Mobile.tap(findTestObject('IOS/keyboard_Done'), 0)

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Set Reminder/vertical_scrollbar'), '20%')

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/send_remider_by_email'), 0)

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Set Reminder/vertical_scrollbar'), '95%')

Mobile.tap(findTestObject('IOS/Fertility Tracker/Set Reminder/button_Save'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('IOS/Fertility Tracker/Set Reminder/successTxt_Reminder'), 5)

