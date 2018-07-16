package com.russell.video.services.Imp;

import com.russell.video.domain.City;
import com.russell.video.mapper.CityMapper;
import com.russell.video.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImp implements CityService {

    @Autowired
    private CityMapper mapper;

    @Override
    public City getCityByState(String state) {
        return this.mapper.findByState(state);
    }
}
