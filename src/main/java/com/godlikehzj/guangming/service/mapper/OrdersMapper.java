package com.godlikehzj.guangming.service.mapper;

import com.godlikehzj.guangming.bean.Order;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by godlikehzj on 2016/11/13.
 */
public interface OrdersMapper {
    public List<Order> getAllOrders();
//    public void addOrder(@Param("cid") long cid, @Param("pid") long pid, @Param("mid") long mid,
//                         @Param("num") int num, @Param("startTime") Date startTime, @Param("endTime") Date endTime);
    public void addOrder(Order order);
}
