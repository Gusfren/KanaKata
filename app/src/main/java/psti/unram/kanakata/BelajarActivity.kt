package psti.unram.kanakata

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.GridLayout
import android.view.Gravity
import android.view.ViewGroup
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.widget.LinearLayout

class BelajarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar)

        val gridHuruf = findViewById<GridLayout>(R.id.gridHuruf)
        val hurufList = listOf("a", "i", "u", "e", "o")

        for (i in 1..7) { // 7 baris
            for (huruf in hurufList) {
                val textView = TextView(this).apply {
                    text = huruf
                    textSize = 18f
                    gravity = Gravity.CENTER
                    setTextColor(Color.BLACK)
                    background = GradientDrawable().apply {
                        shape = GradientDrawable.OVAL
                        setColor(Color.parseColor("#FADADD"))
                    }
                    val size = resources.displayMetrics.density * 48 // 48dp
                    layoutParams = ViewGroup.LayoutParams(size.toInt(), size.toInt())
                }
                gridHuruf.addView(textView)
            }
        }
    }
}
