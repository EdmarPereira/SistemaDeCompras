package com.example.pedmar.sistemadecompras;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Compras_Activity extends AppCompatActivity {
    CheckBox chkArroz, chkFeijao, chkLeite, chkCarne;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras_);
        chkArroz = (CheckBox) findViewById(R.id.chkarroz);
        chkFeijao = (CheckBox) findViewById(R.id.chkfeijao);
        chkLeite = (CheckBox) findViewById(R.id.chkleite);
        chkCarne = (CheckBox) findViewById(R.id.chkcarne);
        Button bttotal = (Button) findViewById(R.id.bttotal);

        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Double total = 0.0;

                if(chkCarne.isChecked())
                    total += 4.50;
                if(chkLeite.isChecked())
                    total += 2.8;
                if(chkArroz.isChecked())
                    total += 3.2;
                if(chkFeijao.isChecked())
                    total += 7.6;
                AlertDialog.Builder dialogo = new AlertDialog.Builder(Compras_Activity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total = " + total);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });
    }
}
