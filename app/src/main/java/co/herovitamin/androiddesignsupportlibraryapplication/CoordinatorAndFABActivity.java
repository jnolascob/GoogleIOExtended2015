package co.herovitamin.androiddesignsupportlibraryapplication;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;

import co.herovitamin.androiddesignsupportlibraryapplication.adapter.RecyclerViewAdapter;


public class CoordinatorAndFABActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView planets_list;
    RecyclerView.LayoutManager layout_manager;
    RecyclerViewAdapter adapter;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_and_fab);

        toolbar = (Toolbar) findViewById(R.id.coordinator_three_toolbar);
        planets_list = (RecyclerView) findViewById(R.id.planets_list_3);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        layout_manager = new LinearLayoutManager(this);
        planets_list.setLayoutManager(layout_manager);

        adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.planets_names));
        planets_list.setAdapter(adapter);

        fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Hi there!", Snackbar.LENGTH_LONG).show();
            }
        });

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_coordinator_layout_and_fab);
    }
}
