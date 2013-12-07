package com.roey.where2park;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		GoogleMap mMap;
		mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mMap.addMarker(new MarkerOptions()
		.position(new LatLng(32.777539, 35.023906))
		.title("Hello world"));

		PolygonOptions rectOptions = new PolygonOptions()
		.add(   new LatLng(32.778288304674106, 35.02170771360397),
				new LatLng(32.77796356597343, 35.022053718566895),
				new LatLng(32.77793424922683, 35.02204030752182),
				new LatLng(32.77825898803451, 35.02167820930481));
		//Get back the mutable Polygon
		Polygon polygon = mMap.addPolygon(rectOptions);
	}
	public void onClickSearch(View view){
		onSearchRequested();
	}
}