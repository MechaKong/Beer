package com.hfad.beeradvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FindBeerActivity extends Activity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        //Declare a TextView object called brands
        TextView brands = (TextView) findViewById(R.id.brands);
        //Declare a Spinner object called colors
        Spinner colors = (Spinner) findViewById(R.id.color);
        //Declare a String called BeerType and set it to the value of the selected "colors" item (which a Spinner object)
        String beerType = String.valueOf(colors.getSelectedItem());

        //Create a List of Strings called "brandsList" and pass the results of the "beerType" Spinner item to the BeerExpert method "getBrands" using the BeerExpert object "expert"
        List<String> brandsList = expert.getBrands(beerType);
        //Create a StringBuilder object called "brandsFormatted"
        StringBuilder brandsFormatted = new StringBuilder();
        //Use an enhanced for loop to assign all of the contents from the "brandsList" List object into the "brandsFormatted" StringBuilder object
        for(String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }

        //Set the TextView "brands" text to the StringBuilder object "brandsFormatted"
        brands.setText(brandsFormatted);

    }
}
