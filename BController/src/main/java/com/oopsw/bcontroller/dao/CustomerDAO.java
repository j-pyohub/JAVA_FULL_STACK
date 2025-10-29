package com.oopsw.bcontroller.dao;

import com.oopsw.bcontroller.vo.CustomerVO;

public interface CustomerDAO {
    CustomerVO getCustomer(String customerId);
}
