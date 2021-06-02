package test.server1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.lang.reflect.Field;

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

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[]) c.get(cache);
        // array[129] is 1
        array[130] = array[129];
        // Set 2 to be 1
        array[131] = array[129];
        // Set 3 to be 1

        Integer a = 1;

        if(a.equals(1) && a.equals(2) && a.equals(3)){
            System.out.println("Success");
        }
    }

}