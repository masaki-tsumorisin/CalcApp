package jp.techacademy.masaki.tsumori.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import java.lang.Exception


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            try {
                var number1 = editText1.text.toString().toDouble()
                var number2 = editText2.text.toString().toDouble()
                var answer = (number1 + number2).toString()
                intent.putExtra("ANSWER", answer)
            } catch (e: Exception) {

            } finally {
                intent.putExtra("E", "error:何か数値を入力してください")
            }
            startActivity(intent)
    }

        subtract.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            try {
                var number1 = editText1.text.toString().toDouble()
                var number2 = editText2.text.toString().toDouble()
                var answer = (number1 - number2) .toString()
                intent.putExtra("ANSWER", answer)
            } catch (e: Exception) {

            } finally {
                intent.putExtra("E", "error:何か数値を入力してください")
            }
            startActivity(intent)
        }

        multiply.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            try {
                var number1 = editText1.text.toString().toDouble()
                var number2 = editText2.text.toString().toDouble()
                var answer = (number1 * number2).toString()
                intent.putExtra("ANSWER", answer)
            } catch (e: Exception) {

            } finally {
                intent.putExtra("E", "error:何か数値を入力してください")
            }
            startActivity(intent)
        }

        divide.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            try {
                var number1 = editText1.text.toString().toDouble()
                var number2 = editText2.text.toString().toDouble()
                var answer = (number1 / number2).toString()
                intent.putExtra("ANSWER", answer)
            } catch (e: Exception) {

            } finally {
                intent.putExtra("E", "error:何か数値を入力してください")
            }
            startActivity(intent)
        }
    }
}