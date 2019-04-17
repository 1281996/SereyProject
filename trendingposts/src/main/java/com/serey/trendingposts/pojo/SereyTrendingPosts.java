package com.serey.trendingposts.pojo;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="trendingPosts")
public class SereyTrendingPosts {
	@Id
	private String userName;
	private LocalDate howManyHoursAgo;
	private String typeOfPost;
	private String imageLink;
	private ArrayList<String> comments;
	private int likes;
	
	public SereyTrendingPosts() {
		
	}

	public SereyTrendingPosts(String userName, LocalDate howManyHoursAgo, String typeOfPost, String imageLink,
			ArrayList<String> comments, int likes) {
		super();
		this.userName = userName;
		this.howManyHoursAgo = howManyHoursAgo;
		this.typeOfPost = typeOfPost;
		this.imageLink = imageLink;
		this.comments = comments;
		this.likes = likes;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getHowManyHoursAgo() {
		return howManyHoursAgo;
	}

	public void setHowManyHoursAgo(LocalDate howManyHoursAgo) {
		this.howManyHoursAgo = howManyHoursAgo;
	}

	public String getTypeOfPost() {
		return typeOfPost;
	}

	public void setTypeOfPost(String typeOfPost) {
		this.typeOfPost = typeOfPost;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public ArrayList<String> getComments() {
		return comments;
	}

	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "SereyTrendingPosts [userName=" + userName + ", howManyHoursAgo=" + howManyHoursAgo + ", typeOfPost="
				+ typeOfPost + ", imageLink=" + imageLink + ", comments=" + comments + ", likes=" + likes + "]";
	}
	
	

}
