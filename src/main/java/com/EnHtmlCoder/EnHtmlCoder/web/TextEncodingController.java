package com.EnHtmlCoder.EnHtmlCoder.web;

import com.EnHtmlCoder.EnHtmlCoder.service.EncodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextEncodingController {

    @Autowired
    @Qualifier(value = "TextEncodingService")
    EncodingService<String, String> encodingService;

    @RequestMapping("/encodeText")
    public String encodeText(String input) {
        String test = encodingService.handleInput(input);
        return test;
    }
}
