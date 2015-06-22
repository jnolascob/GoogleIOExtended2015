package co.herovitamin.androiddesignsupportlibraryapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.main_toolbar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(getString(R.string.title));
    }


    public void launch_activity(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.button_navigation:
                intent = new Intent(this, NavigationActivity.class);
                break;
            case R.id.button_humble_improvements:
                intent = new Intent(this, HumbleImprovementsActivity.class);
                break;
            case R.id.button_snackbar:
                intent = new Intent(this, SnackbarActivity.class);
                break;
            case R.id.button_coordinator_one:
                intent = new Intent(this, CoordinatorLayoutAndAppBarActivity.class);
                break;
            case R.id.button_coordinator_two:
                intent = new Intent(this, CoordinatorAppBarWithTabsActivity.class);
                break;
            case R.id.button_coordinator_three:
                intent = new Intent(this, CoordinatorAndFABActivity.class);
                break;
            case R.id.button_coordinator_four:
                intent = new Intent(this, CollapsingToolBarLayoutActivity.class);
                break;
            case R.id.button_coordinator_five:
                intent = new Intent(this, CollapsingToolbarAndFABActivity.class);
                break;
            default:
                intent = new Intent(this, NavigationActivity.class);
                break;
        }
        startActivity(intent);
    }

}
