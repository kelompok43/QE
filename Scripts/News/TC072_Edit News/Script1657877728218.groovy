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

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('News/Edit/Edit News'))

WebUI.setText(findTestObject('News/Edit/Category'), '1')

WebUI.setText(findTestObject('News/Edit/Title'), '1')

WebUI.setText(findTestObject('News/Edit/Author'), '1')

WebUI.setText(findTestObject('News/Edit/Date'), '1')

WebUI.click(findTestObject('News/Edit/Save Button'))

WebUI.verifyElementText(findTestObject('News/Edit/Category1'), 'Fitness Gym1')

WebUI.verifyElementText(findTestObject('News/Edit/Title1'), 'Mengenal kelas Virtual Studio di “Fitness Gym”1')

WebUI.verifyElementText(findTestObject('News/Edit/Author1'), 'Syania Tan1')

WebUI.verifyElementText(findTestObject('News/Edit/Date1'), '03/06/20221')

