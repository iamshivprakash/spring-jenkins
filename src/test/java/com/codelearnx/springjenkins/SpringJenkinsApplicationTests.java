package com.codelearnx.springjenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringJenkinsApplicationTests {


    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

    @Test
    public void contextLoads() {
        logger.info("Test case executing`....");
        assertTrue(true);
    }

}
