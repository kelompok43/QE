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

WebUI.click(findTestObject('Management/Trainer/Edit/data pelatih'))

WebUI.click(findTestObject('Management/Trainer/Edit/edit button'))

WebUI.setText(findTestObject('Management/Trainer/Edit/nama'), 'alif')

WebUI.setText(findTestObject('Management/Trainer/Edit/email'), 'alif1234@gmail.com')

WebUI.click(findTestObject('Management/Trainer/Edit/tgl lahir'))

WebUI.click(findTestObject('Management/Trainer/Edit/jk'))

WebUI.setText(findTestObject('Management/Trainer/Edit/no hp'), '08231234567')

WebUI.setText(findTestObject('Management/Trainer/Edit/alamat'), 'malang')

WebUI.uploadFile(findTestObject('Management/Trainer/Edit/foto'), 'C:\\foto.png')

WebUI.click(findTestObject('Management/Trainer/Edit/bidang'))

WebUI.click(findTestObject('Management/Trainer/Edit/save button'))

WebUI.click(findTestObject('Management/Trainer/Edit/ya button'))

