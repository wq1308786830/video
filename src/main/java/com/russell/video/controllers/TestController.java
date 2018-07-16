package com.russell.video.controllers;

import com.russell.video.domain.City;
import com.russell.video.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private CityMapper cityMapper;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    String home() {
        City city = this.cityMapper.findByState("CA");
        return city + "";
    }
}
