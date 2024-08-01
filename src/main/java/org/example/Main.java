package org.example;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main implements HttpFunction {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        BufferedWriter writer = response.getWriter();
        writer.write("hel loWorld");
    }
}
