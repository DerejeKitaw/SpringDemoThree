package com.dkitaw.springdemothree.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "youtube_chanel")
  private String youtubeChanal;

  @Column(name = "hobby")
  private String hobby;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getYoutubeChanal() {
    return this.youtubeChanal;
  }

  public void setYoutubeChanal(String youtubeChanal) {
    this.youtubeChanal = youtubeChanal;
  }

  public String getHobby() {
    return this.hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  public InstructorDetail(String youtubeChanal, String hobby) {
    this.youtubeChanal = youtubeChanal;
    this.hobby = hobby;
  }

  public InstructorDetail() {
  }
}