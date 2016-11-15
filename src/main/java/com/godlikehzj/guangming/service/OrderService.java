package com.godlikehzj.guangming.service;

import com.godlikehzj.guangming.bean.Customer;
import com.godlikehzj.guangming.bean.Manager;
import com.godlikehzj.guangming.bean.Order;
import com.godlikehzj.guangming.bean.Production;
import com.godlikehzj.guangming.service.mapper.CustomerMapper;
import com.godlikehzj.guangming.service.mapper.ManagerMapper;
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

    @Autowired
    private ManagerMapper managerMapper;

    public List<String> getAllSeries(){
        return productionMapper.getSeries();
    }

    public List<Manager> getAllManager(){
        return managerMapper.getAllManager();
    }

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

        Manager manager = managerMapper.getManager(order.getMname());
        if (manager == null){
            return new ResponseEntity(SysApiStatus.ERROR, SysApiStatus.getMessage(SysApiStatus.ERROR), null);
        }

        Production production = productionMapper.getProduction(order.getSeries(), order.getSubType());
        if (production == null){
            return new ResponseEntity(SysApiStatus.ERROR, SysApiStatus.getMessage(SysApiStatus.ERROR), null);
        }

        ordersMapper.addOrder(customer.getId(), production.getId(), manager.getId(),
                order.getNum(), order.getStartTime(), order.getEndTime());
        return new ResponseEntity(SysApiStatus.OK_200, SysApiStatus.getMessage(SysApiStatus.OK_200),null);
    }
}
