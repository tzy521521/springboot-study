package com.md.demo.dao.impl;

import com.md.demo.bo.City;
import com.md.demo.dao.CityDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityDaoImpl implements CityDao {

    @Autowired
    public SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(City record) {
        return 0;
    }

    @Override
    public City selectByPrimaryKey(Integer id) {
        return sqlSessionTemplate.selectOne("selectByPrimaryKey",id);
    }

    @Override
    public List<City> selectAll() {
        return sqlSessionTemplate.selectList("selectAll");
    }

    @Override
    public int updateByPrimaryKey(City record) {
        return 0;
    }
}
