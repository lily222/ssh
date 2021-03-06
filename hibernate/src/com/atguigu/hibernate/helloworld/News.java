//持久化类,一般的javabean
package com.atguigu.hibernate.helloworld;

import java.sql.Date;

public class News {

	private Integer id;
	private String title;
	private String author;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	//为创建对象方面
	public News(String title, String author, Date date) {
		super();
		this.title = title;
		this.author = author;
		this.date = date;
	}
	public News(){
		
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", author=" + author
				+ ", date=" + date + "]";
	}
	
}
