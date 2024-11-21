package com.quest.oops.weather_management_system;

import com.quest.oops.library_management.Members;

import java.util.Scanner;

public class WeatherManagementMainDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Weather Monitoring System ");
        System.out.println("Enter the number of cities");
        int numberOfCities = intTypeCheck(sc);
        WeatherManagement cities;
        for(int i = 0;i<numberOfCities;i++){ //adding the cities
            cities = addCity(sc);
            WeatherManagement.addCities(cities);
        }
        WeatherManagement nation;
        //for updating the temp,humidity,condition
        while(true) {
            System.out.println("Enter to update " +
                    "1 : temperature" +
                    "2 : Humidity" +
                    "3 : condition" +
                    "4 : exit");
            int choice = intTypeCheck(sc);
            String city ;
            switch (choice){
                case 1:
                    System.out.println("Enter the city and new temp");
                    city = stringTypeCheck(sc);
                    int newTemp = intTypeCheck(sc);
                    nation = findCity(city);
                    if (nation != null){
                        nation.updateCityTemperature(nation,newTemp);
                    }
                    else {
                        System.out.println("Enter proper");
                    }
                    break;
                case 2:
                    System.out.println("Enter the city and new Humidity");
                    city = stringTypeCheck(sc);
                    int newHum = intTypeCheck(sc);
                    nation = findCity(city);
                    if (nation != null){
                        nation.updateCityHumidity(nation,newHum);
                    }
                    else {
                        System.out.println("Enter proper");
                    }
                    break;
                case 3:
                    System.out.println("Enter the city and new Condition");
                    city = stringTypeCheck(sc);
                    String newCon = stringTypeCheck(sc);
                    nation = findCity(city);
                    if (nation != null){
                        nation.updateCityCondition(nation,newCon);
                    }
                    else {
                        System.out.println("Enter proper");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("invalid option");
            }
            if(choice == 4){
                break;
            }
        }
        WeatherManagement.displayCities();
        WeatherManagement.highestAndLowestTemperature();
        WeatherManagement.humidityCheck();
        WeatherManagement.groupingCities();
        WeatherManagement.avgTemperature();
        WeatherManagement.alerts();


    }
    //get the city individually
    private static WeatherManagement findCity(String city){
        WeatherManagement[] cities = WeatherManagement.getCITIES();
        int numberCity = WeatherManagement.getNumberOfCities();

       WeatherManagement currentCity= null;
        boolean flag2 = false;
        for (int i = 0; i < numberCity; i++) {
            if (cities[i].getCityName().equalsIgnoreCase(city) ) {
                currentCity = cities[i];
                flag2 = true;
                return currentCity;
            }
        }
        return null;
    }
 //to add city
    private static WeatherManagement addCity(Scanner sc) {

        System.out.println("Enter the Name of the city");
        String cityName = stringTypeCheck(sc);
        System.out.println("Enter the current Temp");
        int currentTemp = intTypeCheck(sc);
        System.out.println("Enter the Current Humidity");
        int currentHumidity = intTypeCheck(sc);
        System.out.println("Enter Current Condition  |sunny|rainy|cloudy|Snow");
        String currentCondition = stringTypeCheck(sc);
        return new WeatherManagement(cityName,currentTemp,currentHumidity,currentCondition);
    }

    //to check integer values
    private static int intTypeCheck(Scanner sc) {
        int value; //store  temporary
        while (!sc.hasNextInt()) {
            System.out.println("Enter valid Integer NUmber");
            sc.next();
        }
        value = sc.nextInt();
        return value; //it returns the integer value
    }
    //to check string values
    private static String stringTypeCheck(Scanner sc) {
        String str;
        sc.nextLine();
        while (true) {
            str = sc.nextLine();
            // Check if the input is nonempty and only contains letters and spaces
            if (str.matches("[a-zA-Z\\s]+") && !str.trim().isEmpty()) {
                break; // Valid input, exit the loop
            } else {
                System.out.println("Invalid input. Please enter a valid name (letters and spaces only).");
            }
        }
        return str;
    }
}
