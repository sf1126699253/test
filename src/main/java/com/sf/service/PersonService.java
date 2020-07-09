package com.sf.service;

import com.sf.demo.Person;

/**
 * @Author sf
 * @Date Create in 2020/7/9
 * @Description
 */
public interface PersonService {

    /**
     * 获取人员信息
     * @return
     * @throws Exception
     */
    Person getPerson() throws Exception;

    /**
     * 新增人员信息
     * @param person1
     * @throws Exception
     */
    void insertPerson(Person person1) throws Exception;
}
