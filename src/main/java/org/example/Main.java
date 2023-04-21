package org.example;
public class Main {
    public static void main(String[] args) {
        Response response = new Response();
        JsonParser jsonParser = new JsonParser();
        System.out.println(jsonParser.sortBody(response.getResponse("https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats")));
    }
}