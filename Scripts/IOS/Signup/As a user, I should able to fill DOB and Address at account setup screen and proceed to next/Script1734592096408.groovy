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

WebUI.callTestCase(findTestCase('IOS/Signup/As a new user, I should able to fill up details at signup screen and proceed next'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('IOS/Signup/SetupAccount/select_Year'), '2007')

Mobile.sendKeys(findTestObject('IOS/Signup/SetupAccount/select_Month'), 'July')

Mobile.sendKeys(findTestObject('IOS/Signup/SetupAccount/select_Day'), '12')

Mobile.tap(findTestObject('IOS/Signup/SetupAccount/button_Done'), 0)

Mobile.setText(findTestObject('IOS/Signup/SetupAccount/phoneNumber'), '9977885544', 0)

Mobile.setText(findTestObject('IOS/Signup/SetupAccount/zipCode'), '98901', 0)

Mobile.tap(findTestObject('IOS/Signup/SetupAccount/checkbox_AgreeToReceiveSMS'), 0)

Mobile.sendKeys(findTestObject('IOS/Signup/SetupAccount/select_language'), 'English')

Mobile.sendKeys(findTestObject('IOS/Signup/SetupAccount/select_Race'), 'White')

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('IOS/Signup/Win Benefit/radiobutton_MyEmployer'), 0)

