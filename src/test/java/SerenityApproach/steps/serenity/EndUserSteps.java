package SerenityApproach.steps.serenity;

import SerenityApproach.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;

public class EndUserSteps {

    private DictionaryPage dictionaryPage = new DictionaryPage();

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