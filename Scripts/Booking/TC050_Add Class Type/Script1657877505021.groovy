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

WebUI.click(findTestObject('Booking/Type/Add/Data Kelas'))

WebUI.click(findTestObject('Booking/Type/Add/Tipe Kelas'))

WebUI.click(findTestObject('Booking/Type/Add/Add Tipe Kelas'))

WebUI.refresh()

WebUI.verifyElementText(findTestObject('Booking/Type/Add/Tambah Tipe Kelas Baru'), 'Tambah Tipe Kelas Baru')

WebUI.setText(findTestObject('Booking/Type/Add/Class Name'), 'Yoga')

WebUI.setText(findTestObject('Booking/Type/Add/Description'), 'ini adalah kelas yoga')

WebUI.uploadFile(findTestObject('Booking/Type/Add/Upload Foto'), 'C:\\\\FILE\\\\DataTest\\\\thresh.jpg')

WebUI.click(findTestObject('Booking/Type/Add/Save Button'))

WebUI.click(findTestObject('Booking/Type/Add/Ya Button'))

WebUI.verifyElementText(findTestObject('Booking/Type/Add/SUKSES'), 'SUKSES! Data berhasil disimpan')

WebUI.navigateToUrl('https://develop--capstone-frontend-43.netlify.app/TipeKelas')

