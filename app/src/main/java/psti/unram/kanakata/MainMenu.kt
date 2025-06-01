package psti.unram.kanakata

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnHiragana1 = findViewById<Button>(R.id.btnHiragana)
        btnHiragana1.setOnClickListener {
            val intent = Intent(this, HurufMenuActivity::class.java)
            intent.putExtra("huruf", "Hiragana")
            startActivity(intent)
        }

        val btnKatakana2 = findViewById<Button>(R.id.btnKatakana)
        btnKatakana2.setOnClickListener {
            val intent = Intent(this, HurufMenuActivity::class.java)
            intent.putExtra("huruf", "Katakana")
            startActivity(intent)
        }

        val btnKanji3 = findViewById<Button>(R.id.btnKanji)
        btnKanji3.setOnClickListener {
            val intent = Intent(this, HurufMenuActivity::class.java)
            intent.putExtra("huruf", "Kanji")
            startActivity(intent)
        }
    }
}