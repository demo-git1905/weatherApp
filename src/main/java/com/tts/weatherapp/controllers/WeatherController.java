package com.tts.weatherapp.controllers;

import java.util.List;

import com.tts.weatherapp.models.Request;
import com.tts.weatherapp.models.Response;

import com.tts.weatherapp.service.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("request", new Request());  
        List<String> zips = weatherService.findLastTenZipcodes();
        model.addAttribute("zips", zips);
        return "index";
    }

    @PostMapping
    public String postIndex(Request request, Model model) {
        Response data = weatherService.getForecast(request.getZipCode());
        data.setZipCode(request.getZipCode());
        data.main.replace("temp" , weatherService.kelvinToFahrenheit((Double.parseDouble(data.main.get("temp")))));
        weatherService.save(request);
        model.addAttribute("data", data);
        List<String> zips = weatherService.findLastTenZipcodes();
        model.addAttribute("zips", zips);
        return "index";
    }
    
    

}
