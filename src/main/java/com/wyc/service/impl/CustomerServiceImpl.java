package com.wyc.service.impl;

import com.wyc.mapper.CustomerMapper;
import com.wyc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Yc on 2017/1/6.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public int loginConfirm(String firstName) {
        return customerMapper.selectCustomerByFirstName(firstName);
    }
}
