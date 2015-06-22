package co.herovitamin.androiddesignsupportlibraryapplication;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import co.herovitamin.androiddesignsupportlibraryapplication.adapter.RecyclerViewAdapter;


public class CollapsingToolbarAndFABActivity extends ActionBarActivity {

    Toolbar toolbar;
    RecyclerView planets_list;
    RecyclerView.LayoutManager layout_manager;
    RecyclerViewAdapter adapter;
    CollapsingToolbarLayout collapsing_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_and_fab);

        toolbar = (Toolbar) findViewById(R.id.coordinator_five_toolbar);
        planets_list = (RecyclerView) findViewById(R.id.planets_list_five);
        collapsing_container = (CollapsingToolbarLayout) findViewById(R.id.collapsing_container);

        layout_manager = new LinearLayoutManager(this);
        planets_list.setLayoutManager(layout_manager);

        adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.planets_names));
        planets_list.setAdapter(adapter);

        setSupportActionBar(toolbar);
        collapsing_container.setTitle(getResources().getString(R.string.title_activity_collapsing_toolbar_and_fab));
    }
}
