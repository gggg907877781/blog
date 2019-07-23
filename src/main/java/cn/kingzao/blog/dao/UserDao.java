package cn.kingzao.blog.dao;

import cn.kingzao.blog.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {

    /**
     * @Author king
     * @Description This method is mainly for administrators to view all users.
     * @Date  2019年06月19日10:55:02
     * @Param 
     * @return list
     **/
    List<User> listUser();

    /**
     * @Author king
     * @Description In order for users to have their own users, we need to create a user to solve this problem.
     * @Date  2019年06月19日10:58:09
     * @Param User Object.
     * @return
     **/
    void saveUser(User user);
    
    /**
     * @Author king
     * @Description Modifying user information will make special processing for information that can not be changed, so there is no need to do some unnecessary business operations here.
     * @Date  2019年06月28日10:35:37
     * @Param  User Object.
     * @return 
     **/
    void updateUser(User user);
    
    /**
     * @Author king
     * @Description I don't really want to Tucao's blog website. If it's slow, and it's so ugly, I will decide to cancel my own user first.
     * @Date    2019年06月28日11:12:45
     * @Param   Unique Logo id
     * @return 
     **/
    void deleteUser(Integer id);

    /**
     * @Author king
     * @Description In order to save the user's login time, this method is called every time the user logs in to change the time to the current time.
     * @Date
     * @Param
     * @return
     **/
    void updateLoginTime(Integer id);


}
