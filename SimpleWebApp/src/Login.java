import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.UserEntity;

@WebServlet(name = "/Login", urlPatterns = "/Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        //System.out.println(request.getParameter("name"));
        //System.out.println(request.getParameter("pass"));
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        UserDao userDao = new UserDao();
        if (userDao.checkLogin(name, pass)) {
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

