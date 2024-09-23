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
import com.kms.katalon.core.testobject.MobileTestObject.MobileLocatorStrategy as MobileLocatorStrategy
import groovy.time.TimeCategory as TimeCategory
import com.kms.katalon.core.testobject.MobileTestObject as MobileTestObject

Mobile.tap(findTestObject('ios/Home/fertilityTracker'), 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/button_ExportNotes'), 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/startExportDate'), 0)

MobileTestObject mobileTestObject = findTestObject('Object Repository/android/Fertility Tracker/selectDate')

mobileTestObject.setMobileLocatorStrategy(MobileLocatorStrategy.XPATH)

newxpath = (('//XCUIElementTypeButton[@name=" , ' + selectStartDate) + '"]')

println(newxpath)

mobileTestObject.setMobileLocator(newxpath)

Mobile.tap(mobileTestObject, 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/button_Save'), 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/endExportDate'), 0)

mobileTestObject = findTestObject('Object Repository/android/Fertility Tracker/selectEndDate')

mobileTestObject.setMobileLocatorStrategy(MobileLocatorStrategy.XPATH)

newxpath = (('//XCUIElementTypeButton[@name=" , ' + selectEndDate) + '"]')

println(newxpath)

mobileTestObject.setMobileLocator(newxpath)

Mobile.tap(mobileTestObject, 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/button_Save'), 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/button_Export'), 0)

