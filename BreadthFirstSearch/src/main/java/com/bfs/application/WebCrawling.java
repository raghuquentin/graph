package com.bfs.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawling {
    private Queue<String> queue = new LinkedList<>();
    private List<String> visitedList = new ArrayList<>();
    public void webCrawl(String rootUrl){
        queue.add(rootUrl);
        visitedList.add(rootUrl);

        while(!queue.isEmpty()){
            String url = queue.remove();
            System.out.println(url);
            String siteData = websiteContent(url);
            String pattern = "https://(\\w+\\.)*(\\w+)";
            Pattern p1 = Pattern.compile(pattern);
            Matcher matcher = p1.matcher(siteData);
            while (matcher.find()){
                String url1 = matcher.group();
                if(!visitedList.contains(url1)){
                    queue.add(url1);
                    visitedList.add(url1);
                }
            }
        }
    }
    public String websiteContent(String u)  {
        StringBuilder builder = new StringBuilder();
        try {
            URL url = new URL(u);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line="";
            while ((line= reader.readLine())!=null){
                builder.append(line);
            }
        }catch (Exception e){
            System.out.println("Error while reading website content....");
        }
        return builder.toString();
    }
}
