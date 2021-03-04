package com.didi.demo.activity

import android.view.LayoutInflater
import com.didi.drouter.annotation.Router
import com.didi.drouter.demo.databinding.ActivityTest4Binding

@Router(path = "/activity/test4kt")
class ActivityTest4kt : ViewBindingActivity<ActivityTest4Binding>() {

    override fun createViewBinding(): ActivityTest4Binding {
        return ActivityTest4Binding.inflate(LayoutInflater.from(this))
    }
}