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

Mobile.tap(findTestObject('Android/Menu/Me'), 0)

Mobile.tap(findTestObject('Android/Me/AccountSettings'), 0)

Mobile.tap(findTestObject('Android/Me/ResetPassword'), 0)

Mobile.setText(findTestObject('Android/Reset Password/input_OldPassword'), OldPassword, 0)

Mobile.setText(findTestObject('Android/Reset Password/input_NewPassword'), NewPassword, 0)

Mobile.setText(findTestObject('Android/Reset Password/input_ConfirmPassword'), NewPassword, 0)

Mobile.tap(findTestObject('Android/Reset Password/button_Submit'), 0)

Mobile.verifyElementVisible(findTestObject('Android/Reset Password/errorTxt_PasswordLengthFormat'), 0, FailureHandling.CONTINUE_ON_FAILURE)

