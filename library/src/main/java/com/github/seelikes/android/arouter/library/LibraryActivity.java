package com.github.seelikes.android.arouter.library;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.github.seelikes.android.log.SaLog;

@Route(path = "/demo/library")
public class LibraryActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        SaLog.i(LibraryActivity.class, "onCreate", "enter.");
    }
}
