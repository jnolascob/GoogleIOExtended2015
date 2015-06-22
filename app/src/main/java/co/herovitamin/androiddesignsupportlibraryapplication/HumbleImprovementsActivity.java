package co.herovitamin.androiddesignsupportlibraryapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class HumbleImprovementsActivity extends AppCompatActivity {

    Toolbar toolbar;
    EditText text;
    TextInputLayout container;
    boolean show_error = true;
    FloatingActionButton action_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humble_improvements);

        toolbar = (Toolbar) findViewById(R.id.humble_toolbar);
        text = (EditText) findViewById(R.id.text_entry);
        container = (TextInputLayout) findViewById(R.id.text_container);
        action_button = (FloatingActionButton) findViewById(R.id.floating_action_button);

        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.title_activity_humble_improvements);
        container.setHint(getString(R.string.hint_text));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void check_error(View view){
        if (show_error){
            container.setErrorEnabled(true);
            container.setError(getString(R.string.hint_error));
            show_error = false;
        }
        else{
            container.setErrorEnabled(false);
//            container.setError("");
            show_error = true;
        }
    }
}
