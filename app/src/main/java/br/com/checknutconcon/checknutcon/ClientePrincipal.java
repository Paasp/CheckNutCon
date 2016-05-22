package br.com.checknutconcon.checknutcon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ClientePrincipal extends AppCompatActivity implements View.OnClickListener{

    private Button btnNovoCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cliente_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnNovoCliente = (Button)findViewById(R.id.btnNovoCliente);
        btnNovoCliente.setOnClickListener(this);


        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_cliente_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.mni_acaoInicial:
                Intent principal = new Intent(this, Principal.class);
                startActivity(principal);

                break;
            case R.id.mni_acaoConsultoria:
                Intent consultoriaPrincipal = new Intent(this, ConsultoriaPrincipal.class);
                startActivity(consultoriaPrincipal);

                break;
            case R.id.mni_acaoSair:

                break;
        }




        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        Intent it = new Intent(this, NovoCliente.class);
        startActivity(it);

    }
}
