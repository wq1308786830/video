package com.russell.video.mapper;

import com.russell.video.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Russell
 */
@Mapper
public interface CityMapper {

    @Select("select * from city where state = #{state}")
    City findByState(@Param("state") String state);

    @Select("select * from city where country = #{country}")
    City findByCountry(@Param("country") String country);

}
