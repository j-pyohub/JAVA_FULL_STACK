package com.oopsw.bcontroller.controller;

import com.oopsw.bcontroller.dto.CustomerResponse;
import com.oopsw.bcontroller.service.CustomerService;
import com.oopsw.bcontroller.service.CustomerServiceA;
import com.oopsw.bcontroller.vo.CustomerVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor //필수. 상속, 생성자 --> final로 메모리에 한번만 올라가게 함. 대신 interface 하나당 class 한개여야 함
public class CustomerRestController {
    private final CustomerService customerService; //final: 초기화 1번만. interface와 관련된 class 알아서 찾아감 -> 동적으로 구현부 바꿈
    //특정 고객의 정보 확인 - api/customer/pyo(선택) or api/customer?customer_id=pyo
    //view or JSON(선택)
    @GetMapping("api/customer/{customerId}") //요구사항에 맞추어 입력, 출력, url 결정
    public ResponseEntity<CustomerResponse> getCustomer(@PathVariable String customerId){
        //service
        //CustomerService customerService = new CustomerServiceA(); //spring을 쓰는 이점X - 계속 생성됨
        CustomerVO customerVO = customerService.getCustomer(customerId);
        CustomerResponse response = CustomerResponse.builder().customerId(customerVO.getCustomerId())
                                    .name(customerVO.getName()).point(customerVO.getPoint()).build();

        return ResponseEntity.status(201).body(response); //상황에 맞추어 status 번호 적기
    }

}
