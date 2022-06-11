package com.example.andriod.floatingactionbuttons;

import androidx.appcompat.app.AppCompatActivity; import android.os.Bundle; import android.view.View;
import android.widget.Toast; import com.google.android.material.floatingactionbutton.FloatingActionButton;

        public class MainActivity extends AppCompatActivity {
            FloatingActionButton f1,f2,f3,f4; int flag=1;
            @Override protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main); f1=findViewById(R.id.fb1); f2=findViewById(R.id.fb2); f3=findViewById(R.id.fb3); f4=findViewById(R.id.fb4); f1.setOnClickListener(new View.OnClickListener() {

    @Override public void onClick(View view) { if (flag == 1)
    { f2.setVisibility(View.VISIBLE);
        f3.setVisibility(View.VISIBLE); f4.setVisibility(View.VISIBLE); flag = 0; } else { f2.setVisibility(View.INVISIBLE); f3.setVisibility(View.INVISIBLE); f4.setVisibility(View.INVISIBLE); flag = 1; } } } ); f2.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { Toast.makeText(MainActivity.this,"FAB_2",Toast.LENGTH_SHORT).show(); } }); f3.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { Toast.makeText(MainActivity.this,"FAB_3",Toast.LENGTH_SHORT).show(); } }); f4.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View view) { Toast.makeText(MainActivity.this,"FAB_4",Toast.LENGTH_SHORT).show(); } }); } }