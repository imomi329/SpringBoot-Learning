package com.learning.util.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 1. 新建一個 Class，這裡取名為 GlobalDefaultExceptionHandler;
 * 2. 在 class 上添加註解，@ControllerAdvice;
 * 3. 在 class 中添加一個方法;
 * 4. 在方法上添加 @ExceptionHandler 攔截相應的異常信息;
 * 5. 如果返回的是 View -- 方法的回傳值是 ModelAndView;
 * 6. 如果返回的是 String 或者是 Json數據，那麼要在方法上添加 @ResponseBody 註解;
 * @author yuan
 * @version v.0.1
 * @date 2017.09.13
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public String defaultExceptionHandler(HttpServletRequest req, Exception e) {
//		ModelAndView modal = new ModelAndView();
//        modal.setViewName("/exception");
//        modal.addObject("messages", e.getMessage());
//        return modal;
		return "對不起，服務器繁忙，請稍後再試！";
	}
	
	
//	@ExceptionHandler(value = Exception.class)
//	public void defaultErrorHandler(HttpServletBean req, Exception e) {
//		// // If the exception is annotated with @ResponseStatus rethrow it and
//		// let
//		// // the framework handle it - like the OrderNotFoundException example
//		// // at the start of this post.
//		// // AnnotationUtils is a Spring Framework utility class.
//		// if (AnnotationUtils.findAnnotation(e.getClass(),
//		// ResponseStatus.class) != null)
//		// throw e;
//		//
//		// // Otherwise setup and send the user to a default error-view.
//		// ModelAndView mav = new ModelAndView();
//		// mav.addObject("exception", e);
//		// mav.addObject("url", req.getRequestURL());
//		// mav.setViewName(DEFAULT_ERROR_VIEW);
//		// return mav;
//
//		// 打印异常信息：
//		e.printStackTrace();
//		System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
//
//		/*
//		 * 返回json数据或者String数据： 那么需要在方法上加上注解：@ResponseBody 添加return即可。
//		 */
//
//		/*
//		 * 返回视图： 定义一个ModelAndView即可， 然后return;
//		 * 定义视图文件(比如：error.html,error.ftl,error.jsp);
//		 *
//		 */
//	}

}
