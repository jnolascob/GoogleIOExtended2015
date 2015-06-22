package co.herovitamin.androiddesignsupportlibraryapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import co.herovitamin.androiddesignsupportlibraryapplication.adapter.RecyclerViewAdapter;


public class CoordinatorLayoutAndAppBarActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView planets_list;
    RecyclerView.LayoutManager layout_manager;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout_and_appbar);

        toolbar = (Toolbar) findViewById(R.id.coordinator_one_toolbar);
        planets_list = (RecyclerView) findViewById(R.id.planets_list);

        layout_manager = new LinearLayoutManager(this);
        planets_list.setLayoutManager(layout_manager);

        adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.planets_names));
        planets_list.setAdapter(adapter);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_coordinator_layout_and_fab);
    }

}
