package mx.edu.potros.practica6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detalle_pelicula : AppCompatActivity() {

    var iv_pelicula_imagen: ImageView = findViewById(R.id.iv_pelicula_imagen)
    var tv_nombre_pelicula: TextView = findViewById(R.id.tv_nombre_pelicula)
    var tv_pelicula_desc: TextView = findViewById(R.id.tv_pelicula_desc)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val bundle = intent.extras

        if(bundle != null)
        {
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("nombre"))
            tv_pelicula_desc.setText(bundle.getString("sinopsis"))
        }
    }
}