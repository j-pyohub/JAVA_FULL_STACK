package com.oopsw.bcontroller.dao;

import com.oopsw.bcontroller.vo.CustomerVO;
import org.springframework.stereotype.Repository;

@Repository //상징적으로 표시. 생략X
public class CustomerDAOOracle implements CustomerDAO {
    @Override
    public CustomerVO getCustomer(String customerId) {
        //JDBC 연결

        return new CustomerVO(customerId, "오라클", 500);
    }
}
