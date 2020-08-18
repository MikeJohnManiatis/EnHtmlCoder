package com.EnHtmlCoder.EnHtmlCoder.service;

public interface EncodingService<I, O> {
    O handleInput(I input);
}
