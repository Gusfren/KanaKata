package psti.unram.kanakata

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button
import android.content.Intent



class HurufMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_huruf_menu)

        val huruf = intent.getStringExtra("huruf") ?: "Huruf"
        val hurufJepang = intent.getStringExtra("hurufJepang") ?: ""

        val tvHuruf = findViewById<TextView>(R.id.tvHuruf)
        val btnBelajar = findViewById<Button>(R.id.btnBelajar)
        val btnKuis = findViewById<Button>(R.id.btnKuis)

        tvHuruf.text = "$huruf\n$hurufJepang"

        btnBelajar.setOnClickListener {
            val intent = Intent(this, BelajarActivity::class.java)
            intent.putExtra("huruf", huruf)
            startActivity(intent)
        }

        btnKuis.setOnClickListener {
            val intent = Intent(this, KuisActivity::class.java)
            intent.putExtra("huruf", huruf)
            startActivity(intent)
        }
    }
}
