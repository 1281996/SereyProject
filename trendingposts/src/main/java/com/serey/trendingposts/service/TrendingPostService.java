package com.serey.trendingposts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.serey.trendingposts.pojo.SereyTrendingPosts;
import com.serey.trendingposts.repo.TrendingPostRepo;

@Component
public class TrendingPostService {
	@Autowired
	TrendingPostRepo trendingPostRepo;


	public List<SereyTrendingPosts> getPosts() {
		// TODO Auto-generated method stub
		 List<SereyTrendingPosts> listOfPosts=trendingPostRepo.findAll();
		return listOfPosts;
	}


	public boolean savePost(SereyTrendingPosts sereyTrendingPosts) {
		// TODO Auto-generated method stub
		trendingPostRepo.save(sereyTrendingPosts);
		return true;
		
	}
	

}
