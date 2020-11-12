package com.cs.service;

import com.cs.entity.NewsCategory;
import com.cs.entity.NewsDetail;

import java.util.List;

public interface NewsService {
	
	//查询所有新闻信息
	public List<NewsDetail> findAllNews() throws Exception;
	
	//根据分类和标题模糊查询新闻信息
	public List<NewsDetail> findBycateAndtitle(int categoryId,String title) throws Exception;
	
	//根据新闻编号获取新闻信息
	public NewsDetail findById(int id) throws Exception;
	
	//查询所有新闻分类信息
	public List<NewsCategory> findAllcateNews() throws Exception;
	
	//根据新闻标题查询新闻记录数
	public int findCountByTitle(String title) throws Exception;
	
	//修改新闻信息
	public int updateNews(NewsDetail newsDetail) throws Exception;
	
	//根据标题查询是否重复
	public NewsDetail checkTitle(String title) throws Exception;
}
