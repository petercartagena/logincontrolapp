package com.petercartagena.logincontrolapp.web;

import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.petercartagena.logincontrolapp.service.SimpleUserManager;

public class EntryPointControllerTests {

	@Test
	public void testHandleRequestView() throws Exception {
		EntryPointController controller = new EntryPointController();
		controller.setIUserManager(new SimpleUserManager());

		ModelAndView modelAndView = controller.handleRequest(null, null);
		Assert.assertEquals("main", modelAndView.getViewName());
		Assert.assertNotNull(modelAndView.getModel());

		Map modelMap = (Map) modelAndView.getModel().get("model");
		String nowValue = (String) modelMap.get("now");

		Assert.assertNotNull(nowValue);

	}

}