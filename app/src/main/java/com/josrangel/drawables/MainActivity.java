package com.josrangel.drawables;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.josrangel.drawables.datos.Imagen;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Imagen[] imagenes= {new Imagen(R.drawable.ic_barril), new Imagen(R.drawable.ic_ui_ux_design_mobile_icon_1), new Imagen(R.drawable.ic_ui_ux_design_mobile_icon_2),new Imagen(R.drawable.ic_ui_ux_design_mobile_icon_3),new Imagen(R.drawable.ic_ui_ux_design_mobile_icon_4)};
    int contador=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_barril);


    }

    public void cambiaImagen(View v){
        imageView.setImageResource(imagenes[++contador].getImageResource());
        if(contador==4){
            contador=-1;
        }
    }

    /*ImageView imageView;
    int[] imagenes= {R.drawable.ic_barril, R.drawable.ic_ui_ux_design_mobile_icon_1, R.drawable.ic_ui_ux_design_mobile_icon_2,R.drawable.ic_ui_ux_design_mobile_icon_3,R.drawable.ic_ui_ux_design_mobile_icon_4};
    int contador=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_barril);


    }

    public void cambiaImagen(View v){
        imageView.setImageResource(imagenes[++contador]);
        if(contador==4){
            contador=-1;
        }
    }*/
}