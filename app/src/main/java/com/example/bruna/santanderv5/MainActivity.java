package com.example.bruna.santanderv5;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bruna.santanderv5.Contatos.ContatoFragment;
import com.example.bruna.santanderv5.Investimentos.InvestimentoFragment;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.bottom_nav_view);
        navigation.setOnNavigationItemSelectedListener(this);

        loadFragment(new InvestimentoFragment());

    }

    private boolean loadFragment(Fragment fragment) {
        if(fragment != null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();

            return true;
        }

        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.nav_investimento:
                fragment = new  InvestimentoFragment();
                break;

            case R.id.nav_contato:
                fragment = new ContatoFragment();
                break;
        }

        return loadFragment(fragment);
    }
}

