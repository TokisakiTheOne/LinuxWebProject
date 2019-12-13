import com.yyh.dao.StudentDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author YanYuHang
 * @create 2019-12-13-10:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-beans.xml","classpath:spring-mvc.xml"})
public class Test {

    @Autowired
    private StudentDao sd;


    @org.junit.Test
    public void test() {
        sd.selectAll().forEach(System.out::println);
    }
}
