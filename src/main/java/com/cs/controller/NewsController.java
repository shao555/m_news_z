package com.cs.controller;

import com.alibaba.fastjson.JSON;
import com.cs.entity.NewsCategory;
import com.cs.entity.NewsDetail;
import com.cs.service.impl.NewsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class NewsController {
	
	@Resource
	private NewsServiceImpl newsService;


	@RequestMapping("/cate")
	public void cate(HttpServletResponse response) throws Exception {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		List<NewsCategory> clist = newsService.findAllcateNews();
		String newsJSON = JSON.toJSONStringWithDateFormat(clist, "yyyy-MM-dd hh:mm");
		System.out.println(newsJSON);
		out.print(newsJSON);
		out.flush();
		out.close();
	}
	
	@RequestMapping("/show")
	public String list(HttpServletResponse response) throws Exception {
		//查询所有新闻信息
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		List<NewsDetail> list = newsService.findAllNews();
		String newsJSON = JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd hh:mm");
		out.print(newsJSON);
		out.flush();
		out.close();
		return "show";
	}
	
	@RequestMapping("/findByTitle")
	public void findByTitle(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String select = request.getParameter("select");
		String title = request.getParameter("title");

		int	i = Integer.parseInt(select);

		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		//根据分类和标题模糊查询新闻信息
		List<NewsDetail> list = newsService.findBycateAndtitle(i, title);
		String newsJSON = JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd hh:mm");
		System.out.println(newsJSON);
//		//根据新闻标题查询新闻记录数
//		int count = newsService.findCountByTitle(title);
		out.print(newsJSON);
		out.flush();
		out.close();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(@RequestParam int id,
	                     Model model) throws Exception {
		//根据新闻编号获取新闻信息
		NewsDetail newsDetail = newsService.findById(id);
		model.addAttribute("n", newsDetail);
		return "update";
	}
	
	@RequestMapping(value = "/check.do", method = RequestMethod.POST)
	public void checkTitle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String title = request.getParameter("title");
		PrintWriter out = response.getWriter();
		//根据标题查询是否重复
		NewsDetail newsDetail = newsService.checkTitle(title);
		boolean flag = false;
		if (newsDetail != null) {
			flag = true;
		} else {
			flag = false;
		}
		out.print(flag);
		out.flush();
		out.close();
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String updatedo(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		int id1 = Integer.parseInt(id);
		String select = request.getParameter("select");
		int i = Integer.parseInt(select);
		String title = request.getParameter("title");
		String summary = request.getParameter("summary");
		String author = request.getParameter("author");
		NewsDetail newsDetail = new NewsDetail();
		newsDetail.setId(id1);
		newsDetail.setCategoryId(i);
		newsDetail.setTitle(title);
		newsDetail.setSummary(summary);
		newsDetail.setAuthor(author);
		//修改新闻信息
		int i1 = newsService.updateNews(newsDetail);
		String index = "";
		if (i1 > 0) {
			index = this.list(response);
		}
		return index;
	}
}
