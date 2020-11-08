package net.staela.wifirtt_testing

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.text.TextUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainTextView = findViewById<TextView>(R.id.mainTextView)

        if (this.packageManager.hasSystemFeature(PackageManager.FEATURE_WIFI_RTT)) {
            mainTextView.setText("Has WiFi RTT!")
        } else {
            mainTextView.setText("Not has WiFi RTT! :(")
        }
    }
}