package com.chinasofti.postbar.dto;


import java.util.Date;

public class PbPost {

  private String postUuid;
  private String userUuid;
  private String postTitle;
  private String postText;
  private long postPageviews;
  private String postAudio;
  private Date postTime;


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


  public String getPostTitle() {
    return postTitle;
  }

  public void setPostTitle(String postTitle) {
    this.postTitle = postTitle;
  }


  public String getPostText() {
    return postText;
  }

  public void setPostText(String postText) {
    this.postText = postText;
  }


  public long getPostPageviews() {
    return postPageviews;
  }

  public void setPostPageviews(long postPageviews) {
    this.postPageviews = postPageviews;
  }


  public String getPostAudio() {
    return postAudio;
  }

  public void setPostAudio(String postAudio) {
    this.postAudio = postAudio;
  }


  public Date getPostTime() {
    return postTime;
  }

  public void setPostTime(Date postTime) {
    this.postTime = postTime;
  }

}
