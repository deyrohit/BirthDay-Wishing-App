package gmail.deyrohit1212.birthdaywishing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthDay_Card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_day_card)
        val value = intent.getStringExtra("key")
        findViewById<TextView>(R.id.textView1).text = "$value!"
    }

}