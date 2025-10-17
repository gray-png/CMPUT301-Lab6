package com.example.listycitylab6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if a given city exists in the list
     * @param city
     * This is the city to search for
     * @return
     * Return true if found, false if not
     */
    public Boolean hasCity(City city){
        for(City i : cities){
            if(i.getCityName().equals(city.getCityName()) && i.getProvinceName().equals(city.getProvinceName())){
                return true;
            }
        }
        return false;
    }

    /**
     * This removes a city if it exists in the list, if it does not exist, an exception is thrown
     * @param city
     * This is the city to delete
     */
    public void deleteCity(City city){
        City checkCity;
        for(int i = 0; i < cities.size(); i += 1){
            checkCity = cities.get(i);
            if(checkCity.getCityName().equals(city.getCityName()) && checkCity.getProvinceName().equals(city.getProvinceName())){
                cities.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /**
     * This counts how many cities are in the list
     * @return
     * return the number of cities in the list
     */
    public int countCities(){
        return cities.size();
    }
}
