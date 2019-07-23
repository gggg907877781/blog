package cn.kingzao.blog.service;


import cn.kingzao.blog.entity.User;

import java.util.List;

public interface UserService {

    /**
     * @Author king
     * @Description 添加用户
     * @Date  2019年06月28日15:25:23
     * @Param
     * @return
     **/
    void addUser(User user);

    /**
     * @Author king
     * @Description 删除用户
     * @Date  2019年06月28日15:25:51
     * @Param id
     * @return
     **/
    void removeUser(int id);

    /**
     * @Author king
     * @Description 当前用户信息
     * @Date  2019年06月28日15:26:02
     * @Param
     * @return list
     **/
    User getThisUser(String userName);

    /**
     * @Author king
     * @Description 所用用户信息
     * @Date  2019年06月28日17:22:25
     * @Param
     * @return
     **/
    List<User> listUser();

    /**
     * @Author king
     * @Description 记录用户登入时间
     * @Date  2019年06月28日15:29:42
     * @Param
     * @return
     **/
    void recordLoginTime(int id);

    /**
     * @Author king
     * @Description 修改用户信息
     * @Date  2019年06月28日15:29:08
     * @Param id
     * @return
     **/
    void updateUser(User user);

}
