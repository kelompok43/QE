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

WebUI.click(findTestObject('Membership/Edit/data member'))

WebUI.click(findTestObject('Membership/Edit/edit button'))

WebUI.setText(findTestObject('Membership/Edit/nama lengkap'), 'alif')

WebUI.setText(findTestObject('Membership/Edit/email'), 'alif@gmail.com')

WebUI.click(findTestObject('Membership/Edit/tgl lahir'))

WebUI.click(findTestObject('Membership/Edit/JK'))

WebUI.setText(findTestObject('Membership/Edit/no hp'), '08231234567')

WebUI.setText(findTestObject('Membership/Edit/alamat'), 'malang')

WebUI.click(findTestObject('Membership/Edit/status'))

WebUI.click(findTestObject('Membership/Edit/save button'))

WebUI.click(findTestObject('Membership/Edit/ya button'))

