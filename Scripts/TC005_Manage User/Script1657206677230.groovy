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

Response = WS.sendRequest(findTestObject('User/Get All User'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data[0].name', 'Jiran Muhammad')

WS.verifyElementPropertyValue(Response, 'data[0].email', 'smdmao@gmail.com')

WS.verifyElementPropertyValue(Response, 'data[0].status', 'Bukan Member')

Response = WS.sendRequest(findTestObject('User/Get User By ID'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.name', 'Jiran Muhammad')

WS.verifyElementPropertyValue(Response, 'data.email', 'smdmao@gmail.com')

WS.verifyElementPropertyValue(Response, 'data.status', 'Bukan Member')

Response = WS.sendRequest(findTestObject('User/Get User By Email'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.email', 'mfauzan@gmail.com')

WS.verifyElementPropertyValue(Response, 'data.status', 'Bukan Member')

Response = WS.sendRequest(findTestObject('User/Get All User Transaction'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data[0].user_id', '1')

WS.verifyElementPropertyValue(Response, 'data[0].payment_method_id', '1')

WS.verifyElementPropertyValue(Response, 'data[0].total_price', '1000000')

WS.verifyElementPropertyValue(Response, 'data[0].status', 'Sedang Diproses')

WS.verifyElementPropertyValue(Response, 'data[0].payment_receipt', 'https://cs110032002051f116d.blob.core.windows.net/imagegms/3298597395409689049.jpg')

Response = WS.sendRequest(findTestObject('User/Get User By Transaction ID'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.user_id', '1')

WS.verifyElementPropertyValue(Response, 'data.payment_method_id', '1')

WS.verifyElementPropertyValue(Response, 'data.total_price', '1000000')

WS.verifyElementPropertyValue(Response, 'data.status', 'Sedang Diproses')

WS.verifyElementPropertyValue(Response, 'data.payment_receipt', 'https://cs110032002051f116d.blob.core.windows.net/imagegms/3298597395409689049.jpg')

Response = WS.sendRequest(findTestObject('User/Change Password User'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.name', 'Jiran Muhammad')

WS.verifyElementPropertyValue(Response, 'data.email', 'smdmao@gmail.com')

WS.verifyElementPropertyValue(Response, 'data.status', 'Bukan Member')

WS.verifyElementPropertyValue(Response, 'message', 'success')

