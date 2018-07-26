package com.tincho.expenses.config.security;

import org.springframework.web.filter.GenericFilterBean;
import org.springframework.security.core.Authentication;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import java.io.IOException;

public class JWTAuthenticationFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Authentication authentication = TokenAuthorizationService
                .getAuthentication((HttpServletRequest)servletRequest);

        SecurityContextHolder.getContext()
                .setAuthentication(authentication);
        filterChain.doFilter(servletRequest,servletResponse);
    }
}