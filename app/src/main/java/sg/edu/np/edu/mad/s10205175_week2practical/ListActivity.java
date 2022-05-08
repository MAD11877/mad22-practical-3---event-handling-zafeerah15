package sg.edu.np.edu.mad.s10205175_week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView imageButton = findViewById(R.id.imageView2);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (user1.click == false) {

                    }
                }
                    user1.followed = true;
                else {
                    user1.followed = false;
                }
                followstatus(, imageButton);
            };
    /*public void followstatus(userclass userclass, ImageView imageButton)
    {
        ImageView imageView = findViewById(R.id.imageView2);
        if(userclass.followed == false)
        {
            imageButton
        }
        else
        {

        }
    };

    }

