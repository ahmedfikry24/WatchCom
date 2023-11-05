package com.example.watchcom.ui.base

import androidx.lifecycle.ViewModel
import com.example.watchcom.data.RepositoryImpl

abstract class BaseViewModel : ViewModel() {

    protected val repository: RepositoryImpl = RepositoryImpl()
}