package br.com.ricardosander.mypetapi.filter;

import br.com.ricardosander.mypetapi.entities.Session;
import br.com.ricardosander.mypetapi.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName = "authentication", urlPatterns = "/*")
public class AuthenticationFilter implements Filter {

  private static final String TOKEN_NAME = "skey";

  private SessionRepository sessionRepository;

  @Autowired
  public AuthenticationFilter(
      SessionRepository sessionRepository) {
    this.sessionRepository = sessionRepository;
  }


  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {

    HttpServletRequest request = (HttpServletRequest) servletRequest;

    Optional<Session> session = sessionRepository.findByToken(request.getHeader(TOKEN_NAME));

    if (session.isPresent()) {
      request.getSession().setAttribute("userId", session.get().getUserId());
      filterChain.doFilter(servletRequest, servletResponse);
      return;
    }

    HttpServletResponse response = (HttpServletResponse) servletResponse;
    response.setStatus(401);
    response.getWriter().append("Deny");
  }



  @Override
  public void destroy() {

  }
}
