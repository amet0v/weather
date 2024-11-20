package com.ametov.console;

import com.ametov.core.DTO.CurrentResponse;
import com.ametov.service.WeatherApi;
import com.ametov.service.WeatherService;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        String city;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your city (or ctrl+c for exit):");
            city = scanner.nextLine();

            Response<CurrentResponse> response = WeatherService.instance().currentResponse(city).execute();

            if (response.isSuccessful()){
                CurrentResponse body = response.body();
                System.out.printf("Temperature is %s and it feels like %s\n", body.getCurrent().getTemp_c(), body.getCurrent().getFeelslike_c());
            } else {
                System.out.println("City not found. Try again");
            }
        }
    }
}
