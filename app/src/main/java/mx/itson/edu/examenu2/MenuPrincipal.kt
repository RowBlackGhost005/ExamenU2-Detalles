package mx.itson.edu.examenu2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button

class MenuPrincipal : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        var btnDetalles: Button = this.findViewById(R.id.Detalles) as Button
        var btnGlobos: Button = this.findViewById(R.id.Globos) as Button
        var btnPeluches: Button = this.findViewById(R.id.Peluches) as Button
        var btnRegalos: Button = this.findViewById(R.id.Regalos) as Button
        var btnTazas: Button = this.findViewById(R.id.Tazas) as Button



        btnDetalles.setOnClickListener(){
            var intent:Intent = Intent(this, Regalos::class.java)
            intent.putExtra("tipo" , "Detalles")
            startActivity(intent)
        }

        btnGlobos.setOnClickListener(){
            var intent:Intent = Intent(this, Regalos::class.java)
            intent.putExtra("tipo" , "Globos")
            startActivity(intent)
        }

        btnPeluches.setOnClickListener(){
            var intent:Intent = Intent(this, Regalos::class.java)
            intent.putExtra("tipo" , "Peluches")
            startActivity(intent)
        }

        btnRegalos.setOnClickListener(){
            var intent:Intent = Intent(this, Regalos::class.java)
            intent.putExtra("tipo" , "Regalos")
            startActivity(intent)
        }

        btnTazas.setOnClickListener(){
            var intent:Intent = Intent(this, Regalos::class.java)
            intent.putExtra("tipo" , "Tazas")
            startActivity(intent)
        }
    }
}