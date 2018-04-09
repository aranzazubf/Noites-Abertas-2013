package com.aranzazu.appnoites;

import java.util.List;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class Localizaciones extends MapActivity {
	   public GeoPoint points[]=new GeoPoint[]{
			   
			   new GeoPoint((int)(42.431982*1E6),(int)(-8.64508*1E6)),
			   new GeoPoint((int)(42.430799*1E6),(int)(-8.643688*1E6)),
			   new GeoPoint((int)(42.430893*1E6),(int)(-8.649378*1E6)),
			   new GeoPoint((int)(42.432953*1E6),(int)(-8.645723*1E6)),
			   new GeoPoint((int)(42.430984*1E6),(int)(-8.643967*1E6)),
			   new GeoPoint((int)(42.433921*1E6),(int)(-8.64637*1E6)),
			   new GeoPoint((int)(42.43273*1E6),(int)(-8.647455*1E6)),
			   new GeoPoint((int)(42.432612*1E6),(int)(-8.646265*1E6)),
			   new GeoPoint((int)(42.4367*1E6),(int)(-8.641754*1E6)),
			   new GeoPoint((int)(42.43353*1E6),(int)(-8.638621*1E6)),
			   new GeoPoint((int)(42.43821*1E6),(int)(-8.637638*1E6)),
			   new GeoPoint((int)(42.437595*1E6),(int)(-8.634949*1E6)),
			   new GeoPoint((int)(42.419458*1E6),(int)(-8.636593*1E6)),
			   new GeoPoint((int)(42.421727*1E6),(int)(-8.637174*1E6))
			   
			   
	   };    
	   public String[] adress=new String[]{"","","","r/ Xeneral Martitegui, 3 (ao lado de Belas Artes)","","r/ Sor Lucía, 2","","","","Av. Bos Aires, s/n","","","(ao lado da estación de tren)",""};
	     
	      @Override
		public void onCreate(Bundle savedInstanceState) {

	    	
	    	
	            super.onCreate(savedInstanceState);
	            //this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
	           // getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
	            setContentView(R.layout.localizaciones);
	            Resources res=this.getResources();
	            String[] lug=res.getStringArray(R.array.lugaract2);
	  
	      
	      Drawable[] draw={res.getDrawable(R.drawable.pink),
	    		  res.getDrawable(R.drawable.purple),
	    		  res.getDrawable(R.drawable.green),
	    		  res.getDrawable(R.drawable.yellow),
	    		  res.getDrawable(R.drawable.blue),
	    		  res.getDrawable(R.drawable.pink),
	    		  res.getDrawable(R.drawable.purple),
	    		  res.getDrawable(R.drawable.red),
	    		  res.getDrawable(R.drawable.green),
	    		  res.getDrawable(R.drawable.blue),
	    		  res.getDrawable(R.drawable.purple),
	    		  res.getDrawable(R.drawable.green),
	    		  res.getDrawable(R.drawable.green),
	    		  res.getDrawable(R.drawable.purple)};
	    		  
	    		  
	    		  
	    		  
	    		  
	      
	      
	         MapView map=(MapView)findViewById(R.id.mapview);
	         
	         
	         
	         
	         map.setSatellite(true);
	         
	       MapController mapC= map.getController();
	       mapC.setZoom(17);
	          mapC.setCenter(points[0]);
	           map.setBuiltInZoomControls(true);
	           List<Overlay>mapOverlays= map.getOverlays();
	           HustsItemizedOverlay itemizedoverlay=  new HustsItemizedOverlay(draw[0],this);

        	   OverlayItem over= new OverlayItem(points[0],lug[0],"Calleblaba");
	           for(int i=0;i<lug.length;i++){
	        	   itemizedoverlay= new HustsItemizedOverlay(draw[i],this);
	        	 over= new OverlayItem(points[i],lug[i],adress[i]);
	        	 itemizedoverlay.addOverlay(over);
	        	    mapOverlays.add(itemizedoverlay);
	           }
	       
	         
	      
	           
	          
	      }

		@Override
		protected boolean isRouteDisplayed() {
			// TODO Auto-generated method stub
			return false;
		}

		public void mapa(View view) {
		     Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.google.es/maps/ms?msa=0&msid=209360466359965039230.0004d5273849e5e4dca1b&ie=UTF8&t=m&ll=42.429539,-8.64212&spn=0.063352,0.068665&z=13&source=embed")); 
		     startActivity(i);
		
			
	
		}
	     
}

