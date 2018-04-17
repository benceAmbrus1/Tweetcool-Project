package com.codecool.web.servlet;

import com.codecool.web.service.TweetService;
import com.codecool.web.service.exception.NoInputException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/newtweet")
public class NewTweetServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String name = req.getParameter("name");
        String message = req.getParameter("message");
        TweetService service = new TweetService();
        try{
            service.addTweet(name, message);
        } catch (NoInputException e){
            req.setAttribute("error", e);
            req.getRequestDispatcher("newtweet.jsp").forward(req, resp);
        }

        resp.sendRedirect("newtweet.jsp");

    }
}
