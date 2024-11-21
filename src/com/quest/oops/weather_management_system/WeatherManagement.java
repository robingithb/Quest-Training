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
    private static ArrayList<String> sunny = new ArrayList<>();//for grouping sunny
    private static ArrayList<String> cloudy = new ArrayList<>(); //for grouping cloudy
    private static ArrayList<String> rainy = new ArrayList<>(); //for grouping rainy
    private static ArrayList<String> snow = new ArrayList<>(); //for grouping snow

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
    // to add cities
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
    //to update temperature of the city
    @Override
    public void updateCityTemperature(WeatherManagement weatherManagement, int newTemp) {
        weatherManagement.setCurrentTemp(newTemp);
        System.out.println("Updated with new temperature : "+weatherManagement.getCurrentTemp());
    }
    //to update the humidity od a city
    @Override
    public void updateCityHumidity(WeatherManagement weatherManagement, int newHumidity) {
        weatherManagement.setCurrentHumidity(newHumidity);
        System.out.println("Updated with new Humidity : "+weatherManagement.getCurrentHumidity());
    }
    //to update condition of the city
    @Override
    public void updateCityCondition(WeatherManagement weatherManagement, String newCondition) {
        weatherManagement.setCurrentCondition(newCondition);
        System.out.println("Updated with new Condition : "+weatherManagement.getCurrentCondition());
    }

    //to find highest and lowest temperature
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

//to find the cities ,that are greater the 80% of humidity
    public static void humidityCheck() {
        System.out.println("\nCities with Humidity > 80%:");
        boolean flag = false;
        for (int i =0;i<NUMBER_OF_CITIES;i++) {
            if (CITIES[i].getCurrentHumidity() > HUMIDITY_LIMIT) {
                System.out.println(CITIES[i].getCityName());
                flag = true;
            }
        }
          if (!flag){
              System.out.println("No cities found");
        }
    }

     //calculate the average
    public static void avgTemperature() {
        double avgTemp;
        int totalTemp = 0;
        for(int i =0;i<NUMBER_OF_CITIES;i++){
            totalTemp += CITIES[i].getCurrentTemp() ;
        }
        avgTemp = (double) totalTemp /NUMBER_OF_CITIES;
        System.out.println("Average Temperature : "+avgTemp+" degree Celsius");
    }
    //grouping the city based on the condition
    public static void groupingCities(){
        for(int i = 0;i<NUMBER_OF_CITIES;i++){
            if(CITIES[i].getCurrentCondition().equalsIgnoreCase("sunny")){
                ArrayList<String> sunny = getSunny();
                sunny.add(CITIES[i].getCityName());
                continue;
            } else if (CITIES[i].getCurrentCondition().equalsIgnoreCase("rainy")) {
                ArrayList<String> rainy = getRainy();
                rainy.add(CITIES[i].getCityName());
                continue;
            } else if (CITIES[i].getCurrentCondition().equalsIgnoreCase("snow")) {
                ArrayList<String> snow = getSnow();
                snow.add(CITIES[i].getCityName());
                continue;
            }else {
                ArrayList<String> cloudy = getCloudy();
                cloudy.add(CITIES[i].getCityName());
            }
        }
        displayGroupedCities();
    }
    //display the groups of the conditions
    public static void displayGroupedCities(){
        System.out.println("Generating Reports");
        if(!getSunny().isEmpty()){
            System.out.println("Sunny ->"+ String.join(" ,",getSunny()));
        }
        if (!getCloudy().isEmpty()) {
            System.out.println("Cloudy ->"+ String.join(" ,",getCloudy()));
        }
        if (!getSnow().isEmpty()) {
            System.out.println("Snow ->"+ String.join(" ,",getSnow()));
        }
        if (!getRainy().isEmpty()) {
            System.out.println("Rainy ->"+ String.join(" ,",getRainy()));
        }

    }
    //to  display the alerts
    public static void alerts(){
        System.out.println("\nAlerts");
        for(int i = 0;i<NUMBER_OF_CITIES;i++){
            if(CITIES[i].getCurrentTemp() > HEATWAVE_LIMIT){
                System.out.println("Heatwave Alert: "+CITIES[i].getCityName()+" is experiencing extreme heat ("+CITIES[i].getCurrentTemp()+"°C)! ");
            }
        }
        for(int i = 0;i<NUMBER_OF_CITIES;i++){
            if(CITIES[i].getCurrentHumidity() < LOW_HUMIDITY_LIMIT){
                System.out.println("Low Humidity Alert: "+CITIES[i].getCityName()+" is experiencing low humidity ("+CITIES[i].getCurrentTemp()+"%)! ");
            }
        }
    }
//display the cities
    public static void displayCities(){
        System.out.println("\nCities");
        for(int i=0;i<NUMBER_OF_CITIES;i++){
            System.out.println("City Name : "+CITIES[i].getCityName());
            System.out.println("Current Temperature : "+CITIES[i].getCurrentTemp() );
            System.out.println("Current Humidity : "+CITIES[i].getCurrentHumidity());
            System.out.println("Current Condition : "+CITIES[i].getCurrentCondition());
            System.out.println("\n");
        }
    }
}
