package com.oopsw.bcontroller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest //백그라운드에서 소스 읽음(서버 없이 테스트 가능 )
class BControllerApplicationTests {

    @Test
    void 유니트_테스트_시작() {
        assertTrue(true);
    }
    @DisplayName("이해당사자에게 전달하는 메시지")
    @Test
    void unitTestStart(){
        assertTrue(1==1);
    }

}
