package co.herovitamin.androiddesignsupportlibraryapplication;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import co.herovitamin.androiddesignsupportlibraryapplication.adapter.RecyclerViewAdapter;


public class CollapsingToolBarLayoutActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView planets_list;
    RecyclerView.LayoutManager layout_manager;
    RecyclerViewAdapter adapter;
    CollapsingToolbarLayout collapsing_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_tool_bar_layout);

        toolbar = (Toolbar) findViewById(R.id.coordinator_four_toolbar);
        planets_list = (RecyclerView) findViewById(R.id.planets_list_four);
        collapsing_container = (CollapsingToolbarLayout) findViewById(R.id.collapsing_container);

        layout_manager = new LinearLayoutManager(this);
        planets_list.setLayoutManager(layout_manager);

        adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.planets_names));
        planets_list.setAdapter(adapter);

        setSupportActionBar(toolbar);
        collapsing_container.setTitle(getResources().getString(R.string.title_activity_coordinator_layout_and_fab));
    }

}
