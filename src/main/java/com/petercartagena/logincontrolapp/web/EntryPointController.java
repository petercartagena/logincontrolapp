package com.petercartagena.logincontrolapp.web;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.petercartagena.logincontrolapp.service.IUserManager;

@Controller
public class EntryPointController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired(required = false)
	private IUserManager iuserManager;

	@RequestMapping(value = Constants.PATH_PAGES_PUBLIC + Constants.MAIN)
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new Date()).toString();
		logger.info("Returning main view with " + now);

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("users", this.iuserManager.getUsers());

		return new ModelAndView(Constants.PATH_PAGES_PUBLIC + Constants.MAIN,
				"model", myModel);

	}

	public void setIUserManager(IUserManager iuserManager) {
		this.iuserManager = iuserManager;
	}
}