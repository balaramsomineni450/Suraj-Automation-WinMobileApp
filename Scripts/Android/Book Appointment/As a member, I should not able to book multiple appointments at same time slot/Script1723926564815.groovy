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
import com.kms.katalon.core.testobject.MobileTestObject as MobileTestObject
import com.kms.katalon.core.testobject.MobileTestObject.MobileLocatorStrategy as MobileLocatorStrategy
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.io.File as File
import groovy.time.TimeCategory as TimeCategory

Mobile.tap(findTestObject('Android/Book Appointment/android.widget.TextView - Support'), 0)

Mobile.tap(findTestObject('Android/Book Appointment/android.widget.TextView - BIPOC'), 0)

Mobile.tap(findTestObject('Android/Book Appointment/android.widget.TextView - Connect with an Advocate'), 0)

Mobile.tap(findTestObject('Android/Book Appointment/android.widget.TextView - View Behavioral Health Advocate schedule'), 
    0)

Mobile.tap(findTestObject('Android/Book Appointment/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Android/Book Appointment/android.widget.TextView - Schedule a phone consultation'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.Button (1)'), 0)

MobileTestObject mobileTestObject = findTestObject('Object Repository/Android/Book Appointment/selectDate')

mobileTestObject.setMobileLocatorStrategy(MobileLocatorStrategy.XPATH)

File file = new File(RunConfiguration.getProjectDir() + '/Data Files/date.txt')

String day = file.getText('UTF-8')

day = day.replaceAll('\\r|\\n', '')

newxpath = (('//android.widget.TextView[@resource-id="com.win.winfertility:id/vw_text" and @text="' + day) + '"]')

println(newxpath)

mobileTestObject.setMobileLocator(newxpath)

Mobile.tap(mobileTestObject, 0)

Mobile.tap(findTestObject('Android/Book Appointment/android.widget.TextView - Next'), 0)

if (Mobile.verifyElementVisible(findTestObject('Android/Book Appointment/android.widget.TextView - Please click on an available date'), 
    0, FailureHandling.OPTIONAL)) {
    PrintWriter writer = new PrintWriter(file)

    writer.print('')

    writer.close()
} else {
    file = new File(RunConfiguration.getProjectDir() + '/Data Files/Variablefile.txt')

    String timeslot = file.getText('UTF-8')

    timeslot = timeslot.replaceAll('\\r|\\n', '')

    println(timeslot)

    String newXpath = ((('//*[@class = \'android.widget.TextView\' and (@text = \'' + timeslot) + '\' or . = \'') + timeslot) + 
    '\')]'

    println(newXpath)

    MobileTestObject reservedTimeSlot = findTestObject('Object Repository/Android/Book Appointment/bookedTimeslot')

    reservedTimeSlot.setMobileLocatorStrategy(MobileLocatorStrategy.XPATH)

    reservedTimeSlot.setMobileLocator(newXpath)

    Mobile.verifyElementNotVisible(reservedTimeSlot, 5)

    PrintWriter writer = new PrintWriter(file)

    writer.print('')

    writer.close()
}

