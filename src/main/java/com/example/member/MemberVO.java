package com.example.member;

import java.util.Date;

public class MemberVO {
    private int seq;
    private String category;
    private String name;
    private String phoneNumber;
    private String email;
    private Date regdate;
    private String age;
    private String birthDate;
    private String gender;
    private int cnt;

    public int getSeq() { return seq; }
    public void setSeq(int seq) { this.seq = seq; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegdate() { return regdate; }
    public void setRegdate(Date regdate) { this.regdate = regdate; }
    public int getCnt() { return cnt; }
    public void setCnt(int cnt) { this.cnt = cnt; }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}