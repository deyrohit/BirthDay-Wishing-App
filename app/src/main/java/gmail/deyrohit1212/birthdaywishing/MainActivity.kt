package gmail.deyrohit1212.birthdaywishing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun createBirthdayCard(view: View)
    {
        val editText =this.findViewById<EditText>(R.id.editTextText)
        val name = editText.editableText.toString()

        Toast.makeText(this ,"Happy Birthday $name",Toast.LENGTH_LONG).show()

        val intent = Intent(this, BirthDay_Card::class.java)
        intent.putExtra("key", name)
        startActivity(intent)
    }
}