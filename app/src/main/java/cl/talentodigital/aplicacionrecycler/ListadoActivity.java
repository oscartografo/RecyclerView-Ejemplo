package cl.talentodigital.aplicacionrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListadoActivity extends AppCompatActivity {
    private RecyclerView rvListadoDeEquipos;
    private RecyclerView.LayoutManager layoutManager;
    private EquiposAdapter equiposAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        rvListadoDeEquipos = findViewById(R.id.rvListadoDeEquipos);
        rvListadoDeEquipos.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rvListadoDeEquipos.setLayoutManager(layoutManager);
        equiposAdapter = new EquiposAdapter(getFakeEquipos());
        rvListadoDeEquipos.setAdapter(equiposAdapter);


    }

    private ArrayList<Equipo> getFakeEquipos() {
        ArrayList<Equipo> equipoArrayList = new ArrayList<>();
        for (int i=1; i<30; i++){
            equipoArrayList.add(getEquipoFake(i));


        }
        return equipoArrayList;
    }

    private Equipo getEquipoFake(int i) {
        return new Equipo("Nombre "+ i, "Copas Nacionales"+ i, "Copas Internacionales"+ i);
    }
}
