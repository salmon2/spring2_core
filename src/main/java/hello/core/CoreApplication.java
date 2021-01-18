package hello.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//스프링 부트 안에 컨포넌트 스캔이 있다. 그냥 @components 붙여서 오토와이이어드 가능
//자동 vs 수동 충돌시 오버라이딩이 아닌 그냥 오류 메시지 출력
@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

}
