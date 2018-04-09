package com.aranzazu.appnoites;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Inicio extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 // this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		 // getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
		setContentView(R.layout.inicio);
	}
	public void inicio1(View view) {
		 Intent emailIntent = new Intent(Intent.ACTION_SEND);   
		 emailIntent.setType("plain/text");   
		 emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"xuventude@pontevedra.eu"});   
		 startActivity(Intent.createChooser(emailIntent, "Enviar mail"));


} 
	public void compartir(View view) {
		Intent intent = new Intent(Intent.ACTION_SEND);

		  intent.setType("text/plain");
		  intent.putExtra(Intent.EXTRA_SUBJECT, "Noites Abertas XIV Edición, " +
		  		"O maior programa cultural da bisbarra. Ocio, cultura, formación no teu concello");
		  intent.putExtra(Intent.EXTRA_TEXT, "http://www.noitesabertas.com");

		  startActivity(Intent.createChooser(intent, "Compartir"));

} 
public void descargabases(View view){
	
	
	
	    

    try {

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.noitesabertas.com/sites/default/files/bases-certame-erotismo.pdf")));

    } 

    catch (ActivityNotFoundException e) {

        Toast.makeText(this, 

            "No Application Available to View PDF", 

           Toast.LENGTH_SHORT).show();}}



}

		
