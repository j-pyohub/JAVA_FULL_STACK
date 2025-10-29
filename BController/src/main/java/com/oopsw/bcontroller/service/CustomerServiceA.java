package com.oopsw.bcontroller.service;

import com.oopsw.bcontroller.dao.CustomerDAO;
import com.oopsw.bcontroller.vo.CustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //필수 아님. 상징적으로 붙임
public class CustomerServiceA implements CustomerService {
    @Autowired
    private CustomerDAO dao;
    public CustomerServiceA() {
        System.out.println("CustomerServiceA()");
    }

    @Override
    public CustomerVO getCustomer(String customerId) {
        //DAO 호출
        return dao.getCustomer(customerId);
       // return new CustomerVO(customerId, "표수정", 100);
    }
}
