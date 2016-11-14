package com.godlikehzj.guangming.service;

import com.godlikehzj.guangming.bean.Order;
import com.godlikehzj.guangming.service.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by godlikehzj on 2016/11/13.
 */
@Service
public class OrderService {
    @Autowired
    private OrdersMapper ordersMapper;

    public List<Order> getAllOrders(){
        List<Order> list = ordersMapper.getAllOrders();

        return list;
    }
}
