package com.godlikehzj.guangming.service.mapper;

import com.godlikehzj.guangming.bean.Production;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by godlikehzj on 2016/11/10.
 */
public interface ProductionMapper {
    public List<Production> getProductions();
    public Production getProduction(@Param("series") String series, @Param("subType") String subType);
}
