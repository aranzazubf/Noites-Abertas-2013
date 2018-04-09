package com.aranzazu.appnoites;

import com.aranzazu.appnoites.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Colaboradores extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		  //this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		  //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
		setContentView(R.layout.colaboradores);
	
	}

}