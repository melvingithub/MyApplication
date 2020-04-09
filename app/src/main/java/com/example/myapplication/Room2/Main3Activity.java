package com.example.myapplication.Room2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.myapplication.R;
import java.util.List;

//testing master
public class Main3Activity extends AppCompatActivity {

    BioViewModel viewModel;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView=findViewById(R.id.recycler_view);
        LinearLayoutManager manager=new LinearLayoutManager(this);

        final BioAdapter adapter=new BioAdapter();

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

        viewModel= ViewModelProviders.of(this).get(BioViewModel.class);
        viewModel.getAllBioData().observe(this, new Observer<List<BioData>>() {
            @Override
            public void onChanged(List<BioData> bioData) {
                adapter.setDate(bioData);
            }
        });

    }
}
