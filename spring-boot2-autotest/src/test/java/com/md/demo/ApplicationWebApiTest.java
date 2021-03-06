package com.md.demo;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)// 指定启动类和随机端口
public class ApplicationWebApiTest {
    protected static Logger logger = LoggerFactory.getLogger(ApplicationWebApiTest.class);

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void setUp() throws Exception {
        String url = String.format("http://localhost:%d/", port);
        logger.info("随机自动分配端口后的整体请求头--->>> " + url);
        this.base = new URL(url);
    }

    @Test
    public void testUrlApi() throws Exception {
        String url = this.base.toString() + "/hello";
        logger.info("待测试接口地址：url=" + url);
        ResponseEntity<String> response = this.restTemplate.getForEntity(url, String.class, "");
        String result = response.getBody();
        logger.info("返回结果：result=" + result);
        boolean expected = false;
        if (result != null && result.contains("sprint-boot2-autotest")) {
            expected = true;
        }
        TestCase.assertEquals(true, expected);
    }
}
