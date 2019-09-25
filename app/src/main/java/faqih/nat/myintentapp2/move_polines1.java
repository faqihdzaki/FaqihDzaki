package faqih.nat.myintentapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class move_polines1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_polines1);

        Button btnhalaman = findViewById(R.id.btn_halaman2);
        btnhalaman.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_halaman2 :
                Intent move_halaman2 = new Intent(move_polines1.this,move_polines2.class);
                startActivity (move_halaman2);
                break;
        }

    }
}
