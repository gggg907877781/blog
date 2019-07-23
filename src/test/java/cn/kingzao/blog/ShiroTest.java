package cn.kingzao.blog;

import cn.kingzao.blog.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.Factory;
import org.apache.shiro.mgt.SecurityManager;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class ShiroTest {


    private Logger logger = LogManager.getLogger(getClass());

    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
    private String algorithmName = "MD5";
    private final int hashIterations = 32;
    String passwords = "d61fc98c076389cb61413a352bb42074de2216ff0";
    String sales = "5420b1ddcda58b3";

    @Test
    public void encryptPassword() throws Exception{

        User user = new User("admin","123456asd","123@qq.com");
        // User对象包含最基本的字段Username和Password
        user.setUserSalt(randomNumberGenerator.nextBytes().toHex());
        // 将用户的注册密码经过散列算法替换成一个不可逆的新密码保存进数据，散列过程使用了盐
        String newPassword = new SimpleHash(algorithmName, user.getUserPassword(), ByteSource.Util.bytes(user.getUserName()+user.getUserSalt()), hashIterations).toHex();
        user.setUserPassword(newPassword);

        System.out.println(user);


        /*Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-mysql.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("admin","admin");

        try {
            subject.login(token);
            System.out.println("登入成功");

            if (subject.hasRole("gly")) {
                System.out.println("有admin角色");
            }else {
                System.out.println("没有admin角色");
            }

        } catch (AuthenticationException e) {
            System.out.println("用户名或密码错误，登入失败！");
        }
*/
        System.out.println(user);

    }





}
