package com.quest.oops.weather_management_system;

public abstract class WeatherOperations {
    //update temperature
    public abstract void updateCityTemperature(WeatherManagement weatherManagement ,int newTemp );
    //update humidity
    public abstract void updateCityHumidity(WeatherManagement weatherManagement ,int newHumidity );
    //update conditions
    public abstract void updateCityCondition(WeatherManagement weatherManagement ,String newCondition );






}
