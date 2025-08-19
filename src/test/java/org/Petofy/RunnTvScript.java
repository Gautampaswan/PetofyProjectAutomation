package org.Petofy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class RunnTvScript extends runntvBaseClass {

    // @Test
    // public void verifyTabs() throws Exception {

    // RunnTvTabs clicktabs = new RunnTvTabs(driver);
    // clicktabs.secondAllow();
    // clicktabs.verifyFeaturedTabText();
    // clicktabs.verifyMoviesTabText();
    // clicktabs.verifyMusicTabText();
    // clicktabs.verifyMusicTabText();
    // clicktabs.newsAndOpinionTab();
    // clicktabs.verifyKidsTab();
    // clicktabs.verifyShortTabFilms();
    // clicktabs.verifyEntertainment();
    // clicktabs.verifyHealthAndFitness();
    // clicktabs.verifyDevotionalTab();

    // // MenuButton menuButton = new MenuButton(driver);
    // // menuButton.verifyMenuButton();
    // // menuButton.verifyStaticTextElements();
    // // menuButton.verifyAppSettingText();
    // // menuButton.verifyAppSetting();
    // // menuButton.verifyRadioButtonsAreClickable();
    // // menuButton.verifyDataSaverPopupUIElements();
    // // menuButton.verifyAppLanguage();
    // }

    @Test(priority = 1)
    // (priority = 1)
    public void verifyFeatureTabLog() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        playbackVerifier.clickFeatureTabAndHorizontal();
    }

    @Test(priority = 2)
    public void verifyFeatureTabLogSecondPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyFeaturedTabText();
        playbackVerifier.verifyFeatureTabLogSecond();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 3)
    public void verifyFeatureTabLogThird() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyFeaturedTabText();
        playbackVerifier.verifyFeatureTabLogThird();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 4)
    public void verifyFeatureTabLogFourth() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyFeaturedTabText();
        playbackVerifier.verifyFeatureTabLogFourth();
        // playbackVerifier.verifyPlayback();

    }

    @Test(priority = 5)
    public void verifyFeatureTabLogFifth() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyFeaturedTabText();
        playbackVerifier.verifyFeatureTabFifth();
        // playbackVerifier.verifyPlayback();
    }

    // Run Test for Movies Tab for playback log testing
    @Test(priority = 6)
    public void verifyMoviesFirstPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabFirstPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 7)
    public void verifyMoviesSecondPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabSecondPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 8)
    public void verifyMoviesThirdPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabThirdPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 9)
    public void verifyMoviesFourthPage() throws Exception {

        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyMoviesTabText();
        playbackVerifier.verifyMoviesTabFourthPage();
        // playbackVerifier.verifyPlayback();
    }

    // @Test(priority = 10)
    // public void verifyMoviesFifthPage() throws Exception {

    // PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
    // playbackVerifier.secondAllow();
    // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
    // runnTvTab.verifyMoviesTabText();
    // playbackVerifier.verifyMoviesTabFifthPage();
    // playbackVerifier.verifyPlayback();
    // }

    // @Test(priority = 11)
    // public void verifyMoviesSixthPage() throws Exception {

    // PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
    // playbackVerifier.secondAllow();
    // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
    // runnTvTab.verifyMoviesTabText();
    // playbackVerifier.scroll();
    // playbackVerifier.verifyMoviesTabSixthPage();
    // playbackVerifier.verifyPlayback();
    // }

    // @Test(priority = 12)
    // public void verifyMoviesSeventhPage() throws Exception {

    // PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
    // playbackVerifier.secondAllow();
    // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
    // runnTvTab.verifyMoviesTabText();
    // playbackVerifier.scroll();
    // playbackVerifier.verifyMoviesTabSeventhPage();
    // playbackVerifier.verifyPlayback();
    // }

    // @Test(priority = 13)
    // public void verifyMoviesEightPage() throws Exception {

    // PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
    // playbackVerifier.secondAllow();
    // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
    // runnTvTab.verifyMoviesTabText();
    // playbackVerifier.scroll();
    // playbackVerifier.verifyMoviesTabEightPage();
    // playbackVerifier.verifyPlayback();
    // }

    // @Test(priority = 14)
    // public void verifyMoviesNineteenthPage() throws Exception {

    // PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
    // playbackVerifier.secondAllow();
    // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
    // runnTvTab.verifyMoviesTabText();
    // playbackVerifier.scroll();
    // playbackVerifier.verifyMoviesTabNinethPage();
    // playbackVerifier.verifyPlayback();
    // }

    // // Verify the playback log of Music Tab page
    @Test(priority = 10)
    public void verifyMusicFirstPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyMusicTabText();
        playbackVerifier.verifyMusicTabFirstpage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 11)
    public void verifyMusicSecondtPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyMusicTabText();
        playbackVerifier.verifyMusicTabSecondPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 12)
    public void verifyMusicThirdPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyMusicTabText();
        playbackVerifier.verifyMusicTabThirdPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 13)
    public void verifyMusicFourthPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyMusicTabText();
        playbackVerifier.verifyMusicTabFourthPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 14)
    public void verifyMusicFifthPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyMusicTabText();
        playbackVerifier.verifyMusicTabFifthPage();
        // playbackVerifier.verifyPlayback();
    }
    // // ******************* Playback Test for Entertainment
    // *********************//

    @Test(priority = 15)
    public void verifyEntertainmentFirstPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyEntertainment();
        playbackVerifier.verifyEntertainmentTabFirstPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 16)
    public void verifyEntertainmentSecondtPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        runnTvTab.verifyEntertainment();
        playbackVerifier.verifyEntertainmentTabSecondPage();
        playbackVerifier.verifyPlayback();
    }

    @Test(priority = 17)
    public void verifyEntertainmentThirdPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyEntertainment();
        playbackVerifier.verifyEntertainmentTabThirdPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 18)
    public void verifyEntertainmentFourthPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyEntertainment();
        playbackVerifier.verifyEntertainmentTabFourthPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 19)
    public void verifyEntertainmentFifthPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyEntertainment();
        playbackVerifier.verifyEntertainmentTabFifthPage();
        // playbackVerifier.verifyPlayback();
    }

    // // ****************** Playback test log for News And Opinion tab
    // // ****************************
    @Test(priority = 20)
    public void verifyNewsAndOpinionFirstPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.newsAndOpinionTab();
        playbackVerifier.verifyNewsAndOpinionTabFirstPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 21)
    public void verifyNewsAndOpinionSecondPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.newsAndOpinionTab();
        playbackVerifier.verifyNewsAndOpinionTabSecondPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 22)
    public void verifyNewsAndOpinionThirdPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.newsAndOpinionTab();
        playbackVerifier.verifyNewsAndOpinionTabThirdPage();
        playbackVerifier.verifyPlayback();
    }

    @Test(priority = 23)
    public void verifyNewsAndOpinionFourthPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.newsAndOpinionTab();
        playbackVerifier.verifyNewsAndOpinionTabFourthPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 24)
    public void verifyNewsAndOpinionFifthPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.newsAndOpinionTab();
        playbackVerifier.verifyNewsAndOpinionTabFifthPage();
        // playbackVerifier.verifyPlayback();
    }

    // // ***************** Verify playback log for Kids tab
    // ***********************//

    @Test(priority = 25)
    public void verifyKidsFirstPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyKidsTab();
        playbackVerifier.verifyKidsTabFirstPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 26)
    public void verifyKidsSecondPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyKidsTab();
        playbackVerifier.verifyKidsTabSecondPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 27)
    public void verifyKidsThirdPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyKidsTab();
        playbackVerifier.verifyKidsTabThirdPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 28)
    public void verifyKidsFourthPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyKidsTab();
        playbackVerifier.verifyKidsTabFourthPage();
        // playbackVerifier.verifyPlayback();
    }

    // // *********************** Verify playback log for Shorts Films
    // // ***************************//

    @Test(priority = 29)
    public void verifyShortFilmsFirstPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyShortTabFilms();
        playbackVerifier.verifyShortFilmsTabFirstPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 30)
    public void verifyShortFilmsSecondPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyShortTabFilms();
        playbackVerifier.verifyShortFilmsTabSecondPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 31)
    public void verifyShortFilmsThirdPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyShortTabFilms();
        playbackVerifier.verifyShortFilmsTabThirdPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 32)
    public void verifyShortFilmsFourthPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyShortTabFilms();
        playbackVerifier.verifyShortFilmsTabFourthPage();
        // playbackVerifier.verifyPlayback();
    }

    // // ********************** Verify playback log for Health And Fitness Tab
    // // **************************//
    @Test(priority = 33)
    public void verifyHealthAndFitnessFirstPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyHealthAndFitness();
        playbackVerifier.verifyHealthFitnessTabFirstPage();
        // playbackVerifier.verifyPlayback();
    }

    @Test(priority = 34)
    public void verifyHealthAndFitnessSecondPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyHealthAndFitness();
        playbackVerifier.verifyHealthAndFitnessTabSecondPage();
        // playbackVerifier.verifyPlayback();
    }
    // // ********************* Verify playback log for Devotional tab
    // // ********************//

    @Test(priority = 35)
    public void verifyDevotionalFirstPage() throws Exception {
        PlaybackVerifier playbackVerifier = new PlaybackVerifier(driver);
        LoginRunnTv loginTv = new LoginRunnTv(driver);
        loginTv.signInApp();
        playbackVerifier.secondAllow();
        // RunnTvTabs runnTvTab = new RunnTvTabs(driver);
        // runnTvTab.verifyDevotionalTab();
        playbackVerifier.verifyDevotionalTabFirstPage();
        // playbackVerifier.verifyPlayback();
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