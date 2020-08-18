package com.EnHtmlCoder.EnHtmlCoder.Utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
@Qualifier(value = "HtmlCrawler")
public class HtmlCrawler implements Crawler<String, String>{

    @Autowired
    @Qualifier(value = "SpanishTextEncoder")
    private SpanishTextEncoder spanishTextEncoder;

    public String crawl(String toCrawl){
        StringBuilder sb = new StringBuilder();
        sb.append(crawlAndEncodeSpanish(toCrawl));
        return sb.toString();
    }
    private String crawlAndEncodeSpanish(String toCrawl){
        StringBuilder sb = new StringBuilder();
        toCrawl.chars()
                .mapToObj(ch -> (char) ch)
                .forEach(c -> sb.append(spanishTextEncoder.encode(c)));
        return sb.toString();
    }
}
