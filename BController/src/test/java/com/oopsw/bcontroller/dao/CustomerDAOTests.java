package com.oopsw.bcontroller.dao;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomerDAOTests {
    @Autowired
    private CustomerDAO customerDAO;
    @Test
    @Order(1)
    void isCustomerDAOTest(){
        assertNotNull(customerDAO);
    }
    @Test
    @Order(2)
    void getCustomerTest(){
        System.out.println(customerDAO.getCustomer("lee"));
    }
    @Test
    void getCustomersTest(){
        System.out.println(customerDAO.getCustomers());
    }
    @Test
    void getCustomerNamesTest(){
        System.out.println(customerDAO.getCustomerNames());
    }
}
