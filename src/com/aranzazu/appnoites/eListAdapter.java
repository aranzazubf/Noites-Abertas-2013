package com.aranzazu.appnoites;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;


public abstract class eListAdapter extends BaseExpandableListAdapter{
	
	private List<?> groupData;
	
	private List<? extends List<?>> childData; 
	private LayoutInflater inflater;
	
	 
	
	public eListAdapter(Context context, List<?> groupData,	List<? extends List<?>> childData){
	
	this.groupData = groupData;
	
	this.childData = childData;
	
	this.inflater = LayoutInflater.from(context);
	
	}
	


	@Override
	public Object getChild(int groupPosition, int childPosition) {

	return childData.get(groupPosition).get(childPosition);

	}

	 

	@Override
	public long getChildId(int groupPosition, int childPosition) {

	return childPosition;

	}

	 
	
@Override
public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
	
	View convertView, ViewGroup parent)

	{

	View v;

	if (convertView == null) {

	v = newChildView(isLastChild, parent);
	
	} else {
	
	v = convertView;

	}

	bindChildView(childPosition, groupPosition, isLastChild, v, parent);

	return v;
	
	}
	
	public abstract View newChildView(boolean isLastChild, ViewGroup parent);
	
	public abstract void bindChildView(int childPosition, int groupPosition, boolean isLastChild,
	
	View v, ViewGroup parent);
	
	
	@Override
	public int getChildrenCount(int groupPosition) {
	
	return childData.get(groupPosition).size();
	
	}

	@Override
	public Object getGroup(int groupPosition) {
	
	return groupData.get(groupPosition);
	
	}
	
	 

	@Override
	public int getGroupCount() {

	return groupData.size();

	}


	@Override
	public long getGroupId(int groupPosition) {

	return groupPosition;

	}

	
	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View convertView,

	ViewGroup parent)

	{

	View v;
	
	if (convertView == null) {
	
	v = newGroupView(isExpanded, parent);
	
	} else {
	
	v = convertView;

	}

	bindGroupView(groupPosition, isExpanded, v, parent);
	
	return v;

	}

	public abstract View newGroupView(boolean isExpanded, ViewGroup parent);

	public abstract void bindGroupView(int groupPosition, boolean isExpanded,

	View v, ViewGroup parent);
	
	 
	
	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
	
	return true;

	}


	@Override
	public boolean hasStableIds() {

	return true;

	}
	
	 

	public LayoutInflater getInflater() {

	return inflater;
	
	}

	}
