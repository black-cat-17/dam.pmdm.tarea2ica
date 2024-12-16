package dam.pmdm.tarea02ica;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class DetallesMario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detalles_mario);

        //------------Button Volver---------------------------------------------------------------//
        // Primero debe encontrar su Button por su id usando findViewById()
        // Luego establecer un setOnClickListener para su botón e implementar el método finis().
        Button btVolver = findViewById(R.id.bt_volver);
        btVolver.setOnClickListener(v -> finish());
        //----------------------------------------------------------------------------------------//
    }
}
