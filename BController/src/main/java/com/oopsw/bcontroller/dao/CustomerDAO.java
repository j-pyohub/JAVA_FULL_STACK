package com.oopsw.bcontroller.dao;

import com.oopsw.bcontroller.vo.CustomerVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

//@Repository //필수 아님->@Mapper
@Mapper
public interface CustomerDAO {
    List<String> getCustomers();
    CustomerVO getCustomer(String customerId);
    //구현부가 없어서 쿼리문이 안에 있어도 부담스럽지 않을 수 있음
    @Select("select name from cust_info")
    Set<String> getCustomerNames(); //중복체크 쿼리에서 안 되면, set으로 중복체크 가능
}
