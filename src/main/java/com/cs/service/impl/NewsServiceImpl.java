package com.cs.service.impl;

import com.cs.entity.NewsCategory;
import com.cs.entity.NewsDetail;
import com.cs.mapper.NewsMapper;
import com.cs.service.NewsService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service("service")
public class NewsServiceImpl implements NewsService {
	
	@Resource
	private NewsMapper newsMapper;
	
	//查询所有新闻信息
	@Override
	public List<NewsDetail> findAllNews() throws Exception {
		return newsMapper.findAllNews();
//		return null;
	}
	
	//根据分类和标题模糊查询新闻信息
	@Override
	public List<NewsDetail> findBycateAndtitle(int categoryId, String title) throws Exception {
		return newsMapper.findBycateAndtitle(categoryId, title);
//		return null;
	}
	
	//根据新闻编号获取新闻信息
	@Override
	public NewsDetail findById(int id) throws Exception {
		return newsMapper.findById(id);
//		return null;
	}
	
	//查询所有新闻分类信息
	@Override
	public List<NewsCategory> findAllcateNews() throws Exception {
		return newsMapper.findAllcateNews();
//		return null;
	}
	
	//根据新闻标题查询新闻记录数
	@Override
	public int findCountByTitle(String title) throws Exception {
		return newsMapper.findCountByTitle(title);
//		return 0;
	}
	
	//修改新闻信息
	@Override
	public int updateNews(NewsDetail newsDetail) throws Exception {
		return newsMapper.updateNews(newsDetail);
//		return 0;
	}
	
	//根据标题查询是否重复
	@Override
	public NewsDetail checkTitle(String title) throws Exception {
		return newsMapper.checkTitle(title);
//		return null;
	}
}
