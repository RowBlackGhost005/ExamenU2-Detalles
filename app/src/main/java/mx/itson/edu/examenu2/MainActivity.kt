package mx.itson.edu.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnPrincipal: Button = this.findViewById(R.id.btn_visitar) as Button

        btnPrincipal.setOnClickListener(){

            var intent = Intent(this , MenuPrincipal::class.java)
            this.startActivity(intent)
        }
    }
}