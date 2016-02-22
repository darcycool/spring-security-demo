package com.demo.tool;

/**
 * Created by Darcy on 2016/2/22.
 */
public interface UrlMatcher {
    Object compile(String paramString);

    boolean pathMatchesUrl(Object paramObject, String paramString);

    String getUniversalMatchPattern();

    boolean requiresLowerCaseUrl();
}
