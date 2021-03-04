package com.didi.demo.activity;

import android.view.LayoutInflater;

import com.didi.drouter.annotation.Router;
import com.didi.drouter.demo.databinding.ActivityTest4Binding;

import org.jetbrains.annotations.NotNull;

@Router(path = "/activity/test4")
public class ActivityTest4 extends ViewBindingActivity<ActivityTest4Binding> {

    @NotNull
    @Override
    public ActivityTest4Binding createViewBinding() {
        return ActivityTest4Binding.inflate(LayoutInflater.from(this));
    }
}
