package cn.kingzao.blog;

import cn.kingzao.blog.entity.User;
import cn.kingzao.blog.util.SerializeUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SerializeTest {

    @Autowired
    SerializeUtil sl;

    @Test
    public void test (){

        User user = new User("admin","123456asd","123@qq.com");

        System.out.println(user);

        byte[] a = sl.serialize(user);

        System.out.println(a);

        User users = (User) sl.unserialize(a);

        System.out.println(users);



    }

}
