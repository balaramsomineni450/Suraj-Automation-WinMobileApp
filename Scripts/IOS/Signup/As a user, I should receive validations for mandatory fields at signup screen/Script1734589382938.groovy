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

Mobile.tap(findTestObject('IOS/Signin/createNewAccount'), 5)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('IOS/Signup/Signup Screen/errortxt_EnterFirstName'), 5)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Ok'), 5)

Mobile.setText(findTestObject('IOS/Signup/Signup Screen/firstName'), FirstName, 5)

Mobile.tap(findTestObject('IOS/keyboard_Done'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Next'), 5)

Mobile.verifyElementVisible(findTestObject('IOS/Signup/Signup Screen/errortxt_EnterLastName'), 5)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/errortxt_EnterLastName'), 0)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Next'), 5)

Mobile.setText(findTestObject('IOS/Signup/Signup Screen/lastName'), LastName, 5)

Mobile.tap(findTestObject('IOS/keyboard_Done'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Next'), 5)

Mobile.verifyElementVisible(findTestObject('IOS/Signup/Signup Screen/errortxt_EnterEmail'), 5)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/errortxt_EnterEmail'), 0)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Next'), 5)

Mobile.setText(findTestObject('IOS/Signup/Signup Screen/emailAddress'), EmailAddress, 5)

Mobile.tap(findTestObject('IOS/keyboard_Done'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Next'), 5)

Mobile.verifyElementVisible(findTestObject('IOS/Signup/Signup Screen/errortxt_EnterPassword'), 10)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/errortxt_EnterPassword'), 0)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Next'), 5)

Mobile.setText(findTestObject('IOS/Signup/Signup Screen/password'), Password, 5)

Mobile.tap(findTestObject('IOS/keyboard_Done'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Next'), 5)

Mobile.verifyElementVisible(findTestObject('IOS/Signup/Signup Screen/errortxt_EnterConfirmPassword'), 5)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/errortxt_EnterConfirmPassword'), 0)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Ok'), 0)

Mobile.setText(findTestObject('IOS/Signup/Signup Screen/confirmPassword'), Password, 5)

Mobile.tap(findTestObject('IOS/keyboard_Done'), 0)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Next'), 0)

Mobile.verifyElementVisible(findTestObject('IOS/Signup/Signup Screen/errortxt_SelectTnC'), 5)

