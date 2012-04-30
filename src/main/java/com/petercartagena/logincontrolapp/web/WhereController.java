package com.petercartagena.logincontrolapp.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WhereController {
	protected final Log	logger	= LogFactory.getLog(getClass());

	@RequestMapping(value = Constants.PATH_PAGES_PUBLIC + Constants.WHERE)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String now = (new Date()).toString();
		logger.info("Returning " + Constants.WHERE + " view with " + now);
		return new ModelAndView(Constants.PATH_PAGES_PUBLIC + Constants.WHERE, "now", now);

	}
}
