package com.softeem.pojo;

/**
 * @program:SpringCloud
 * @description:@todo
 * @author:Rage
 * @create:2020/10/8 21:49
 * @version: v1.0
 */
public class User {

    private int id;
    private String userName;
    private String sex;

    public User() {
    }

    public User(int id, String userName, String sex) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
