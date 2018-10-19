package com.example.demo.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import com.example.demo.constant.ZuulConstant;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// 是否执行该过滤器，true，需要执行
		return true;
	}

	@Override
	public String filterType() {
		// 过滤器类型，pre 前置过滤器
		return FilterConstants.PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		// 过滤器优先级，数字越小，优先级越高
		return 0;
	}

	@Override
	public Object run() throws ZuulException {
		// 
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		String username = request.getParameter(ZuulConstant.TOKEN);
		return null;
	}

}
