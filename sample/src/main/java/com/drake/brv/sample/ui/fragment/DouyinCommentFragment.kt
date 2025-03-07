package com.drake.brv.sample.ui.fragment

import android.view.View
import com.drake.brv.sample.R
import com.drake.brv.sample.databinding.FragmentDouyinCommentBinding
import com.drake.brv.sample.ui.dialog.CommentDialog
import com.drake.engine.base.EngineFragment

class DouyinCommentFragment : EngineFragment<FragmentDouyinCommentBinding>(R.layout.fragment_douyin_comment) {
    override fun initView() {
        binding.v = this
    }

    override fun initData() {
    }

    override fun onResume() {
        super.onResume()
        CommentDialog().show(childFragmentManager, null)
    }

    override fun onClick(v: View) {
        when (v) {
            binding.btnShowDialog -> CommentDialog().show(childFragmentManager, null)
        }
    }
}