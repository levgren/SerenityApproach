package SerenityApproach.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import SerenityApproach.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the google translate page")
    public void the_user_is_on_the_google_translate_page() {
        endUser.openGoogleTranslatePage();
    }

    @Given("selected languages from '$languageFrom' to '$languageTo'")
    public void selected_languages_from_to(String langFrom, String langTo){
        endUser.selectLang(langFrom, langTo);
    }

    @When("the user looks up the translation of the word {$word}")
    public void the_user_looks_up_the_translation_of_the_word(String wordToTranslate) {
        endUser.translateWord(wordToTranslate);
    }

    @Then("they should see the translation {$translatedWord}")
    public void they_should_see_the_translation(String translatedWord) {
        endUser.verifyTranslatedWord(translatedWord);
    }

    @Then("number of characters must be {$int}.")
    public void number_of_characters_must_be(int numb){
        endUser.verifyNumberOfLettersInTranslatedWord(numb);
    }

    @Then("they should see the definition {$string}")
    public void they_should_see_the_definition(String definition){
        endUser.verifyTheDefinition(definition);
    }
}
