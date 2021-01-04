package th.ac.su.ict.ponpitak.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var butColor1 = findViewById<Button>(R.id.btn1)
        var butColor2 = findViewById<Button>(R.id.btn2)
        var butColor3 = findViewById<Button>(R.id.btn3)
        var butColor4 = findViewById<Button>(R.id.btn4)
        var butColor5 = findViewById<Button>(R.id.btn5)
        var butColor6 = findViewById<Button>(R.id.btn6)

        val showColor = findViewById<TextView>(R.id.rgbCode)

        butColor1.setOnClickListener(){
            showColor.setBackgroundColor(Color.parseColor("#EBE1DE"));
            showColor.text = "235-225-222"
        }
        butColor2.setOnClickListener(){
            showColor.setBackgroundColor(Color.parseColor("#ECCBCA"));
            showColor.text = "236-203-202"
        }
        butColor3.setOnClickListener(){
            showColor.setBackgroundColor(Color.parseColor("#75839C"));
            showColor.text = "117-131-156"
        }
        butColor4.setOnClickListener(){
            showColor.setBackgroundColor(Color.parseColor("#99A9BF"));
            showColor.text = "153-169-191"
        }
        butColor5.setOnClickListener(){
            showColor.setBackgroundColor(Color.parseColor("#C2CCD5"));
            showColor.text = "194-204-213"
        }
        butColor6.setOnClickListener(){
            showColor.setBackgroundColor(Color.parseColor("#DDE2E5"));
            showColor.text = "221-226-229"
        }
    }
}