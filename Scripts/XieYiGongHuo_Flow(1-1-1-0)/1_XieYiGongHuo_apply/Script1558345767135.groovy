import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.22/sfw/login.jsp')

WebUI.setViewPortSize(1366, 768)

WebUI.setText(findTestObject('22_Test/Page_22_login/input__userid22'), findTestData('username_password').getValue(1, 1))

WebUI.setText(findTestObject('22_Test/Page_22_login/input__password22'), findTestData('username_password').getValue(2, 1))

WebUI.click(findTestObject('22_Test/Page_22_login/button_22_login'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Comm/close_hint_button'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Comm/person_business/person_business'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Comm/person_submit_app/submit_app'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Comm/app_type/new_app'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Comm/redme_text/button_have_read'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/0_Furniture_Software'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/1_Government_Purchase/0_Government_Purchase'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Submit/Submit_Hint/Submit_Hint_Button'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/1_Government_Purchase/1_Supply_Agreement/1_Supply_Agreement'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Next_Save/entrance_next/entrance_next_button'))

WebUI.setText(findTestObject('22_Test/page_purchase_request/Page_Project/Project_information_edit/1-1-1-0input_name'), findTestData(
        'project_name').getValue(1, 3))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Project/Project_information_payment_method_choose/selector_button'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Project/Project_information_payment_method_choose/pay_on_delivery'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Project/Project_information_days_choose/span__caret'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Project/Project_information_days_choose/4days'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Project/Project_ShouHuoDiDian/ShouHuoDiDian_click'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Project/Project_ShouHuoDiDian/ShouHuoDiDian_select'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Project/Project_Supplier_Qualification/Add_Supplier_Qualification'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Project/Project_Supplier_Qualification/input'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Project/Project_Supplier_Qualification/button_Supplier_Qualification'))

WebUI.setText(findTestObject('22_Test/page_purchase_request/Page_Project/Project_ShenGouLiYou/Set_text_ShenGouLiYou'), '理由')

WebUI.click(findTestObject('22_Test/page_purchase_request/Next_Save/Project_Next_button/Project_Next_button'))

WebUI.verifyElementVisibleInViewport(findTestObject('22_Test/page_purchase_request/Page_Materials/Materials_Directory/Select_Directory_Button'), 
    0)

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Materials/Materials_Directory/Select_Directory_Button'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Materials/Materials_Directory/Directory/TaiShiJiSuanJi'))

WebUI.setText(findTestObject('22_Test/page_purchase_request/Page_Materials/Materials_Name/1-1-1-0Input_Materials_Name'), 
    findTestData('project_name').getValue(1, 3))

WebUI.setText(findTestObject('22_Test/page_purchase_request/Page_Materials/Materials_Money/Input_Materials_Money'), '3000')

WebUI.setText(findTestObject('22_Test/page_purchase_request/Page_Materials/Materials_Quantity/input_Materials_Quantity'), 
    '1')

WebUI.setText(findTestObject('22_Test/page_purchase_request/Page_Materials/Materials_Arguments/1-1-1-0Input_Materials_Arguments'), 
    '参数')

WebUI.click(findTestObject('22_Test/page_purchase_request/Next_Save/Materials_Next_Button/Materials_Next_Button'))

WebUI.verifyElementVisible(findTestObject('22_Test/page_purchase_request/Page_Money/Money_Select/Money_Select'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Money/Money_Select/Money_Select'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Next_Save/Money_Next_Button/Money_Next_Button'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Next_Save/Confirm_Submit/Confirm_Submit'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Submit/Submit_Hint/Submit_Hint_Button'))

WebUI.delay(1)

WebUI.closeBrowser()

