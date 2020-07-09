package com.sf.demo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author sf
 * @Date Create in 2020/7/9
 * @Description
 */
@Data
public class Person implements Serializable {
    private static final long serialVersionUID = -8485438566482942784L;

    private int id;
    private String name;
    private int age;

    public void say() {
        System.out.println("人会说话....");
    }
}
