package dam.pmdm.tarea02ica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv1;
    String[]nombres={"Mario Bros", "Luigi", "Peach", "Toad" };
    int[]fotos={R.drawable.mario, R.drawable.luigi, R.drawable.peach, R.drawable.toad};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv1 = findViewById(R.id.rv1);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv1.setLayoutManager(linearLayoutManager);

        rv1.setAdapter(new AdaptadorPersonaje());

    }


    private class AdaptadorPersonaje extends RecyclerView.Adapter<AdaptadorPersonaje.AdaptadorPersonajeHolder> {

        @NonNull
        @Override
        public AdaptadorPersonajeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new AdaptadorPersonajeHolder(getLayoutInflater().inflate(R.layout.layout_cardview, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull AdaptadorPersonajeHolder holder, int position) {
            holder.imprimir(position);

        }

        @Override
        public int getItemCount() {
            return nombres.length;
        }

        class AdaptadorPersonajeHolder extends RecyclerView.ViewHolder {
            ImageView iv1;
            TextView tv1;
            public AdaptadorPersonajeHolder(@NonNull View itemView) {
                super(itemView);
                iv1=itemView.findViewById(R.id.ivpersonaje);
                tv1=itemView.findViewById(R.id.tvnombre);
            }

            public void imprimir(int position) {
                iv1.setImageResource(fotos[position]);
                tv1.setText(nombres[position]);
            }
        }
    }
}