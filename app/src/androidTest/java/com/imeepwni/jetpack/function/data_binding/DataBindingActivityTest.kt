package com.imeepwni.jetpack.function.data_binding

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.imeepwni.jetpack.R
import org.hamcrest.core.AllOf.allOf
import org.junit.Rule
import org.junit.Test

/**
 * 作者：Created by guofeng on 2019/11/1
 * 邮箱：feng.guo@bees360.com
 */
@LargeTest
class DataBindingActivityTest {

    @get:Rule
    val rule = ActivityTestRule(DataBindingActivity::class.java)

    @Test
    fun defaultUserFirstNameIsNotEmpty() {
        onView(allOf(withId(R.id.tv_first_name), withText("")))
                .check(doesNotExist())
    }

    @Test
    fun defaultUserLastNameIsNotEmpty() {
        onView(allOf(withId(R.id.tv_last_name), withText("")))
                .check(doesNotExist())
    }

}