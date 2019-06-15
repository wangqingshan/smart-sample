package org.smart4j.wqs.day004;

/**
 * User
 *
 * @Title: User.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-14 17:26
 * @Author 90
 */
public class User {

    private String username;
    private int id;
    private String addr;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "id:"+id+" username"+username+" addr:"+addr;
    }
}
