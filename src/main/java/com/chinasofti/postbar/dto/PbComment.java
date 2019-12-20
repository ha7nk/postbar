package com.chinasofti.postbar.dto;

import java.util.Date;

public class PbComment {

  private String cmUuid;
  private String postUuid;
  private String userUuid;
  private String cmText;
  private String cmAudio;
  private Date cmTime;


  public String getCmUuid() {
    return cmUuid;
  }

  public void setCmUuid(String cmUuid) {
    this.cmUuid = cmUuid;
  }


  public String getPostUuid() {
    return postUuid;
  }

  public void setPostUuid(String postUuid) {
    this.postUuid = postUuid;
  }


  public String getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }


  public String getCmText() {
    return cmText;
  }

  public void setCmText(String cmText) {
    this.cmText = cmText;
  }


  public String getCmAudio() {
    return cmAudio;
  }

  public void setCmAudio(String cmAudio) {
    this.cmAudio = cmAudio;
  }


  public Date getCmTime() {
    return cmTime;
  }

  public void setCmTime(Date cmTime) {
    this.cmTime = cmTime;
  }

}
