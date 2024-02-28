package gmail.deyrohit1212.birthdaywishing

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class BirthDayCard : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_day_card)

        val list = listOf(R.drawable.image ,R.drawable.image1 ,R.drawable.image2 ,R.drawable.image3 ,
            R.drawable.image4 ,R.drawable.image5 ,R.drawable.image6 ,R.drawable.image7 ,R.drawable.image8 ,R.drawable.image9 )

        val randomNumber = Random.nextInt(0, 9)

        findViewById<ImageView>(R.id.imageView).setImageResource(list[randomNumber])

        val value = intent.getStringExtra("key")
        findViewById<TextView>(R.id.textView1).text = " $value \uD83E\uDD73✨\uD83C\uDF88\uD83C\uDF86"
    }

}