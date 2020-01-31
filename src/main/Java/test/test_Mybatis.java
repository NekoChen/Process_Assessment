package test;
import com.hc.dao.AccountDao;
import com.hc.domain.test_Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class test_Mybatis {
    @Test
    public void run1() throws IOException {
        test_Account account =new test_Account();
        account.setName("杜永蓝");
        account.setMoney(200d);
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        // 保存
        dao.saveAccount(account);

        // 提交事务
        session.commit();

        // 关闭资源
        session.close();
        in.close();
    }

//    @Test
//    public void run2() throws Exception {
//        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//
//        SqlSession session = factory.openSession();
//
//        AccountDao dao = session.getMapper(AccountDao.class);
//
//        List<test_Account> list = dao.findAll();
//        for (test_Account account: list ) {
//            System.out.println(account);
//        }
//
//        session.close();
//        in.close();
//    }

}
