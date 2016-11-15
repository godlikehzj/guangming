package com.godlikehzj.guangming.service;

import com.godlikehzj.guangming.bean.Customer;
import com.godlikehzj.guangming.bean.Order;
import com.godlikehzj.guangming.bean.Production;
import com.godlikehzj.guangming.service.mapper.CustomerMapper;
import com.godlikehzj.guangming.service.mapper.OrdersMapper;
import com.godlikehzj.guangming.service.mapper.ProductionMapper;
import com.godlikehzj.guangming.utils.ResponseEntity;
import com.godlikehzj.guangming.utils.SysApiStatus;
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

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private ProductionMapper productionMapper;

    public List<Order> getAllOrders(){
        List<Order> list = ordersMapper.getAllOrders();

        return list;
    }

    public ResponseEntity addOrder(Order order){
        Customer customer = customerMapper.getCustomer(order.getPhone());
        if (customer == null){
            customer = new Customer();
            customer.setName(order.getCname());
            customer.setPhone(order.getPhone());
            customer.setAddr(order.getAddr());
            customer.setAddr(order.getArea());

            customerMapper.addCustomer(customer);
        }

        ordersMapper.addOrder(order);
        return new ResponseEntity(SysApiStatus.OK_200, SysApiStatus.getMessage(SysApiStatus.OK_200),null);
    }
}
