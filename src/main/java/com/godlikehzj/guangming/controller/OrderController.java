package com.godlikehzj.guangming.controller;

import com.alibaba.fastjson.JSONObject;
import com.godlikehzj.guangming.bean.Customer;
import com.godlikehzj.guangming.bean.Order;
import com.godlikehzj.guangming.service.OrderService;
import com.godlikehzj.guangming.service.mapper.OrdersMapper;
import com.godlikehzj.guangming.utils.WEBUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by godlikehzj on 2016/11/3.
 */
@Controller
@RequestMapping(value = "order/")
public class OrderController extends BaseController{
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "list.do")
    public String getOrderList(ModelMap modelMap) {
        List<Order> lists = orderService.getAllOrders();
        modelMap.addAttribute("orderLists", lists);

        return "list.jsp";
    }

    @RequestMapping(value = "toEdit.do")
    public String toEdit(ModelMap modelMap){
        return "edit.jsp";
    }

    @RequestMapping(value = "add.do")
    public void edit(HttpServletRequest request,
                     HttpServletResponse response,
                     Order order){
        outJSON(request, response, orderService.addOrder(order));
    }
}
