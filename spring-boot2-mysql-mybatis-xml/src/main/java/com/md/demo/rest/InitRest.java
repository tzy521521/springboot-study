package com.md.demo.rest;

import com.md.demo.bo.City;
import com.md.demo.service.CityService;
import com.md.demo.util.JsonResult;
import com.md.demo.util.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InitRest {
    protected static Logger logger = LoggerFactory.getLogger(InitRest.class);

    @Autowired
    private CityService cityService;


    @GetMapping("/selectAll")
    public JsonResult listCities() {
        logger.info("~~~~~~~~~~");
        List<City> list = this.cityService.selectAll();
        return new JsonResult(ResultCode.SUCCESS, list);
    }

    @GetMapping("/selectByPrimaryKey")
    public JsonResult listCities(Integer id) {
        City obj = this.cityService.selectByPrimaryKey(id);
        return new JsonResult(ResultCode.SUCCESS, obj);
    }
}
