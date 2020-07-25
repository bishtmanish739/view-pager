package in.technicalkeeda.verticalviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;
import android.view.Display;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager;
    List<Model> allModel=new ArrayList<>();
    pagerAdapter thisAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpager);
        for(int i=0;i<5;i++){
            Model model=new Model();
            model.setS("Hii kaise Ho?");
            allModel.add(model);
          model=new Model();
            model.setS("badiya");
            allModel.add(model);
            model=new Model();
            model.setS("Hii kaise Ho?");
            allModel.add(model);
           model=new Model();
            model.setS("Jhakkas");
            allModel.add(model);
        }
        thisAdapter=new pagerAdapter(MainActivity.this, allModel);
        viewPager.setAdapter( thisAdapter);

    }
}