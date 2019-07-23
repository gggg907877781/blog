package cn.kingzao.blog;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {


    public void jsonTest() throws Exception{


        List<UserTest> userList = new ArrayList<>();
        UserTest user1 = new UserTest();
        user1.setId(1);
        user1.setName("tomcat猫");
        user1.setAge(19);
        user1.setSex("男");
        UserTest user2 = new UserTest();
        user2.setId(2);
        user2.setName("tomcat猫");
        user2.setAge(19);
        user2.setSex("男");
        userList.add(user1);
        userList.add(user2);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(userList);

        System.out.println(json);



    }

    /*
    public List<EasyUITree> findCacheItemCatById(Long parentId) {
        List<EasyUITree> treeList = null;

        //1.先查询缓存数据
        String key = "ITEM_CAT_"+parentId;
        String resultJSON = jedis.get(key);

        try {
            //2.判断缓存中是否有数据
            if(StringUtils.isEmpty(resultJSON)){
                //2.1表示缓存中没有数据,需要查询后台数据库
                treeList = findItemCatById(parentId);

                //2.2将java对象转化为JSON串
                String jsonData = objectMapper.writeValueAsString(treeList);

                //2.3将数据写入缓存
                jedis.set(key, jsonData);
                System.out.println("第一次查询数据库");
            }else {
                //3.缓存中有数据
                //3.1将JSON串转化为java对象(List)
                EasyUITree[] trees =
                        objectMapper.readValue(resultJSON,EasyUITree[].class);
                treeList = Arrays.asList(trees);
                System.out.println("查询缓存数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return treeList;
    }

     */

}
