package com.example.android.gitapp.api;

import com.example.android.gitapp.model.ItemResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ruturaj Kumbhar on 7 jan 2022.
 */

public interface Service {
    @GET("/search/users?q=location:canada")
    Call<ItemResponse> getItems();
}
