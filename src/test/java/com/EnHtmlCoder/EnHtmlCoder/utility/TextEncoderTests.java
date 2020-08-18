package com.EnHtmlCoder.EnHtmlCoder.utility;


import com.EnHtmlCoder.EnHtmlCoder.Utility.Encoder;
import com.EnHtmlCoder.EnHtmlCoder.Utility.HtmlCrawler;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class TextEncoderTests {
    @Autowired
    @Qualifier(value = "SpanishTextEncoder")
    private Encoder<Character, String> spanishTextEncoder;

    @Autowired
    @Qualifier(value = "HtmlCrawler")
    private HtmlCrawler crawler;

    @Before
    public void setUp() {
    }

    @Test
    public void encodeSingleLetter_e(){
        String encodedLetter = spanishTextEncoder.encode('é');
        Assert.assertEquals(encodedLetter, "&#233;");
    }

    @Test
    public void encodeSentence() {
        String decodedSentence = getTestHtml();
        String encodedSentence = crawler.crawl(decodedSentence);
        Assert.assertEquals("Ir&#233; s&#243;lo si t&#250; vas tambi&#233;n.", encodedSentence);
    }

    private String getTestHtml() {
        return "Iré sólo si tú vas también.";

    }
}
