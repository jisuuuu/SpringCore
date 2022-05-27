package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member", //어디서 부터 찾을지 지정 가능, 지정 안하면 전부 다 스캔
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //AppConfig와 충돌 되지 않기 위해
)
public class AutoAppConfig {
}
