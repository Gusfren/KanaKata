package psti.unram.kanakata

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import android.view.ViewGroup
import android.view.View
import android.content.Intent

class KuisActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuis)

        val levelList = findViewById<LinearLayout>(R.id.levelList)

        // Misal ada 10 level
        for (i in 1..10) {
            val levelButton = Button(this).apply {
                text = "Level $i"
                setTextColor(resources.getColor(android.R.color.white, null))
                background = resources.getDrawable(R.drawable.rounded_button, null)
                textSize = 16f
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                ).apply {
                    topMargin = 16
                }
            }

            levelList.addView(levelButton)
        }
    }
}
