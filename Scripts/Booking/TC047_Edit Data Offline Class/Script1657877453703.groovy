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

WebUI.click(findTestObject('Booking/Offline/Edit/Edit Offline Class'))

WebUI.refresh()

WebUI.verifyElementText(findTestObject('Booking/Offline/Edit/Edit Kelas Offline Baru'), 'Tambah Kelas Offline Baru')

WebUI.setText(findTestObject('Booking/Offline/Edit/Class Name'), 'Yoga')

WebUI.setText(findTestObject('Booking/Offline/Edit/Date'), '12122012')

WebUI.click(findTestObject('Booking/Offline/Edit/Start Time'))

WebUI.click(findTestObject('Booking/Offline/Edit/Start 8'))

WebUI.click(findTestObject('Booking/Offline/Edit/Start 00'))

WebUI.click(findTestObject('Booking/Offline/Edit/Start OK'))

WebUI.click(findTestObject('Booking/Offline/Edit/End Time'))

WebUI.click(findTestObject('Booking/Offline/Edit/End 10'))

WebUI.click(findTestObject('Booking/Offline/Edit/End 00'))

WebUI.click(findTestObject('Booking/Offline/Edit/End OK'))

WebUI.setText(findTestObject('Booking/Offline/Edit/Location'), 'Ruangan 7')

WebUI.setText(findTestObject('Booking/Offline/Edit/Quota'), '35')

WebUI.click(findTestObject('Booking/Offline/Edit/Trainer'))

WebUI.click(findTestObject('Booking/Offline/Edit/Peter'))

WebUI.setText(findTestObject('Booking/Offline/Edit/Description'), 'ini adalah kelas yoga')

WebUI.click(findTestObject('Booking/Offline/Edit/Save Button'))

WebUI.click(findTestObject('Booking/Offline/Edit/Ya Button'))

WebUI.verifyElementText(findTestObject('Booking/Offline/Edit/SUKSES'), 'SUKSES! Data berhasil disimpan')

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Booking/Offline/Edit/Class Name1'), 'Yoga')

WebUI.verifyElementText(findTestObject('Booking/Offline/Edit/Description1'), 'ini adalah kelas yoga')

WebUI.verifyElementText(findTestObject('Booking/Offline/Edit/Trainer1'), 'Peter')

WebUI.verifyElementText(findTestObject('Booking/Offline/Edit/Location1'), 'Ruangan 7')

WebUI.verifyElementText(findTestObject('Booking/Offline/Edit/Date1'), '2012-12-12')

WebUI.verifyElementText(findTestObject('Booking/Offline/Edit/Start1'), '08:00')

WebUI.verifyElementText(findTestObject('Booking/Offline/Edit/End1'), '10:00')

WebUI.verifyElementText(findTestObject('Booking/Offline/Edit/Quota1'), '35')

