package com.example.eiaugreg;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Method {
    @GET("/eiaug/App.php/?FullName=")
//?FullName=ahmed%20sherif&PhoneNo=01114910940&Email=Ahmed.sherif.abdel&WorkPlace=cairo&Degree=professor&grad=cairo%20university&interest=shit%20nothin
    Call<Model> getAllData();
}
