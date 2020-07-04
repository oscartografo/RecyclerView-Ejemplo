package cl.talentodigital.aplicacionrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class EquiposAdapter extends RecyclerView.Adapter<EquiposViewHolder> {
    private ArrayList<Equipo> arrayList;

    public EquiposAdapter(ArrayList<Equipo> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public EquiposViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_juegos, parent,false);

        return new EquiposViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EquiposViewHolder holder, int position) {
        holder.bind(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
