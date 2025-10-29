package com.oopsw.bcontroller.service;

import com.oopsw.bcontroller.vo.CustomerVO;

public interface CustomerService {
    //어떤 DBMS를 구현할지 결정X - 추상적인 요구사항. 구현을 결정할 수 없을 때 => 우연성이 좋은 소프트웨어
    CustomerVO getCustomer(String customerId); //POJO - 서버와 상관없이 돌아가는 코드
}
