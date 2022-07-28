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

WebUI.refresh()

WebUI.click(findTestObject('Management/Trainer/Edit/Edit Trainer'))

WebUI.setText(findTestObject('Management/Trainer/Edit/Field'), '1')

WebUI.setText(findTestObject('Management/Trainer/Edit/Name'), '1')

WebUI.setText(findTestObject('Management/Trainer/Edit/Email'), '1')

WebUI.setText(findTestObject('Management/Trainer/Edit/Phone'), '1')

WebUI.setText(findTestObject('Management/Trainer/Edit/Address'), '1')

WebUI.setText(findTestObject('Management/Trainer/Edit/Gender'), '1')

WebUI.click(findTestObject('Management/Trainer/Edit/Save Button'))

WebUI.verifyElementText(findTestObject('Management/Trainer/Edit/Field1'), 'Cycling1')

WebUI.verifyElementText(findTestObject('Management/Trainer/Edit/Name1'), 'Peter1')

WebUI.verifyElementText(findTestObject('Management/Trainer/Edit/Email1'), 'jackson.graham@example.com1')

WebUI.verifyElementText(findTestObject('Management/Trainer/Edit/Phone1'), '(252) 555-01261')

WebUI.verifyElementText(findTestObject('Management/Trainer/Edit/Address1'), '775 Rolling Green Rd.1')

WebUI.verifyElementText(findTestObject('Management/Trainer/Edit/Gender1'), 'Female1')

