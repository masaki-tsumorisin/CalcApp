package jp.techacademy.masaki.tsumori.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var answer = intent.getStringExtra("ANSWER")
        result.text = answer ?: intent.getStringExtra("E")

    }
}