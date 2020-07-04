package cl.talentodigital.aplicacionrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class  MainActivity extends AppCompatActivity {
    private Button btnIrAListado;
    private Button btnIrAComponentes;
    private Button btnIrAGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIrAListado = findViewById(R.id.btnIrAListado);
        btnIrAComponentes = findViewById(R.id.bntIrAComponentes);
        btnIrAGoogle = findViewById(R.id.btnIrAGoogle);

        btnIrAListado.setOnClickListener((View v) -> goToListado());
        btnIrAComponentes.setOnClickListener((View v) -> goToComponentes());
        btnIrAGoogle.setOnClickListener((View v) -> goToGoogle());
    }

    private void goToGoogle() {
        String url = "http://www.google.cl";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    private void goToComponentes() {

    }

    private void goToListado() {
        Intent intent = new Intent(this, ListadoActivity.class);
        startActivity(intent);
    }
}
