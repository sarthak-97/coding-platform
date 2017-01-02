package org.javabrain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class submission {
	
 @Id @GeneratedValue
 int id;
 int userid;
 int quesid;
 @Lob
 private String Status;
 private String admno;
 private String name;
 public String getAdmno() {
	return admno;
}
public void setAdmno(String admno) {
	this.admno = admno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private String srccode;
 private String date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getQuesid() {
	return quesid;
}
public void setQuesid(int quesid) {
	this.quesid = quesid;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public String getSrccode() {
	return srccode;
}
public void setSrccode(String srccode) {
	this.srccode = srccode;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
 
}
