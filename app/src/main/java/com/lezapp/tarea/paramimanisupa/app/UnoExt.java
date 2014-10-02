package com.lezapp.tarea.paramimanisupa.app;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;


public class UnoExt extends Activity {

    TextView texto;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno_ext);

        text = "Sos SHCMU importante y especial.. almenos en mi vida" +
                "no hay nadie mas especial que tu.. sos a quien mas quiero " +
                "sos la persona q es indispensable en mi vida.. sin ti no pued" +
                "me equivoco tanto con tigo y me equivoco tan feo.. que no merezco " +
                "que me dirijas la palabra.. pero tu me perdonas y seguis con migo" +
                "es tan genial q cada noche pueda escucharte y contarte de mi.. eso no se " +
                "compara con nada, no hay felicidad mas grande que tener con quien contar" +
                "no hay nadie mas especial q tu en mi vida.. sos cmo la estructura de mis metas" +
                "sin ti se debilitan.. no sabes cuant importante eres, cuanto te necesito " +
                "y cuan especial te considero xq se q no hay nadie q se paresca a ti, por eso " +
                "tu sos la heramana perfecta";


        texto = (TextView)findViewById(R.id.lbltexto);
        texto.setText(text);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.uno_ext, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
