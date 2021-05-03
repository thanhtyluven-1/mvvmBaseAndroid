package com.example.thefirstprojecttdtdemo.viewmodels.author

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AuthorViewModel : ViewModel() {
    val liveData : MutableLiveData<String> = MutableLiveData()
    init {
        viewModelScope.launch {
            demoFunction()
        }
        CoroutineScope(Dispatchers.Default).launch {
            demoFunction()
        }
    }

    private suspend fun demoFunction(): Long {
        fetchUser()
        return 0
    }

    suspend fun fetchUser(): Int {
        return withContext(Dispatchers.IO) {

            0
        }
    }

    fun changeText() {
        liveData.value = "test change"
    }

}