package com.godlikehzj.guangming.service.mapper;

import com.godlikehzj.guangming.bean.Customer;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhijunhu on 2016/11/15.
 */
public interface CustomerMapper {
    public Customer getCustomer(@Param("phone") String phone);
    public void addCustomer(Customer customer);
}
