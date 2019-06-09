import com.bigguy.springcloud.DeptWebApp;
import com.bigguy.springcloud.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author bigguy_hc
 * @create 2019-06-09 11:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DeptWebApp.class)
//@Import(DeptWebApp.class)
public class MainTest {

    @Autowired
    LoadBalancerClient client;

    @Test
    public void testBalance(){
        String serviceId = "MICROSERVICECLOUD-DEPT";
        for (int i = 0; i < 100; i++) {
            ServiceInstance instance = client.choose(serviceId);
            System.out.println(i + " -- " + instance.getHost() + instance.getPort());
        }



    }


}
