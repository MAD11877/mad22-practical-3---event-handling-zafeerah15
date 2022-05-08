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
        userclass user1 = initial();
        if (!isFinishing()){
            new AlertDialog.Builder(ListActivity.this)
                    .setTitle("Profile")
                    .setMessage("MADness")
                    .setCancelable(false)
                    .setPositiveButton("view", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (user1.followed == false) {
                                user1.followed = true;
                            } else {
                                user1.followed = false;
                            }
                            Dialogue(user1,imageButton);

                        }


                    }).show();
        }
    }

    public userclass initial() {
        userclass initialization = new userclass("name", "description", 0, false);
        return initialization;
    };
    public void Dialogue(userclass user,ImageButton imageButton){
        ImageButton dialog = findViewById(R.id.imageButton);
    };




    ;

}
imageButton.setOnClickListener(new View.OnClickListener() {};