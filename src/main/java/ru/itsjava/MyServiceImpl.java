package ru.itsjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl {

//    @Autowired
//    private MyServiceImpl myService;

    @Annotation1
    public void method1(){
        System.out.println("method1");
//        myService.method2();
        method2();
    }

    public void method2(){
        System.out.println("method2");
    }
}
