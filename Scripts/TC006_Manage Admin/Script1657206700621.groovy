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

Response = WS.sendRequest(findTestObject('Admin/Get All Admin'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data[3].name', 'Vidi')

WS.verifyElementPropertyValue(Response, 'data[3].dob', '16-04-2000')

WS.verifyElementPropertyValue(Response, 'data[3].gender', 'L')

WS.verifyElementPropertyValue(Response, 'data[3].address', 'jl. in aja dulu')

WS.verifyElementPropertyValue(Response, 'data[3].role', 'Super Admin')

WS.verifyElementPropertyValue(Response, 'data[3].email', 'vidi@gmail.com')

Response = WS.sendRequest(findTestObject('Admin/Get Admin By ID'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.name', 'Admin1')

WS.verifyElementPropertyValue(Response, 'data.dob', '19-02-2000')

WS.verifyElementPropertyValue(Response, 'data.gender', 'L')

WS.verifyElementPropertyValue(Response, 'data.address', 'jl. apa saja')

WS.verifyElementPropertyValue(Response, 'data.role', 'Super Admin')

WS.verifyElementPropertyValue(Response, 'data.email', 'superAdmin1@gmail.com')

Response = WS.sendRequest(findTestObject('Admin/Update Admin'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.name', 'Admin1')

WS.verifyElementPropertyValue(Response, 'data.dob', '19-02-2000')

WS.verifyElementPropertyValue(Response, 'data.gender', 'L')

WS.verifyElementPropertyValue(Response, 'data.address', 'jl. apa saja')

WS.verifyElementPropertyValue(Response, 'data.role', 'Admin Operasional')

WS.verifyElementPropertyValue(Response, 'data.email', 'emailAdmin@mail.com')

Response = WS.sendRequest(findTestObject('Admin/Change Password Admin'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'data.name', 'Admin14')

WS.verifyElementPropertyValue(Response, 'data.dob', '19-02-2000')

WS.verifyElementPropertyValue(Response, 'data.gender', 'L')

WS.verifyElementPropertyValue(Response, 'data.address', 'jl. apa saja')

WS.verifyElementPropertyValue(Response, 'data.role', 'Super Admin')

WS.verifyElementPropertyValue(Response, 'data.email', 'superAdmin14@gmail.com')

WS.verifyElementPropertyValue(Response, 'message', 'success')

Response = WS.sendRequest(findTestObject('Admin/Delete Admin'))

WS.verifyResponseStatusCode(Response, 200)

WS.verifyElementPropertyValue(Response, 'message', 'success')

