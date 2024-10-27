package com.peos.videodemo.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseLifeActivity<VB : ViewBinding, VM : ViewModel> : AppCompatActivity() {

    protected lateinit var binding: VB
    protected lateinit var viewModel: VM

    abstract fun initViewBinding(inflater: LayoutInflater): VB
    abstract fun initViewModel(viewModelProvider: ViewModelProvider): VM

    protected open fun initView(savedInstanceState: Bundle?) {}
    protected open fun initEvent() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewBinding(LayoutInflater.from(this)).let {
            binding = it
        }
        viewModel = initViewModel(
            ViewModelProvider(
                this,
                ViewModelProvider.AndroidViewModelFactory(application)
            )
        )
        setContentView(binding.root)
        initView(savedInstanceState)
        initEvent()
    }
}