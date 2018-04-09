package com.aranzazu.appnoites;

import com.aranzazu.appnoites.R;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Folleto extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		  //this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		 // getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
		setContentView(R.layout.folleto);
	
	
		
		
		
Button button = (Button)findViewById(R.id.buttoner);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
	 descarga();	}     
});

	}

	public void descarga(){

		
		  

	            try {

	                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.noitesabertas.com/sites/default/files/programacion.pdf")));

	            } 

	            catch (ActivityNotFoundException e) {

	                Toast.makeText(this, 

	                    "No Application Available to View PDF", 

	                   Toast.LENGTH_SHORT).show();}}
	
	}
