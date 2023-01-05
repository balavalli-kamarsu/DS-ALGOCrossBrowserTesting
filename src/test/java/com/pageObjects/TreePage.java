package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepDefinations.BaseClass;
import com.utils.Utils;

public class TreePage extends BaseClass {
	
	 public TreePage(WebDriver webDriver) {
		 
			PageFactory.initElements(webDriver, this);
		}
	 
	 @FindBy(xpath ="//h5[text()='Tree']/..//a[text()='Get Started']")
		WebElement getStartedBtn;
	 
	 @FindBy(xpath ="//a[text()='Overview of Trees']")
		WebElement overviewOfTreeslink;
	 
	 /*@FindBy(xpath ="//a[text()='Try here>>>']")
		WebElement tryHereBtn; */

		@FindBy(xpath ="//textarea[@tabindex='0']")
		WebElement textEditor;
	 
		@FindBy(xpath ="//button[text()='Run']")
		WebElement runBtn;
	 
		 @FindBy(xpath ="//a[text()='Terminologies']")
			WebElement terminologiesLink;
		 
		 @FindBy(xpath ="//a[text()='Types of Trees']")
			WebElement typesOfTreesLink;
		 
		 @FindBy(xpath ="//a[text()='Tree Traversals']")
			WebElement treeTraversalsLink;
		 
		 public void clickGetStarted() {
				Utils.webClick(getStartedBtn);
		 }
			
		 public void clickRunBtn() {
				Utils.webClick(runBtn);
		 }
		 
		 public void clickoverviewOfTreeslink() {
				Utils.webClick(overviewOfTreeslink);
		 }

/*		 public void clickTryHereBtn() {
			Utils.webClick(tryHereBtn); 
		 }				*/
			
		 public void enterCode(String pythonCode) throws InterruptedException {
				Utils.enterPythonCode(textEditor, pythonCode);
		 } 

		 public void clickTerminologiesLink() {
				Utils.webClick(terminologiesLink);
		 }
	 
		 public void clickTypesOfTreesLink() {
			 Utils.webClick(typesOfTreesLink);
		 }
		 
		 public void clickTreeTraversalsLink() {
			 Utils.webClick(treeTraversalsLink);
		 }

}
