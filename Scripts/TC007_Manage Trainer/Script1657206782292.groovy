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

Response = WS.sendRequest(findTestObject('Trainer/Get All Trainer'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data[0].name', 'jiran')

WS.verifyElementPropertyValue(Response, 'data[0].dob', '19-02-2000')

WS.verifyElementPropertyValue(Response, 'data[0].email', 'jiranskjjjjggknssnn@mail.com')

WS.verifyElementPropertyValue(Response, 'data[0].gender', 'L')

WS.verifyElementPropertyValue(Response, 'data[0].phone', '6285393993')

WS.verifyElementPropertyValue(Response, 'data[0].address', 'jl. dimana saja')

WS.verifyElementPropertyValue(Response, 'data[0].picture', 'https://cs110032002051f116d.blob.core.windows.net/imagegms/6810225280479725862.jpg')

WS.verifyElementPropertyValue(Response, 'data[0].field', 'Cardio')

Response = WS.sendRequest(findTestObject('Trainer/Get Trainer By ID'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.name', 'jiran')

WS.verifyElementPropertyValue(Response, 'data.dob', '19-02-2000')

WS.verifyElementPropertyValue(Response, 'data.email', 'jiranskjjjjggknssnn@mail.com')

WS.verifyElementPropertyValue(Response, 'data.gender', 'L')

WS.verifyElementPropertyValue(Response, 'data.phone', '6285393993')

WS.verifyElementPropertyValue(Response, 'data.address', 'jl. dimana saja')

WS.verifyElementPropertyValue(Response, 'data.picture', 'https://cs110032002051f116d.blob.core.windows.net/imagegms/6810225280479725862.jpg')

WS.verifyElementPropertyValue(Response, 'data.field', 'Cardio')

Response = WS.sendRequest(findTestObject('Trainer/Delete Trainer'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'message', 'success')

