package arewegreen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@TestPropertySource(locations="classpath:test.properties")
@WebIntegrationTest(randomPort = true)
public class SpringContextTest {

	@Test
	public void contextLoads() {}
}
