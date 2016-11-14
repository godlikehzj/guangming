package com.godlikehzj.guangming.controller;

import com.godlikehzj.guangming.bean.Production;
import com.godlikehzj.guangming.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by godlikehzj on 2016/11/10.
 */
@Controller
@RequestMapping(value = "production/")
public class ProductionController {
    @Autowired
    private ProductionService productionService;

    @RequestMapping(value = "list.do")
    public String getProductionList(ModelMap model){
        List<Production> list = productionService.getProductionList();
        model.addAttribute("plist", list);

        return "list.jsp";
    }
}
