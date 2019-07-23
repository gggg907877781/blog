package cn.kingzao.blog;

import org.junit.Test;
import redis.clients.jedis.*;

import java.util.ArrayList;
import java.util.List;

public class RedisShardsTest {

    @Test
    public void shardsTest(){
/*
        JedisPoolConfig poolConfig = new JedisPoolConfig();//Jedis池配置
        poolConfig.setMaxIdle(1000);
        poolConfig.setTestWhileIdle(true);

        List<JedisShardInfo> shards = new ArrayList<>();
        JedisShardInfo info1 = new JedisShardInfo("127.0.0.1",6379);
        info1.setPassword("4845664.");
        JedisShardInfo info2 = new JedisShardInfo("127.0.0.1",6380);
        info2.setPassword("4845664.");
        JedisShardInfo info3 = new JedisShardInfo("127.0.0.1",6381);
        info3.setPassword("4845664.");
        shards.add(info1);
        shards.add(info2);
        shards.add(info2);


        ShardedJedisPool pool = new ShardedJedisPool(poolConfig,shards);

        ShardedJedis jedis = pool.getResource();

        jedis.set("as","hello");

        System.out.println(jedis.get("as"));

        pool.close();
*/


    }

}
