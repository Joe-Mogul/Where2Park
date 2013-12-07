package com.roey.where2park;

import java.util.List;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class MyPolygon {
	
	private String mPolygonName;
	private List<LatLng> mListOfLatLng; 
	private Polygon mPolygon; 
	MyPolygon( String name, List<LatLng> list, GoogleMap Map ){
		PolygonOptions rectOptions = new PolygonOptions();
		mPolygonName=name;
		mListOfLatLng=list;
		rectOptions.addAll(mListOfLatLng);
		//Get back the mutable Polygon
		mPolygon=Map.addPolygon(rectOptions);
	}

	public String mGetName(){
		return mPolygonName;
	}
	
	public List<LatLng> mGetListOfLatlang(){
		return mListOfLatLng;
	}
	
	public Polygon mGetPlygon(){
		return mPolygon;
	}
}
	// left to do: add object for Poly data, and get function
// destructure?
// why hate?
//Map I use- should it be the map from main? i created an object just for this (probably should be static for the class)
//maybe should count polygons