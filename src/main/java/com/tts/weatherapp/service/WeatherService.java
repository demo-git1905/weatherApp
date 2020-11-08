package com.tts.weatherapp.service;

import java.util.ArrayList;
import java.util.List;

import com.tts.weatherapp.models.Request;
import com.tts.weatherapp.models.Response;
import com.tts.weatherapp.repositories.RequestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    private RequestRepository requestRepository;
    
    @Value("${api_key}")
    private String apiKey;

    public Response getForecast(String zipCode){
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + zipCode + ",US&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Response.class);
    }

    public void save(Request data){
        requestRepository.save(data);
    }

    public List<String> findLastTenZipcodes(){
        List<Request> requests = requestRepository.findAll();
        if (requests.size() > 10){
            requests = requests.subList(0, 10);
        }
        List<String> zips = new ArrayList<String>();
        for (Request request : requests){
            zips.add(request.getZipCode());
        }
        return zips;
     }

     public String kelvinToFahrenheit(double kelvin){
         double fah = kelvin * ( 9.0 / 5.0) - 459.67;
        String temp = String.valueOf(fah);
        temp = temp.substring(0, 4);
         return temp;
     }

    
}
