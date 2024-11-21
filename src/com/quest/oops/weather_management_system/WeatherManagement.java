package com.quest.oops.weather_management_system;

import java.util.ArrayList;
import java.util.Arrays;

public class WeatherManagement extends WeatherOperations{
    private static final int MAX_CITIES = 10;
    private static  final int HUMIDITY_LIMIT = 80;
    private static  final int HEATWAVE_LIMIT = 40;
    private static  final int LOW_HUMIDITY_LIMIT = 20;
    private  static WeatherManagement[] CITIES = new WeatherManagement[MAX_CITIES];
    private static int NUMBER_OF_CITIES = 0;

    private String cityName;
    private int currentTemp;
    private int currentHumidity;
    private String currentCondition;
    private static ArrayList<String> sunny = new ArrayList<>();
    private static ArrayList<String> cloudy = new ArrayList<>();
    private static ArrayList<String> rainy = new ArrayList<>();
    private static ArrayList<String> snow = new ArrayList<>();

    WeatherManagement(String cityName, int currentTemp,int currentHumidity,String currentCondition){
        this.cityName = cityName;
        this.currentTemp = currentTemp;
        this.currentHumidity = currentHumidity;
        this.currentCondition = currentCondition;
    }

    //setters

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public void setCurrentCondition(String currentCondition) {
        this.currentCondition = currentCondition;
    }

    public void setCurrentHumidity(int currentHumidity) {
        this.currentHumidity = currentHumidity;
    }

    public static void setNumberOfCities(int numberOfCities) {
        NUMBER_OF_CITIES = numberOfCities;
    }

    public void setCloudy(ArrayList<String> cloudy) {
        this.cloudy = cloudy;
    }

    public void setRainy(ArrayList<String> rainy) {
        this.rainy = rainy;
    }

    public void setSnow(ArrayList<String> snow) {
        this.snow = snow;
    }

    public void setSunny(ArrayList<String> sunny) {
        this.sunny = sunny;
    }
    //getters


