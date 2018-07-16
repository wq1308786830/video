package com.russell.video.controllers;

import com.russell.video.domain.City;
import com.russell.video.mapper.CityMapper;
import com.russell.video.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private CityService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String index() {
        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    String home() {
        City city = service.getCityByState("CA");
        return city + "";
    }
}
