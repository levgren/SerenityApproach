package SerenityApproach.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://translate.google.com/?hl=ru")
public class DictionaryPage extends PageObject {

    @FindBy(css = ".sl-wrap [aria-label]")
    private WebElementFacade selectTranslateLangFrom;

    @FindBy(css = "#sl_list-search-box")
    private WebElementFacade selectTranslateLangFromSearchInput;

    @FindBy(css = ".tl-wrap [aria-label]")
    private WebElementFacade selectTranslateLangTo;

    @FindBy(css = "#tl_list-search-box")
    private WebElementFacade selectTranslateLangToSearchInput;

    @FindBy(css = "#source")
    private WebElementFacade selectTranslateLangFromInput;

    @FindBy(xpath = "//span[@class='tlid-translation translation']//span")
    private WebElementFacade translatedWord;

    @FindBy(xpath = "//div[@class='gt-cd gt-cd-mmd']")
    private WebElementFacade definitionSection;

    public void selectLanguage(String langFrom, String langTo){
        selectTranslateLangFrom.click();
        selectTranslateLangFromSearchInput.sendKeys(langFrom);
        selectTranslateLangFromSearchInput.sendKeys(Keys.ENTER);
        selectTranslateLangTo.click();
        selectTranslateLangToSearchInput.sendKeys(langTo);
        selectTranslateLangToSearchInput.sendKeys(Keys.ENTER);
    }

    public void translateTheWord(String word) {
        selectTranslateLangFromInput.sendKeys(word);
    }

    public void verifyTranslation(String transWord){
        Assert.assertTrue("Translated word meets to the requirements", translatedWord.getText().equalsIgnoreCase(transWord));
    }

    public void checkNumberOfLetters(int numOfChars){
        int lengthOfTHeWord = translatedWord.getText().length();
        Assert.assertEquals("Translated word contains " + numOfChars + " chars", numOfChars, lengthOfTHeWord);
    }

    public void checkDefinitionSection(String definition){
        Assert.assertTrue("definition section appears", definitionSection.getText().contains(definition));
    }
}