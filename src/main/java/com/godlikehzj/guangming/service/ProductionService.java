package com.godlikehzj.guangming.service;

import com.godlikehzj.guangming.bean.Production;
import com.godlikehzj.guangming.service.mapper.ProductionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by godlikehzj on 2016/11/10.
 */
@Service
public class ProductionService {
    @Autowired
    private ProductionMapper productionMapper;

    public List<Production> getProductionList(){
        List<Production> productionList = productionMapper.getProductions();

        return productionList;
    }
}
