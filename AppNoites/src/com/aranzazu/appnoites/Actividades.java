package com.aranzazu.appnoites;

import java.util.ArrayList;

import com.aranzazu.appnoites.R;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class Actividades  extends ExpandableListActivity {
	

	
	  
    @Override
    public void onCreate(Bundle savedInstanceState) {
      
    	super.onCreate(savedInstanceState);
        Resources res =getResources();
     
     
       
        ArrayList<group> groupData = new ArrayList<group>();
        ArrayList<ArrayList<Child>> childData= new ArrayList<ArrayList<Child>>();
        
        
        
        String[] tipo=res.getStringArray(R.array.Tipologia);
    	String[] fisicas=res.getStringArray(R.array.fisicas);
    	String[] culturais=res.getStringArray(R.array.culturais);
    	String[] fisicash=res.getStringArray(R.array.fisicas_h);
    	String[] culturaish=res.getStringArray(R.array.culturais_h);
    	String[] formativas=res.getStringArray(R.array.formativas);
    	String[] formativash=res.getStringArray(R.array.formativas_h);
    	String[] ludicas=res.getStringArray(R.array.ludicas);
    	String[] ludicash=res.getStringArray(R.array.ludicas_h);
    	String[] especiais=res.getStringArray(R.array.especiais);
    	String[] especiaish=res.getStringArray(R.array.especiais_h);
   
    	String[] lugaract=res.getStringArray(R.array.lugaract);
    	 ArrayList<String[]> lista = new ArrayList<String[]>();
    	 ArrayList<String[]> lista2 = new ArrayList<String[]>();
    	 lista.add(fisicas);
    	 lista.add(culturais);
    	 lista.add(formativas);
    	 lista.add(ludicas);
    	 lista.add(especiais);
    	
    	 lista2.add(fisicash);
    	 lista2.add(culturaish);
    	 lista2.add(formativash);
    	 lista2.add(ludicash);
    	 lista2.add(especiaish);
    	
    	int[] resIDs = new int[] {
    			R.drawable.cero,
    			R.drawable.uno,
                R.drawable.dos,
                R.drawable.tres,
                R.drawable.cuatro,
                R.drawable.cinco,
                R.drawable.seis,
                R.drawable.siete,
               0
            };
    	 
    	 
    	ExpandableListView elist=this.getExpandableListView();
    	elist.setCacheColorHint(Color.TRANSPARENT);
    	elist.setBackgroundDrawable(res.getDrawable(R.drawable.hoja2));
    	 for (int i = 0; i < tipo.length; i++) {
             
             groupData.add(new group(tipo[i]));
             ArrayList<Child> children = new ArrayList<Child>();

             for (int j = 0; j < lista.get(i).length; j++) {
            	int imagen1=EligeImagen(i,j); 
            	int imagen2=8;
            	int lugar=EligeLugar(i,j);
				if((i==2)&&(j==13))  imagen2=5;
            	else imagen2=8;
               children.add(new Child(lista.get(i)[j],resIDs[imagen1], lista2.get(i)[j],resIDs[imagen2], lugaract[lugar]));
             }
             childData.add(children);
         }

    	Exelistadapter exampleAdapter = new Exelistadapter(this, groupData, childData);
    			
    			this.setListAdapter(exampleAdapter);
    			
    				
        }

    @Override
	public boolean onChildClick(ExpandableListView parent,View v,int groupPosition,int childPosition,long id) 
    {
    
    	String[] mensaje= creamensaje(groupPosition,childPosition); 
    	Dialog d=crearDialogoAlerta(groupPosition,childPosition,mensaje);
    	d.show();
    	
         return false;
    }

    
    
private String[] creamensaje(int posg, int posc)
{
	String[] mensaje = {"","",""};
	Resources res =getResources();
	
	int posiciong=posg;
    int posicionc=posc;

    
	String[] fisicas=res.getStringArray(R.array.fisicas);
	String[] culturais=res.getStringArray(R.array.culturais);
	
	String[] formativas=res.getStringArray(R.array.formativas);
	
	String[] ludicas=res.getStringArray(R.array.ludicas);
	
	String[] especiais=res.getStringArray(R.array.especiais);
	

	String[] descfis=res.getStringArray(R.array.descfisicas);	
	String[] desccul=res.getStringArray(R.array.descculturais);
	String[] descfor=res.getStringArray(R.array.descformativas);
	String[] desclud=res.getStringArray(R.array.descludicas);
	String[] descesp=res.getStringArray(R.array.descespeciais);
	
	 ArrayList<String[]> lista = new ArrayList<String[]>();
	 ArrayList<String[]> lista2 = new ArrayList<String[]>();
	 lista.add(fisicas);
	 lista.add(culturais);
	 lista.add(formativas);
	 lista.add(ludicas);
	 lista.add(especiais);
	 lista2.add(descfis);
	 lista2.add(desccul);
	 lista2.add(descfor);
	 lista2.add(desclud);
	 lista2.add(descesp);
	mensaje[0]=lista.get(posiciong)[posicionc];
	mensaje[1]=lista2.get(posiciong)[posicionc];

	
	
	
	return mensaje; 
}

private Dialog crearDialogoAlerta(int posg,int posc, String[] mensaje)
{
	Context mContext = getApplicationContext();
	

	String[] msj=mensaje;
	AlertDialog.Builder builder = new AlertDialog.Builder(this);
	LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);
	View layout = inflater.inflate(R.layout.dialog,
	                               (ViewGroup) findViewById(R.id.dialog));

	TextView text = (TextView) layout.findViewById(R.id.text_d1);
	text.setText(msj[0]);
	TextView text2 = (TextView) layout.findViewById(R.id.text_d2);
	text2.setText(msj[1]);
	
	    builder.setView(layout)
	   
	           .setPositiveButton("OK", new DialogInterface.OnClickListener() {
	               @Override
	               public void onClick(DialogInterface dialog, int id) {
	            	   dialog.cancel();
	               }});
	               
	           
	    return builder.create();
	
}
public int EligeImagen(int a,int b){
	int grupo=a;
	int act=b;
	int image=0;
	switch(grupo){
	
	case 0: switch(act){
			case 9:image=1;
			break;
			case 3: case 4: case 12:image=0;
			break;
			case 7: image=4;
			break;
			case 8: image=3;
			break;
			default: image=8;
			break;
			}
	break;	
	case 1: switch(act){
			case 1:image=1;
			break;
			case 6: case 7: case 8:  case 12: case 13: image=0;
			break;
			case 11: image=7;
			break;
			default: image=8;
			break;
	}
	break;
	case 2: switch(act){
			case 6: case 19: case 27: image=6;
			break;
			case 8: case 10: case 13: case 14: case 15: case 21: case 26: image=0;
			break;
			case 9: image=1;
			break;
			case 28: image=7;
			break;
			default: image=8;
			break;
	}
	break;
	case 4: switch(act){
			case 7: case 8: image=2;
			break;
			default: image=8;
			break;
	}
	break;
	default: image=8;
	break;
} 
	return image;
}


