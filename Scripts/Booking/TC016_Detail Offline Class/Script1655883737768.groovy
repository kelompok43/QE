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

WebUI.click(findTestObject('Booking/Offline/Edit/data kelas'))

WebUI.click(findTestObject('Booking/Offline/Edit/kelas offline'))

WebUI.click(findTestObject('Booking/Offline/Edit/edit button'))

WebUI.setText(findTestObject('Booking/Offline/Edit/nama kelas'), 'yoga')

WebUI.click(findTestObject('Booking/Offline/Edit/tgl'))

WebUI.setText(findTestObject('Booking/Offline/Edit/jam mulai'), '1pm')

WebUI.setText(findTestObject('Booking/Offline/Edit/jam selesai'), '2pm')

WebUI.setText(findTestObject('Booking/Offline/Edit/kuota kelas'), '20')

WebUI.click(findTestObject('Booking/Offline/Edit/pelatih'))

WebUI.setText(findTestObject('Booking/Offline/Edit/deskripsi'), 'kelas yoga')

WebUI.click(findTestObject('Booking/Offline/Edit/save button'))

WebUI.click(findTestObject('Booking/Offline/Edit/ya button'))

