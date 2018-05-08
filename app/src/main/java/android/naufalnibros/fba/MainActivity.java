package android.naufalnibros.fba;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by Hafizh Herdi on 7/2/2015 www.twoh.co
 */
public class MainActivity extends AppCompatActivity{

    private FloatingActionButton fab;
    private Button btTutorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(findViewById(R.id.ly_fab), "Contoh sebuah Snackbar", Snackbar.LENGTH_LONG).setAction("Click me!", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText( MainActivity.this, "KAMU KLICK APA?", Toast.LENGTH_SHORT).show();
                    }
                }).show();
            }
        });


        setupToolbar();
        super.onCreate(savedInstanceState);
    }

    private void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle("Floating Action Button Example");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home :
                finish();
                break;
        }

        return true;
    }

}