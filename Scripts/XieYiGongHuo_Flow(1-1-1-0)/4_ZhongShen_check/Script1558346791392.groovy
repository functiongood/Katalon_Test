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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.22/sfw/login.jsp')

WebUI.setViewPortSize(1366, 768)

WebUI.setText(findTestObject('22_Test/Page_22_login/input__userid22'), findTestData('username_password').getValue(1, 1))

WebUI.setText(findTestObject('22_Test/Page_22_login/input__password22'), findTestData('username_password').getValue(2, 1))

WebUI.click(findTestObject('22_Test/Page_22_login/button_22_login'))

WebUI.click(findTestObject('22_Test/page_purchase_request/Comm/close_hint_button'))

WebUI.click(findTestObject('22_Test/Page_check/comm/daishen_button'))

WebUI.setText(findTestObject('22_Test/Page_check/comm/daishen_keyword/input_daishen_keyword'), findTestData('project_name').getValue(
        1, 3))

WebUI.click(findTestObject('22_Test/Page_check/comm/danshen_search/danshen_search_button'))

WebUI.click(findTestObject('22_Test/Page_check/comm/daishen_chuli/daishen_chuli_button'))

WebUI.switchToWindowIndex('1')

WebUI.verifyElementVisible(findTestObject('22_Test/Page_check/shenpiyemian/shenpi_verify_page/Supply_Agreement_Verify'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('22_Test/Page_check/shenpiyemian/zhongshen_Page/zhongsheng_shenpi_page/zhongsheng_shenpi_submit_button'))

WebUI.click(findTestObject('22_Test/Page_check/shenpiyemian/zhongshen_Page/zhongsheng_confirm_page/zhongsheng_confirm_submit_button'))

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

