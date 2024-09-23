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

Mobile.tap(findTestObject('ios/Home/fertilityTracker'), 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/button_EditCycleData'), 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/when_did_last_perio_start'), 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/selectCurrentDate'), 10)

Mobile.tap(findTestObject('ios/Fertility Tracker/button_Done'), 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/button_Save'), 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/how_long_period_last'), 0)

Mobile.sendKeys(findTestObject('ios/Fertility Tracker/selectDays'), '3')

Mobile.tap(findTestObject('ios/Fertility Tracker/how_long_is_your_cycle'), 0)

Mobile.sendKeys(findTestObject('ios/Fertility Tracker/selectLength'), '25')

Mobile.tap(findTestObject('ios/Fertility Tracker/button_Done'), 0)

Mobile.tap(findTestObject('ios/Fertility Tracker/button_Save'), 0)

Mobile.verifyElementVisible(findTestObject('ios/Fertility Tracker/successTxt_CycleData'), 10)

