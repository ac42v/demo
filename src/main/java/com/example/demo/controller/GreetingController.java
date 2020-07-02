package com.example.demo.controller;

import com.example.demo.dao.ScDsXiangXianEntityDao;
import com.example.demo.entity.ScDsXiangXianEntity;
import com.example.demo.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class GreetingController {

    private final CityMapper cityMapper;
    private final ScDsXiangXianEntityDao scDsXiangXianEntityDao;

    @Autowired
    public GreetingController(CityMapper cityMapper, ScDsXiangXianEntityDao scDsXiangXianEntityDao) {
        this.cityMapper = cityMapper;
        this.scDsXiangXianEntityDao = scDsXiangXianEntityDao;
    }

    @ResponseBody
    @RequestMapping(value = "/greeting", produces = "application/json; charset=utf-8")
    public Object greeting(@RequestBody Map<String, Object> map) {
        return cityMapper.findByState((Integer) map.get("jianChaXiangDianId"));
    }

    @ResponseBody
    @RequestMapping(value = "/fgsdg456", produces = "application/json; charset=utf-8")
    public Object fgsdg456(@RequestBody Map<String, Object> map) {
        ScDsXiangXianEntity scDsXiangXianEntity = new ScDsXiangXianEntity();
        scDsXiangXianEntity.setId(99);
        scDsXiangXianEntity.setXianShuHao("uieggfiasgfighw");
        scDsXiangXianEntityDao.save(scDsXiangXianEntity);
        return scDsXiangXianEntityDao.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/fdh6786", produces = "application/json; charset=utf-8")
    public Object fdh6786(@RequestBody Map<String, Object> map) {
        ScDsXiangXianEntity scDsXiangXianEntity = new ScDsXiangXianEntity();
        scDsXiangXianEntity.setId(6);
        Example<ScDsXiangXianEntity> example = Example.of(scDsXiangXianEntity);
        List<ScDsXiangXianEntity> ff = scDsXiangXianEntityDao.findAll(example);
        return scDsXiangXianEntityDao.findAll(example);
    }
}