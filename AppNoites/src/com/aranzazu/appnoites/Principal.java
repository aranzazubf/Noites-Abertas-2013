package com.aranzazu.appnoites;
import com.aranzazu.appnoites.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Principal extends Activity{
	 @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
   this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

    setContentView(R.layout.principal);
    getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
   
   
	}
	 public void sendMessagep(View view) {
			Intent intent=new Intent().setClass(this, 	Noites.class);
			startActivity(intent);

}
	 public void inicio(View view) {
		 Intent callIntent = new Intent(Intent.ACTION_CALL);
		 callIntent.setData(Uri.parse("tel:"+986100185));
		startActivity(callIntent);


} 
	 public void inicio1(View view) {
		 Intent emailIntent = new Intent(Intent.ACTION_SEND);   
		 emailIntent.setType("plain/text");   
		 emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"xuventude@pontevedra.eu"});   
		 startActivity(Intent.createChooser(emailIntent, "Enviar mail"));


} 
	 public void inicio2(View view) {
		 Intent i = new Intent(Intent.ACTION_VIEW);
		 i.setData(Uri.parse("http://www.xuventude.pontevedra.eu"));
		 startActivity(Intent.createChooser(i,"Escoga un navegador"));
		
} 
	 public void inicio3(View view) {
		 Intent i = new Intent(Intent.ACTION_VIEW);
		 i.setData(Uri.parse("http://www.noitesabertas.com"));
		 startActivity(Intent.createChooser(i,"navegador"));
		

} 
	 public void inicio4(View view) {
		 Intent i = new Intent(Intent.ACTION_VIEW);
		 i.setData(Uri.parse("http://www.facebook.com/noitesabertas"));
		 startActivity(i);

} 
	 @Override
	public void onBackPressed ()
	 {Intent i = new Intent(this, Grid.class);
	 startActivityForResult(i, 1);
	 }
	 @Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		 if (requestCode == 1) {
		
		     this.finish();

		     

		 }
}}