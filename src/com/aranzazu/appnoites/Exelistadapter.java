package com.aranzazu.appnoites;

import java.util.ArrayList;

import com.aranzazu.appnoites.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Exelistadapter extends eListAdapter {

	public Exelistadapter(Context context,
	
	ArrayList<group> groupData, ArrayList<ArrayList<Child>> childData)
	
	{

	super(context, groupData, childData);

	}

	 


	@Override
	public View newChildView(boolean isLastChild, ViewGroup parent) {
	
	return getInflater().inflate(R.layout.child, parent, false);
	
	}
	
	@Override
	public void bindChildView(int childPosition, int groupPosition,

	boolean isLastChild, View v, ViewGroup parent)
	
	{

	Child child = (Child) super.getChild(groupPosition, childPosition);

	 

	TextView textView = (TextView) v.findViewById(R.id.line_a);
	
	textView.setText(child.getText());
	
	 
	
	ImageView im= (ImageView) v.findViewById(R.id.ic);
	im.setImageResource(child.getImage());
	ImageView im2= (ImageView) v.findViewById(R.id.ic2);
	im2.setImageResource(child.getImage2());
TextView textView2 = (TextView) v.findViewById(R.id.line_b);
	
	textView2.setText(child.getText2());
TextView textView3 = (TextView) v.findViewById(R.id.line_d);
	
	textView3.setText(child.getText3());
	
	

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


