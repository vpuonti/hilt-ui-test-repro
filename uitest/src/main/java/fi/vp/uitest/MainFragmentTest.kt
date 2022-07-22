package fi.vp.uitest

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import fi.vp.myapplication.MainFragment
import fi.vp.myapplication.R
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@HiltAndroidTest
class MainFragmentTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Before
    fun setUp() {
        hiltRule.inject()
    }

    @Test
    fun test1() {
        launchFragmentInHiltContainer<MainFragment> {  }
        Espresso.onView(ViewMatchers.withId(R.id.text_main))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

}