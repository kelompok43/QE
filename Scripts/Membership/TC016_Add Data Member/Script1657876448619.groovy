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

WebUI.click(findTestObject('Membership/Data Member/Add/Membership'))

WebUI.click(findTestObject('Membership/Data Member/Add/Data Member'))

WebUI.click(findTestObject('Membership/Data Member/Add/Add Member'))

WebUI.refresh()

WebUI.setText(findTestObject('Membership/Data Member/Add/Name'), 'Alif Fadil')

WebUI.setText(findTestObject('Membership/Data Member/Add/Email'), 'alif@gmail.com')

WebUI.setText(findTestObject('Membership/Data Member/Add/DoB'), '2662001')

WebUI.click(findTestObject('Membership/Data Member/Add/Gender'))

WebUI.setText(findTestObject('Membership/Data Member/Add/No HP'), '08231234567')

WebUI.setText(findTestObject('Membership/Data Member/Add/Address'), 'Malang')

WebUI.click(findTestObject('Membership/Data Member/Add/Status'))

WebUI.click(findTestObject('Membership/Data Member/Add/Member'))

WebUI.click(findTestObject('Membership/Data Member/Add/Save Button'))

WebUI.click(findTestObject('Membership/Data Member/Add/Ya Button'))

WebUI.verifyElementText(findTestObject('Booking/Online/Add/SUKSES'), 'SUKSES! Data berhasil disimpan')

