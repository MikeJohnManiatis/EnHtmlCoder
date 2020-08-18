package com.EnHtmlCoder.EnHtmlCoder.Utility;

import com.EnHtmlCoder.EnHtmlCoder.Codes;
import org.springframework.stereotype.Component;


@Component(value = "SpanishTextEncoder")
public class SpanishTextEncoder implements Encoder<Character, String> {

    public SpanishTextEncoder() {

    }
    public String encode(Character c) {
        if (Codes.SPANISH_CODES().containsKey(c))
            return Codes.SPANISH_CODES().get(c);
        else
            return c.toString();
    }
}
