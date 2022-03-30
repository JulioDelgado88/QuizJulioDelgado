package com.uca.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Se declaran los objetos para usarlos
    RadioButton rdOpc1, rdOpc2, rdOpc3;
    TextView txtNpregunta, txtPregunta;
    Button btnSiguiente, btnSalir;
    //Se declaran las variables para modificar la pregunta y las opciones, y para calcular la puntuacion
    //String NoPregunta, pregunta, opcion1, opcion2, opcion3;
    int nota = 0; int Npregunta = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se le asigna a cada objeto el id de lo que va a usar
        rdOpc1 = (RadioButton)findViewById(R.id.rdBtnOpc1);
        rdOpc2 = (RadioButton)findViewById(R.id.rdBtnOpc2);
        rdOpc3 = (RadioButton)findViewById(R.id.rdBtnOpc3);

        txtNpregunta = (TextView)findViewById(R.id.txtNpregunta);
        txtPregunta = (TextView)findViewById(R.id.txtPregunta);

        btnSiguiente = (Button)findViewById(R.id.btnSiguiente);
        btnSalir = (Button)findViewById(R.id.btnSalir);
    }

    public void siguiente (View v){
        //if por si no se marca ninguna opcion
        if(rdOpc1.isChecked() == false && rdOpc2.isChecked() == false && rdOpc3.isChecked()==false){
            Toast.makeText(this, "Elija una opción", Toast.LENGTH_SHORT).show();
        }else if(Npregunta == 1){
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if(rdOpc2.isChecked()){
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 2");
            txtPregunta.setText("¿GetText es para?");
            rdOpc1.setText("Asignar texto");
            rdOpc2.setText("Recuperar el texto");
            rdOpc3.setText("Borrar el texto");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(true);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 2) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 3");
            txtPregunta.setText("¿Toast es para?");
            rdOpc1.setText("Cerrar la App");
            rdOpc2.setText("Sumar numeros");
            rdOpc3.setText("Mostrar mensajes");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(true);
        }else if(Npregunta == 3) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc3.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 4");
            txtPregunta.setText("¿Finish es para?");
            rdOpc1.setText("Borrar text");
            rdOpc2.setText("Cerrar la actividad");
            rdOpc3.setText("Declarar variables");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(true);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 4) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 5");
            txtPregunta.setText("¿Para que sirve Else?");
            rdOpc1.setText("agregar texto");
            rdOpc2.setText("condicion");
            rdOpc3.setText("agregar algo");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(true);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 5) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 6");
            txtPregunta.setText("¿Para que sirve If?");
            rdOpc1.setText("condicion");
            rdOpc2.setText("tomar decisiones");
            rdOpc3.setText("asignar texto");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(true);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 6) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 7");
            txtPregunta.setText("¿Switch es para?");
            rdOpc1.setText("cambiar texto");
            rdOpc2.setText("cambiar variable");
            rdOpc3.setText("Declarar variables");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(true);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 7) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 8");
            txtPregunta.setText("¿Import es para?");
            rdOpc1.setText("Agregar texto");
            rdOpc2.setText("Importar clases");
            rdOpc3.setText("cambiar de clases");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(true);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 8) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 9");
            txtPregunta.setText("¿Finish es para?");
            rdOpc1.setText("Borrar text");
            rdOpc2.setText("Cerrar la actividad");
            rdOpc3.setText("Declarar variables");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(true);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 9) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc1.isChecked()) {
                nota = nota + 2;
            }
            //Se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //Se setean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 10");
            txtPregunta.setText("¿Textview es para?");
            rdOpc1.setText("Mostrar texto");
            rdOpc2.setText("Dividir");
            rdOpc3.setText("Multiplicar");
            //Se limpian los Radio buttons para la siguiente pregunta
            rdOpc1.setChecked(false);
            rdOpc2.setChecked(false);
            rdOpc3.setChecked(false);
        }else if(Npregunta == 10) {
            //Se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdOpc2.isChecked()) {
                nota = nota + 2;
            }
            //Se setean los textos para el resultado de la nota
            txtNpregunta.setText("Nota obtenida: "+nota);
            //IF para verificar si se ha aprobado o reprobado
            if(nota >= 10){
                txtPregunta.setText("Estado: Aprobado");
            }else{
                txtPregunta.setText("Estado: Reprobado");
            }
            //Se ocultan las opciones que no se van a usar para ver la nota y resultado
            rdOpc1.setVisibility(View.GONE);
            rdOpc2.setVisibility(View.GONE);
            rdOpc3.setVisibility(View.GONE);
            btnSiguiente.setVisibility(View.GONE);
        }
    }

    public void Salir(View v){
        finish();
    }
}

