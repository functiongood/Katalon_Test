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

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/1_Furniture_Software'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/1_Furniture_Software(Organizational_Type)/1_Government_Purchase'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Submit/Submit_Hint/Submit_Hint_Button'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/1_Furniture_Software'))

WebUI.click(findTestObject('22_Test/tree/1_Furniture_Software/2_Disperse_Purchase/0_Disperse_Purchase'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/2_Scientific_Equipment'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Submit/Submit_Hint/Submit_Hint_Button'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/2_Scientific_Equipment(Organizational_Type)/1_School_Equipment'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/2_Scientific_Equipment'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Page_Submit/Submit_Hint/Submit_Hint_Button'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/2_Scientific_Equipment(Organizational_Type)/2_Non-school_Equipment'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/3_Consumable_Items'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/3_Consumable_Items(Organizational_Type)/1_Cargo'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/3_Consumable_Items'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/3_Consumable_Items(Organizational_Type)/2_Project'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/3_Consumable_Items'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/3_Consumable_Items(Organizational_Type)/3_Service'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/3_Consumable_Items'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/3_Consumable_Items(Organizational_Type)/4_Disperse_Purchase'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/4_Project'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/4_Project(Organizational_Type)/1_Infrastructure'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/4_Project'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/4_Project(Organizational_Type)/2_Repair'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/4_Project'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/4_Project(Organizational_Type)/3_Restoration_Project'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/4_Project'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/4_Project(Organizational_Type)/4_Assign_Purchase'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/5_Service'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/5_Service(Organizational_Type)/1_Cargo_Service'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/5_Service'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/5_Service(Organizational_Type)/2_Project_Service'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/5_Service'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/5_Service(Organizational_Type)/3_Separate_Service'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/1 Select_Purchase_Type/5_Service'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Submit_Purchas_Application/2 Select_Organizational_Type/5_Service(Organizational_Type)/4_Shortlisted_Service'))

