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

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/1_Government_Purchase/2_Enquiry/2_Enquiry'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/1_Government_Purchase/3_Online_Bidding/3_Online_Bidding'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/1_Government_Purchase/4_Bulk_Concentration/4_Bulk_Concentration'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/1_Government_Purchase/5_Sentinel_Procurement/5_Sentinel_Procurement'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/0_Disperse_Purchase'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/1_LT_50000/1_LT_50000'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/2_EQ-50000_LT-100000/0_EQ-50000_LT-100000'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/2_EQ-50000_LT-100000/1_Online_Bidding/1_Online_Bidding'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/2_EQ-50000_LT-100000/2_Single_Source/2_Single_Source'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/2_EQ-50000_LT-100000/3_ Purchase_Record/3_ Purchase_Record'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/3_Secondary_Unit/3_Secondary_Unit'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/4_EQ_100000-LT_2000000/0_EQ_100000-LT_2000000'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/4_EQ_100000-LT_2000000/1_Open_Tendering/1_Open_Tendering'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Submit/Submit_Hint/Submit_Hint_Button'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/4_EQ_100000-LT_2000000/2_Competitive_Negotiation/2_Competitive_Negotiation'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/4_EQ_100000-LT_2000000/3_Exchange_Views/3_Exchange_Views'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/4_EQ_100000-LT_2000000/4_Invited_Tendering/4_Invited_Tendering'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/4_EQ_100000-LT_2000000/5_Single_Source/5_Single_Source'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/4_EQ_100000-LT_2000000/6_Specify_Purchase/6_Specify_Purchase'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/5_GE_2000000/0_GE_2000000'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/5_GE_2000000/1_Open_Tendering/1_Open_Tendering'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1_Furniture_Software/2_Disperse_Purchase/5_GE_2000000/2_Single_Source/2_Single_Source'))

