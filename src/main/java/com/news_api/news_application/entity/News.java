package com.news_api.news_application.entity;

public class News {
    private int id;
    private int clicks;
    private String newsHeading;
    private String timing;
    private String writer;
    private String image;
    private String fullNews;

    
    public News(int id, int clicks, String newsHeading, String timing, String writer, String image, String fullNews) {
        this.id = id;
        this.clicks = clicks;
        this.newsHeading = newsHeading;
        this.timing = timing;
        this.writer = writer;
        this.image = image;
        this.fullNews = fullNews;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getClicks() {
        return clicks;
    }
    public void setClicks(int clicks) {
        this.clicks = clicks;
    }
    public String getFullNews() {
        return fullNews;
    }
    public void setFullNews(String fullNews) {
        this.fullNews = fullNews;
    }
    private String fullNews;
    
    News(){}
    public String getNewsHeading() {
        return newsHeading;
    }
    @Override
    public String toString() {
        return "User [newsHeading=" + newsHeading + ", timing=" + timing + ", writer=" + writer + ", image=" ;
    }
    public void setNewsHeading(String newsHeading) {
        this.newsHeading = newsHeading;
    }
    public String getTiming() {
        return timing;
    }
    public void setTiming(String timing) {
        this.timing = timing;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

}
