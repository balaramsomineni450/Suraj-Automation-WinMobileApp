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
import com.kms.katalon.core.util.KeywordUtil

Mobile.tap(findTestObject('Android/Menu/Benefits'), 0)

Mobile.tap(findTestObject('Android/Benefits/menu_RxAuthorization'), 0)

Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/firstRX'), 0)

if (Mobile.verifyElementExist(findTestObject('Android/Benefits/Rx Authorization/button_Next'), 5, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Android/Benefits/Rx Authorization/button_Next'), 0)
}

if(Mobile.verifyElementExist(findTestObject('Android/Benefits/Rx Authorization/text_AuthorizationNumber'), 5, FailureHandling.OPTIONAL) || Mobile.verifyElementExist(findTestObject('Android/Benefits/Rx Authorization/button_PickBestPharmacy'), 0, FailureHandling.OPTIONAL)) {
	
}else {
	KeywordUtil.markFailed('');
}



