package com.chinasofti.postbar.dto;


import java.util.Date;

public class PbRegister {

  private String regUuid;
  private String userUuid;
  private String regSex;
  private long regAge;
  private String regEmial;
  private String regPhoto;
  private Date regTime;


  public String getRegUuid() {
    return regUuid;
  }

  public void setRegUuid(String regUuid) {
    this.regUuid = regUuid;
  }


  public String getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }


  public String getRegSex() {
    return regSex;
  }

  public void setRegSex(String regSex) {
    this.regSex = regSex;
  }


  public long getRegAge() {
    return regAge;
  }

  public void setRegAge(long regAge) {
    this.regAge = regAge;
  }


  public String getRegEmial() {
    return regEmial;
  }

  public void setRegEmial(String regEmial) {
    this.regEmial = regEmial;
  }


  public String getRegPhoto() {
    return regPhoto;
  }

  public void setRegPhoto(String regPhoto) {
    this.regPhoto = regPhoto;
  }


  public Date getRegTime() {
    return regTime;
  }

  public void setRegTime(Date regTime) {
    this.regTime = regTime;
  }

}
