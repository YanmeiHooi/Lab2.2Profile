package my.edu.taruc.lab22profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {
    private EditText editTextName, editTextEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        editTextName = (EditText) findViewById(R.id.editTextUserName);
        editTextEmail = (EditText) findViewById(R.id.editTextUserEmail);
    }
    public void saveProfile(View view){
        //TODO: get user input
        String name,email;
        name = editTextName.getText().toString();
        email = editTextEmail.getText().toString();

        //TODO: return input data to the MainActivity
        Intent intent = getIntent();
        intent.putExtra(MainActivity.PROFILE_NAME,name);
        intent.putExtra(MainActivity.PROFILE_EMAIL,email);
        setResult(RESULT_OK,intent);
        finish();
    }
}
