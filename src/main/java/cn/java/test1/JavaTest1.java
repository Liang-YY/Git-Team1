package cn.java.test1;

public interface JavaTest1 {
    int abc();

    default String test1(){
        return "aa";
    }
}
