package servlet;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet", urlPatterns = "/index")
public class Servlet extends HttpServlet {
    private static final String SERVLET = "SERVLET";
    private static final String ERROR = "ERROR: ";
    private static final String EXCEPTION_END = "-----------------------";

    private static final String ROLE_ADMIN = "admin";
    private static final String ROLE_NOF = "nof";
    private static final String ROLE_BOF = "bof";
    private static final String ROLE_ARO = "aro";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        try {
//            if (request.isUserInRole(ROLE_ADMIN))
                response.sendRedirect(getServletContext().getContextPath() + "/pages/competition.xhtml");
//            else if (request.isUserInRole(ROLE_BOF))
//                response.sendRedirect(getServletContext().getContextPath() + "/pages/briefing.xhtml");
//            else if (request.isUserInRole(ROLE_NOF))
//                response.sendRedirect(getServletContext().getContextPath() + "/pages/ntm_new.xhtml");
//            else if (request.isUserInRole(ROLE_ARO))
//                response.sendRedirect(getServletContext().getContextPath() + "/pages/message.xhtml");

        } catch (Exception e) {
            System.out.println(ERROR + SERVLET);
            System.out.println(e.getMessage());
            System.out.println(EXCEPTION_END);
        }
    }
}
