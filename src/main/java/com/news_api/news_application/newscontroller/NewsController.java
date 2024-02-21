package com.news_api.news_application.newscontroller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.news_api.news_application.entity.News;
import com.news_api.news_application.service.NewsService;
import com.news_api.news_application.testing.TestApp;

@Controller
public class NewsController {

    final String COMPANY_NAME = "NewsApp";

    TestApp testApp = new TestApp();
    @Autowired
    NewsService newsService;

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("title", "My Title");
        String url = "http://localhost:8081/news";
        RestTemplate restTemplate = new RestTemplate();
        Object[] res = restTemplate.getForObject(url, Object[].class);
        // res[0] is linked hashmap
        System.out.println(res[0]);
        // getting values
        int id = Integer.parseInt(((LinkedHashMap) res[0]).get("id").toString());
        System.out.println("Id : " + (id + 2));
        // System.out.println(res[0].getClass());
        model.addAttribute("companyName", COMPANY_NAME);

        return "test";
    }

    // getting all news
    @GetMapping("/home")
    public String home(Model model) {

        List<News> news = newsService.getAllNews();

        model.addAttribute("users", news);
        model.addAttribute("companyName", COMPANY_NAME);
        return "index";
    }

    // getting news by id
    @GetMapping("/news/{id}")
    public String getNews(Model model, @PathVariable("id") int id) {
        // model.addAttribute("id", user.getNewsHeading());
        News news = newsService.getNewsById(id);
        model.addAttribute("user", news);
        model.addAttribute("companyName", COMPANY_NAME);
        return "news";
    }

    @GetMapping("/about_us")
    public String aboutUs(Model model) {
        model.addAttribute("companyName", COMPANY_NAME);
        return "about_us";
    }

    @GetMapping("/contact_us")
    public String contactUs(Model model) {
        model.addAttribute("companyName", COMPANY_NAME);
        return "contact_us";
    }

    @GetMapping("/latest")
    public String laest(Model model) {
        List<News> news = newsService.getLatestNews();

        model.addAttribute("users", news);
        model.addAttribute("companyName", COMPANY_NAME);
        return "latest";
    }

}