public int EligeLugar(int a,int b){
	int grupo=a;
	int act=b;
	int image=0;
	switch(grupo){
	
	case 0: switch(act){
			case 0: case 5: case 10: case 12:image=0; 
			break;
			case 1: case 9:image=1;
			break;
			case 2:  image=2;
			break;
			case 6: image=5;
			break;
			case 3:case 8: case 11: case 13: case 14: image=3;
			break;
			case 4: image=4;
			break;
			case 7: image=6;
			break;
			
			
			}
	break;	
	case 1: switch(act){
			case 0: case 3: image=7;
			break;
			case 1: image=8;
			break;
			case 2: case 7: case 9: case 13: case 12: image=3;
			break;
			case 4: case 5: image=10;
			break;
			case 6: case 10: image=9;
			break;
			case 8: image=2;
			break;
			case 11: image=11;
			break;
			case 14:image=1;
			break;
	}
	break;
	case 2: switch(act){
			case 0: case 3: case 8: case 9: case 13: case 14: case 15: case 24: case 26: image=1;
			break;
			case 1: case 2: case 10: case 11: case 12: case 16: case 17:  case 20: case 21: case 22: case 25:image=3;
			break;
			case 4: case 5: case 6: case 7: case 18: case 19: case 23: case 27: image=10;
			break;
			case 28: image=12;
			break;
			
	}
	break;
	case 3: switch(act){
			case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 10: case 11: case 12: case 13: case 17: case 19: case 20: case 21: case 22: image=3;
			break;
			case 9: case 14: case 15: case 16: case 18: image=1;
			break;

}
break;
	case 4: switch(act){
			case 1:  case 5: case 7: case 8: case 9: case 12: case 13:  image=1;
			break;
			case 6: case 10: image=3;
			break;
			case 3: image=13;
			break;
			case 4: image=14;
			break;
			case 0: case 2: case 11: image=15;
			break;
} 
break;	
	}
	return image;
}


}