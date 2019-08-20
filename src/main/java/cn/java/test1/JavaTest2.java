package cn.java.test1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaTest2 {

    /**
     * 通过Lambda遍历集合
     * 遍历单列集合语法：集合对象名.forEach(temp->{代码块});
     * 如果代码块中的只有一行代码时花括号可以省略，且那一行代码的分号也可以省略
     * 遍历双列集合语法：集合对象名.forEach((k,v)->{代码块});
     */
    @Test
    public void test1(){
        // 单列集合：List、Set
        List<String> aList = Arrays.asList("中国","美国","日本");
        aList.forEach(temp-> System.out.println(temp));

        // 双列集合：Map
        Map<String,Object> aMap = new HashMap<>();
        aMap.put("1","aaa");
        aMap.put("2","bbb");
        aMap.put("3","ccc");
        aMap.forEach((k,v) -> System.out.println(k + " : " + v));
    }

}
