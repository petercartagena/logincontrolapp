/**
 * 
 */
package com.petercartagena.logincontrolapp.web.authentication;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.petercartagena.logincontrolapp.web.Constants;

/**
 * Handles and retrieves the login or denied page depending on the URI template
 */
@Controller
//@RequestMapping("/authentication/")
public class LoginLogoutController {

	protected static Logger	logger	= Logger.getLogger("controller");

	/**
	 * Handles and retrieves the login JSP page
	 * 
	 * @return the name of the JSP page
	 */
	@RequestMapping(value =  Constants.PATH_PAGES_AUTHENTICATION + "loginpage", method = RequestMethod.GET)
	public String getLoginPage(@RequestParam(value = "error", required = false) boolean error, ModelMap model) {
		logger.debug("Received request to show login page");

		if (error == true) {
			model.put("error", "You have entered an invalid username or password!");
		} else {
			model.put("error", "");
		}
		return Constants.PATH_PAGES_AUTHENTICATION + "loginpage";
	}

	/**
	 * Handles and retrieves the denied JSP page. This is shown whenever a
	 * regular user tries to access an admin only page.
	 * 
	 * @return the name of the JSP page
	 */
	@RequestMapping(value = Constants.PATH_PAGES_AUTHENTICATION + "deniedpage", method = RequestMethod.GET)
	public String getDeniedPage() {
		logger.debug("Received request to show denied page");

		return Constants.PATH_PAGES_AUTHENTICATION + "deniedpage";
	}
}