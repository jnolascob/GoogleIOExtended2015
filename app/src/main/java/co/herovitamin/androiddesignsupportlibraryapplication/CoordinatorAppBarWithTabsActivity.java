package co.herovitamin.androiddesignsupportlibraryapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import co.herovitamin.androiddesignsupportlibraryapplication.adapter.RecyclerViewAdapter;

public class CoordinatorAppBarWithTabsActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView planets_list;
    RecyclerView.LayoutManager layout_manager;
    RecyclerViewAdapter adapter;
    TabLayout tab_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_app_bar_with_tabs);

        toolbar = (Toolbar) findViewById(R.id.coordinator_two_toolbar);
        planets_list = (RecyclerView) findViewById(R.id.planets_list_2);
        tab_layout = (TabLayout) findViewById(R.id.tabs);

        layout_manager = new LinearLayoutManager(this);
        planets_list.setLayoutManager(layout_manager);

        adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.planets_names));
        planets_list.setAdapter(adapter);

        tab_layout.setTabMode(TabLayout.MODE_FIXED);
        tab_layout.addTab(tab_layout.newTab().setText("Pestaña 1"));
        tab_layout.addTab(tab_layout.newTab().setText("Pestaña 2"));
        tab_layout.addTab(tab_layout.newTab().setText("Pestaña 3"));

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_coordinator_app_bar_with_tabs);
    }


}
