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

Mobile.tap(findTestObject('IOS/Signin/createNewAccount'), 0)

Mobile.setText(findTestObject('IOS/Signup/Signup Screen/firstName'), 'testnew1', 0)

Mobile.setText(findTestObject('IOS/Signup/Signup Screen/lastName'), 'testnew2', 0)

Mobile.setText(findTestObject('IOS/Signup/Signup Screen/preferredName'), 'altname', 0)

Mobile.setText(findTestObject('IOS/Signup/Signup Screen/emailAddress'), 'test1gmail.com', 0)

Mobile.setText(findTestObject('IOS/Signup/Signup Screen/password'), 'Asd@1234', 0)

Mobile.setText(findTestObject('IOS/Signup/Signup Screen/confirmPassword'), 'Asd@1234', 0)

Mobile.tap(findTestObject('IOS/keyboaard_Done'), 0)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/termsAndCondition'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('IOS/Signup/Signup Screen/button_Next'), 5)

Mobile.verifyElementVisible(findTestObject('IOS/Signup/Signup Screen/errortxt_InvalidEmail'), 0)
