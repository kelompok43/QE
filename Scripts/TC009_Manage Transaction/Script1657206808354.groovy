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

Response = WS.sendRequest(findTestObject('Transaction/Get All Transaction'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data[1].user_id', '8')

WS.verifyElementPropertyValue(Response, 'data[1].payment_method_id', '1')

WS.verifyElementPropertyValue(Response, 'data[1].total_price', '400000')

WS.verifyElementPropertyValue(Response, 'data[1].status', 'Diterima')

WS.verifyElementPropertyValue(Response, 'data[1].payment_receipt', 'https://cs110032002051f116d.blob.core.windows.net/imagegms/5131449252013075954.jpg')

Response = WS.sendRequest(findTestObject('Transaction/Get Transaction By ID'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.user_id', '8')

WS.verifyElementPropertyValue(Response, 'data.payment_method_id', '1')

WS.verifyElementPropertyValue(Response, 'data.total_price', '400000')

WS.verifyElementPropertyValue(Response, 'data.status', 'Diterima')

WS.verifyElementPropertyValue(Response, 'data.payment_receipt', 'https://cs110032002051f116d.blob.core.windows.net/imagegms/5131449252013075954.jpg')

Response = WS.sendRequest(findTestObject('Transaction/Update Transaction Status'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.user_id', '8')

WS.verifyElementPropertyValue(Response, 'data.payment_method_id', '1')

WS.verifyElementPropertyValue(Response, 'data.total_price', '400000')

WS.verifyElementPropertyValue(Response, 'data.status', 'Diterima')

WS.verifyElementPropertyValue(Response, 'data.payment_receipt', 'https://cs110032002051f116d.blob.core.windows.net/imagegms/5131449252013075954.jpg')

Response = WS.sendRequest(findTestObject('Transaction/Delete Transaction'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'message', 'success')

