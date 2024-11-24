import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class CheckSignInBeforeEachTestCase {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	String Email,Pass
	
	@BeforeTestCase
	def checkLoginState(TestCaseContext testCaseContext) {
		println testCaseContext.getTestCaseId()
		println testCaseContext.getTestCaseVariables()
		
		def testCase = findTestCase(testCaseContext.getTestCaseId())
		def vars = testCase.getVariables()

		
		for(int i = 0; i < vars.size(); i++) {
			if(vars[i].name == "EmailAddress") {
			  Email = vars[i].defaultValue
			  break
			}
		}

		for(int i = 0; i < vars.size(); i++) {
			if(vars[i].name == "Password") {
			Pass = vars[i].defaultValue
			break
		  }
		}
		println Email
		println Pass
		
		if(testCase.description.contains("ios"))
			{
				Mobile.startExistingApplication('com.eisplc.winfertility', FailureHandling.STOP_ON_FAILURE)
				
				if(testCase.tag.contains("signin") || testCase.tag.contains("signup")) {
					
					Mobile.tap(findTestObject('IOS/skip'),10, FailureHandling.OPTIONAL)
					
					if(Mobile.verifyElementVisible(findTestObject('IOS/Signin/username'),20, FailureHandling.OPTIONAL)){
						
					}
					else{
						ios_logout()
					}
					
				}
				else {
					 ios_login()
				}
			}
			else
			{
				Mobile.startExistingApplication('com.win.winfertility', FailureHandling.STOP_ON_FAILURE)
				
				if(testCase.tag.contains("signin") || testCase.tag.contains("signup")) {
					
					Mobile.tap(findTestObject('Android/Signin/android.widget.TextView - Skip'),10, FailureHandling.OPTIONAL)
					
					if(Mobile.verifyElementVisible(findTestObject('Android/Signin/input_EmailAddress'),20, FailureHandling.OPTIONAL)){
						
					}
					else{
						logout()
					}
					
				}
				else {
					
					Mobile.tap(findTestObject('Android/Signin/android.widget.TextView - Skip'),10, FailureHandling.OPTIONAL)
					
					if(Mobile.verifyElementVisible(findTestObject('Android/Signin/input_EmailAddress'),20,FailureHandling.OPTIONAL)){
						
						login()
					}
					else {
						
						Mobile.tap(findTestObject('Object Repository/android/Home/button_Later'), 5, FailureHandling.OPTIONAL)
						
					}
					
				}
			}
		
		
	}
	
	def ios_login()
	{
		Mobile.tap(findTestObject('IOS/Signin/skip'), 5, FailureHandling.OPTIONAL)
		
		Mobile.setText(findTestObject('IOS/Signin/username'), Email.substring(1, Email.length() - 1), 2)
		
		Mobile.setText(findTestObject('IOS/Signin/password'), Pass.substring(1, Pass.length() - 1), 2)
		
		Mobile.tap(findTestObject('IOS/Signin/button_Login'), 5)
	}
	
	def ios_logout()
	{
		Mobile.tap(findTestObject('Object Repository/android/Home/android.widget.TextView - Me'), 0)
		
		Mobile.tap(findTestObject('Object Repository/android/Home/android.widget.TextView - Logout'), 0)
		
		Mobile.tap(findTestObject('Object Repository/android/Home/android.widget.Button - YES'), 0)
	}
	
	def login()
	{
		Mobile.setText(findTestObject('Android/Signin/input_Password'), Pass.substring(1, Pass.length() - 1), 2)
		
		Mobile.setText(findTestObject('Android/Signin/input_EmailAddress'), Email.substring(1, Email.length() - 1), 2)
		
		
		Mobile.tap(findTestObject('Android/Signin/android.widget.TextView - Log In'), 5)
		
		Mobile.tap(findTestObject('Android/Home/button_Later'), 10, FailureHandling.OPTIONAL)
	}
	
	def logout()
	{
		Mobile.tap(findTestObject('Object Repository/android/Home/button_Later'), 0, FailureHandling.OPTIONAL)
		
		Mobile.tap(findTestObject('Object Repository/android/Home/android.widget.TextView - Me'), 0)
		
		Mobile.tap(findTestObject('Object Repository/android/Home/android.widget.TextView - Logout'), 0)
		
		Mobile.tap(findTestObject('Object Repository/android/Home/android.widget.Button - YES'), 0)
	}
}