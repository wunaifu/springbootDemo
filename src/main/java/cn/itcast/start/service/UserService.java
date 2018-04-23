package cn.itcast.start.service;

import java.util.List;
import java.util.Map;

import cn.itcast.start.domain.User;

public interface UserService {
	
	/**
	 * 根据接口查询所用的用户
	 */
	public List<User> findAllUser();

	public Map<String, Object> redisMap();
}
