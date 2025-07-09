package org.Petofy;

import org.testng.annotations.Test;

public class RunnTvScript extends runntvBaseClass {

    @Test
    public void verifyTabs() {

        RunnTvTabs clicktabs = new RunnTvTabs(driver);
        clicktabs.verifyFeaturedTabText();
        clicktabs.verifyMoviesTabText();
        clicktabs.verifyMusicTabText();
        clicktabs.verifyMusicTabText();
        clicktabs.newsAndOpinionTab();
        clicktabs.verifyKidsTab();
        clicktabs.verifyShortTabFilms();
        clicktabs.verifyEntertainment();
        clicktabs.verifyHealthAndFitness();
        clicktabs.verifyDevotionalTab();

        MenuButton menuButton = new MenuButton(driver);
        menuButton.verifyMenuButton();
        menuButton.verifyStaticTextElements();
        // menuButton.verifyAppSettingText();
        // menuButton.verifyAppSetting();
        // menuButton.verifyRadioButtonsAreClickable();
        menuButton.verifyDataSaverPopupUIElements();
    }

}
