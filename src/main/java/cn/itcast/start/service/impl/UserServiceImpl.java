package cn.itcast.start.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

//import redis.clients.jedis.JedisCluster;
import cn.itcast.start.domain.User;
import cn.itcast.start.mapper.UserMapper;
import cn.itcast.start.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	/*@Autowired
	private JedisCluster jedisCluster;*/
	
	
//	public List<User> findAllUser() {
//		List<User> list = userMapper.findAll();
//		return list;
//	}

	/**
	 * 测试：redis缓存
	 * @return
	 */
	@Cacheable(value = "findAllUser")
	public List<User> findAllUser() {
		System.out.println("测试缓存，第二次查询不走此方法!!!");
		List<User> list = userMapper.findAll();
		return list;
	}


	@Override
	public Map<String, Object> redisMap() {
		// TODO Auto-generated method stub
		return null;
	}


	//@Override
	//public Map<String, Object> redisMap() {
		//jedisCluster.set("user", "张三丰");
		//设置完毕，获取之
		//String value = jedisCluster.get("user");
		//Map<String, Object> maps = new HashMap<String, Object>();
		//maps.put("redis", value);
		//return maps;
	//}

}
