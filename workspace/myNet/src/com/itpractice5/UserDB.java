package com.itpractice5;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    private static List<User> users = new ArrayList<User>();
    
    static{
       users.add(new User("zhang","123456"));
       users.add(new User("lishi","123456"));
       users.add(new User("wangwu","123456"));
       users.add(new User("admin","password"));
       
    
    }
    public static List<User> getUsers(){
 	   return users;
    }
}
