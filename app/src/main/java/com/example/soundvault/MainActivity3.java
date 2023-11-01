package com.example.soundvault;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {

    private ListViewLayout Item;
    private TextView album, descripcion, tracklist;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Item = (ListViewLayout) getIntent().getSerializableExtra("objetoData");

        album = (TextView) findViewById(R.id.textViewAlbum);
        descripcion = (TextView) findViewById(R.id.textViewDescripcion);
        tracklist = (TextView) findViewById(R.id.textViewTracklist);
        imagen = (ImageView) findViewById(R.id.imageView);

        album.setText(Item.getAlbum());
        imagen.setImageResource(Item.getImagen());
        descripcion.setText(Item.getDescripcion());
        tracklist.setText(Item.getTracklist());




    }
}