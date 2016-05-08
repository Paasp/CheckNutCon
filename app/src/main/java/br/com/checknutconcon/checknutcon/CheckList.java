package br.com.checknutconcon.checknutcon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.*;
import android.view.*;

public class CheckList extends AppCompatActivity implements View.OnClickListener {

    private Button btnNovaConsultoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnNovaConsultoria = (Button)findViewById(R.id.btnNovaConsultoria);
        btnNovaConsultoria.setOnClickListener(this);


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
    public void onClick(View v) {
        Intent intent = new Intent(this, NovaConsultoria.class);
        startActivity(intent);
    }
}
