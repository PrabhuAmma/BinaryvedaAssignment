package org.com.sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.widget.AppCompatImageView
import kotlinx.android.synthetic.main.activity_landing.*

class LandingActivity : AppCompatActivity() {
    private lateinit var listOfMock:ArrayList<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
        try {
            listOfMock=ArrayList<Int>()
            listOfMock.add(R.drawable.ic_human_mock)
            listOfMock.add(R.drawable.ic_mock_tw)
            listOfMock.add(R.drawable.ic_mock_th)
            listOfMock.add(R.drawable.ic_mock_fu)
            listOfMock.add(R.drawable.ic_mock_fiv)
            listOfMock.add(R.drawable.ic_mock_six)
            listOfMock.add(R.drawable.ic_mock_sv)
            listOfMock.add(R.drawable.ic_mock_eig)
            nav_click.setOnClickListener {
                val intent=Intent(this,DashboardActivity::class.java)
                startActivity(intent)
            }
            for (items in listOfMock){
                val inflater = LayoutInflater.from(this)
                val view=inflater.inflate(R.layout.our_service_layout, null, false)
                val headImg=view.findViewById(R.id.head_img) as AppCompatImageView
                headImg.setBackgroundResource(items)
                serviceView.addView(view) //android kotlin extension synthetic binding
            }
        }
        catch (ex: Exception){

        }
    }
}