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

class CheckPrerequisiteBeforeEachTestCase {
	/**
	 * Executes before test case : As a member, I should not see cancelled appointments under upcoming appointments.
	 * @param testCaseContext related information of the executed test case.
	 */
	
	String Email,Pass
	
	@BeforeTestCase
	def checkPrerequisite(TestCaseContext testCaseContext) {
		
		def testCase = findTestCase(testCaseContext.getTestCaseId())
		
		println testCaseContext.getTestCaseId()
		println testCaseContext.getTestCaseVariables()
		
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
		
		if(testCase.name=="As a member, I should able to cancel the scheduled appointment") {
			
			if(testCase.description.contains("ios")){
				
				if(Mobile.verifyElementVisible(findTestObject('IOS/Book Appointment/txt_NoUpcomingAppointment'),5, FailureHandling.OPTIONAL))
					{
						Mobile.callTestCase(findTestCase('IOS/Book Appointment/As a member, I should able to book appointment for available time-slot'),
								[('EmailAddress') : Email.substring(1, Email.length() - 1), ('Password') : Pass.substring(1, Pass.length() - 1)], FailureHandling.STOP_ON_FAILURE)
						
						Mobile.tap(findTestObject('IOS/Book Appointment/button_okay'), 0)
						
						Mobile.delay(5)
						
						Mobile.tap(findTestObject('IOS/Menu/Support'), 5)
						
						Mobile.tap(findTestObject('IOS/Menu/Home'), 5)
					}
					else {
						
					}
			
			}else {
					
				if(Mobile.verifyElementVisible(findTestObject('Android/Book Appointment/android.widget.TextView - No upcoming appointment'),5, FailureHandling.OPTIONAL))
				{	
					Mobile.callTestCase(findTestCase('Android/Book Appointment/As a member, I should able to book appointment for available time-slot'),
							[('EmailAddress') : Email.substring(1, Email.length() - 1), ('Password') : Pass.substring(1, Pass.length() - 1)], FailureHandling.STOP_ON_FAILURE)
					
					Mobile.tap(findTestObject('Android/Book Appointment/android.widget.Button - OK'), 0)
					
					Mobile.delay(5)
					
					Mobile.tap(findTestObject('Android/Menu/Support2'), 5)
					
					Mobile.tap(findTestObject('Android/Menu/Home'), 5)
				}
				else {
					
				}
			}
		}
	}
}