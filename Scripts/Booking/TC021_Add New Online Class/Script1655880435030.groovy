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

WebUI.click(findTestObject('Booking/Online/Add/Data Kelas'))

WebUI.click(findTestObject('Booking/Online/Add/Online Class'))

WebUI.click(findTestObject('Booking/Online/Add/Add Online Class'))

WebUI.navigateToUrl('https://develop--capstone-frontend-43.netlify.app/tambahKelasOnline')

WebUI.setText(findTestObject('Booking/Online/Add/Class Name'), 'Yoga')

WebUI.setText(findTestObject('Booking/Online/Add/Date'), '12122022')

WebUI.click(findTestObject('Booking/Online/Add/Start Time'))

WebUI.click(findTestObject('Booking/Online/Add/Start 12'))

WebUI.click(findTestObject('Booking/Online/Add/Start 00'))

WebUI.click(findTestObject('Booking/Online/Add/Start PM'))

WebUI.click(findTestObject('Booking/Online/Add/Start OK'))

WebUI.click(findTestObject('Booking/Online/Add/End Time'))

WebUI.click(findTestObject('Booking/Online/Add/End PM'))

WebUI.click(findTestObject('Booking/Online/Add/End 1'))

WebUI.click(findTestObject('Booking/Online/Add/End 00'))

WebUI.click(findTestObject('Booking/Online/Add/End OK'))

WebUI.click(findTestObject('Booking/Online/Add/Trainer1'))

WebUI.click(findTestObject('Booking/Online/Add/Peter2'))

WebUI.setText(findTestObject('Booking/Online/Add/Description'), 'ini adalah kelas yoga online')

WebUI.setText(findTestObject('Booking/Online/Add/Virtual Meeting'), 'https://zoom.us/meeting/register/tJEuceihpj4pE9YG18D1OTbZHQjnniOr')

WebUI.click(findTestObject('Booking/Online/Add/Save Button'))

WebUI.navigateToUrl('https://develop--capstone-frontend-43.netlify.app/DataKelasOnline')

