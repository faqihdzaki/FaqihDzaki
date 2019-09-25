package faqih.nat.myintentapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnMOveActivity;
    Button btnMoveData;
    Button btnDial;
    Button btnLink;
    Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMOveActivity = findViewById(R.id.btn_move_activity);
        btnMOveActivity.setOnClickListener(this);

        btnMoveData = findViewById(R.id.btn_move_data);
        btnMoveData.setOnClickListener(this);

        btnDial = findViewById(R.id.BtnDial);
        btnDial.setOnClickListener(this);

        btnLink = findViewById(R.id.btnLink);
        btnLink.setOnClickListener(this);

        btnMove =findViewById(R.id.btn_halaman2);
        btnMove.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveActivity = new Intent(MainActivity.this,MoveActivity.class);
                    startActivity(moveActivity);
                    break;
            case R.id.btn_move_data:
                Intent MoveDataActivity = new Intent(MainActivity.this,MoveActivityWithData.class);
                MoveDataActivity.putExtra(MoveActivityWithData.EXTRA_NAME,"Faqih Nat");
                MoveDataActivity.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(MoveDataActivity);
                break;
            case R.id.BtnDial:
                String PhoneNumber = "085290503635";
                //Intent dialphone = new Intent (intent.Action_Dial,Uri.parse("tel"+Phone)
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel"+PhoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btnLink:
                String link = "https://www.polines.ac.id/id/";
                Intent linkIntent = new Intent(Intent.ACTION_VIEW);
                linkIntent.setData(Uri.parse("LINK : "+link));
                startActivity(linkIntent);
                break;
            case R.id.btn_halaman2:
                Intent move_polines1 = new Intent(MainActivity.this,move_polines1.class);
        }

    }
}
