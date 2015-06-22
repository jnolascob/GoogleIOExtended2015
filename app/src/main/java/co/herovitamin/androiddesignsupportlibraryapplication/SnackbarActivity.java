package co.herovitamin.androiddesignsupportlibraryapplication;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SnackbarActivity extends AppCompatActivity {

    Toolbar toolbar;
    Button show_snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);

        toolbar = (Toolbar) findViewById(R.id.snackbar_toolbar);
        show_snackbar = (Button) findViewById(R.id.show_snackbar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(R.string.title_activity_snackbar);
    }

    public void show_snackbar(View view){
        Snackbar
                .make(view, R.string.i_am_a_snackbar, Snackbar.LENGTH_LONG)
                .setAction(R.string.snackbar_action, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Realizar acción aquí
                    }
                })
                .show();
    }

}
