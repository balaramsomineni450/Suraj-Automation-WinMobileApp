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
import com.detroitlabs.katalonmobileutil.testobject.TextField as TextField
import org.openqa.selenium.By as By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.detroitlabs.katalonmobileutil.testobject.TestObjectConverter as TestObjectConverter
import com.detroitlabs.katalonmobileutil.testobject.Finder as Finder
import com.kms.katalon.core.testobject.MobileTestObject as MobileTestObject
import com.kms.katalon.core.testobject.MobileTestObject.MobileLocatorStrategy as MobileLocatorStrategy
import groovy.time.TimeCategory as TimeCategory

Mobile.tap(findTestObject('IOS/Home/fertilityTracker'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/selectCurrentDate'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/button_CreateNotes'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/notes'), 0)

Mobile.sendKeys(findTestObject('IOS/Fertility Tracker/Create Notes/addNotes'), 'New Test Notes', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/notes'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/period'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/select_PeriodMedium'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/period'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/sexDrive'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/select_SexDriveNeutral'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/sexDrive'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/intercourse'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/select_IntercourseFrequent'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/intercourse'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/symptoms'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/select_Cravings'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/symptoms'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/mood'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/select_Calm'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/mood'), 0)

Mobile.tap(findTestObject('IOS/Fertility Tracker/Create Notes/button_Save'), 0)

Mobile.verifyElementVisible(findTestObject('IOS/Fertility Tracker/Create Notes/successTxt_CreateNotes'), 5)

