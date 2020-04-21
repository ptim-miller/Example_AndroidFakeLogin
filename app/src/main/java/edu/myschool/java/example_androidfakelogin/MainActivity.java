package edu.myschool.java.example_androidfakelogin;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textPass = (EditText)findViewById(R.id.textPass);
                String password = textPass.getText().toString();
                Toast toast = Toast.makeText(getApplicationContext(),"Password: " + password ,Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, -120);
                toast.show();
//                Toast.makeText(getApplicationContext(),"Password: " + password ,Toast.LENGTH_LONG).show();
            }
        });


    }
}
