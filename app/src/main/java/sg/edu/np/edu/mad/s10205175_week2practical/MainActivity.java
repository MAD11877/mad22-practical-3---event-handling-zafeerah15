package sg.edu.np.edu.mad.s10205175_week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void follow(View view){
        TextView txt = findViewById(R.id.button2);
        txt.setText("welcome to App");
    }
}