//package com.ryw.conf.server.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class AuthCheckFilter implements Filter{
//	
//	private static final Logger logger = LoggerFactory.getLogger(AuthCheckFilter.class);
//	
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
//			throws IOException, ServletException {
//		
//		HttpServletRequest req = null;
//		HttpServletResponse res = null;
//		try {
//			req = (HttpServletRequest)request;
//			res = (HttpServletResponse)response;
//		} catch (ClassCastException e) {
//			throw new ServletException("non-HTTP request or reponse");
//			e.printStackTrace();
//		}
//		
//		
//		String pirectoryName = request.getParameter("pirectoryName");
//		String profiles = request.getParameter("profiles");
//		String lable = request.getParameter("lable");
//		
//		
//		String authContext = req.getHeader("authorization");
//		if (null == whiteListHander) {
//			throw new ServletException("对象 whiteListHander "+whiteListHander+"为空!");
//		}
//		
//		
//		
//		
//		
//		
//		chain.doFilter(request, response);
//		
//	}
//
//	@Override
//	public void init(FilterConfig arg0) throws ServletException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//		
//	}
//}
