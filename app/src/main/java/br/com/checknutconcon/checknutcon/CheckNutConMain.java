package br.com.checknutconcon.checknutcon;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.widget.*;

public class CheckNutConMain extends ActionBarActivity implements View.OnClickListener{

    private Button btnNovoCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_nut_con_main);

        btnNovoCliente = (Button)findViewById(R.id.btnNovoCliente);
        btnNovoCliente.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        Intent it = new Intent(this, CadastroDoCliente.class);
        startActivity(it);

    }

    public boolean oCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_check_nut_con_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){
            case R.id.mni_acaoCliente:

                break;
            case R.id.mni_acaoCheckList:

                break;
            case R.id.mni_acaoSair:

                break;

        }
        return super.onOptionsItemSelected(item);
    }


}
