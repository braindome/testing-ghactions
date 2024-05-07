package com.example.testing_ghactions

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class MyAppTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun counterIncrease_whenIncreaseButtonClicked() {
        composeTestRule.setContent {
            MyApp()
        }

        composeTestRule.onNodeWithText("Increase").performClick()
        composeTestRule.onNodeWithText("1").assertExists()
    }

    @Test
    fun counterDecreases_WhenDecreaseButtonClicked() {
        composeTestRule.setContent {
            MyApp()
        }

        composeTestRule.onNodeWithText("Decrease").performClick()
        composeTestRule.onNodeWithText("-1").assertExists()
    }

    @Test
    fun labelChanges_WhenClicked() {
        composeTestRule.setContent {
            MyApp()
        }

        composeTestRule.onNodeWithText("Click me!").performClick()
        composeTestRule.onNodeWithText("Clicked").assertExists()
    }
}