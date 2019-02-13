package com.bw.com.fanshe;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class list {

   /* public static void main(String[] args) throws Exception {
        // 创建ArrayList集合
        ArrayList<String> list = new ArrayList<>();
        // 获取Class文件对象
        Class<? extends ArrayList> c = list.getClass();
        // 获取ArrayList类中的add方法
        Method method = c.getDeclaredMethod("add", Object.class);
        // 调用该方法存值
        method.invoke(list, 20);
        method.invoke(list, "庆欢孙子");
        System.out.println(list);
    }*/
   public static void main(String[] args) throws Exception{
        //创建Arraylist集合
       ArrayList<String> list=new ArrayList<>();
       //获取对象Class文件对象
       Class<? extends ArrayList> b=list.getClass();
       //获取ArrayList类中的add方法
       Method method = b.getDeclaredMethod("add", Object.class);
       //调用该方法存值
       method.invoke(list,12);
       method.invoke(list,"傻子万岁");
       System.out.print(list);

   }

    }
