package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;
// 전부 하위에 @component가 있다.
//@Controller : 스프링 MVC 컨트롤러로 인식
//@Repository : 스프링 데이터 접근 계층으로 인식하고, 데이터 계층의 예외를 스프링 예외로 변환해준다.
//@Configuration : 앞서 보았듯이 스프링 설정 정보로 인식하고, 스프링 빈이 싱글톤을 유지하도록 추가 처
//        리를 한다.
//@Service
@Configuration
@ComponentScan(
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //,basePackages = "hello.core.member",
        //basePackageClasses = AutoAppConfig.class
        //디폴트 : 이 페이지의 패키지부터 뒤짐
        //권장 : 설정파일 최상단에 두고 디폴트로 두기
)
public class AutoAppConfig {
}
