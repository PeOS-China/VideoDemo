package com.peos.videodemo

import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.peos.videodemo.base.BaseLifeActivity
import com.peos.videodemo.base.BaseViewModel
import com.peos.videodemo.databinding.ActivityMainBinding

class MainActivity : BaseLifeActivity<ActivityMainBinding, BaseViewModel>() {

    override fun initViewBinding(inflater: LayoutInflater): ActivityMainBinding = ActivityMainBinding.inflate(inflater)

    override fun initViewModel(viewModelProvider: ViewModelProvider): BaseViewModel = viewModelProvider[BaseViewModel::class.java]

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)
    }

    override fun initEvent() {
        super.initEvent()
    }

}

