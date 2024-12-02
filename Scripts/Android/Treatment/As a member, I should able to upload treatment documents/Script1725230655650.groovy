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

Mobile.tap(findTestObject('Android/Home/Treatment'), 10)

Mobile.tap(findTestObject('Android/Treatment/button - Upload Documentation for Review'), 30)

Mobile.tap(findTestObject('Android/Treatment/dropdown_DocumentType'), 0)

Mobile.tap(findTestObject('Android/Treatment/Fertility Cycle Reimburesement Receipt'), 0)

Mobile.tap(findTestObject('Android/Treatment/button_SelectImages'), 0)

Mobile.tap(findTestObject('Android/Treatment/selectFirstImage'), 0)

Mobile.verifyElementExist(findTestObject('Android/Treatment/icon_DeleteOne'), 0)

Mobile.tap(findTestObject('Android/Treatment/button_SelectDocuments'), 0)

Mobile.tap(findTestObject('Android/Treatment/secondDoc'), 0)

Mobile.verifyElementExist(findTestObject('Android/Treatment/icon_DeleteTwo'), 0)

