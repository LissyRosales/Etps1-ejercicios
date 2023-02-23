package sv.edu.utec.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtadmin, edtpassword;
    Button btnLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtadmin=findViewById(R.id.edtAdmin);
        edtpassword=findViewById(R.id.edtPassword);
        btnLog=findViewById(R.id.btnLogin);

        btnLog.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(edtadmin.getText().toString().equals("parcialETps1")&&edtpassword.getText().toString().equals("p4rC14l#tp$")){
                    Intent intento = new Intent(getApplicationContext(), Principal.class);
                    startActivity(intento);
                }else
                {
                    Toast.makeText(MainActivity.this, "contraseña y usuario no son correctos ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}