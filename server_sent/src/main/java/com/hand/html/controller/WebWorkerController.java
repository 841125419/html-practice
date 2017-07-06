package com.hand.html.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by Administrator on 2017/7/4.
 */
public class WebWorkerController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //content type must be set to text/event-stream

        resp.setContentType("text/event-stream");

        //encoding must be set to UTF-8

        resp.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();

        Random random = new Random();

        writer.write("data: " + random.nextInt(55) + "\n\n");

    }
}
