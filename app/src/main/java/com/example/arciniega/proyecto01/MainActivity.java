package com.example.arciniega.proyecto01;

// Importación de paquetes
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Manipulación de los controles del layout (MainActivity)
        final EditText edt1 = (EditText)findViewById(R.id.editNombre);
        final EditText edt2 = (EditText)findViewById(R.id.editApellido);
        final TextView view1 = (TextView)findViewById(R.id.txtBienvenido);
        final Button btn = (Button)findViewById(R.id.cmdAceptar);

        // Porgramación del "Escuchador" de eventos ...
        btn.setOnClickListener(new View.OnClickListener(){
            //Se invoca al mètodo onClick
            public void onClick(View v){
                // Código de la tarea que se desea efectuar ...
                view1.setText("Bienvenido " + edt1.getText() + " " + edt2.getText());
            }
        });
    }
}
