package Control;

import DAO.UserDAO;
import Model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name= "Control",urlPatterns = {"/User-Controller"})
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            UserDAO userDAO = new UserDAO();
            String username = req.getParameter("user");
            String password = req.getParameter("pass");
            User user = userDAO.getUser(username,password);
            if(user!=null){
                resp.sendRedirect("index.jsp");
            }else{
                req.setAttribute("mess","Tài khoản hoặc mật khẩu không chính xác");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp");
                requestDispatcher.forward(req,resp);
            }
    }
}
