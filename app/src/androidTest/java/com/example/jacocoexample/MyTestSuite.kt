package com.example.jacocoexample

//import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.filters.LargeTest
import com.example.jacocoexample.ui.main.MainFragment

@LargeTest
@RunWith(AndroidJUnit4::class)
class MyTestSuite {
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()


   @Test
    fun testSomeActivity(){
        //val scenario = launchFragmentInContainer<MainFragment>()
        Thread.sleep(10000)
    }
}