package com.EnHtmlCoder.EnHtmlCoder.Utility;

public interface Encoder<I, O> {
    O encode(I input);
}
