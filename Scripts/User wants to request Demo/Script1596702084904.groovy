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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.mile.app/request-demo')

WebUI.setText(findTestObject('Page_Mileapp  Request Demo/input_Full name_name'), 'Mile App')

WebUI.setText(findTestObject('Page_Mileapp  Request Demo/input_Email_email'), 'mileapp@yopmail.com')

WebUI.setText(findTestObject('Page_Mileapp  Request Demo/input_Phone number_phone'), '8123456789')

WebUI.setText(findTestObject('Page_Mileapp  Request Demo/input_Company name_organization_name'), 'Mile App')

WebUI.click(findTestObject('Page_Mileapp  Request Demo/button_Request Demo'))

