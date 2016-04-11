package br.com.checknutconcon.checknutcon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class BemVindo extends AppCompatActivity implements View.OnClickListener{

    private Button btnCadastrar;
    private Button btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        btnCadastrar = (Button)findViewById(R.id.btnCadastrar);
        btnSair = (Button)findViewById(R.id.btnSair);

        btnCadastrar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        Intent it = new  Intent (this, CadastroDoNutricionista.class);
        startActivity(it);



    }
}
