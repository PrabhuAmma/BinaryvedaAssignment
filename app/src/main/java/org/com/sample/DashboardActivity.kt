package org.com.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        try {
            switchCon.setOnCheckedChangeListener(null)
            switchCon.isChecked = true
        }
        catch (ex:Exception){}
    }
}