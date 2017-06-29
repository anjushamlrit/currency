package com.example.mlrit.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.mlrit.currency.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    EditText t1;
    Spinner sp;
    Button b;
    TextView tv;
int pos;

    String[] names={"Curr1","Curr2","curr3","curr4"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText)findViewById(R.id.et1);
        sp=(Spinner)findViewById(R.id.sp1);
        b=(Button)findViewById(R.id.b1);
        tv=(TextView)findViewById(R.id.tv1);


        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,names);
        sp.setAdapter(aa);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int i, long id) {
                 pos = i;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = t1.getText().toString();
                long val = Long.parseLong(s1);
                if (pos == 0) {
                    val = val * 100;
                    tv.setText("" + val);
                }
                if (pos == 1) {
                    val = val * 50;
                    tv.setText("" + val);
                }

                if (pos == 2) {
                    val = val * 20;
                    tv.setText("" + val);
                }
                if (pos == 3) {
                    val = val * 10;
                    tv.setText("" + val);
                }
            }
        });






    }
}
