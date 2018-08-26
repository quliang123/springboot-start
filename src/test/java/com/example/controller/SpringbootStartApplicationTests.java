package com.example.controller;

import com.example.service.UserService;
import com.example.tasks.AsyncTask;
import com.example.utils.RedisOperator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootStartApplicationTests {


    @Qualifier("userServiceImpl")
    @Autowired
    private UserService userService;
    @Autowired
    private Sid sid;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Qualifier("redisOperator")
    @Autowired
    private RedisOperator redis;


    @Autowired
    private AsyncTask asyncTask;

    @Test
    public void contextLoads() throws Exception {
        long start = System.currentTimeMillis();
        Future<Boolean> a = asyncTask.doTask11();
        Future<Boolean> b = asyncTask.doTask22();
        Future<Boolean> c = asyncTask.doTask33();

        while (!a.isDone() || !b.isDone() || !c.isDone()) {
            if (a.isDone() && b.isDone() && c.isDone()) {
                System.out.println("异步任务全部完成");
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("全部任务完成,总耗时:" + (end - start) + "毫秒");

//        用自己封装的redis操作工具类来操作列表中的数据
//        SysUser u1 = new SysUser();
//        u1.setAge(22);
//        u1.setCity("天津");
//        u1.setUsername("呵呵");
//
//        SysUser u2 = new SysUser();
//        u2.setAge(18);
//        u2.setCity("北京");
//        u2.setUsername("呵呵");
//
//
//        SysUser u3 = new SysUser();
//        u3.setAge(20);
//        u3.setCity("武汉");
//        u3.setUsername("呵呵");
//
//        List<SysUser> users = new ArrayList<SysUser>();
//
//        users.add(u1);
//        users.add(u2);
//        users.add(u3);
//
//        redis.set("json:user:info", JsonUtils.objectToJson(users));
//
//        String u = redis.get("json:user:info");
//
//        System.out.println(u);
//        List<SysUser> sysUsers = JsonUtils.jsonToList(u, SysUser.class);
//        System.out.println(sysUsers.size());

//       redis 将对象信息装换成JSON字符串
//        SysUser user = new SysUser();
//        user.setAge(20);
//        user.setSex(1);
//        user.setCity("北京");
//        user.setNickname("呵呵");
//        user.setUsername("呵呵");
//
//        stringRedisTemplate.opsForValue().set("json:user", JsonUtils.objectToJson(user));
//
//        SysUser jsonUser = JsonUtils.jsonToPojo(stringRedisTemplate.opsForValue().get("json:user"), SysUser.class);
//        System.out.println(jsonUser.getUsername());


//       redis 存储普通字符串
//        stringRedisTemplate.opsForValue().set("imooc-cache", "springboot - redis");
//
//        String v = stringRedisTemplate.opsForValue().get("imooc-cache");
//
//        System.out.println(v);


//        SysUser user = new SysUser();
//        user.setAge(20);
//        user.setSex(1);
//        user.setCity("北京");
//        user.setUsername("瞿亮" + new Date());
//        user.setId(sid.nextShort());
//        user.setPassword("root" + new Date());
//        user.setNickname("呵呵" + new Date());
//
//        user.setRegistTime(new Date());
//        user.setIsDelete(0);
//        添加
//        userService.insertSelective(user);
//        删除
//        userService.deleteByPrimaryKey("1808251BAG9KXRYW");

//        查询单个对象
//        userService.selectByPrimaryKey("180825CBAG9KXRYW");

//        int a = 1 / 0;

//        user.setIsDelete(1);
//        修改
//        userService.updateByPrimaryKeySelective(user);

//        普通查询列表
//        userService.queryStudentList(user);

        /*List<SysUser> list = userService.queryStudentListPage(user, 0, 5);*/



        /*for (SysUser u : list) {
            System.out.println(u.getUsername() + "==========");
        }*/

//        SysUser u = userService.queryUserSimplyInfoById("1808251BAG9KXRYW");


//        System.out.println(u.getUsername());
    }

}
