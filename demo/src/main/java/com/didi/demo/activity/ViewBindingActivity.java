package com.didi.demo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.viewbinding.ViewBinding;

public abstract class ViewBindingActivity<T extends ViewBinding> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(createViewBinding().getRoot());
    }

    abstract T createViewBinding();
}
