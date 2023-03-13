package mx.itson.edu.examenu2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.TextView

class Regalos : AppCompatActivity() {

    var menuDetalles = ArrayList<Detalles>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        var opcionDetalles:String? = intent.getStringExtra("tipo")
        agregarDetalles(opcionDetalles)

        var gridView:GridView = findViewById(R.id.regalosGrid) as GridView

        var adaptador:DetalleAdapter = DetalleAdapter(this, menuDetalles)
        gridView.adapter = adaptador
    }

    fun agregarDetalles(option:String?){

        var menuTitle: TextView = findViewById(R.id.menuTitle)

        when(option){
            "Detalles"->{
                menuTitle.text = "Detalles"
                menuDetalles.add(Detalles(R.drawable.cumplevinos, "Cumplevinos" , "250"))
                menuDetalles.add(Detalles(R.drawable.cumplebotanas, "Cumplebotanas" , "250"))
                menuDetalles.add(Detalles(R.drawable.cumplecheve, "Cumplecheve" , "250"))
                menuDetalles.add(Detalles(R.drawable.cumplevinos, "Cumplevinos" , "250"))
            }
        }
    }
}

class DetalleAdapter: BaseAdapter {

    var detalles = ArrayList<Detalles>()
    var contexto: Context? = null

    constructor(context:Context, regalos:ArrayList<Detalles>){
        this.detalles = regalos
        this.contexto = context
    }

    override fun getCount(): Int {
        return detalles.size
    }

    override fun getItem(p0: Int): Any {
        return detalles[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var detalle = detalles[p0]
        var inflador = LayoutInflater.from(contexto)
        var vista = inflador.inflate(R.layout.activity_regalos , null)

        return vista
    }
}