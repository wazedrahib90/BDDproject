package com.paxovision.framework;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Page {
	
	protected WebDriver driver;
	private String textToWait;
	
	public Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void delayfor(int ms) {

		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
		}
	}

	public WebElement waitForElement(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	}

	public WebElement waitForElementdisplay(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(locator);
				if (element.isDisplayed()) {
					return element;
				}
				return null;
			}
		});
		return foo;
	}

	public WebElement waitforElementText(final By locator, String text) {
		textToWait = text;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(locator);
				if (element.getText().contentEquals(textToWait)) {
					return element;
				}
				return null;
			}
		});
		return foo;
	}

	public WebElement waitforElementNotDisplayed(final By locator, String text) {
		textToWait = text;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(locator);
				if (element.isDisplayed()) {
					return null;
				}
				return element;

			}
		});

		return foo;
	}

	/* JAVA SCRIPT CLICK */

	public void jsClick(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",
				element);
	}

	/* TO HIHGLIGHT TEXT OR Elements */
	public void highlightElement(WebElement element) {
		for (int i = 0; i < 2; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(
					"arguments[0].setAttribute('style',arguments[1]);",
					element, "color: red; border: 5px solid blue;");
			delayfor(500);
			js.executeScript(
					"arguments[0].setAttribute('style',arguments[1]);",
					element, "");
		}
	}

	/* Actions Class For MouseHover */

	public void hoverItem(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click();
		actions.perform();
	}

	public void hoverItem(By by) {
		WebElement element = driver.findElement(by);
		hoverItem(element);
	}

	/* Action Class for Mouse Hover */

	/*
	 * public void hoverItemEx(WebElement element) { Locatable hoverItem =(Locatable) element; 
	 * Mouse mouse = ((HasInputDevices) driver).getMouse();
	 * mouse.mouseMove(hoverItem.getCoordinates()); 
	 * }
	 * public void hoverItemEx(By by) { WebElement element =driver.findElement(by); hoverItemEx(element); }
	 */
}
