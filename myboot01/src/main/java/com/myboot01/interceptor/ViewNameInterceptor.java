package com.myboot01.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//DispatcherServlet에서 Controller에 요청하기 전에 Interceptor에 들렸다 지나감 반대 요청도 마찬가지
public class ViewNameInterceptor extends HandlerInterceptorAdapter{
	//preHandle메소드는 DispatcherServlet에서 Controller에 요청하기 전 실행
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) {
		try {
			String viewName = getViewName(request);
			request.setAttribute("viewName", viewName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
		
	}
	//preHandle메소드의 반대
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception{
		
	}
	
	//jsp로 값을 보내주는 첫 단계 (처음에 입력한 주소를 자름)
		private String getViewName(HttpServletRequest request)throws Exception{
			String contextPath = request.getContextPath();
			String uri = (String)request.getAttribute("javax.servlet.include.request_uri");
			if(uri == null || uri.trim().equals("")) {
				uri = request.getRequestURI();
			}
			int begin = 0;
			if(!((contextPath == null) ||("".equals(contextPath)))) {
				begin = contextPath.length();
			}
			int end;
			if(uri.indexOf(";")!= -1) {
				end= uri.indexOf(";");
			}else if(uri.indexOf("?")!= -1) {
				end= uri.indexOf("?");
			}else {
				end = uri.length();
			}
			String fileName = uri.substring(begin,end);
			if(fileName.indexOf(".")!= -1){
				fileName = fileName.substring(0, fileName.lastIndexOf("."));
			}
			if(fileName.lastIndexOf("/") != -1) {
				fileName = fileName.substring(fileName.lastIndexOf("/"),fileName.length());
			}
			return fileName;
		}
}


