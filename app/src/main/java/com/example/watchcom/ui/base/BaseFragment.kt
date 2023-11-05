package com.example.watchcom.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.watchcom.BR

abstract class BaseFragment<DB : ViewDataBinding, V : BaseViewModel> : Fragment() {

    abstract val layOutId: Int
    abstract val viewModel: V

    private var _binding: DB? = null
    protected val binding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate<DB>(inflater, layOutId, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            setVariable(BR.viewModel,viewModel)
        }
        return _binding!!.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}