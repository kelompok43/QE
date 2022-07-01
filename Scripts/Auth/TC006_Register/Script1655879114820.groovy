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

WebUI.click(findTestObject('Auth/Register/Data Admin'))

WebUI.click(findTestObject('Auth/Register/Add Admin'))

WebUI.navigateToUrl('https://develop--capstone-frontend-43.netlify.app/registrasi')

WebUI.setText(findTestObject('Auth/Register/Name'), 'alif')

WebUI.setText(findTestObject('Auth/Register/DoB'), '662006')

WebUI.click(findTestObject('Auth/Register/Gender'))

WebUI.setText(findTestObject('Auth/Register/Address'), 'Malang')

WebUI.click(findTestObject('Auth/Register/Role'))

WebUI.click(findTestObject('Auth/Register/Admin Operasional'))

WebUI.setText(findTestObject('Auth/Register/Email'), 'alif@gmail.com')

WebUI.setText(findTestObject('Auth/Register/Password'), 'alif123')

WebUI.click(findTestObject('Auth/Register/Save Button'))

WebUI.click(findTestObject('Auth/Register/Ya Button'))

WebUI.navigateToUrl('https://develop--capstone-frontend-43.netlify.app/DataAdmin')

