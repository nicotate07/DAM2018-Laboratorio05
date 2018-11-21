package ar.edu.utn.frsf.isi.dam.laboratorio05;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * A simple {@link Fragment} subclass.
 */

public class MapaFragment extends SupportMapFragment implements OnMapReadyCallback { 
    private GoogleMap miMapa;
    private int tipoMapa = 0;
    public MapaFragment() { } 
    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { 
        View rootView = super.onCreateView(inflater, container, savedInstanceState);

        Bundle argumentos = getArguments(); 
        if(argumentos !=null) { 
            tipoMapa = argumentos .getInt("tipo_mapa",0); 
        }
        getMapAsync(this); return rootView; 
    } 
    @Override public void onMapReady(GoogleMap map) { miMapa = map; }

    public interface MapaFragmentListener {};
    public MapaFragmentListener listener;
    public void setListener(MapaFragmentListener mainActivity) {
        listener = mainActivity;

    }
}