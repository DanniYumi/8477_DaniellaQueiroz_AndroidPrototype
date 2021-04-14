package com.example.a8477_daniella_queiroz_prototype;

import android.content.Context;

import java.util.List;


public class DataService {

    private ListDatabase sqlite;

    public void init(Context context){

        sqlite = sqlite.getInstance(context);

    }
    //add recipes in the database and return the id of it
        public Long add(ProductsList productsList){
            return sqlite.insert(productsList.getRecipeName(), productsList.getIngredients(), productsList.getDuration());
        }
        //delete a recipe
        public boolean delete(ProductsList productsList){
            return sqlite.delete(productsList.getId());
        }
        //update the recipe by the id
        public boolean update(ProductsList productsList){
            return sqlite.update(productsList.getId(), productsList.getRecipeName(), productsList.getIngredients(),productsList.getDuration());
        }

        //return the list
        public List<ProductsList> getProductsList(){
            return sqlite.getproductsList();
        }
}
