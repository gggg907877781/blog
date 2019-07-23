package cn.kingzao.blog;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;


public class Test1 {

    @Value("${spring.redis.database}")
    String ipAll;

    @Test
    public void contextLoads() throws Exception {

        System.out.println(ipAll);

    }

}
