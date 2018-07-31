package com.example.bruna.santanderv5.Contatos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bruna.santanderv5.R;


public class MessageSuccessFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_message_success, container, false);

        Button btnEnviarNovamente = view.findViewById(R.id.btnEnviarNovament);

        btnEnviarNovamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final FragmentTransaction ft = getFragmentManager()
                        .beginTransaction();
                ft.replace(R.id.container_fragment ,new ContatoFragment(), "success");
                ft.commit();
            }

        });

        return view;
    }

}
