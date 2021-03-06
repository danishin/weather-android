package com.daniel.sunshine.http;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface OpenWeatherMap {
  @GET("/forecast/daily?units=metric&cnt=14")
  Observable<WeatherResponse> getForecast(
    @Query("lat") double lat,
    @Query("lon") double lon
  );
}
