package com.example.musicaencontexto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.awareness.Awareness;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private Button ubicarme;
    private Button abrirMenu;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_menu_desplegable);
/*
        ubicarme = (Button)findViewById(R.id.btn_AbrirMapa);

        ubicarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        abrirMenu = (Button)findViewById(R.id.btn_desplegarMenu);

        abrirMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intento = new Intent(MainActivity.this, MenuDesplegable.class);
                startActivity(intento);
            }
        });
*/
        //GoogleApiClient client = new GoogleApiClient.Builder(context)
         //       .addApi(Awareness.API)
          //      .build();
       // client.connect();
    }
}
