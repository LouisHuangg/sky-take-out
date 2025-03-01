package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    //根据菜品id查询套餐id
    //多对多
    List<Long> getSetmealIdsByDishId(List<Long> dishIds);

    void insertBatch(List<SetmealDish> setmealDishes);
}
