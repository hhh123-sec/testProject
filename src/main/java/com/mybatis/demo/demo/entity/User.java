package com.mybatis.demo.demo.entity;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class User {

    private Integer userId;
    private MysqlxDatatypes.Scalar.String userName;
    private MysqlxDatatypes.Scalar.String password;
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public MysqlxDatatypes.Scalar.String getUserName() {
        return userName;
    }
    public void setUserName(MysqlxDatatypes.Scalar.String userName) {
        this.userName = userName;
    }
    public MysqlxDatatypes.Scalar.String getPassword() {
        return password;
    }
    public void setPassword(MysqlxDatatypes.Scalar.String password) {
        this.password = password;
    }

}