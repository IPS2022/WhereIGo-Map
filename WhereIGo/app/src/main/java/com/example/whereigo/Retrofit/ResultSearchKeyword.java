package com.example.whereigo.Retrofit;

import com.google.gson.annotations.SerializedName;

public class ResultSearchKeyword{

    @SerializedName("place_name")
    private String place_name;
    @SerializedName("address_name")
    private String address_name;
    @SerializedName("road_address_name")
    private String road_address_name;
    @SerializedName("x")
    private String x;
    @SerializedName("y")
    private String y;

    @Override
    public String toString(){
        return "ResultSearchKeyword{"+
                "place_name"+place_name+
                ", address_name"+address_name+
                ", road_address_name"+road_address_name+
                ", x"+x+
                " y"+y+"}";
    }
}
