package com.kiran.UserManagement.Model;

public class User {
    int UserId;
    String Name;
    String UserName;
    String Address;
    long PhoneNumber;

    public User() {
    }

    public User(int userId, String name, String userName, String address, long phoneNumber) {
        this.UserId = userId;
        this.Name = name;
        this.UserName = userName;
        this.Address = address;
        this.PhoneNumber = phoneNumber;
    }

    public int getUserId() {
        return this.UserId;
    }

    public void setUserId(int userId) {
        this.UserId = userId;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public long getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }
}
