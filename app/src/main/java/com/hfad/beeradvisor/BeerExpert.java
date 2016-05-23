package com.hfad.beeradvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 5/23/2016.
 */
public class BeerExpert {

    //This is a method that returns a List<String>. That is all it is.
    List<String> getBrands(String color) {

        //this is a List<String> object called "brands". It is being declared as an ArrayList<String> object, specifically
        List<String> brands = new ArrayList<>();

        //This if statement looks at the color string that is passed into its method ("getBrands()"). It will assign Strings to the "brands" array
        if(color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        //Here, the "brands" array is returned to the caller
        return brands;
    }
}
