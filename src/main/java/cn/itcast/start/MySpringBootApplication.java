package cn.itcast.start;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
@SpringBootApplication
@EnableCaching
public class MySpringBootApplication {
	
	public static void main(String[] args) {		
		//入口运行类
		SpringApplication.run(MySpringBootApplication.class, args);
		
	}

}
