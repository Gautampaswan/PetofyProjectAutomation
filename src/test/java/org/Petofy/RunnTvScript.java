package org.Petofy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class RunnTvScript extends runntvBaseClass {

    @Test
    public void verifyTabs() throws Exception {

        RunnTvTabs clicktabs = new RunnTvTabs(driver);
        clicktabs.secondAllow();
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

        // MenuButton menuButton = new MenuButton(driver);
        // menuButton.verifyMenuButton();
        // menuButton.verifyStaticTextElements();
        // menuButton.verifyAppSettingText();
        // menuButton.verifyAppSetting();
        // menuButton.verifyRadioButtonsAreClickable();
        // menuButton.verifyDataSaverPopupUIElements();
        // menuButton.verifyAppLanguage();
    }

    /*
     * @Test
     * public void verifyAppLanguageHindi() {
     * 
     * MenuButton menuButton = new MenuButton(driver);
     * menuButton.verifyAppLanguage();
     * 
     * }
     */

    /*
     * @Test
     * public void verifyPlayback() throws Exception {
     * 
     * // PlaybackTest playbackTest = new PlaybackTest(driver);
     * // playbackTest.secondAllow();
     * // playbackTest.checkLog();
     * 
     * }
     */

    /*
     * @Test
     * public void verifyLog() throws Exception {
     * PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
     * playbackVerifier.secondAllow();
     * playbackVerifier.verifyPlayback();
     * 
     * // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
     * // runnTvTab.verifyFeaturedTabText();
     * // playbackVerifier.featureTabPlayback();
     * 
     * // playbackVerifier.clickAllScrollViewsAndVerifyPlayback();
     * // playbackVerifier.clickFeatureTabAndHorizontal();
     * // playbackVerifier.verifyPlayback();
     * 
     * }
     */

    @Test
    public void verifyFeatureTabLog() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyFeaturedTabText();
        playbackVerifier.clickFeatureTabAndHorizontal();
        playbackVerifier.verifyPlayback();

    }

    @Test
    public void verifyFeatureTabLogSecondPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyFeaturedTabText();
        playbackVerifier.verifyFeatureTabLogSecond();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyFeatureTabLogThird() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyFeaturedTabText();
        playbackVerifier.verifyFeatureTabLogThird();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyFeatureTabLogFourth() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyFeaturedTabText();
        playbackVerifier.verifyFeatureTabLogFourth();
        playbackVerifier.verifyPlayback();

    }

    @Test
    public void verifyFeatureTabLogFifth() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyFeaturedTabText();
        playbackVerifier.verifyFeatureTabFifth();
        playbackVerifier.verifyPlayback();
    }

    // Run Test for Movies Tab for playback log testing
    @Test
    public void verifyMoviesFirstPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabFirstPage();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyMoviesSecondPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabSecondPage();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyMoviesThirdPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabThirdPage();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyMoviesFourthPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabFourthPage();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyMoviesFifthPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabFifthPage();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyMoviesSixthPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.scroll();
        playbackVerifier.verifyMoviesTabSixthPage();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyMoviesSeventhPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabSeventhPage();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyMoviesEightPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabEightPage();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyMoviesNineteenthPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabNinethPage();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyMoviesTenthPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabTenthPage();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyMoviesEleventhPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabEleventhPage();
        playbackVerifier.verifyPlayback();
    }

    @Test
    public void verifyMoviesTwelthPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabTwelthPage();
        playbackVerifier.verifyPlayback();
    }
}

// @Test(groups = "featureTab")
// public void verifyFeatureTabLog() throws Exception {
// PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
// playbackVerifier.secondAllow();
// RunnTvTabs runnTvTab = new RunnTvTabs(driver);
// runnTvTab.verifyFeaturedTabText();
// playbackVerifier.clickFeatureTabAndHorizontal();
// playbackVerifier.verifyPlayback();
// }

// @Test(groups = "featureTab")
// public void verifyFeatureTabLogSecondPage() throws Exception {
// PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
// playbackVerifier.secondAllow();
// RunnTvTabs runnTvTab = new RunnTvTabs(driver);
// runnTvTab.verifyFeaturedTabText();
// playbackVerifier.verifyFeatureTabLogSecond();
// playbackVerifier.verifyPlayback();
// }

// @Test(groups = "featureTab")
// public void verifyFeatureTabLogThird() throws Exception {
// PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
// playbackVerifier.secondAllow();
// RunnTvTabs runnTvTab = new RunnTvTabs(driver);
// runnTvTab.verifyFeaturedTabText();
// playbackVerifier.verifyFeatureTabLogThird();
// playbackVerifier.verifyPlayback();
// }

// @Test(groups = "featureTab")
// public void verifyFeatureTabLogFourth() throws Exception {
// PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
// playbackVerifier.secondAllow();
// RunnTvTabs runnTvTab = new RunnTvTabs(driver);
// runnTvTab.verifyFeaturedTabText();
// playbackVerifier.verifyFeatureTabLogFourth();
// playbackVerifier.verifyPlayback();

// }

// @Test(groups = "featureTab")
// public void verifyFeatureTabLogFifth() throws Exception {
// PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
// playbackVerifier.secondAllow();
// RunnTvTabs runnTvTab = new RunnTvTabs(driver);
// runnTvTab.verifyFeaturedTabText();
// playbackVerifier.verifyFeatureTabFifth();
// playbackVerifier.verifyPlayback();
// }

// @Test
// public void verifyAllFeatureTabLogs() throws Exception {
// PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
// playbackVerifier.secondAllow();

// RunnTvTabs runnTvTab = new RunnTvTabs(driver);
// runnTvTab.verifyFeaturedTabText();

// for (int i = 1; i <= 5; i++) {
// System.out.println("▶ Executing feature tab log test #" + i);
// switch (i) {
// case 1 -> playbackVerifier.clickFeatureTabAndHorizontal();
// case 2 -> playbackVerifier.verifyFeatureTabLogSecond();
// case 3 -> playbackVerifier.verifyFeatureTabLogThird();
// case 4 -> playbackVerifier.verifyFeatureTabLogFourth();
// case 5 -> playbackVerifier.verifyFeatureTabFifth();
// }
// playbackVerifier.verifyPlayback();
// }
// }
