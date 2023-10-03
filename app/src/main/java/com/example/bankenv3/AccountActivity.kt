package com.example.bankenv3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bankenv3.ui.main.AccountFragment

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, AccountFragment.newInstance())
                .commitNow()
        }
    }
}