package com.hoamancode.android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hoamancode.android.R
import com.hoamancode.android.ui.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}