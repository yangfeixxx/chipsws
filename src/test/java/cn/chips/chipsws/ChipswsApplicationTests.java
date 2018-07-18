package cn.chips.chipsws;

import cn.chips.chipsws.mapper.UserModelMapper;
import cn.chips.chipsws.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChipswsApplicationTests {
    @Autowired
    private UserModelMapper userModelMapper;

    @Test
    public void contextLoads() {
        UserModel userModel = new UserModel();
        userModel.setName("yf");
        userModel.setAge(22);
        userModel.setSex((short) 1);
        userModel.setCreatetime(LocalDateTime.now());
        userModel.setUpdatetime(LocalDateTime.now());
        userModelMapper.insert(userModel);
        UserModel userModel1 = userModelMapper.selectByPrimaryKey(1L);
        System.out.println(userModel1);
    }

}
