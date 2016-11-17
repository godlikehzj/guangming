package com.godlikehzj.guangming.service.mapper;

import com.godlikehzj.guangming.bean.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by godlikehzj on 2016/11/16.
 */
public interface ManagerMapper {
    public Manager getManager(@Param("name") String name);
    public List<Manager> getAllManager();
}
