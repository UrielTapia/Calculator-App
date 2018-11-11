package com.esiete.ironmusclesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.esiete.ironmusclesapp.WelcomeActivity.usuario;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.esiete.ironmusclesapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, HomeActivity.class);

        EditText mail = findViewById(R.id.editTextCorreo);
        EditText password = findViewById(R.id.editTextContra);
        String correo = mail.getText().toString();
        String contra = password.getText().toString();
        TextView error = findViewById(R.id.textError);

        intent.putExtra(usuario.getCorreo(), usuario.getNombre());

        if(TextUtils.isEmpty(correo) || TextUtils.isEmpty(contra)){
            if (TextUtils.isEmpty(correo)) error.setText(R.string.error_correo_sesion);
            else error.setText(R.string.error_contra_sesion);
        }
        else{
            if (verificarDatos(correo, contra)) startActivity(intent);
            else error.setText(R.string.error_datos_sesion);
        }
    }

    private boolean verificarDatos(String correo, String contra){
        if (correo.equals(usuario.getCorreo()) && contra.equals(usuario.getContra())) return true;
        else return false;
    }

}
