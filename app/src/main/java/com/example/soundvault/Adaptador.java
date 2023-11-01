package com.example.soundvault;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context context;
    private ArrayList<ListViewLayout> listItems;

    public Adaptador(Context context, ArrayList<ListViewLayout> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override  //tamaño de la lista
    public int getCount() {
        return listItems.size();
    }

    @Override //devuelve posicion
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ListViewLayout Item = (ListViewLayout) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textViewAlbum = convertView.findViewById(R.id.textViewAlbum);
        TextView textViewAutor = convertView.findViewById(R.id.textViewAutor);

        imageView.setImageResource(Item.getImagen());
        textViewAlbum.setText(Item.getAlbum());
        textViewAutor.setText(Item.getAutor());


        return convertView;
    }
}