    public String getCityName() {
        return cityName;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public int getCurrentHumidity() {
        return currentHumidity;
    }

    public String getCurrentCondition() {
        return currentCondition;
    }

    public static int getMaxCities() {
        return MAX_CITIES;
    }

    public static int getNumberOfCities() {
        return NUMBER_OF_CITIES;
    }

    public static WeatherManagement[] getCITIES() {
        return CITIES;
    }

    public static int getHumidityLimit() {
        return HUMIDITY_LIMIT;
    }

    public static ArrayList<String> getCloudy() {
        return cloudy;
    }

    public static ArrayList<String> getSnow() {
        return snow;
    }

    public static ArrayList<String> getRainy() {
        return rainy;
    }

    public static ArrayList<String> getSunny() {
        return sunny;
    }

    public static void addCities(WeatherManagement cities){
        if(NUMBER_OF_CITIES < MAX_CITIES){
            CITIES[NUMBER_OF_CITIES] = cities;
            setNumberOfCities(getNumberOfCities()+1);
            System.out.println(cities.getCityName() + " added successfully");
        }
        else {
            System.out.println("City not added !!! try again");
        }
    }

    @Override
    public void updateCityTemperature(WeatherManagement weatherManagement, int newTemp) {
        weatherManagement.setCurrentTemp(newTemp);
        System.out.println("Updated with new temperature : "+weatherManagement.getCurrentTemp());
    }

    @Override
    public void updateCityHumidity(WeatherManagement weatherManagement, int newHumidity) {
        weatherManagement.setCurrentHumidity(newHumidity);
        System.out.println("Updated with new Humidity : "+weatherManagement.getCurrentHumidity());
    }

    @Override
    public void updateCityCondition(WeatherManagement weatherManagement, String newCondition) {
        weatherManagement.setCurrentCondition(newCondition);
        System.out.println("Updated with new Condition : "+weatherManagement.getCurrentCondition());
    }


    public static void  highestAndLowestTemperature() {
        int highestTemp = CITIES[0].getCurrentTemp();
        int lowestTemp = CITIES[0].getCurrentTemp();
        WeatherManagement highTempCity = CITIES[0];
        WeatherManagement lowTempCity = CITIES[0];
        for(int i = 1; i<NUMBER_OF_CITIES;i++){
            if(highestTemp < CITIES[i].getCurrentTemp()){
                highestTemp = CITIES[i].getCurrentTemp();
                highTempCity = CITIES[i];
            }
            if(lowestTemp > CITIES[i].getCurrentTemp()){
                lowestTemp = CITIES[i].getCurrentTemp();
                lowTempCity = CITIES[i];
            }

        }
        System.out.println("City with Highest temperature : "+highTempCity.getCityName()+"("+highestTemp+") degree Celsius");
        System.out.println("City with Lowest temperature : "+lowTempCity.getCityName()+"("+lowestTemp+") degree Celsius");
    }


    public static void humidityCheck() {
        System.out.println("\n Cities with Humidity > 80%:");
        for (int i =0;i<NUMBER_OF_CITIES;i++){
            if (CITIES[i].getCurrentHumidity() > HUMIDITY_LIMIT){
                System.out.println(CITIES[i].getCityName());
            }else {
                System.out.println("No cities found");
            }
        }
    }


    public static void avgTemperature() {
        double avgTemp;
        int totalTemp = 0;
        for(int i =0;i<NUMBER_OF_CITIES;i++){
            totalTemp += CITIES[i].getCurrentTemp() ;
        }
        avgTemp = (double) totalTemp /NUMBER_OF_CITIES;
        System.out.println("Average Temperature : "+avgTemp+" degree Celsius");
    }

    public static void groupingCities(){
        for(int i = 0;i<NUMBER_OF_CITIES;i++){
            if(CITIES[i].getCurrentCondition().equalsIgnoreCase("sunny")){
                ArrayList<String> sunny = getSunny();
                sunny.add(CITIES[i].getCityName());
            } else if (CITIES[i].getCurrentCondition().equalsIgnoreCase("rainy")) {
                ArrayList<String> rainy = getRainy();
                rainy.add(CITIES[i].getCityName());
            } else if (CITIES[i].getCurrentCondition().equalsIgnoreCase("snow")) {
                ArrayList<String> snow = getSnow();
                snow.add(CITIES[i].getCityName());
            }else {
                ArrayList<String> cloudy = getCloudy();
                cloudy.add(CITIES[i].getCityName());
            }
            displayGroupedCities();
        }
    }
    public static void displayGroupedCities(){
        System.out.println("Generating Reports");
        if(!getSunny().isEmpty()){
            System.out.println("\nSunny "+ String.join(" ,",getSunny()));
        }
        if (!getCloudy().isEmpty()) {
            System.out.println("\nCloudy "+ String.join(" ,",getCloudy()));
        }
        if (!getSnow().isEmpty()) {
            System.out.println("\nSnow "+ String.join(" ,",getSnow()));
        }
        if (!getRainy().isEmpty()) {
            System.out.println("\nRainy "+ String.join(" ,",getRainy()));
        }

    }
    public static void alerts(){
        System.out.println("\n Alerts");
        for(int i = 0;i<NUMBER_OF_CITIES;i++){
            if(CITIES[i].getCurrentTemp() > HEATWAVE_LIMIT){
                System.out.println("Heatwave Alert: "+CITIES[i]+" is experiencing extreme heat ("+CITIES[i].getCurrentTemp()+"°C)! ");
            }
        }
        for(int i = 0;i<NUMBER_OF_CITIES;i++){
            if(CITIES[i].getCurrentHumidity() < LOW_HUMIDITY_LIMIT){
                System.out.println("Low Humidity Alert: "+CITIES[i]+" is experiencing low humidity ("+CITIES[i].getCurrentTemp()+"%)! ");
            }
        }
    }

    public static void displayCities(){
        for(int i=0;i<NUMBER_OF_CITIES;i++){
            System.out.println("\nCity Name : "+CITIES[i].getCityName());
            System.out.println("\nCurrent Temperature : "+CITIES[i].getCurrentTemp() );
            System.out.println("\nCurrent Humidity : "+CITIES[i].getCurrentHumidity());
            System.out.println("\nCurrent Condition : "+CITIES[i].getCurrentCondition());
            System.out.println("\n");
        }
    }
}
