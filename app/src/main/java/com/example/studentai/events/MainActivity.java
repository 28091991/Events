package com.example.studentai.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.meinButton);
        View.OnClickListener listener = new MeinClickListener();
        button.setOnClickListener(listener);





    }

/*    @Override
    public void onClick(View v) {
        System.out.println("Taste wurde geklickt");
    }*/

    private class MeinClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            if (v == button)
            {
                System.out.println("Taste wurde geklickt");
            }
            else
            {
                Toast.makeText(MainActivity.this,
                        "taste wurde geklickt!",
                        Toast.LENGTH_LONG).show();
            }

        }
    }
}

