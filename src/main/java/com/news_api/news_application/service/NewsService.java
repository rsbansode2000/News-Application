package com.news_api.news_application.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.news_api.news_application.entity.News;

@Service
public class NewsService {

    //getting any news by passing object[]
    public List<News> getAnyNewsList(Object[] newsObject) {

        List<News> newsList = new ArrayList<>();

        for (Object object : newsObject) {
            int id = Integer.parseInt(((LinkedHashMap) object).get("id").toString());
            int clicks = Integer.parseInt(((LinkedHashMap) object).get("clicks").toString());
            String newsHeading = ((LinkedHashMap) object).get("newsHeading").toString();
            String timing = ((LinkedHashMap) object).get("timing").toString();
            String writer = ((LinkedHashMap) object).get("writer").toString();
            String image = ((LinkedHashMap) object).get("image").toString();
            String fullNews = ((LinkedHashMap) object).get("fullNews").toString();

            // adding data to news list
            newsList.add(new News(id, clicks, newsHeading, timing, writer, image, fullNews));
        }

        return newsList;
    }

    //get all news from API
    public List<News> getAllNews() {
        String url = "http://localhost:8081/news";
        RestTemplate restTemplate = new RestTemplate();
        Object[] newsObject = restTemplate.getForObject(url, Object[].class);
        return this.getAnyNewsList(newsObject);

    }

    //get news by id using API
    public News getNewsById(int findid) {

        String url = "http://localhost:8081/news/" + findid;

        RestTemplate restTemplate = new RestTemplate();
        Object newsObject = restTemplate.getForObject(url, Object.class);
        int id = Integer.parseInt(((LinkedHashMap) newsObject).get("id").toString());
        int clicks = Integer.parseInt(((LinkedHashMap) newsObject).get("clicks").toString());
        String newsHeading = ((LinkedHashMap) newsObject).get("newsHeading").toString();
        String timing = ((LinkedHashMap) newsObject).get("timing").toString();
        String writer = ((LinkedHashMap) newsObject).get("writer").toString();
        String image = ((LinkedHashMap) newsObject).get("image").toString();
        String fullNews = ((LinkedHashMap) newsObject).get("fullNews").toString();

        News news = new News(id, clicks, newsHeading, timing, writer, image, fullNews);

        return news;

    }


    //getting latest news
    public List<News> getLatestNews(){
        String url = "http://localhost:8081/news/latest";
        RestTemplate restTemplate = new RestTemplate();
        Object[] newsObjects = restTemplate.getForObject(url, Object[].class);
        return this.getAnyNewsList(newsObjects);
    }



}
