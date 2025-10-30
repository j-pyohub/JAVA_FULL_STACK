package com.oopsw.bcontroller.service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerServiceTests {
    @Autowired
    private CustomerService customerService;

    @Test
    public void getCustomerTest(){ //service 테스트하면서 dao까지 자동으로 넘어가서 함
        System.out.println(customerService.getCustomer("c001"));
        System.out.println(customerService.getCustomer("lee"));
    }
    @Test
    public void getCustomersTest(){
        System.out.println(customerService.getCustomers());
    }
}
