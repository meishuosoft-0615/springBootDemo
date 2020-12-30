package com.meishuosoft.springboothelloworlddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title springboot 启动类
 * @author Meishuosoft
 * @date 2020-12-30 22:57
 * @descrition 距离2021年还有1天。
 */
@SpringBootApplication
@RestController
public class SpringbootHelloworldDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldDemoApplication.class, args);
	}

	@GetMapping("/sayhello")
	public String sayhello(@RequestParam(required = false,name = "who") String who)
	{
		if(StringUtils.hasLength(who))
		{
			who="world";
		}
		return String.format("hello,%s",who);
	}
}
