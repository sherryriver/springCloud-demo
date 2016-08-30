package com.wbiao;

import com.wbiao.filter.ApiFilterController;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class ApiFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFilterApplication.class, args);
	}

	@Bean
	public ApiFilterController accessFilter() {
		return new ApiFilterController();
	}
}
