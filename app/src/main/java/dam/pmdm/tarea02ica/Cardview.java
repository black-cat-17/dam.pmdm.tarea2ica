package dam.pmdm.tarea02ica;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Cardview extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cardview);

        //--------------Botón Detalles-----------------------------------------------------------//
        Button btdetalles = findViewById(R.id.bt_detalles);
        btdetalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Le mostramos el personaje: Mario Bros", Toast.LENGTH_LONG);
            }
        });
        //----------------------------------------------------------------------------------------//
    }
}
