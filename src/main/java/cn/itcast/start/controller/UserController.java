package cn.itcast.start.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.start.domain.User;
import cn.itcast.start.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("info")
	public User hello(){
		
		User user = new User();
		
		user.setUsername("张三丰");
		user.setAddress("深圳市");
		
		return user;
	}
	
	@RequestMapping("list")
	public List<User> list(){
		List<User> list = userService.findAllUser();
		return list;
	}
	
	/**
	 * 需求：操作REDIS集群缓存
	 */
	@RequestMapping("redis")
	public String redisMap(Model model){
		//Map<String, Object> maps = userService.redisMap();
		model.addAttribute("hello", "张三丰");
		return null;
	}
}
