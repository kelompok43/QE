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

Response = WS.sendRequest(findTestObject('Class/Offline Class/Add Offline Class'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'message', 'success')

Response = WS.sendRequest(findTestObject('Class/Offline Class/Get All Offline Class'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data[1].class_category_id', '1')

WS.verifyElementPropertyValue(Response, 'data[1].trainer_id', '1')

WS.verifyElementPropertyValue(Response, 'data[1].started_at', '2022-07-07T08:00:00+07:00')

WS.verifyElementPropertyValue(Response, 'data[1].ended_at', '2022-07-07T09:30:00+07:00')

WS.verifyElementPropertyValue(Response, 'data[1].place', 'ruangan 01')

WS.verifyElementPropertyValue(Response, 'data[1].quota', '20')

Response = WS.sendRequest(findTestObject('Class/Offline Class/Get Offline Class By ID'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.class_category_id', '1')

WS.verifyElementPropertyValue(Response, 'data.trainer_id', '1')

WS.verifyElementPropertyValue(Response, 'data.started_at', '2022-07-07T08:00:00+07:00')

WS.verifyElementPropertyValue(Response, 'data.ended_at', '2022-07-07T09:30:00+07:00')

WS.verifyElementPropertyValue(Response, 'data.place', 'ruangan 02')

WS.verifyElementPropertyValue(Response, 'data.quota', '20')

Response = WS.sendRequest(findTestObject('Class/Offline Class/Update Offline Class'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.class_category_id', '1')

WS.verifyElementPropertyValue(Response, 'data.trainer_id', '1')

WS.verifyElementPropertyValue(Response, 'data.started_at', '2022-07-07T08:00:00+07:00')

WS.verifyElementPropertyValue(Response, 'data.ended_at', '2022-07-07T09:30:00+07:00')

WS.verifyElementPropertyValue(Response, 'data.place', 'ruangan 02')

WS.verifyElementPropertyValue(Response, 'data.quota', '20')

Response = WS.sendRequest(findTestObject('Class/Offline Class/Delete Offline Class'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'message', 'success')

