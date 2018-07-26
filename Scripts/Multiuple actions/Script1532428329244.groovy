import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_txtPassword'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_Submit'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/img'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/a_Add Timesheet'))

WebUI.doubleClick(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_timedate'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/a_26'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_addTimesheetBtn'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_button'))

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows0projectName'), 
    'SVP-ACBS')

WebUI.doubleClick(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/select_-- Select --'))

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows00'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows01'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows02'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows03'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows04'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows05'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows06'), '8')

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_btnAddRow'))

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows1projectName'), 
    'SVP-CMODS')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows10'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows11'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows12'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows13'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows14'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows15'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows16'), '8')

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_btnAddRow'))

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows2projectName'), 
    'SVP-Infolease')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows20'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows21'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows22'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows23'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows24'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows25'), '8')

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_initialRows26'), '8')

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_btnSave'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/td_-- Select --'))

WebUI.doubleClick(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/select_-- Select --_1'))

WebUI.doubleClick(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/select_-- Select --_2'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_btnSave'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_btnReset'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_btnBack'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/b_Dashboard'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/img_1'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/a_Leave List'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/a_Assign Leave'))

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_assignleavetxtEmployeeem'), 
    'Venky')

WebUI.selectOptionByValue(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/select_--Select--FMLA USMatern'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/img_ui-datepicker-trigger'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/a_24'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/img_ui-datepicker-trigger'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/a_25'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/select_NoneAll DaysStart Day O'), 
    'start', true)

WebUI.setText(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/textarea_assignleavetxtComment'), 
    'Invalid reason')

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/input_assignBtn'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/a_Welcome Steven'))

WebUI.click(findTestObject('Object Repository/Multiple actions/Page_OrangeHRM/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

