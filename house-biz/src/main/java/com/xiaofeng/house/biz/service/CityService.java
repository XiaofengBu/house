package com.xiaofeng.house.biz.service;

import com.google.common.collect.Lists;
import com.xiaofeng.house.common.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
  
  public List<City> getAllCitys(){
    City city = new City();
    city.setCityCode("110000");
    city.setCityName("北京");
    city.setId(1);
    return Lists.newArrayList(city);
  }

}
