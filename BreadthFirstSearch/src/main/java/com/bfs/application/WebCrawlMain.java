package com.bfs.application;

public class WebCrawlMain {
    public static void main(String[] args) {
        WebCrawling crawling = new WebCrawling();
        crawling.webCrawl("https://www.bbc.com/");
    }
}
