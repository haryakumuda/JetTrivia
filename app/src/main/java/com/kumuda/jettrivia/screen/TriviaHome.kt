package com.kumuda.jettrivia.screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.kumuda.jettrivia.component.Questions

@Composable
fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel()){
    Questions(viewModel)

}