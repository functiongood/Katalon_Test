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

WebUI.navigateToUrl('http://192.168.1.13:8078/sfw/login.jsp?entryId=1')

WebUI.setText(findTestObject('22_Test/Page_22_login/input__userid22'), findTestData('username_password').getValue(1, 1))

WebUI.setText(findTestObject('22_Test/Page_22_login/input__password22'), findTestData('username_password').getValue(2, 1))

WebUI.click(findTestObject('22_Test/Page_22_login/button_22_login'))

WebUI.click(findTestObject('22_Test/Page_check/comm/daishen_button'))

WebUI.setText(findTestObject('22_Test/Page_check/comm/daishen_keyword/input_daishen_keyword'), GlobalVariable.ProjectName_XieYiGongHuo)

WebUI.click(findTestObject('22_Test/Page_check/comm/daishen_keyword/danshen_search_button'))

WebUI.delay(1)

WebUI.click(findTestObject('22_Test/Page_check/comm/daishen_chuli/daishen_chuli_button'))

WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('22_Test/Page_check/shenpiyemian/LuRuJieGuo_ShenHe/button_ShenHe'))

WebUI.click(findTestObject('22_Test/Page_check/shenpiyemian/LuRuJieGuo_ShenHe/button_confirm'))

WebUI.delay(3)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

WebUI.closeBrowser()

