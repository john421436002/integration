package test.org.integration.service.impl; 

import org.apache.ibatis.reflection.SystemMetaObject;
import org.integration.dao.UserDao;
import org.integration.entity.User;
import org.integration.service.UserService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;


/** 
* UserServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮһ�� 7, 2016</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-*.xml")
@WebAppConfiguration
public class UserServiceImplTest {
    @Resource
    private UserDao userDao;

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: addUser(User user) 
* 
*/ 
@Test
public void testAddUser() throws Exception {
    User user = new User();
    user.setUsername("john");
    user.setPassword("12345");
    user.setNickname("hhh");
    user.setUserphone("12012545454");
    user.setAddress("北京");
    user.setAddDate(new Date());
    user.setEmail("11121@qq.com");
    user.setOrderCount(1);
    user.setOrderMount(new BigDecimal("100.00"));
    System.out.println(user.toString());
    int a = userDao.addUser(user);
    System.out.println("insert num:==>" + a);
    System.out.println("user==>" + user.getNickname());
}
    @Test
    public void testFindUser() throws Exception{
        User user = new User();
        user.setId(1);
        User user1 = userDao.findUserById(user);
        System.out.println(user1.toString());
    }


} 
