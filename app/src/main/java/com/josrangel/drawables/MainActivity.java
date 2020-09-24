package com.josrangel.drawables;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.josrangel.drawables.datos.Imagen;
import com.josrangel.drawables.datos.ImagenAbs;

public class MainActivity extends AppCompatActivity {
    /*ImageView imageView;
    ImagenAbs[] imagenes;
    int contador=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_barril);

        imagenes= new ImagenAbs[]{
                new ImagenAbs() {
                    @Override
                    public int retornaImagen() {
                        return R.drawable.ic_barril;
                    }
                },
                new ImagenAbs() {
                    @Override
                    public int retornaImagen() {
                        return R.drawable.ic_ui_ux_design_mobile_icon_1;
                    }
                },
                new ImagenAbs() {
                    @Override
                    public int retornaImagen() {
                        return R.drawable.ic_ui_ux_design_mobile_icon_2;
                    }
                },
                new ImagenAbs() {
                    @Override
                    public int retornaImagen() {
                        return R.drawable.ic_ui_ux_design_mobile_icon_3;
                    }
                },
                new ImagenAbs() {
                    @Override
                    public int retornaImagen() {
                        return R.drawable.ic_ui_ux_design_mobile_icon_4;
                    }
                }
        };
    }

    public void cambiaImagen(View v){
        imageView.setImageResource(imagenes[++contador].retornaImagen());
        if(contador==4){
            contador=-1;
        }
    }*/

    /*
    *
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
    * */

    ImageView imageView;
    int[] imagenes= {R.drawable.ic_barril, R.drawable.ic_ui_ux_design_mobile_icon_1, R.drawable.ic_ui_ux_design_mobile_icon_2,R.drawable.ic_ui_ux_design_mobile_icon_3,R.drawable.ic_ui_ux_design_mobile_icon_4};
    int contador=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_barril);


    }

    public void cambiaImagenSiguiente(View v){
        imageView.setImageResource(imagenes[++contador]);
        if(contador==4){
            contador=-1;
        }
    }

    public void cambiaImagen(View v){
        if(v.getId() == R.id.button1){
            imageView.setImageResource(imagenes[0]);
        }else if(v.getId() == R.id.button2){
            imageView.setImageResource(imagenes[1]);
        }else if(v.getId() == R.id.button3){
            imageView.setImageResource(imagenes[2]);
        }else if(v.getId() == R.id.button4){
            imageView.setImageResource(imagenes[3]);
        }else if(v.getId() == R.id.button5){
            imageView.setImageResource(imagenes[4]);
        }
    }

    public void cambiaImagenAntes(View v){
        if(contador==0){
            contador=4;
        }else{
            contador--;
        }
        imageView.setImageResource(imagenes[contador]);
    }
}