package de.eshop.userservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import de.eshop.userserviceAPI.EshopUserServiceAPIApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EshopUserServiceAPIApplication.class)
@WebAppConfiguration
public class EshopUserServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
