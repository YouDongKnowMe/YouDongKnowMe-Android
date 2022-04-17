package com.dongyang.android.youdongknowme.ui.adapter

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("bind_visibility_search")
fun bindSearchView(view : View, condition: Boolean) {
    view.visibility = if(condition) View.VISIBLE else View.GONE
}