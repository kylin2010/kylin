package com.atguigu.boot05web.Inteceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author kylin
 * @date 2021-01-23 22:44
 * 登录检查
 * 1.这个拦截器要拦截哪些请求
 * 2.把拦截器放到容器中
 */
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 目标方法执行以前
     * @param request 请求
     * @param response 响应
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录检查逻辑
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser!=null){
            //放行请求
            return true;
        }
        //拦截住,跳转到登录界面，重定向取不出东西
        /* response.sendRedirect("/");*/
       request.setAttribute("msg","请先登录");
        request.getRequestDispatcher("/").forward(request,response);

        return false;
    }

    /**
     * 目标方法执行以后
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
