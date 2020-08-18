package com.EnHtmlCoder.EnHtmlCoder.Utility;

public interface Crawler<I, O> {
    O crawl(I input);
}
