package com.md.demo.service;

import com.md.demo.bo.City;

import java.util.List;

public interface CityService {
    City selectByPrimaryKey(Integer id);

    List<City> selectAll();
}
