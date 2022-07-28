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

Response = WS.sendRequest(findTestObject('Membership/Add Membership Category'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'message', 'success')

Response = WS.sendRequest(findTestObject('Membership/Get All Membership Category'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data[0].category', 'Monthly')

WS.verifyElementPropertyValue(Response, 'data[0].price', '400000')

WS.verifyElementPropertyValue(Response, 'data[0].duration', '30')

Response = WS.sendRequest(findTestObject('Membership/Get Membership By Category ID'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.category', 'Monthly')

WS.verifyElementPropertyValue(Response, 'data.price', '400000')

WS.verifyElementPropertyValue(Response, 'data.duration', '30')

Response = WS.sendRequest(findTestObject('Membership/Update Membership Category'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.category', 'Monthly')

WS.verifyElementPropertyValue(Response, 'data.price', '400000')

WS.verifyElementPropertyValue(Response, 'data.duration', '30')

Response = WS.sendRequest(findTestObject('Membership/Delete Membership Category'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'message', 'success')

Response = WS.sendRequest(findTestObject('Membership/Get All Membership'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data[0].user_id', '8')

WS.verifyElementPropertyValue(Response, 'data[0].membership_category_id', '2')

Response = WS.sendRequest(findTestObject('Membership/Get Membership By ID'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.user_id', '8')

WS.verifyElementPropertyValue(Response, 'data.membership_category_id', '2')

Response = WS.sendRequest(findTestObject('Membership/Get Membership By User ID'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data[0].user_id', '8')

WS.verifyElementPropertyValue(Response, 'data[0].membership_category_id', '2')

