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

WebUI.click(findTestObject('News/Add/Berita'))

WebUI.click(findTestObject('News/Add/Add News'))

WebUI.refresh()

WebUI.verifyElementText(findTestObject('News/Add/Tambah Berita Baru'), 'Tambah Berita Baru')

WebUI.click(findTestObject('News/Add/Category'))

WebUI.click(findTestObject('News/Add/Fitness Gym'))

WebUI.setText(findTestObject('News/Add/Title'), 'Makan')

WebUI.setText(findTestObject('News/Add/Author'), 'Alif')

WebUI.setText(findTestObject('News/Add/Date'), '12122012')

WebUI.setText(findTestObject('News/Add/Description'), 'ini adalah berita makan')

WebUI.uploadFile(findTestObject('News/Add/Upload'), 'C:\\FILE\\DataTest\\thresh.jpg')

WebUI.click(findTestObject('News/Add/Save Button'))

WebUI.verifyElementText(findTestObject('Auth/Register/SUKSES'), 'SUKSES! Data berhasil disimpan')

