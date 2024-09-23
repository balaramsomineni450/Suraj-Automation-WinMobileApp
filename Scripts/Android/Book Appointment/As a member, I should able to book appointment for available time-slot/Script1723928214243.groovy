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
import java.io.File as File
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.MobileTestObject as MobileTestObject
import com.kms.katalon.core.testobject.MobileTestObject.MobileLocatorStrategy as MobileLocatorStrategy
import groovy.time.TimeCategory as TimeCategory

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - Support'), 30)

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - BIPOC'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - Connect with an Advocate'), 
    0)

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - View Behavioral Health Advocate schedule'), 
    0)

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - Schedule a phone consultation'), 
    0)

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - Continue'), 0)

MobileTestObject mobileTestObject = findTestObject('Object Repository/Android/Book Appointment/selectDate')

mobileTestObject.setMobileLocatorStrategy(MobileLocatorStrategy.XPATH)

def now = new Date().format('dd/mm/yyyy')

day = now.substring(0, 2)

day = day.replaceFirst('^0*', '')

newxpath = (('//android.widget.TextView[@resource-id="com.win.winfertility:id/vw_text" and @text="' + day) + '"]')

println(newxpath)

mobileTestObject.setMobileLocator(newxpath)

Mobile.tap(mobileTestObject, 60)

Mobile.tap(findTestObject('Android/Book Appointment/android.widget.TextView - Next'), 0)

int a = day.toInteger()

while (Mobile.verifyElementVisible(findTestObject('Android/Book Appointment/android.widget.TextView - Please click on an available date'), 
    0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Android/Book Appointment/android.widget.Button - OK'), 0)

    a++

    newxpath = (('//android.widget.TextView[@resource-id="com.win.winfertility:id/vw_text" and @text="' + a.toString()) + 
    '"]')

    println(newxpath)

    mobileTestObject.setMobileLocator(newxpath)

    Mobile.tap(mobileTestObject, 60)

    Mobile.tap(findTestObject('Android/Book Appointment/android.widget.TextView - Next'), 0)

    Mobile.delay(3)
}

writeStringToFile(RunConfiguration.getProjectDir() + '/Data Files/date.txt', a.toString())

Mobile.tap(findTestObject('Android/Book Appointment/timeSlot'), 0)

String Slot = Mobile.getAttribute(findTestObject('Android/Book Appointment/timeSlot'), 'text', 0)

writeStringToFile(RunConfiguration.getProjectDir() + '/Data Files/Variablefile.txt', Slot)

Mobile.tap(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - Book Appointment'), 0)

if (Mobile.verifyElementVisible(findTestObject('Object Repository/Android/Book Appointment/android.widget.TextView - Currently you have a Behavioral Health-Phone appointment scheduled.You can only schedule one appointment at a time.Would you like to cancel your existing appointment and book the current selection'), 
    3)) {
    Mobile.tap(findTestObject('Android/Book Appointment/android.widget.Button - OK'), 0)
}

Mobile.verifyElementVisible(findTestObject('Android/Book Appointment/android.widget.TextView - Success'), 0)

static void writeStringToFile(String filePath, String theString) {
    new File(filePath).withWriter('utf-8', { def writer ->
            writer.writeLine(theString)
        })
}

