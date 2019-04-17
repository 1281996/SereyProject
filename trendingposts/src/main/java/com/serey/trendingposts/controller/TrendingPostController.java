package com.serey.trendingposts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serey.trendingposts.pojo.SereyTrendingPosts;
import com.serey.trendingposts.service.TrendingPostService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TrendingPostController {
	@Autowired
	TrendingPostService  trendingPostService; 
	@GetMapping("/getAllPosts")
	List<SereyTrendingPosts> getPosts(){
		System.out.println("in controller");
		List<SereyTrendingPosts> listOfPosts=trendingPostService.getPosts();
		return listOfPosts;
	}
	@PostMapping("/addPost")
	boolean savePost(@RequestBody SereyTrendingPosts sereyTrendingPosts ) {
		
		trendingPostService.savePost(sereyTrendingPosts);
		return true;
	}
	
}
