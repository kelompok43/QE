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

WebUI.click(findTestObject('Management/Trainer/Add/Data Pelatih'))

WebUI.click(findTestObject('Management/Trainer/Add/Add Trainer'))

WebUI.refresh()

WebUI.verifyElementText(findTestObject('Management/Trainer/Add/Tambah Pelatih'), 'Tambah Pelatih')

WebUI.setText(findTestObject('Management/Trainer/Add/Name'), 'alif')

WebUI.setText(findTestObject('Management/Trainer/Add/Email'), 'alif@gmail.com')

WebUI.setText(findTestObject('Management/Trainer/Add/DoB'), '12122012')

WebUI.click(findTestObject('Management/Trainer/Add/Gender'))

WebUI.setText(findTestObject('Management/Trainer/Add/Phone'), '08231234567')

WebUI.setText(findTestObject('Management/Trainer/Add/Address'), 'malang')

WebUI.click(findTestObject('Management/Trainer/Add/Field'))

WebUI.click(findTestObject('Management/Trainer/Add/Cycling'))

WebUI.uploadFile(findTestObject('Management/Trainer/Add/Photo'), 'C:\\\\FILE\\\\DataTest\\\\thresh.jpg')

WebUI.click(findTestObject('Management/Trainer/Add/Save Button'))

WebUI.click(findTestObject('Management/Trainer/Add/Ya Button'))

WebUI.verifyElementText(findTestObject('Auth/Register/SUKSES'), 'SUKSES! Data berhasil disimpan')

