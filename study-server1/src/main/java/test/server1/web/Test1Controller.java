package test.server1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author sunYang
 * @Description:
 * @Title: Test1Controller
 * @Package test.server1.web
 * @date 2021-06-0218:47
 */
@RestController
@RequestMapping("/test1")
public class Test1Controller {

    @GetMapping("/t1")
    public Mono<String> t1(){
        return Mono.just("1111111111111");
    }

}