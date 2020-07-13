import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        //Get the number of customer guesses submitted
        int guessNumber=Integer.parseInt(request.getParameter("guessnumber"));
        //Get the client's session object
        HttpSession session=request.getSession();
        Integer integer=(Integer)session.getAttribute("saveNumber");
        int realNumber=integer.intValue();
        System.out.println(realNumber);
        System.out.println(guessNumber);
        System.out.println(" I'm thinking of a number between 1 and 100. Guess what it is.");
        if(guessNumber>realNumber){
            session.setAttribute("message", "guess big");
            System.out.println ("No, that's too low. Guess again.");
            response.sendRedirect("input.jsp");
        }
        else if(guessNumber<realNumber){
            session.setAttribute ("message", "guess small");
            System.out.println ("No, that's too high. Guess again.");
            response.sendRedirect("input.jsp");
        }
        else if(guessNumber<realNumber){
            session.setAttribute("message", "you guessed it right");
            System.out.println ("No, that's too low. Guess again.");
            response.sendRedirect("input.jsp");
        }
        else if(guessNumber<realNumber){
            session.setAttribute("massage", "you guessed it right");
            System.out.println("No, that's too low. Guess again.");
            response.sendRedirect("input.jsp");
        }
        else{
            session.setAttribute("masaage", "you guessed it right");
            System.out.println("That's right! You guessed my number in only 5 tries! Would you like to play again?");
            response.sendRedirect("input.jsp");
        }
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
