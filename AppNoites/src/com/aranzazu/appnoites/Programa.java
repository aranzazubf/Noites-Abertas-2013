package com.aranzazu.appnoites;

import com.aranzazu.appnoites.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Programa extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 // this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		  //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
		setContentView(R.layout.programa);
		
	 
		
	}
		public void sendMessage1(View view) {
			Intent intent=new Intent().setClass(this, Febrero.class);
		startActivity(intent);
			
	
		}
		public void sendMessage2(View view) {
			Intent intent=new Intent().setClass(this, Marzo.class);
			startActivity(intent);
	
		}

		public void sendMessage3(View view) {
			Intent intent=new Intent().setClass(this, Abril.class);
			startActivity(intent);
	
		}

		public void sendMessage4(View view) {
			Intent intent=new Intent().setClass(this, Maio.class);
			startActivity(intent);
	
		}

}
