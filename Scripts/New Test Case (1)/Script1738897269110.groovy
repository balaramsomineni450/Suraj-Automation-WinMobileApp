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

Mobile.startExistingApplication('com.eisplc.winfertility')

Mobile.takeScreenshot('')

Mobile.tap(findTestObject('Object Repository/IOS/New Folder/XCUIElementTypeImage - pinkRecangle'), 0)

Mobile.takeScreenshot('')

Mobile.tap(findTestObject('Object Repository/IOS/New Folder/XCUIElementTypeButton -  Document Upload'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/New Folder/XCUIElementTypeTextField - --Select--'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/New Folder/XCUIElementTypeAny'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/New Folder/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/New Folder/XCUIElementTypeButton - Select Image(s)'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/New Folder/XCUIElementTypeButton - Photo Library'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/New Folder/XCUIElementTypeButton - Close'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/New Folder/XCUIElementTypeImage - PXGGridLayout-Info'), 0)

Mobile.takeScreenshot('')

Mobile.tap(findTestObject('Object Repository/IOS/New Folder/XCUIElementTypeButton - Select Document(s)'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/New Folder/XCUIElementTypeCollectionView - File View'), 0)

Mobile.closeApplication()

