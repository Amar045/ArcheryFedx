package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/pages/index")
public class IndexFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException {
        HttpServletResponse response = (HttpServletResponse) resp;
        response.sendRedirect(req.getServletContext().getContextPath() + "/index");
    }

    public void init(FilterConfig config) {
    }

    public void destroy() {
    }
}