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

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - Support'), 20)

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - BIPOC'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - Connect with an Advocate'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - View Behavioral Health Advocate schedule'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - You are scheduling a behavioral health consultation. The behavioral health program is designed to provide patients with emotional support throughout treatment. You have access to 5 free, 30-minute behavioral health consults'), 
    0)

