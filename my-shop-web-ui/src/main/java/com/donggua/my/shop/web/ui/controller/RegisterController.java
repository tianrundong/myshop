package com.donggua.my.shop.web.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 注册
 *
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/14 16:34
 **/
@Controller
public class RegisterController {

	/**
	 * 跳转注册页
	 * @return
	 */
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}
}

