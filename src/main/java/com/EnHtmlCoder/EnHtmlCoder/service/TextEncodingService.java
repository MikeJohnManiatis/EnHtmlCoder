package com.EnHtmlCoder.EnHtmlCoder.service;

import com.EnHtmlCoder.EnHtmlCoder.Utility.Crawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(value = "TextEncodingService")
public class TextEncodingService implements EncodingService<String, String> {
    @Autowired
    @Qualifier(value = "HtmlCrawler")
    Crawler<String, String> htmlCrawler;

    public String handleInput(String input){
        return htmlCrawler.crawl(input);
    }
}
