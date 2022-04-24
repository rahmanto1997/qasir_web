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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.qasir.id/sign-in')

WebUI.setText(findTestObject('Object Repository/qasir_web/Page_Masuk/input__phonenumber'), '89635901289')

WebUI.setEncryptedText(findTestObject('Object Repository/qasir_web/Page_Masuk/input_Email_password'), '7Q0szbd4+A0=')

WebUI.click(findTestObject('Object Repository/qasir_web/Page_Masuk/input_No. PIN_submit-btn-signin'))

WebUI.click(findTestObject('Object Repository/qasir_web/Page_Masuk/h4_Pusat'))

WebUI.click(findTestObject('Object Repository/qasir_web/Page_Profile/img_atau_img-circle avatar'))

WebUI.click(findTestObject('Object Repository/qasir_web/Page_Home/a_User Profile'))

WebUI.setText(findTestObject('Object Repository/qasir_web/Page_Profile/input_First Name_last_name'), 'ujann')

WebUI.click(findTestObject('Object Repository/qasir_web/Page_Profile/button_Save'))

WebUI.click(findTestObject('Object Repository/qasir_web/Page_Home/img_atau_img-circle avatar border-free'))

WebUI.closeBrowser()

