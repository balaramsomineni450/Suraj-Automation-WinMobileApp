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

Mobile.tap(findTestObject('Android/Signin/createNewAccount'), 5)

Mobile.setText(findTestObject('Android/Signup/Signup screen/firstName'), FirstName, 0)

Mobile.setText(findTestObject('Android/Signup/Signup screen/lastName'), LastName, 0)

Mobile.setText(findTestObject('Android/Signup/Signup screen/preferredName'), PreferredName, 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Android/Signup/Signup screen/emailAddress'), EmailAddress, 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.delay(2)

Mobile.setText(findTestObject('Android/Signup/Signup screen/password'), Password, 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.delay(2)

Mobile.setText(findTestObject('Android/Signup/Signup screen/confirmPassword'), Password, 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Android/Signup/Signup screen/termsAndCondition'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android/Signup/Signup screen/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('Android/Signup/Account Setup/dob'), 5)

