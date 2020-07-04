package cl.talentodigital.aplicacionrecycler;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class EquiposViewHolder extends RecyclerView.ViewHolder {
    private TextView tvEquipo;
    private TextView tvCopasNacionales;
    private TextView tvCopasInternacionales;

    public EquiposViewHolder(@NonNull View itemView) {
        super(itemView);
        tvEquipo = itemView.findViewById(R.id.tvEquipo);
        tvCopasNacionales = itemView.findViewById(R.id.tvCopasNacionales);
        tvCopasInternacionales = itemView.findViewById(R.id.tvCopasInternacionales);

    }

    public void bind(Equipo equipo) {
        tvEquipo.setText(equipo.getNombreEquipo());
        tvCopasNacionales.setText(equipo.getCopasNacionales());
        tvCopasInternacionales.setText(equipo.getCopasInternacionales());

    }
}
