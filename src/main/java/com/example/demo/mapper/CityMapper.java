package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

@Mapper
public interface CityMapper {

    Map<String, Object> findByState(@Param("jianChaXiangDianId") Integer jianChaXiangDianId);

}
