package com.md.demo.service.impl;

import com.md.demo.bo.City;
import com.md.demo.dao.CityDao;
import com.md.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City selectByPrimaryKey(Integer id) {
        return cityDao.selectByPrimaryKey(id);
    }

    @Override
    public List<City> selectAll() {
        return cityDao.selectAll();
    }
}
