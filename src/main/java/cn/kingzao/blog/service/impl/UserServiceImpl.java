package cn.kingzao.blog.service.impl;

import cn.kingzao.blog.dao.UserDao;
import cn.kingzao.blog.entity.User;
import cn.kingzao.blog.service.UserService;
import cn.kingzao.blog.util.RedisConstants;
import cn.kingzao.blog.util.RedisUtil;
import cn.kingzao.blog.util.SerializeUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    SerializeUtil serializeUtil;

    private Logger logger = LogManager.getLogger(getClass());

    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();


    @Override
    public void addUser(User user) {

        // User对象包含最基本的字段Username和Password
        user.setUserSalt(randomNumberGenerator.nextBytes().toHex());
        // 将用户的注册密码经过散列算法替换成一个不可逆的新密码保存进数据，散列过程使用了盐  userNmae + salt 组合
        String newPassword = new SimpleHash(RedisConstants.algorithmName, user.getUserPassword(), ByteSource.Util.bytes(user.getUserName()+user.getUserSalt()), RedisConstants.hashIterations).toHex();
        user.setUserPassword(newPassword);

        userDao.saveUser(user);

    }

    @Override
    public void removeUser(int id) {
            userDao.deleteUser(id);
    }

    @Override
    public User getThisUser(String userName) {

        Boolean judgeKey = redisUtil.exists(userName);

        if (judgeKey){      //从缓存中获取用户的信息

            byte[] thisUser = redisUtil.get(userName.getBytes(),RedisConstants.datebase5);

            logger.info("缓存中数据"+RedisConstants.datebase5+"  "+getClass());

            return (User) SerializeUtil.unserialize(thisUser);

        }else {             //把所有用户对象序列化然后放如redis,db5中userName为key键因为数据库中的用户名一经注册就不允许修改所以才把用户名当做key

            List<User> listUser = userDao.listUser();

            for (int i = 0; i < listUser.size() ; i++) {
                User user = listUser.get(i);
                redisUtil.set(user.getUserName().getBytes(),serializeUtil.serialize(user), RedisConstants.datebase5);
            }

            byte[] thisUser = redisUtil.get(userName.getBytes(),RedisConstants.datebase5);

            return (User) SerializeUtil.unserialize(thisUser);
        }

    }

    @Override
    public List<User> listUser() {
        return userDao.listUser();
    }

    @Override
    public void recordLoginTime(int id) {
        userDao.updateLoginTime(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

}
