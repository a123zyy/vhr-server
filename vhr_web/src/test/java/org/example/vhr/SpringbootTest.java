package org.example.vhr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringbootTest {

    @Autowired
    private HrService hrService;

    @Test
    public void getparamer(){
        System.out.println(hrService.selectByPrimaryKey(3));

    }
}
