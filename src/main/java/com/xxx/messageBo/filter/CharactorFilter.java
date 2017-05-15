package com.xxx.messageBo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * 字符编码过滤器
 * @author miao
 * @date 2017年5月8日
 */
//注释配置过滤器
@WebFilter(urlPatterns={"/*"},initParams={@WebInitParam(name="encoding",value="UTF-8")
})
public class CharactorFilter implements Filter{
	String encoding=null;
	public CharactorFilter(){
		
	}
	//初始化方法
	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
		encoding=filterConfig.getInitParameter("encording");
	}
	
	//过滤器处理方法
	@Override
	public void doFilter(ServletRequest servletRequest,ServletResponse servletResponse,FilterChain filterChain)throws IOException,ServletException{
		if(encoding!=null){
			//设置请求的编码格式
			servletRequest.setCharacterEncoding(encoding);
			//设置response字符编码
			servletResponse.setContentType("text/html;charset="+encoding);
		}
		//传递给下一个过滤器
		filterChain.doFilter(servletRequest, servletResponse);
	}
	//销毁方法
	@Override
	public void destroy(){
		encoding=null;
	}

}
