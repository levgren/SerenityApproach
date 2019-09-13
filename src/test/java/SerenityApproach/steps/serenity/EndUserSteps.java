package SerenityApproach.steps.serenity;

import SerenityApproach.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.yecht.Data;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void openGoogleTranslatePage() {
        dictionaryPage.open();
    }

    @Step
    public void selectLang(String langFrom, String langTo){
        dictionaryPage.selectLanguage(langFrom, langTo);
    }

    @Step
    public void translateWord(String wordToTranslate){
        dictionaryPage.translateTheWord(wordToTranslate);
    }

    @Step
    public void verifyTranslatedWord(String translatedWord){
        dictionaryPage.verifyTranslation(translatedWord);
    }

    @Step
    public void verifyNumberOfLettersInTranslatedWord(int num){
        dictionaryPage.checkNumberOfLetters(num);
    }

    @Step
    public void verifyTheDefinition(String definition){
        dictionaryPage.checkDefinitionSection(definition);
    }


}