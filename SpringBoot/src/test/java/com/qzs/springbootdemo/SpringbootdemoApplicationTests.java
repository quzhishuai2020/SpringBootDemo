package com.qzs.springbootdemo;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class SpringbootdemoApplicationTests {

    @Test
    void contextLoads() {
        int[] nums = {1,1,1,1,1};
        int length = nums.length;
        int[] result = new int[nums.length];
        int n = 0;
        for(int i = 0;i < nums.length;i++){
            n+=nums[i];
            result[i] = n;
        }
        System.out.println(result);

    }

}
