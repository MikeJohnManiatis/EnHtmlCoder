package com.EnHtmlCoder.EnHtmlCoder;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class Codes {
    public static HashMap<Character, String> SPANISH_CODES(){
        HashMap<Character, String> codes = new HashMap<>();
        codes.put('á', "&#225;");
        codes.put('é', "&#233;");
        codes.put('í', "&#237;");
        codes.put('ó', "&#243;");
        codes.put('ú', "&#250;");
        codes.put('ñ', "&#241;");
        codes.put('ü', "&#252;");
        codes.put('Á', "&#193;");
        codes.put('É', "&#201;");
        codes.put('Í', "&#205;");
        codes.put('Ó', "&#211;");
        codes.put('Ú', "&#218;");
        codes.put('Ñ', "&#209;");
        codes.put('Ü', "&#220;");
        return codes;
    }
}
