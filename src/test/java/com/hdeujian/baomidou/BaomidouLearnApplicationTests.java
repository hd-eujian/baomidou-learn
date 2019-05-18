package com.hdeujian.baomidou;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hdeujian.baomidou.entity.User;
import com.hdeujian.baomidou.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaomidouLearnApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        List<User> list = userMapper.selectList(queryWrapper);
        System.out.println(list);
    }

}
