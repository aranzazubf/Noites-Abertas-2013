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

public class Dia extends ExpandableListActivity {
	
	

	
	  
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
    	super.onCreate(savedInstanceState);
    	//  this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
    	Resources res=getResources();
    	ExpandableListView elist=this.getExpandableListView();
    	elist.setBackgroundDrawable(res.getDrawable(R.drawable.hoja2));
    	elist.setCacheColorHint(Color.TRANSPARENT);
	      
    	  Bundle datos = this.getIntent().getExtras();
    	  int mes = datos.getInt("variable_integer");
    	  int dia= datos.getInt("variable_integer1");
    	 ArrayList<group> groupData = new ArrayList<group>();
	     ArrayList<ArrayList<ChildDia>> childData= new ArrayList<ArrayList<ChildDia>>();
    	 Exelistadapter2 exampleAdapter=new Exelistadapter2(this,groupData,childData);
    	 
    	

    		switch(mes){
    			case 1:
    				exampleAdapter=rellenafebreiro(dia);
    			break;
    			case 2:
    				exampleAdapter=rellenamarzo(dia);
    			break;
    			case 3:
    				exampleAdapter=rellenaabril(dia);
    			break;
    			
    			case 4:
    				exampleAdapter=rellenamaio(dia);
    			break;
    		}
    			
   
    	 
    	
 
