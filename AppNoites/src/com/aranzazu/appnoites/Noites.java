package com.aranzazu.appnoites;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;

public class Noites extends TabActivity {

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		 
		setContentView(R.layout.noites);
		 getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
	TabHost tabhost = getTabHost();
	TabHost.TabSpec spec;
	Intent intent;
	Resources res =getResources();
	

	
	
	
	
	
	
	
	intent=new Intent().setClass(this, Inicio.class);
	spec =tabhost.newTabSpec("  Inicio  ").setIndicator("",res.getDrawable(R.drawable.my_selector)).setContent(intent);
	tabhost.addTab(spec);
	
	intent=new Intent().setClass(this, Actividades.class);
	spec =tabhost.newTabSpec("  Actividades  ").setIndicator("",res.getDrawable(R.drawable.my_selector2)).setContent(intent);
	tabhost.addTab(spec);
	
	intent=new Intent().setClass(this, Localizaciones.class);
	 
	spec =tabhost.newTabSpec("  Localizaciones  ").setIndicator("",res.getDrawable(R.drawable.my_selector3)).setContent(intent);
	tabhost.addTab(spec);
	
	intent=new Intent().setClass(this, Programa.class);
	spec =tabhost.newTabSpec("  Programa  ").setIndicator("",res.getDrawable(R.drawable.my_selector4)).setContent(intent);
	tabhost.addTab(spec);
	
	intent=new Intent().setClass(this, Colaboradores.class);
	spec =tabhost.newTabSpec("  Colaboradores  ").setIndicator("",res.getDrawable(R.drawable.my_selector5)).setContent(intent);
	tabhost.addTab(spec);
	//tabhost.setCurrentTab(0);
	intent=new Intent().setClass(this, Folleto.class);
	spec =tabhost.newTabSpec("  Folleto ").setIndicator("",res.getDrawable(R.drawable.my_selector6)).setContent(intent);
	tabhost.addTab(spec);
	
	}
	
	
	}

