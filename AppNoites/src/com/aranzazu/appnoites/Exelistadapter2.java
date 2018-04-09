package com.aranzazu.appnoites;

import java.util.ArrayList;

import com.aranzazu.appnoites.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Exelistadapter2 extends eListAdapter {

	public Exelistadapter2(Context context,
	
	ArrayList<group> groupData, ArrayList<ArrayList<ChildDia>> childData)
	
	{

	super(context, groupData, childData);

	}

	 


	@Override
	public View newChildView(boolean isLastChild, ViewGroup parent) {
	
	return getInflater().inflate(R.layout.childdia, parent, false);
	
	}
	
	@Override
	public void bindChildView(int childPosition, int groupPosition,

	boolean isLastChild, View v, ViewGroup parent)
	
	{

	ChildDia child = (ChildDia) super.getChild(groupPosition, childPosition);

	 

	TextView textView = (TextView) v.findViewById(R.id.line_ap);
	

	textView.setText(child.getText());
	
	 
	
TextView textView2 = (TextView) v.findViewById(R.id.line_bp);
	
	textView2.setText(child.getText2());
	ImageView im= (ImageView) v.findViewById(R.id.icp);
	im.setImageResource(child.getImage());
	ImageView im2= (ImageView) v.findViewById(R.id.icp2);
	im2.setImageResource(child.getImage2());
	}

	@Override
	public View newGroupView(boolean isExpanded, ViewGroup parent) {

	return getInflater().inflate(R.layout.grupo, parent, false);
	
	}

	
	@Override
	public void bindGroupView(int groupPosition, boolean isExpanded, View v,
	
	ViewGroup parent)
	
	{

	group group = (group) super.getGroup(groupPosition);

	TextView textView = (TextView) v.findViewById(R.id.text_actividades);

	textView.setText(group.getText());
	
	}

	}