    			 this.setListAdapter(exampleAdapter);
        
        }

   
 





    
	Exelistadapter2 rellenafebreiro(int dia){
			 
		     ArrayList<group> groupData = new ArrayList<group>();
		     ArrayList<ArrayList<ChildDia>> childData= new ArrayList<ArrayList<ChildDia>>();
		 	Resources res =getResources();
			
		 	String[] febrerolug1=res.getStringArray(R.array.lugaresfeb22);
		 	ArrayList<String[]> Af1= new ArrayList<String[]>();
			ArrayList<String[]> Hf1= new ArrayList<String[]>();
		   String[] febrero1a=res.getStringArray(R.array.actividadesfebrero22froebel);
		   String[] febrero1b=res.getStringArray(R.array.actividadesfebrero22casaazul);
		   String[] febrero1c=res.getStringArray(R.array.actividadesfebrero22localmusica);
		   String[] febrero1d=res.getStringArray(R.array.actividadesfebrero22pavmunicipal);
		   Af1.add(febrero1a);
		   Af1.add(febrero1b);
		   Af1.add(febrero1c);
		   Af1.add(febrero1d);
		   
		   String[] febrero1ha=res.getStringArray(R.array.horasfebrero22froebel);
		   String[] febrero1hb=res.getStringArray(R.array.horasfebrero22casaaazul);
		   String[] febrero1hc=res.getStringArray(R.array.horasfebrero22localmusica);
		   String[] febrero1hd=res.getStringArray(R.array.horasfebrero22pavmunicipal);
		Hf1.add(febrero1ha);
		Hf1.add(febrero1hb);	
		Hf1.add(febrero1hc);	
		Hf1.add(febrero1hd);	
		
		
		
	 	String[] febrerolug2=res.getStringArray(R.array.lugfeb23);
	 	ArrayList<String[]> Af2= new ArrayList<String[]>();
		ArrayList<String[]> Hf2= new ArrayList<String[]>();
	   String[] febrero2a=res.getStringArray(R.array.actividadesfebrero23froebel);
	   String[] febrero2b=res.getStringArray(R.array.actividadesfebrero23casaazul);
	   String[] febrero2c=res.getStringArray(R.array.actividadesfebrero23ceipmanuel);
	   String[] febrero2d=res.getStringArray(R.array.actividadesfebrero23pavmultiusos);
	   Af2.add(febrero2a);
	   Af2.add(febrero2b);
	   Af2.add(febrero2c);
	   Af2.add(febrero2d);
	   
	   String[] febrero2ha=res.getStringArray(R.array.horasfebrero23froebel);
	   String[] febrero2hb=res.getStringArray(R.array.horasfebrero23casaazul);
	   String[] febrero2hc=res.getStringArray(R.array.horasfebrero23ceipmanuel);
	   String[] febrero2hd=res.getStringArray(R.array.horasfebrero23pavmultiusos);
	Hf2.add(febrero2ha);
	Hf2.add(febrero2hb);	
	Hf2.add(febrero2hc);	
	Hf2.add(febrero2hd);	
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
		   
		   
					switch(dia){
			case 1:
				 for (int i = 0; i < febrerolug1.length; i++) {
			         
			         groupData.add(new group(febrerolug1[i]));
			         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

			         for (int j = 0; j < Af1.get(i).length; j++) {
			        	 int imagen1=EligeImagenF(dia,i,j); 
			            	int imagen2=8;
			            
							if((i==1)&&(j==1))  imagen2=5;
			            	else imagen2=8;
			           children.add(new ChildDia((Hf1.get(i)[j]),(Af1.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
			         }
			         childData.add(children);
			     }
				break;
			case 2:
				for (int i = 0; i < febrerolug2.length; i++) {
					
	            	
			         groupData.add(new group(febrerolug2[i]));
			         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

			         for (int j = 0; j < Af2.get(i).length; j++) {
			        	 int imagen1=EligeImagenF(dia,i,j); 
			        	 int imagen2=8;
			           children.add(new ChildDia((Hf2.get(i)[j]),(Af2.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
			         }
			         childData.add(children);
			     }
				break;
			}
			
			 Exelistadapter2 exampleAdapter= new Exelistadapter2(this,groupData,childData);
				return exampleAdapter;
			
		}
	
	public int EligeImagenF(int dia,int a,int b){
		int day=dia;
		int i=a;
		int j=b;
		int image=0;
		switch(day){
		
		case 1: switch(i){
				case 0: if(j==4)image=3; else image=8;
				break;
				case 1: if(j==1)image=0;
				else if (j==3)image=2;
				else image=8;
				break;
				case 2: image=8;
				break;
				case 3: image=1;
				break;
				default: image=2;
				break;
				}
		break;	
		case 2: switch(i){
				case 0:case 2: case 3:image=8;
				break;
				case 1: if(j==0)image=1; else image=8;
				break;
				
		}
		break;
		
	} 
		return image;
	}

	
		Exelistadapter2 rellenamarzo(int dia){
			
			

		     ArrayList<group> groupData = new ArrayList<group>();
		     ArrayList<ArrayList<ChildDia>> childData= new ArrayList<ArrayList<ChildDia>>();
		     Resources res =getResources();
				
		     String[] lugmarzo1=res.getStringArray(R.array.lugmar1);
		     String[] lugmarzo2=res.getStringArray(R.array.lugmar2);
		     String[] lugmarzo3=res.getStringArray(R.array.lugaresfeb22);
		     String[] lugmarzo4=res.getStringArray(R.array.lugmar9);
		     String[] lugmarzo5=res.getStringArray(R.array.lugmar15);
		     String[] lugmarzo6=res.getStringArray(R.array.lugfeb23);
		     String[] lugmarzo7=res.getStringArray(R.array.lugaresfeb22);
		     String[] lugmarzo8=res.getStringArray(R.array.lugmar23);
		     String[] lugmarzo9=res.getStringArray(R.array.lugSemSta);
		     String[] lugmarzo10=res.getStringArray(R.array.lugSemSta);
		     String[] lugmarzo11=res.getStringArray(R.array.lugSemSta);
		     
		     ArrayList<String[]> Am1=new ArrayList<String[]>();
		     ArrayList<String[]> Am2=new ArrayList<String[]>();
		     ArrayList<String[]> Am3=new ArrayList<String[]>();
		     ArrayList<String[]> Am4=new ArrayList<String[]>();
		     ArrayList<String[]> Am5=new ArrayList<String[]>();
		     ArrayList<String[]> Am6=new ArrayList<String[]>();
		     ArrayList<String[]> Am7=new ArrayList<String[]>();
		     ArrayList<String[]> Am8=new ArrayList<String[]>();
		     ArrayList<String[]> Am9=new ArrayList<String[]>();
		     ArrayList<String[]> Am10=new ArrayList<String[]>();
		     ArrayList<String[]> Am11=new ArrayList<String[]>();
		     ArrayList<String[]> Hm1=new ArrayList<String[]>();
		     ArrayList<String[]> Hm2=new ArrayList<String[]>();
		     ArrayList<String[]> Hm3=new ArrayList<String[]>();
		     ArrayList<String[]> Hm4=new ArrayList<String[]>();
		     ArrayList<String[]> Hm5=new ArrayList<String[]>();
		     ArrayList<String[]> Hm6=new ArrayList<String[]>();
		     ArrayList<String[]> Hm7=new ArrayList<String[]>();
		     ArrayList<String[]> Hm8=new ArrayList<String[]>();
		     ArrayList<String[]> Hm9=new ArrayList<String[]>();
		     ArrayList<String[]> Hm10=new ArrayList<String[]>();
		     ArrayList<String[]> Hm11=new ArrayList<String[]>();
		     String[] marzo1a=res.getStringArray(R.array.actividadesmarzo1froebel);
		     String[] marzo1b=res.getStringArray(R.array.actividadesmarzo1casaazul);
		     String[] marzo1c=res.getStringArray(R.array.actividadesmarzo1prazaou);
		     String[] marzo1d=res.getStringArray(R.array.actividadesmarzo1pavmunicipal);
		     String[] marzo1e=res.getStringArray(R.array.actividadesmarzo1localmusica);
		     Am1.add(marzo1a);
		     Am1.add(marzo1b);
		     Am1.add(marzo1c);
		     Am1.add(marzo1d);
		     Am1.add(marzo1e);
		     String[] marzo2a=res.getStringArray(R.array.actividadesmarzo2froeble);
		     String[] marzo2b=res.getStringArray(R.array.actividadesmarzo2casaazul);
		     String[] marzo2c=res.getStringArray(R.array.actividadesmarzo2camposh);
		     Am2.add(marzo2a);
		     Am2.add(marzo2b);
		     Am2.add(marzo2c);
		     String[] marzo3a=res.getStringArray(R.array.actividadesmarzo8froebel);
		     String[] marzo3b=res.getStringArray(R.array.actividadesmarzo8casaazul);
		  
		     String[] marzo3c=res.getStringArray(R.array.actividadesmarzo8localmusica);
		     String[] marzo3d=res.getStringArray(R.array.actividadesmarzo8pavmunicipal);
		     Am3.add(marzo3a);
		     Am3.add(marzo3b);
		     Am3.add(marzo3c);
		     Am3.add(marzo3d);
		     String[] marzo4a=res.getStringArray(R.array.actividadesmarzo9froebel);
		     String[] marzo4b=res.getStringArray(R.array.actividadesmarzo9casaazul);
		  
		     
		     String[] marzo4c=res.getStringArray(R.array.actividadesmarzo9pavmultiusos);
		     Am4.add(marzo4a);
		     Am4.add(marzo4b);
		     Am4.add(marzo4c);
		     String[] marzo5a=res.getStringArray(R.array.actividadesmarzo15froebel);
		     String[] marzo5b=res.getStringArray(R.array.actividadesmarzo15casaazul);
		     String[] marzo5c=res.getStringArray(R.array.actividadesmarzo15diantpavmunicipal);
		     String[] marzo5d=res.getStringArray(R.array.actividadesmarzo15localmusica);
		     String[] marzo5e=res.getStringArray(R.array.actividadesmarzo15pavmunicipal);
		     Am5.add(marzo5a);
		     Am5.add(marzo5b);
		     Am5.add(marzo5c);
		     Am5.add(marzo5d);
		     Am5.add(marzo5e);
		     String[] marzo6a=res.getStringArray(R.array.actividadesmarzo16froebel);
		     String[] marzo6b=res.getStringArray(R.array.actividadesmarzo16casaazul);
		     String[] marzo6c=res.getStringArray(R.array.actividadesmarzo16CEIPmanuel);
		     String[] marzo6d=res.getStringArray(R.array.actividadesmarzo16pavmultiusos);
		     Am6.add(marzo6a);
		     Am6.add(marzo6b);
		     Am6.add(marzo6c);
		     Am6.add(marzo6d);
		     String[] marzo7a=res.getStringArray(R.array.actividadesmarzo22froebel);
		     String[] marzo7b=res.getStringArray(R.array.actividadesmarzo22casaazul);
		     String[] marzo7c=res.getStringArray(R.array.actividadesmarzo22localmusica);
		     String[] marzo7d=res.getStringArray(R.array.actividadesmarzo22pavmunicipal);
		     Am7.add(marzo7a);
		     Am7.add(marzo7b);
		     Am7.add(marzo7c);
		     Am7.add(marzo7d);
		     String[] marzo8a=res.getStringArray(R.array.actividadesmarzo23froebel);
		     String[] marzo8b=res.getStringArray(R.array.actividadesmarzo23casaazul);
		     String[] marzo8c=res.getStringArray(R.array.actividadesmarzo23camposh);
		     String[] marzo8d=res.getStringArray(R.array.actividadesmarzo23estacion);
		     Am8.add(marzo8a);
		     Am8.add(marzo8b);
		     Am8.add(marzo8c);
		     Am8.add(marzo8d);
		     String[] marzo28=res.getStringArray(R.array.actividadessanta28);
		     String[] marzo29=res.getStringArray(R.array.actividadessanta29);
		     String[] marzo30=res.getStringArray(R.array.actividadessanta30);
		   
		     Am9.add(marzo28);
		     Am10.add(marzo29);
		     Am11.add(marzo30);
		     
		     String[] marzo1ha=res.getStringArray(R.array.horasmarzo1froebel);
		     String[] marzo1hb=res.getStringArray(R.array.horasmarzo1casaazul);
		     String[] marzo1hc=res.getStringArray(R.array.horasmarzo1prazaou);
		     String[] marzo1hd=res.getStringArray(R.array.horasmarzo1pavmunicipal);
		     String[] marzo1he=res.getStringArray(R.array.horasmarzo1localmusica);
		     Hm1.add(marzo1ha);
		     Hm1.add(marzo1hb);
		     Hm1.add(marzo1hc);
		     Hm1.add(marzo1hd);
		     Hm1.add(marzo1he);
		     String[] marzo2ah=res.getStringArray(R.array.horasmarzo2froebel);
		     String[] marzo2bh=res.getStringArray(R.array.horasmarzo2casaazul);
		     String[] marzo2ch=res.getStringArray(R.array.horasmarzo2camposh);
		     Hm2.add(marzo2ah);
		     Hm2.add(marzo2bh);
		     Hm2.add(marzo2ch);
		     String[] marzo3ah=res.getStringArray(R.array.horasmarzo8froebel);
		     String[] marzo3bh=res.getStringArray(R.array.horasmarzo8casaazul);
		  
		     String[] marzo3ch=res.getStringArray(R.array.horasmarzo8localmusica);
		     String[] marzo3dh=res.getStringArray(R.array.horasmarzo8pavmunicipal);
		     Hm3.add(marzo3ah);
		     Hm3.add(marzo3bh);
		     Hm3.add(marzo3ch);
		     Hm3.add(marzo3dh);
		     String[] marzo4ah=res.getStringArray(R.array.horasmarzo9froebel);
		     String[] marzo4bh=res.getStringArray(R.array.horasmarzo9casaazul);
		  
		     
		     String[] marzo4ch=res.getStringArray(R.array.horasmarzo9pavmultiusos);
		     Hm4.add(marzo4ah);
		     Hm4.add(marzo4bh);
		     Hm4.add(marzo4ch);
		     String[] marzo5ah=res.getStringArray(R.array.horasmarzo15froebel);
		     String[] marzo5bh=res.getStringArray(R.array.horasmarzo15casaazul);
		     String[] marzo5ch=res.getStringArray(R.array.horasmarzo15diantpavmunicipal);
		     String[] marzo5dh=res.getStringArray(R.array.horasmarzo15localmusica);
		     String[] marzo5eh=res.getStringArray(R.array.horasmarzo15pavmunicipal);
		     Hm5.add(marzo5ah);
		     Hm5.add(marzo5bh);
		     Hm5.add(marzo5ch);
		     Hm5.add(marzo5dh);
		     Hm5.add(marzo5eh);
		     String[] marzo6ah=res.getStringArray(R.array.horasmarzo16froebel);
		     String[] marzo6bh=res.getStringArray(R.array.horasmarzo16casaazul);
		     String[] marzo6ch=res.getStringArray(R.array.horasmarzo16CEIPmanuel);
		     String[] marzo6dh=res.getStringArray(R.array.horasmarzo16pavmultiusos);
		     Hm6.add(marzo6ah);
		     Hm6.add(marzo6bh);
		     Hm6.add(marzo6ch);
		     Hm6.add(marzo6dh);
		     String[] marzo7ah=res.getStringArray(R.array.horasmarzo22froebel);
		     String[] marzo7bh=res.getStringArray(R.array.horasmarzo22casaazul);
		     String[] marzo7ch=res.getStringArray(R.array.horasmarzo22localmusica);
		     String[] marzo7dh=res.getStringArray(R.array.horasmarzo22pavmunicipal);
		     Hm7.add(marzo7ah);
		     Hm7.add(marzo7bh);
		     Hm7.add(marzo7ch);
		     Hm7.add(marzo7dh);
		     String[] marzo8ah=res.getStringArray(R.array.horasmarzo23froebel);
		     String[] marzo8bh=res.getStringArray(R.array.horasmarzo23casaazul);
		     String[] marzo8ch=res.getStringArray(R.array.horasmarzo23camposh);
		     String[] marzo8dh=res.getStringArray(R.array.horasmarzo23estacion);
		     Hm8.add(marzo8ah);
		     Hm8.add(marzo8bh);
		     Hm8.add(marzo8ch);
		     Hm8.add(marzo8dh);
		     String[] marzo28h=res.getStringArray(R.array.horassanta28);
		     String[] marzo29h=res.getStringArray(R.array.horassanta29);
		     String[] marzo30h=res.getStringArray(R.array.horassanta30);
		   
		     Hm9.add(marzo28h);
		     Hm10.add(marzo29h);
		     Hm11.add(marzo30h);
		     
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
		 		  
		     
		  //ojo cambiar en todo h por a¡¡¡¡¡
		     
		     
		     
		     
		     
		     
		     switch(dia){
				case 1:
					 for (int i = 0; i <lugmarzo1.length ; i++) {
				         
				         groupData.add(new group(lugmarzo1[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();
///CAMBIAR PARA PONER ICONO y DESCRIPCIONES¡¡¡
				         for (int j = 0; j < Am1.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=8;
				            	
								
				           children.add(new ChildDia((Hm1.get(i)[j]),(Am1.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 2:
					for (int i = 0; i <lugmarzo2.length ; i++) {
				         
				         groupData.add(new group(lugmarzo2[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();
 
				         for (int j = 0; j < Am2.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=8;
				           children.add(new ChildDia((Hm2.get(i)[j]),(Am2.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 3:
					for (int i = 0; i <lugmarzo3.length ; i++) {
				         
				         groupData.add(new group(lugmarzo3[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am3.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=8;;
				           children.add(new ChildDia((Hm3.get(i)[j]),(Am3.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
					
				case 4:
					for (int i = 0; i <lugmarzo4.length ; i++) {
				         
				         groupData.add(new group(lugmarzo4[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am4.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=8;;
				           children.add(new ChildDia((Hm4.get(i)[j]),(Am4.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 5:
					for (int i = 0; i <lugmarzo5.length ; i++) {
				         
				         groupData.add(new group(lugmarzo5[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am5.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=8;;
				           children.add(new ChildDia((Hm5.get(i)[j]),(Am5.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 6:
					for (int i = 0; i <lugmarzo6.length ; i++) {
				         
				         groupData.add(new group(lugmarzo6[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am6.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=8;;
				           children.add(new ChildDia((Hm6.get(i)[j]),(Am6.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 7:
					for (int i = 0; i <lugmarzo7.length ; i++) {
				         
				         groupData.add(new group(lugmarzo7[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am7.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=8;;
				           children.add(new ChildDia((Hm7.get(i)[j]),(Am7.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
					
				case 8:
					for (int i = 0; i <lugmarzo8.length ; i++) {
				         
				         groupData.add(new group(lugmarzo8[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am8.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=8;;
				           children.add(new ChildDia((Hm8.get(i)[j]),(Am8.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 9:
					for (int i = 0; i <lugmarzo9.length ; i++) {
				         
				         groupData.add(new group(lugmarzo9[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am9.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=8;;
				           children.add(new ChildDia((Hm9.get(i)[j]),(Am9.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 10:
					for (int i = 0; i <lugmarzo10.length ; i++) {
				         
				         groupData.add(new group(lugmarzo10[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am10.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=8;;
				           children.add(new ChildDia((Hm10.get(i)[j]),(Am10.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 11:
					for (int i = 0; i <lugmarzo11.length ; i++) {
				         
				         groupData.add(new group(lugmarzo11[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am11.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=8;;
				           children.add(new ChildDia((Hm11.get(i)[j]),(Am11.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
					
				}
		     
		     
		     
		     
		     
			 Exelistadapter2 exampleAdapter= new Exelistadapter2(this,groupData,childData);
				return exampleAdapter;
			
			
			
		}
		public int EligeImagenM(int dia,int a,int b){
			int day=dia;
			int i=a;
			int j=b;
			int image=0;
			switch(day){
			
			case 1: switch(i){
					case 0:if(j==4)image=3;else image=8;
					break;
					case 1:if(j==1)image=0;else image=8;
					break;
					case 3: image=1;;
					break;
					default: image=8;
					break;
					}
			break;	
			case 2: switch(i){
					case 1:if(j==0)image=1; else if(j==3)image=2; else image=8;
					break;
					default: image=8;
					break;
			}
			break;
			case 3: switch(i){
					case 0: if(j==4)image=3; else image=8;
					break;
					case 1: if(j==0)image=0; else if(j==2)image=2; else image=8;
					break;
					case 3:image=1;
					break;
					default: image=8;
					break;
			}
			break;
			case 4: switch(i){
					case 0:if(j==0) image=0;else image=8;
					break;
					case 1: if(j==0)image=0; else if(j==3)image=2; else image=8;
					break;
					default: image=8;
					break;
			}
			break;
			case 5: switch(i){
					case 0:if(j==4)image=3;else image=8;
					break;
					case 2: image=0;
					break;
					case 4:image=1;
					break;
					default:image=8;
					break;
			
			}
			break;
			case 7: switch(i){
					case 0: if(j==3)image=3; else image=8;
					break;
					case 1: if (j==0)image=0; else if(j==2)image=2; else image=8;
					break;
					case 3: image=1;
					break;
					default:image=8;
					break;
										
			}
			break;
			case 8: switch(i){
					case 0: if(j==0||j==2)image=0; else image=8;
					break;
					case 1: if(j==0)image=0; else if(j==2)image=2;else image=8;
							break;
					case 3: image=7;
					break;
					default:image=8;
					break;
			}
			break;
			case 9:case 11:if(j==1)image=0; else image=8;
			break;
			case 10: if(j==0||j==2)image=0; else if (j==4) image=3; else image=8;
			break;
			default: image=8;
			break;
		
			
			}
			return image;
		}


		Exelistadapter2 rellenaabril(int dia){
			
			   ArrayList<group> groupData = new ArrayList<group>();
			     ArrayList<ArrayList<ChildDia>> childData= new ArrayList<ArrayList<ChildDia>>();
			     Resources res =getResources();
					
			     String[] lugabril1=res.getStringArray(R.array.lugabril5);
			     String[] lugabril2=res.getStringArray(R.array.lugabril6);
			     String[] lugabril3=res.getStringArray(R.array.lugabril12);
			     String[] lugabril4=res.getStringArray(R.array.lugaabril13);
			     String[] lugabril5=res.getStringArray(R.array.lugabril5);
			     String[] lugabril6=res.getStringArray(R.array.lugabril20);
			     String[] lugabril7=res.getStringArray(R.array.lugabril26);
			     String[] lugabril8=res.getStringArray(R.array.lugabril27);
			   
			     
			     ArrayList<String[]> Aa1=new ArrayList<String[]>();
			     ArrayList<String[]> Aa2=new ArrayList<String[]>();
			     ArrayList<String[]> Aa3=new ArrayList<String[]>();
			     ArrayList<String[]> Aa4=new ArrayList<String[]>();
			     ArrayList<String[]> Aa5=new ArrayList<String[]>();
			     ArrayList<String[]> Aa6=new ArrayList<String[]>();
			     ArrayList<String[]> Aa7=new ArrayList<String[]>();
			     ArrayList<String[]> Aa8=new ArrayList<String[]>();
			   
			     ArrayList<String[]> Ha1=new ArrayList<String[]>();
			     ArrayList<String[]> Ha2=new ArrayList<String[]>();
			     ArrayList<String[]> Ha3=new ArrayList<String[]>();
			     ArrayList<String[]> Ha4=new ArrayList<String[]>();
			     ArrayList<String[]> Ha5=new ArrayList<String[]>();
			     ArrayList<String[]> Ha6=new ArrayList<String[]>();
			     ArrayList<String[]> Ha7=new ArrayList<String[]>();
			     ArrayList<String[]> Ha8=new ArrayList<String[]>();
			   
			     String[] abril1a=res.getStringArray(R.array.actividadesabril5froebel);
			     String[] abril1b=res.getStringArray(R.array.actividadesabril5prazastamaria);
			     String[] abril1c=res.getStringArray(R.array.actividadesabril5casaazul);
			     String[] abril1d=res.getStringArray(R.array.actividadesabril5localmusica);
			     Aa1.add(abril1a);
			     Aa1.add(abril1b);
			     Aa1.add(abril1c);
			     Aa1.add(abril1d);
			     String[] abril1ah=res.getStringArray(R.array.horasabril5froebel);
			     String[] abril1bh=res.getStringArray(R.array.horasabril5prazastamaria);
			     String[] abril1ch=res.getStringArray(R.array.horasabril5casaazul);
			     String[] abril1dh=res.getStringArray(R.array.horasabril5localmuscica);
			     Ha1.add(abril1ah);
			     Ha1.add(abril1bh);
			     Ha1.add(abril1ch);
			     Ha1.add(abril1dh);
			     String[] abril2a=res.getStringArray(R.array.actividadesabril6teatro);
			     String[] abril2b=res.getStringArray(R.array.actividadesabril6froebel);
			     String[] abril2c=res.getStringArray(R.array.actividadesabril6pavmultiusos);
			     Aa2.add(abril2a);
			     Aa2.add(abril2b);
			     Aa2.add(abril2c);
			     String[] abril2ah=res.getStringArray(R.array.horasabril6teatro);
			     String[] abril2bh=res.getStringArray(R.array.horasabril6froebel);
			     String[] abril2ch=res.getStringArray(R.array.horasabril6pavmultiusos);
			     Ha2.add(abril2ah);
			     Ha2.add(abril2bh);
			     Ha2.add(abril2ch);
			     String[] abril3a=res.getStringArray(R.array.actividadesabril12froebel);
			     String[] abril3b=res.getStringArray(R.array.actividadesabril12prazastamaria);
			     String[] abril3c=res.getStringArray(R.array.actividadesabril12casaazul);
			     String[] abril3d=res.getStringArray(R.array.actividadesabril12prazaperegrina);
			     String[] abril3e=res.getStringArray(R.array.actividadesabril12localmusica);
			     Aa3.add(abril3a);
			     Aa3.add(abril3b);
			     Aa3.add(abril3c);
			     Aa3.add(abril3d);
			     Aa3.add(abril3e);
			     String[] abril3ah=res.getStringArray(R.array.horasabril12froebel);
			     String[] abril3bh=res.getStringArray(R.array.horasabril12prazastamaria);
			     String[] abril3ch=res.getStringArray(R.array.horasabril12casaazul);
			     String[] abril3dh=res.getStringArray(R.array.horasabril12prazaperegrina);
			     String[] abril3eh=res.getStringArray(R.array.horasabril12localmuscica);
			     Ha3.add(abril3ah);
			     Ha3.add(abril3bh);
			     Ha3.add(abril3ch);
			     Ha3.add(abril3dh);
			     Ha3.add(abril3eh);
			     String[] abril4a=res.getStringArray(R.array.actividadesabril13froebel);
			     String[] abril4b=res.getStringArray(R.array.actividadesabril13ceipmanuel);
			     String[] abril4c=res.getStringArray(R.array.actividadesabril13camposh);
			     String[] abril4d=res.getStringArray(R.array.actividadesabril13localmusica);
			     Aa4.add(abril4a);
			     Aa4.add(abril4b);
			     Aa4.add(abril4c);
			     Aa4.add(abril4d);
			     String[] abril4ah=res.getStringArray(R.array.horasabril13froebel);
			     String[] abril4bh=res.getStringArray(R.array.horasabril13ceipmanuel);
			     String[] abril4ch=res.getStringArray(R.array.horasabril13camposh);
			     String[] abril4dh=res.getStringArray(R.array.horasabril13localmusica);
			     Ha4.add(abril4ah);
			     Ha4.add(abril4bh);
			     Ha4.add(abril4ch);
			     Ha4.add(abril4dh);
			     String[] abril5a=res.getStringArray(R.array.actividadesabril19froebel);
			     String[] abril5b=res.getStringArray(R.array.actividadesabril19prazastamaria);
			     String[] abril5c=res.getStringArray(R.array.actividadesabril19casaazul);
			     String[] abril5d=res.getStringArray(R.array.actividadesabril19localmusica);
			     Aa5.add(abril5a);
			     Aa5.add(abril5b);
			     Aa5.add(abril5c);
			     Aa5.add(abril5d);
			     String[] abril5ah=res.getStringArray(R.array.horasabril19froebel);
			     String[] abril5bh=res.getStringArray(R.array.horasabril19prazastamaria);
			     String[] abril5ch=res.getStringArray(R.array.horasabril19casaazul);
			     String[] abril5dh=res.getStringArray(R.array.horasabril19localmusica);
			     Ha5.add(abril5ah);
			     Ha5.add(abril5bh);
			     Ha5.add(abril5ch);
			     Ha5.add(abril5dh);
			  
			     String[] abril6a=res.getStringArray(R.array.actividadesabril20froebel);
			     String[] abril6b=res.getStringArray(R.array.actividadesabril20ceipmanuel);
			     String[] abril6c=res.getStringArray(R.array.actividadesabril20pavmultiusos);
			     String[] abril6d=res.getStringArray(R.array.actividadesabril20localmusica);
			    
			     Aa6.add(abril6a);
			     Aa6.add(abril6b);
			     Aa6.add(abril6c);
			     Aa6.add(abril6d);
			    
			     String[] abril6ah=res.getStringArray(R.array.horasabril20froebel);
			     String[] abril6bh=res.getStringArray(R.array.horasabril20ceipmanuel);
			     String[] abril6ch=res.getStringArray(R.array.horasabril20pavmultiusos);
			     String[] abril6dh=res.getStringArray(R.array.horasabril20localmusica);
			   
			     Ha6.add(abril6ah);
			     Ha6.add(abril6bh);
			     Ha6.add(abril6ch);
			     Ha6.add(abril6dh);
			     
			     String[] abril7es=res.getStringArray(R.array.Resolucion);
			     String[] abril7a=res.getStringArray(R.array.actividadesabril26froebel);
			     String[] abril7b=res.getStringArray(R.array.actividadesabril26prazastamaria);
			     String[] abril7c=res.getStringArray(R.array.actividadesabril26casaazul);
			     String[] abril7d=res.getStringArray(R.array.actividadesabril26localmusica);
			     Aa7.add(abril7es);
			     Aa7.add(abril7a);
			     Aa7.add(abril7b);
			     Aa7.add(abril7c);
			     Aa7.add(abril7d);
			     String[] abril7esh={""};
			     String[] abril7ah=res.getStringArray(R.array.horasabril26froebel);
			     String[] abril7bh=res.getStringArray(R.array.horasabril26prazastamaria);
			     String[] abril7ch=res.getStringArray(R.array.horasabril26casaazul);
			     String[] abril7dh=res.getStringArray(R.array.horasabril26localmusica);
			     Ha7.add(abril7esh);
			     Ha7.add(abril7ah);
			     Ha7.add(abril7bh);
			     Ha7.add(abril7ch);
			     Ha7.add(abril7dh);
			
			     String[] abril8a=res.getStringArray(R.array.actividadesabril27alameda);
			     String[] abril8b=res.getStringArray(R.array.actividadesabril27casaazul);
			     String[] abril8c=res.getStringArray(R.array.actividadesabril27pavmultiusos);
			     String[] abril8d=res.getStringArray(R.array.actividadesabril27localmusica);
			     Aa8.add(abril8a);
			     Aa8.add(abril8b);
			     Aa8.add(abril8c);
			     Aa8.add(abril8d);
			     String[] abril8ah=res.getStringArray(R.array.horasabril27alameda);
			     String[] abril8bh=res.getStringArray(R.array.horasabril27casaazul);
			     String[] abril8ch=res.getStringArray(R.array.horasabril27pavmultiusos);
			     String[] abril8dh=res.getStringArray(R.array.horasabril27localmusica);
			     Ha8.add(abril8ah);
			     Ha8.add(abril8bh);
			     Ha8.add(abril8ch);
			     Ha8.add(abril8dh);

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
			     switch(dia){
					case 1:
						 for (int i = 0; i <lugabril1.length ; i++) {
					         
					         groupData.add(new group(lugabril1[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa1.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=8;
					            	
					           children.add(new ChildDia((Ha1.get(i)[j]),(Aa1.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 2:
						for (int i = 0; i <lugabril2.length ; i++) {
					         
					         groupData.add(new group(lugabril2[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa2.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=8;
					            	
					           children.add(new ChildDia((Ha2.get(i)[j]),(Aa2.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 3:
						for (int i = 0; i <lugabril3.length ; i++) {
					         
					         groupData.add(new group(lugabril3[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa3.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=8;
					            	
					           children.add(new ChildDia((Ha3.get(i)[j]),(Aa3.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
						
					case 4:
						for (int i = 0; i <lugabril4.length ; i++) {
					         
					         groupData.add(new group(lugabril4[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa4.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=8;
					            	
					           children.add(new ChildDia((Ha4.get(i)[j]),(Aa4.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 5:
						for (int i = 0; i <lugabril5.length ; i++) {
					         
					         groupData.add(new group(lugabril5[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa5.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=8;
					            	
					           children.add(new ChildDia((Ha5.get(i)[j]),(Aa5.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 6:
						for (int i = 0; i <lugabril6.length ; i++) {
					         
					         groupData.add(new group(lugabril6[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa6.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=8;
					            	
					           children.add(new ChildDia((Ha6.get(i)[j]),(Aa6.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 7:
						for (int i = 0; i <lugabril7.length ; i++) {
					         
					         groupData.add(new group(lugabril7[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa7.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=8;
					            	
					           children.add(new ChildDia((Ha7.get(i)[j]),(Aa7.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
						
					case 8:
						for (int i = 0; i <lugabril8.length ; i++) {
					         
					         groupData.add(new group(lugabril8[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa8.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=8;
					            	
					           children.add(new ChildDia((Ha8.get(i)[j]),(Aa8.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
				
					}
			     
			     
			     
			     
			     
				 Exelistadapter2 exampleAdapter= new Exelistadapter2(this,groupData,childData);
					return exampleAdapter;
				
			
		}
		public int EligeImagenA(int dia,int a,int b){
			int day=dia;
			int i=a;
			int j=b;
			int image=0;
			switch(day){
			
			case 1: switch(i){
					case 0:if(j==2)image=0;else image=8;
					break;
					case 1:image=4;
					break;
					case 2:if(j==1)image=0;else if(j==2) image=1;else image=8;
					break;
					default: image=8;
					break;
					}
			break;	
			case 2: switch(i){
					case 0:if(j==0)image=0; else image=8;
					break;
					default: image=8;
					break;
			}
			break;
			case 3: switch(i){
				case 0:if(j==2)image=0;else image=8;
					break;
					case 1:image=4;
					break;
					case 2:if(j==2)image=0;else if(j==3) image=1;else image=8;
					break;
					default: image=8;
					break;
			}
			break;
			case 4: switch(i){
					case 0: if(j==4)image=0;else image=8;
					break;
					case 3: image=6;
					break;
					default: image=8;
					break;
			}
			break;
			case 5: switch(i){
			case 0:if(j==2)image=0;else image=8;
					break;
					case 1:image=4;
					break;
					case 2:if(j==1) image=0;else if(j==2)image=1;else image=8;
					break;
					case 3:if(j==1)image=6;else image=8;
					break;
					default:image=8;
					break;
			
			}
			break;
			case 6: switch(i){
					case 3:image=6;
					break;
					default:image=8;
					break;
			}
			break;
			case 7: switch(i){
					
					case 2:image=4;
					break;
					case 3: if(j==1) image=0;else if(j==2)image=1;else image=8;
					break;
					default:image=8;
					break;
										
			}
			break;
			case 8: switch(i){
					case 0:  image=1;
					break;
					case 3: image=6;
					break;
					default:image=8;
					break;
			}
			
			break;
			default: image=8;
			break;
		
			
			}
			return image;
		}


		Exelistadapter2 rellenamaio(int dia){
			
			
			   ArrayList<group> groupData = new ArrayList<group>();
			     ArrayList<ArrayList<ChildDia>> childData= new ArrayList<ArrayList<ChildDia>>();
			     Resources res =getResources();
			
			  String[] lugmaio1=res.getStringArray(R.array.lugabril5);
			     String[] lugmaio2=res.getStringArray(R.array.lugmaio4);
			     String[] lugmaio3=res.getStringArray(R.array.lugabril5);
			     String[] lugmaio4=res.getStringArray(R.array.lugmaio11);
			     String[] lugmaio5=res.getStringArray(R.array.lugmaio17);
			     String[] lugmaio6=res.getStringArray(R.array.lugmaio18);
			   
			   
			     
			     ArrayList<String[]> Ama1=new ArrayList<String[]>();
			     ArrayList<String[]> Ama2=new ArrayList<String[]>();
			     ArrayList<String[]> Ama3=new ArrayList<String[]>();
			     ArrayList<String[]> Ama4=new ArrayList<String[]>();
			     ArrayList<String[]> Ama5=new ArrayList<String[]>();
			     ArrayList<String[]> Ama6=new ArrayList<String[]>();
			  
			   
			     ArrayList<String[]> Hma1=new ArrayList<String[]>();
			     ArrayList<String[]> Hma2=new ArrayList<String[]>();
			     ArrayList<String[]> Hma3=new ArrayList<String[]>();
			     ArrayList<String[]> Hma4=new ArrayList<String[]>();
			     ArrayList<String[]> Hma5=new ArrayList<String[]>();
			     ArrayList<String[]> Hma6=new ArrayList<String[]>();
			
		
			     String[] maio1a=res.getStringArray(R.array.actividadesmaio3froebel);
			     String[] maio1b=res.getStringArray(R.array.actividadesmaio3prazastamaria);
			     String[] maio1c=res.getStringArray(R.array.actividadesmaio3casaazul);
			     String[] maio1d=res.getStringArray(R.array.actividadesmaio3localmusica);
			     Ama1.add(maio1a);
			     Ama1.add(maio1b);
			     Ama1.add(maio1c);
			     Ama1.add(maio1d);
			     String[] maio1ah=res.getStringArray(R.array.horasmaio3froebel);
			     String[] maio1bh=res.getStringArray(R.array.horasmaio3prazastamaria);
			     String[] maio1ch=res.getStringArray(R.array.horasmaio3casaazul);
			     String[] maio1dh=res.getStringArray(R.array.horasmaio3localmusica);
			     Hma1.add(maio1ah);
			     Hma1.add(maio1bh);
			     Hma1.add(maio1ch);
			     Hma1.add(maio1dh);
			     String[] maio2es=res.getStringArray(R.array.Resolucion2);
			     String[] maio2a=res.getStringArray(R.array.actividadesmaio4ceipmanuel);
			     String[] maio2b=res.getStringArray(R.array.actividadesmaio4pavmultiusos);
			     String[] maio2c=res.getStringArray(R.array.actividadesmaio4camposh);
			     String[] maio2d=res.getStringArray(R.array.actividadesmaio4localmusica);
			     Ama2.add(maio2es);
			     Ama2.add(maio2a);
			     Ama2.add(maio2b);
			     Ama2.add(maio2c);
			     Ama2.add(maio2d);
			     String[]maio2esh={""};
			     String[] maio2ah=res.getStringArray(R.array.horasmaio4ceipmanuel);
			     String[] maio2bh=res.getStringArray(R.array.horasmaio4pavmultiusos);
			     String[] maio2ch=res.getStringArray(R.array.horasmaio4camposh);
			     String[] maio2dh=res.getStringArray(R.array.horasmaio4localmusica);
			     Hma2.add(maio2esh);
			     Hma2.add(maio2ah);
			     Hma2.add(maio2bh);
			     Hma2.add(maio2ch);
			     Hma2.add(maio2dh);
			     String[] maio3a=res.getStringArray(R.array.actividadesmaio10froebel);
			     String[] maio3b=res.getStringArray(R.array.actividadesmaio10prazastamaria);
			     String[] maio3c=res.getStringArray(R.array.actividadesmaio10casaazul);
			     String[] maio3d=res.getStringArray(R.array.actividadesmaio10localmusica);
			     Ama3.add(maio3a);
			     Ama3.add(maio3b);
			     Ama3.add(maio3c);
			     Ama3.add(maio3d);
			     String[] maio3ah=res.getStringArray(R.array.horasmaio10froebel);
			     String[] maio3bh=res.getStringArray(R.array.horasmaio10prazastamaria);
			     String[] maio3ch=res.getStringArray(R.array.horasmaio10casaazul);
			     String[] maio3dh=res.getStringArray(R.array.horasmaio10localmusica);
			     Hma3.add(maio3ah);
			     Hma3.add(maio3bh);
			     Hma3.add(maio3ch);
			     Hma3.add(maio3dh);
			     String[] maio4a=res.getStringArray(R.array.actividadesmaio11froebel);
			     String[] maio4b=res.getStringArray(R.array.actividadesmaio11estacion);
			     String[] maio4c=res.getStringArray(R.array.actividadesmaio11pavmultiusos);
			     
			     Ama4.add(maio4a);
			     Ama4.add(maio4b);
			     Ama4.add(maio4c);
			     
			     String[] maio4ah=res.getStringArray(R.array.horasmaio11froebel);
			     String[] maio4bh=res.getStringArray(R.array.horasmaio11estacion);
			     String[] maio4ch=res.getStringArray(R.array.horasmaio11pavmultiusos);
			     
			     Hma4.add(maio4ah);
			     Hma4.add(maio4bh);
			     Hma4.add(maio4ch);
			    
			     String[] maio5a=res.getStringArray(R.array.actividadesmaio17pavmunicipal);
			     String[] maio5b=res.getStringArray(R.array.actividadesmaio17froebel);
			     String[] maio6a=res.getStringArray(R.array.actividadesmaio18);
			 
			     Ama5.add(maio5a);
			     Ama5.add(maio5b);
			     Ama6.add(maio6a);
			   
			     String[] maio5ah=res.getStringArray(R.array.horasmaio17pavmunicipal);
			     String[] maio5bh=res.getStringArray(R.array.horasmaio17froebel);
			     String[] maio6ah=res.getStringArray(R.array.horasmaio18);
			 
			     Hma5.add(maio5ah);
			     Hma5.add(maio5bh);
			     Hma6.add(maio6ah);
			     
			 Exelistadapter2 exampleAdapter= new Exelistadapter2(this,groupData,childData);
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
				
				
				  switch(dia){
					case 1:
						 for (int i = 0; i <lugmaio1.length ; i++) {
					         
					         groupData.add(new group(lugmaio1[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Ama1.get(i).length; j++) {
					        	 int imagen1=EligeImagenMy(dia,i,j); 
					            	int imagen2=8;
					            	
					           children.add(new ChildDia((Hma1.get(i)[j]),(Ama1.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 2:
						for (int i = 0; i <lugmaio2.length ; i++) {
					         
					         groupData.add(new group(lugmaio2[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Ama2.get(i).length; j++) {
					        	 int imagen1=EligeImagenMy(dia,i,j); 
					            	int imagen2=8;
					           children.add(new ChildDia((Hma2.get(i)[j]),(Ama2.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 3:
						for (int i = 0; i <lugmaio3.length ; i++) {
					         
					         groupData.add(new group(lugmaio3[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Ama3.get(i).length; j++) {
					        	 int imagen1=EligeImagenMy(dia,i,j); 
					            	int imagen2=8;
					           children.add(new ChildDia((Hma3.get(i)[j]),(Ama3.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
						
					case 4:
						for (int i = 0; i <lugmaio4.length ; i++) {
					         
					         groupData.add(new group(lugmaio4[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Ama4.get(i).length; j++) {
					        	 int imagen1=EligeImagenMy(dia,i,j); 
					            	int imagen2=8;
					           children.add(new ChildDia((Hma4.get(i)[j]),(Ama4.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 5:
						for (int i = 0; i <lugmaio5.length ; i++) {
					         
					         groupData.add(new group(lugmaio5[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Ama5.get(i).length; j++) {
					        	 int imagen1=EligeImagenMy(dia,i,j); 
					            	int imagen2=8;
					           children.add(new ChildDia((Hma5.get(i)[j]),(Ama5.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 6:
						for (int i = 0; i <lugmaio6.length ; i++) {
					         
					         groupData.add(new group(lugmaio6[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Ama6.get(i).length; j++) {
					        	 int imagen1=EligeImagenMy(dia,i,j); 
					            	int imagen2=8;
					           children.add(new ChildDia((Hma6.get(i)[j]),(Ama6.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
				
					}
			     
				  return exampleAdapter;	
			
		}
		
		public int EligeImagenMy(int dia,int a,int b){
			int day=dia;
			int i=a;
			int j=b;
			int image=0;
			switch(day){
			
			case 1: switch(i){
					
				
					case 1:image=4;
					break;
					case 2:if(j==2)image=1;else image=8;
					break;
					case 3:if(j==0)image=6;else image=8;
					break;
					default: image=8;
					break;
					}
			break;	
			case 2: switch(i){
					case 4:image=6;
					break;
					default: image=8;
					break;
			}
			break;
			
			
			case 3: switch(i){
					case 1: image=4;
					break;
					case 2: if(j==1)image=1; else image=8;
					break;
					case 3:image=6;
					break;
					default: image=8;
					break;
			}
			break;
			case 4: switch(i){
					case 1: image=7;
					break;
					case 2:image=0;
					break;
					default:image=8;
					break;
			
			}
			break;
			case 5: if((i==0)&&(j==0))image=0; else image=8;
			break;
			default: image=8;
			break;
		
			
			}
			return image;
		}
		

	    @Override
		public boolean onChildClick(ExpandableListView parent,View v,int groupPosition,int childPosition,long id) 
	    {
	    	  Bundle datos = this.getIntent().getExtras();
	    	  int mes = datos.getInt("variable_integer");
	    	  int dia= datos.getInt("variable_integer1");
	    	  String[] mensaje={""};
	    	  
	    	  switch(mes){
  			case 1:
  				mensaje= creamensaje1(groupPosition,childPosition,dia);
  			break;
  			case 2:
  				mensaje= creamensaje2(groupPosition,childPosition,dia);
  			break;
  			case 3:
  				mensaje= creamensaje3(groupPosition,childPosition,dia);
  			break;
  			
  			case 4:
  				 mensaje= creamensaje4(groupPosition,childPosition,dia);
  			break;
  		}
  			
	    
	    	
	    	Dialog d=crearDialogoAlerta(groupPosition,childPosition,mensaje);
	    	d.show();
	    	
	         return false;
	    }

	    
	    
	private String[] creamensaje4(int posg, int posc, int dia)
	{
	   String[] mensaje = {"","",""};
		 
	  
	   Resources res =getResources();
		
	    String[] descfis=res.getStringArray(R.array.descfisicas);	
		String[] desccul=res.getStringArray(R.array.descculturais);
		String[] descfor=res.getStringArray(R.array.descformativas);
		String[] desclud=res.getStringArray(R.array.descludicas);
		String[] descesp=res.getStringArray(R.array.descespeciais);
	   ArrayList<String[]> Af1= new ArrayList<String[]>();
	   ArrayList<String[]> df1= new ArrayList<String[]>();

	    
	    
	     
	 
	    
	     
	   
	    
	     
	  
	 
	
	   
	   
	   switch(dia){
		   case 1:
			   String[]des1={descfis[3], descfor[25],desclud[21],desclud[7]};
			   String[]des2={descfis[7]};
			   String[]des3={descfor[0],descfis[1],descfor[9]};
			   String[]des4={descfor[6],descfor[18],"Demostración de manexo deste dous instrumentos"};
			   String[] maio1a=res.getStringArray(R.array.actividadesmaio3froebel);
			     String[] maio1b=res.getStringArray(R.array.actividadesmaio3prazastamaria);
			     String[] maio1c=res.getStringArray(R.array.actividadesmaio3casaazul);
			     String[] maio1d=res.getStringArray(R.array.actividadesmaio3localmusica);
			   Af1.add(maio1a);
			   Af1.add(maio1b);
			   Af1.add(maio1c);
			   Af1.add(maio1d);
			   df1.add(des1);
			   df1.add(des2);
			   df1.add(des3);
			   df1.add(des4);
			   mensaje[0]=Af1.get(posg)[posc];
			   mensaje[1]=df1.get(posg)[posc];
	   break;
	  
	case 2:
	    String[] maio2es=res.getStringArray(R.array.Resolucion2);
	     String[] maio2a=res.getStringArray(R.array.actividadesmaio4ceipmanuel);
	     String[] maio2b=res.getStringArray(R.array.actividadesmaio4pavmultiusos);
	     String[] maio2c=res.getStringArray(R.array.actividadesmaio4camposh);
	     String[] maio2d=res.getStringArray(R.array.actividadesmaio4localmusica);
		   String[]des11={descesp[0]};
		   String[]des21={desccul[3]};
		   String[]des31={descfis[10],descfis[0]};
		   String[]des41={descfis[6]};
		   String[]des51={descfor[19]};
		   Af1.add(maio2es);
		   Af1.add(maio2a);
		   Af1.add(maio2b);
		   Af1.add(maio2c);
		   Af1.add(maio2d);
		  
		   df1.add(des11);
		   df1.add(des21);
		   df1.add(des31);
		   df1.add(des41);
		   df1.add(des51);
		   
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 3:

	     String[] maio3a=res.getStringArray(R.array.actividadesmaio10froebel);
	     String[] maio3b=res.getStringArray(R.array.actividadesmaio10prazastamaria);
	     String[] maio3c=res.getStringArray(R.array.actividadesmaio10casaazul);
	     String[] maio3d=res.getStringArray(R.array.actividadesmaio10localmusica);
	   
		   String[]des13={descfor[25],descfis[13],descfis[14],desclud[21],desclud[1]};
		   String[]des23={descfis[7]};
		   String[]des33={descfor[0],descfor[9]};
		   String[]des43={descfor[6]};
		 
		   Af1.add(maio3a);
		   Af1.add(maio3b);
		   Af1.add(maio3c);
		   Af1.add(maio3d);
		  
		   df1.add(des13);
		   df1.add(des23);
		   df1.add(des33);
		   df1.add(des43);
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 4:
		 String[] maio4a=res.getStringArray(R.array.actividadesmaio11froebel);
	     String[] maio4b=res.getStringArray(R.array.actividadesmaio11estacion);
	     String[] maio4c=res.getStringArray(R.array.actividadesmaio11pavmultiusos);
		   String[]des14={desclud[12],desclud[7],descesp[6],desclud[10]};
		   String[]des24={descfor[28]};
		   String[]des34={descfis[12]};
	
		
		   Af1.add(maio4a);
		   Af1.add(maio4b);
		   Af1.add(maio4c);
		
		  
		   df1.add(des14);
		   df1.add(des24);
		   df1.add(des34);
	
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 5:
		String[] maio5a=res.getStringArray(R.array.actividadesmaio17pavmunicipal);
	     String[] maio5b=res.getStringArray(R.array.actividadesmaio17froebel);
		   String[]des15={descfis[4]};
		   String[]des25={descfor[25],descfis[13],descfis[14],desclud[21]};
		   
		  
		   Af1.add(maio5a);
		   Af1.add(maio5b);
		   
		  
		   df1.add(des15);
		   df1.add(des25);
		   
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 6:
		   String[] maio6a=res.getStringArray(R.array.actividadesmaio18);
			 
		   
		   String[]des16={"Fin das Xornadas de Noites Abertas"};
		 
	
		   Af1.add(maio6a);
		  
		  
		   df1.add(des16);
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
		default: mensaje[0]="";
		   mensaje[1]="";
			
	   }
	 
	
	   
	   
	
  

	   
	
	
		
		
		
		return mensaje; 
	}

	    
	private String[] creamensaje3(int posg, int posc, int dia)
	{
	   String[] mensaje = {"","",""};
		 
	  
	   Resources res =getResources();
		
	   
	  
	   
	    
	 
	     
	    
	   
	    
	    
	     
	  
	    
	    
	  
	     
	    
	
	     String[] descfis=res.getStringArray(R.array.descfisicas);	
			String[] desccul=res.getStringArray(R.array.descculturais);
			String[] descfor=res.getStringArray(R.array.descformativas);
			String[] desclud=res.getStringArray(R.array.descludicas);
			String[] descesp=res.getStringArray(R.array.descespeciais);
	     ArrayList<String[]> Af1= new ArrayList<String[]>();
		   ArrayList<String[]> df1= new ArrayList<String[]>();
	  
	   
	   
	   switch(dia){
		   case 1:
			   String[]des1={descfis[3],descfor[11],descfor[10],desclud[1]};
			   String[]des2={descfis[7]};
			   String[]des3={descfor[3],descfor[14],descfor[9]};
			   String[]des4={descfor[5],descfor[18],descfor[23],desccul[4]};
			   String[] abril1a=res.getStringArray(R.array.actividadesabril5froebel);
			   String[] abril1b=res.getStringArray(R.array.actividadesabril5prazastamaria);
			   String[] abril1c=res.getStringArray(R.array.actividadesabril5casaazul);
			   String[] abril1d=res.getStringArray(R.array.actividadesabril5localmusica);
			   Af1.add(abril1a);
			   Af1.add(abril1b);
			   Af1.add(abril1c);
			   Af1.add(abril1d);
			   df1.add(des1);
			   df1.add(des2);
			   df1.add(des3);
			   df1.add(des4);
			   mensaje[0]=Af1.get(posg)[posc];
			   mensaje[1]=df1.get(posg)[posc];
	   break;
	  
	case 2:
		 String[] abril2a=res.getStringArray(R.array.actividadesabril6teatro);
	     String[] abril2b=res.getStringArray(R.array.actividadesabril6froebel);
	     String[] abril2c=res.getStringArray(R.array.actividadesabril6pavmultiusos);
		   String[]des11={desccul[6],desccul[10],desccul[10]};
		   String[]des21={desclud[5],desclud[3],desclud[8]};
		   String[]des31={descfis[5]};
	
		   Af1.add(abril2a);
		   Af1.add(abril2b);
		   Af1.add(abril2c);
	
		  
		   df1.add(des11);
		   df1.add(des21);
		   df1.add(des31);

		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 3:
		String[] abril3a=res.getStringArray(R.array.actividadesabril12froebel);
	     String[] abril3b=res.getStringArray(R.array.actividadesabril12prazastamaria);
	     String[] abril3c=res.getStringArray(R.array.actividadesabril12casaazul);
	     String[] abril3d=res.getStringArray(R.array.actividadesabril12prazaperegrina);
	     String[] abril3e=res.getStringArray(R.array.actividadesabril12localmusica);
		   String[]des13={descfis[3],descfor[11],descfor[10],desclud[1]};
		   String[]des23={descfis[7]};
		   String[]des33={descfis[1],descesp[13],descfor[14],descfor[9]};
		   String[]des43={descesp[4]};
		   String[]des53={descfor[18],descfor[23],desccul[4]};
			
		   
	
		   Af1.add(abril3a);
		   Af1.add(abril3b);
		   Af1.add(abril3c);
		   Af1.add(abril3d);
		   Af1.add(abril3e);
	
		  
		   df1.add(des13);
		   df1.add(des23);
		   df1.add(des33);
		   df1.add(des43);
		   df1.add(des53);

		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 4:
		  String[] abril4a=res.getStringArray(R.array.actividadesabril13froebel);
		     String[] abril4b=res.getStringArray(R.array.actividadesabril13ceipmanuel);
		     String[] abril4c=res.getStringArray(R.array.actividadesabril13camposh);
		     String[] abril4d=res.getStringArray(R.array.actividadesabril13localmusica);
		   String[]des14={desclud[4],desclud[12],descfis[11],desccul[2],desccul[12],desclud[8]};
		   String[]des24={desccul[3]};
		   String[]des34={descfis[6]};
		   String[]des44={descfor[19],descfor[27]};
	
		   Af1.add(abril4a);
		   Af1.add(abril4b);
		   Af1.add(abril4c);
		   Af1.add(abril4d);
	
		  
		   df1.add(des14);
		   df1.add(des24);
		   df1.add(des34);
		   df1.add(des44);

		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 5:
		 String[] abril5a=res.getStringArray(R.array.actividadesabril19froebel);
	     String[] abril5b=res.getStringArray(R.array.actividadesabril19prazastamaria);
	     String[] abril5c=res.getStringArray(R.array.actividadesabril19casaazul);
	     String[] abril5d=res.getStringArray(R.array.actividadesabril19localmusica);
	
		   String[]des15={descfis[3],descfor[16],descfor[10],descfor[12]};
		   String[]des25={descfis[7]};
		   String[]des35={descfis[1],descfor[14],descfor[9],desclud[14]};
		   String[]des45={descfor[18],descfor[6],descfor[23], desccul[4]};
			
	
			
	
		   Af1.add(abril5a);
		   Af1.add(abril5b);
		   Af1.add(abril5c);
		   Af1.add(abril5d);
		
	
		  
		   df1.add(des15);
		   df1.add(des25);
		   df1.add(des35);
		   df1.add(des45);

		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
		
	case 6:
		 String[] abril6a=res.getStringArray(R.array.actividadesabril20froebel);
	     String[] abril6b=res.getStringArray(R.array.actividadesabril20ceipmanuel);
	     String[] abril6c=res.getStringArray(R.array.actividadesabril20pavmultiusos);
	     String[] abril6d=res.getStringArray(R.array.actividadesabril20localmusica);
	 
		   String[]des16={desclud[4],desclud[20],desclud[0]};
		   String[]des26={desccul[3]};
		   String[]des36={descfis[10],descfis[0]};
		   String[]des46={descfor[19],descfor[27]};
	
		   Af1.add(abril6a);
		   Af1.add(abril6b);
		   Af1.add(abril6c);
		   Af1.add(abril6d);
	
		  
		   df1.add(des16);
		   df1.add(des26);
		   df1.add(des36);
		   df1.add(des46);

		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 7:
		 String[] abril7es=res.getStringArray(R.array.Resolucion);
	     String[] abril7a=res.getStringArray(R.array.actividadesabril26froebel);
	     String[] abril7b=res.getStringArray(R.array.actividadesabril26prazastamaria);
	     String[] abril7c=res.getStringArray(R.array.actividadesabril26casaazul);
	     String[] abril7d=res.getStringArray(R.array.actividadesabril26localmusica);
	    
		   String[]des17={descesp[0]};
		   String[]des27={descfis[3],descfor[25],desclud[1]};
		   String[]des37={descfis[7]};
		   String[]des47={descfis[1],descfor[14],descfor[9],desclud[14]};
		   String[]des57={descfor[18],descfor[23],desccul[4]};
		
		   Af1.add(abril7es);
		   Af1.add(abril7a);
		   Af1.add(abril7b);
		   Af1.add(abril7c);
		   Af1.add(abril7d);
		  
		   df1.add(des17);
		   df1.add(des27);
		   df1.add(des37);
		   df1.add(des47);
		   df1.add(des57);

		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 8:

	     String[] abril8a=res.getStringArray(R.array.actividadesabril27alameda);
	     String[] abril8b=res.getStringArray(R.array.actividadesabril27casaazul);
	     String[] abril8c=res.getStringArray(R.array.actividadesabril27pavmultiusos);
	     String[] abril8d=res.getStringArray(R.array.actividadesabril27localmusica);
	    
		   String[]des18={desccul[1]};
		   String[]des28={descesp[10],desclud[9],descesp[1]};
		   String[]des38={descfis[5]};
		   String[]des48={descfor[18],descfor[27]};
			
	
		   Af1.add(abril8a);
		   Af1.add(abril8b);
		   Af1.add(abril8c);
		   Af1.add(abril8d);
	
		  
		   df1.add(des18);
		   df1.add(des28);
		   df1.add(des38);
		   df1.add(des48);

		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
		default: mensaje[0]="";
		   mensaje[1]="";
		break;	
	   }
	 
	
	   
	   
	
  

	   
	
	
		
		
		
		return mensaje; 
	}

	    
	private String[] creamensaje2(int posg, int posc, int dia)
	{
	   String[] mensaje = {"","",""};
		 
	  
	   Resources res =getResources();
		
	    String[] descfis=res.getStringArray(R.array.descfisicas);	
		String[] desccul=res.getStringArray(R.array.descculturais);
		String[] descfor=res.getStringArray(R.array.descformativas);
		String[] desclud=res.getStringArray(R.array.descludicas);
		String[] descesp=res.getStringArray(R.array.descespeciais);
	   ArrayList<String[]> Af1= new ArrayList<String[]>();
	   ArrayList<String[]> df1= new ArrayList<String[]>();
	      
	   
	   switch(dia){
		   case 1:
			   String[]des1={descfor[21],descfor[2],descfor[17],desclud[11],descfis[8],descfor[12]};
			   String[]des2={descesp[11],descfor[26],descfor[24]};
			   String[]des3={descesp[3]};
			   String[]des4={descfis[2]};
			   String[]des5={descfor[4],descfor[7]};
			   String[] marzo1a=res.getStringArray(R.array.actividadesmarzo1froebel);
			     String[] marzo1b=res.getStringArray(R.array.actividadesmarzo1casaazul);
			     String[] marzo1c=res.getStringArray(R.array.actividadesmarzo1prazaou);
			     String[] marzo1d=res.getStringArray(R.array.actividadesmarzo1pavmunicipal);
			     String[] marzo1e=res.getStringArray(R.array.actividadesmarzo1localmusica);
			   Af1.add(marzo1a);
			   Af1.add(marzo1b);
			   Af1.add(marzo1c);
			   Af1.add(marzo1d);
			   Af1.add(marzo1e);
			   df1.add(des1);
			   df1.add(des2);
			   df1.add(des3);
			   df1.add(des4);
			   df1.add(des5);
			   mensaje[0]=Af1.get(posg)[posc];
			   mensaje[1]=df1.get(posg)[posc];
	   break;
	  
	case 2:
		String[] marzo2a=res.getStringArray(R.array.actividadesmarzo2froeble);
	     String[] marzo2b=res.getStringArray(R.array.actividadesmarzo2casaazul);
	     String[] marzo2c=res.getStringArray(R.array.actividadesmarzo2camposh);
		   String[]des11={desclud[4],descfor[1],desclud[6],desccul[9],desclud[19]};
		   String[]des21={descfis[9],desclud[18],descesp[13],descesp[8]};
		   String[]des31={descfis[6]};
		  
		   Af1.add(marzo2a);
		   Af1.add(marzo2b);
		   Af1.add(marzo2c);
		   
		   df1.add(des11);
		   df1.add(des21);
		   df1.add(des31);
		   
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 3:
		String[] marzo3a=res.getStringArray(R.array.actividadesmarzo8froebel);
	     String[] marzo3b=res.getStringArray(R.array.actividadesmarzo8casaazul);
	  
	     String[] marzo3c=res.getStringArray(R.array.actividadesmarzo8localmusica);
	     String[] marzo3d=res.getStringArray(R.array.actividadesmarzo8pavmunicipal);
		   String[]des111={descfor[22],desclud[13],descfor[2],desclud[11],descfis[8]};
		   String[]des211={descfor[8],desclud[16],descesp[7]};
		   String[]des311={descfor[4],descfor[5],descfor[7]};
		   String[]des411={descfis[2]};
		   Af1.add(marzo3a);
		   Af1.add(marzo3b);
		   Af1.add(marzo3c);
		   Af1.add(marzo3d);
		  
		   df1.add(des111);
		   df1.add(des211);
		   df1.add(des311);
		   df1.add(des411);
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 4:
		  
	     String[] marzo4a=res.getStringArray(R.array.actividadesmarzo9froebel);
	     String[] marzo4b=res.getStringArray(R.array.actividadesmarzo9casaazul);
	  
	     
	     String[] marzo4c=res.getStringArray(R.array.actividadesmarzo9pavmultiusos);
		   String[]des1111={desccul[7],desclud[4],descfor[1],desccul[9],desclud[6],desclud[19]};
		   String[]des2111={descfor[15],desclud[18],descesp[13],descesp[8]};
		  
		   String[]des3111={descfis[10],descfis[0]};
		   Af1.add(marzo4a);
		   Af1.add(marzo4b);
		   Af1.add(marzo4c);
		
		  
		   df1.add(des1111);
		   df1.add(des2111);
		   df1.add(des3111);
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 5:
		 
	     String[] marzo5a=res.getStringArray(R.array.actividadesmarzo15froebel);
	     String[] marzo5b=res.getStringArray(R.array.actividadesmarzo15casaazul);
	     String[] marzo5c=res.getStringArray(R.array.actividadesmarzo15diantpavmunicipal);
	     String[] marzo5d=res.getStringArray(R.array.actividadesmarzo15localmusica);
	     String[] marzo5e=res.getStringArray(R.array.actividadesmarzo15pavmunicipal);
		   String[]des11111={desclud[22],descfor[2],desclud[11],desclud[1],descfis[8]};
		   String[]des21111={desccul[14]};
		   String[]des31111={desccul[8]};
		   String[]des4111={descfor[4],descfor[5],descfor[7]};
		   String[]des51={descfis[2]};
		   Af1.add(marzo5a);
		   Af1.add(marzo5b);
		   Af1.add(marzo5c);
		   Af1.add(marzo5d);
		   Af1.add(marzo5e);
		   
		   df1.add(des11111);
		   df1.add(des21111);
		   df1.add(des31111);
		   df1.add(des4111);
		   df1.add(des51);
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 6:
		 String[] marzo6a=res.getStringArray(R.array.actividadesmarzo16froebel);
	     String[] marzo6b=res.getStringArray(R.array.actividadesmarzo16casaazul);
	     String[] marzo6c=res.getStringArray(R.array.actividadesmarzo16CEIPmanuel);
	     String[] marzo6d=res.getStringArray(R.array.actividadesmarzo16pavmultiusos);
		   String[]des111111={desclud[20],desclud[0],descfor[1],desclud[6],desccul[9],desclud[19]};
		   String[]des211111={desccul[14]};
		   String[]des311111={desccul[3]};
		   String[]des41={descfis[5]};
		   Af1.add(marzo6a);
		   Af1.add(marzo6b);
		   Af1.add(marzo6c);
		   Af1.add(marzo6d);
		  
		   df1.add(des111111);
		   df1.add(des211111);
		   df1.add(des311111);
		   df1.add(des41);
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 7:
		 String[] marzo7a=res.getStringArray(R.array.actividadesmarzo22froebel);
	     String[] marzo7b=res.getStringArray(R.array.actividadesmarzo22casaazul);
	     String[] marzo7c=res.getStringArray(R.array.actividadesmarzo22localmusica);
	     String[] marzo7d=res.getStringArray(R.array.actividadesmarzo22pavmunicipal);
		   String[]des17={descfor[2],descfor[25],desclud[11],descfis[8],desclud[1]};
		   String[]des27={descfor[15],desclud[15],descesp[7]};
		   String[]des37={descfor[5],descfor[7]};
		   String[]des47={descfis[2]};
		   Af1.add( marzo7a);
		   Af1.add( marzo7b);
		   Af1.add( marzo7c);
		   Af1.add( marzo7d);
		  
		   df1.add(des17);
		   df1.add(des27);
		   df1.add(des37);
		   df1.add(des47);
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 8:
		 String[] marzo8a=res.getStringArray(R.array.actividadesmarzo23froebel);
	     String[] marzo8b=res.getStringArray(R.array.actividadesmarzo23casaazul);
	     String[] marzo8c=res.getStringArray(R.array.actividadesmarzo23camposh);
	     String[] marzo8d=res.getStringArray(R.array.actividadesmarzo23estacion);
	     
		   String[]des18={desccul[13],desclud[12],descfor[21],descfor[1]};
		   String[]des28={descfor[15],desclud[15],descesp[7]};
		   String[]des38={descfis[6]};
		   String[]des48={desccul[11]};
		   Af1.add(marzo8a);
		   Af1.add(marzo8b);
		   Af1.add(marzo8c);
		   Af1.add(marzo8d);
		  
		   df1.add(des18);
		   df1.add(des28);
		   df1.add(des38);
		   df1.add(des48);
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 9:
		 String[] marzo28=res.getStringArray(R.array.actividadessanta28);
	    
		  
		   String[]des19={descfor[20],descfor[21],descfor[2],descfor[25],descfor[17],desclud[17],};
		
		   Af1.add(marzo28);
		  
		   df1.add(des19);
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 10:
		
	     String[] marzo29=res.getStringArray(R.array.actividadessanta29);
	  
		  
		   String[]des10={descfor[21],descfor[2],descfor[10],desclud[2],descfis[8]};
		
		   Af1.add(marzo29);
		  
		   df1.add(des10);
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 11:
		 String[] marzo30=res.getStringArray(R.array.actividadessanta30);
		   
		  
		   String[]des130={descesp[9],descfor[21],desccul[2],desclud[2],desclud[8]};
		
		   Af1.add(marzo30);
		  
		   df1.add(des130);
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
		default: mensaje[0]="";
		   mensaje[1]="";
			
	   }
	 
	
	   
	   
	
  

	   
	
	
		
		
		
		return mensaje; 
	}

	    
	private String[] creamensaje1(int posg, int posc, int dia)
	{
	   String[] mensaje = {"","",""};
		 
	  
	   Resources res =getResources();
		
	    String[] descfis=res.getStringArray(R.array.descfisicas);	
		String[] desccul=res.getStringArray(R.array.descculturais);
		String[] descfor=res.getStringArray(R.array.descformativas);
		String[] desclud=res.getStringArray(R.array.descludicas);
		String[] descesp=res.getStringArray(R.array.descespeciais);
	   ArrayList<String[]> Af1= new ArrayList<String[]>();
	   ArrayList<String[]> df1= new ArrayList<String[]>();
	  
	   
	   
	   switch(dia){
		   case 1:
			   String[]des1={descfor[16],descfor[2],descfor[17],desclud[11],descfis[8]};
			   String[]des2={descesp[13],descfor[13],desclud[16],descesp[7]};
			   String[]des3={descfor[4],descfor[7]};
			   String[]des4={descfis[2]};
			   String[] febrero1a=res.getStringArray(R.array.actividadesfebrero22froebel);
			   String[] febrero1b=res.getStringArray(R.array.actividadesfebrero22casaazul);
			   String[] febrero1c=res.getStringArray(R.array.actividadesfebrero22localmusica);
			   String[] febrero1d=res.getStringArray(R.array.actividadesfebrero22pavmunicipal);
			   Af1.add(febrero1a);
			   Af1.add(febrero1b);
			   Af1.add(febrero1c);
			   Af1.add(febrero1d);
			   df1.add(des1);
			   df1.add(des2);
			   df1.add(des3);
			   df1.add(des4);
			   mensaje[0]=Af1.get(posg)[posc];
			   mensaje[1]=df1.get(posg)[posc];
	   break;
	  
	case 2:
		   String[] febrero2a=res.getStringArray(R.array.actividadesfebrero23froebel);
		   String[] febrero2b=res.getStringArray(R.array.actividadesfebrero23casaazul);
		   String[] febrero2c=res.getStringArray(R.array.actividadesfebrero23ceipmanuel);
		   String[] febrero2d=res.getStringArray(R.array.actividadesfebrero23pavmultiusos);
		   String[]des11={desccul[2],desclud[6],desccul[9],desclud[19]};
		   String[]des21={descfis[9],descesp[5],descfor[24]};
		   String[]des31={desccul[0]};
		   String[]des41={descfis[5]};
		   Af1.add(febrero2a);
		   Af1.add(febrero2b);
		   Af1.add(febrero2c);
		   Af1.add(febrero2d);
		  
		   df1.add(des11);
		   df1.add(des21);
		   df1.add(des31);
		   df1.add(des41);
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
		default: mensaje[0]="";
		   mensaje[1]="";
			
	   }
	 
	
	   
	   
	
  

	   
	
	
		
		
		
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
	
	
	
	
	
	
	}	


