package com.api.albion.repository;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Repository;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;

@Repository
public class ApiCallRepository {
    public void get(String requestURL) {
        try {
            CloseableHttpClient client = HttpClients.createDefault();
            HttpGet getRequest = new HttpGet(requestURL); //GET 메소드 URL 생성

            CloseableHttpResponse response = client.execute(getRequest);

            //Response 출력
            if (response.getStatusLine().getStatusCode() == 200) {
                ResponseHandler<String> handler = new BasicResponseHandler();
                String body = handler.handleResponse(response);
                System.out.println(body);
            } else {
                System.out.println("response is error : " + response.getStatusLine().getStatusCode());
            }

        } catch (Exception e){
            System.err.println(e.toString());
        }
    }
}
