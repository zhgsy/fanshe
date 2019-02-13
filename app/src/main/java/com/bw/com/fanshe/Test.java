package com.bw.com.fanshe;

import com.bw.com.fanshe.entity.PersonEntity;
import com.bw.com.fanshe.entity.Son;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] a){
        //第一种
        Class c1 = PersonEntity.class;
        //第二种
        PersonEntity personEntity = new PersonEntity();
        Class c2 = personEntity.getClass();

        //第三种
        try {
            Class c3 = Class.forName("com.example.kson.a8creflection.entity.PersonEntity");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //获取构造器
        try {
            //获取公开的构造器
            Constructor constructor = c1.getConstructor(null);
            //实例化构造器
            PersonEntity personEntity1 = (PersonEntity) constructor.newInstance(null);
//            personEntity1.fun();
            //第二种获取构造器
//            Constructor constructor1 = c1.getDeclaredConstructor(String.class,int.class);
            //获取受保护的构造器
            Constructor constructor1 = c1.getDeclaredConstructor(new Class[]{String.class,int.class});
            constructor1.setAccessible(true);//强制访问，开通权限
            //通过构造器创建对象
            PersonEntity personEntity2 = (PersonEntity) constructor1.newInstance("宽松",100);
//            personEntity2.fun();

            //获取域，成员变量
            Field field = c1.getField("age");
//            field.set(new PersonEntity(),99);//不能直接new
//            field.set(PersonEntity.class.newInstance(),99);
            PersonEntity personEntity3 = (PersonEntity) constructor.newInstance(null);
//            field.set(personEntity3,99);
//            personEntity3.fun();

//            Field field1 = c1.getDeclaredField("name");
//            field1.setAccessible(true);
//
//            field1.set(personEntity3,"kson");
//            personEntity3.fun();
            //获取方法用的控件
            Method method = c1.getMethod("fun" ,null);
            //执行方法 调用构造器
            method.invoke(personEntity3,null);

            Method method1 = c1.getDeclaredMethod("fun1", String.class, int.class, String.class);
            //强制访问 开通权限
            method1.setAccessible(true);

            method1.invoke(personEntity3,"k",99,"s");
            new Son().f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
