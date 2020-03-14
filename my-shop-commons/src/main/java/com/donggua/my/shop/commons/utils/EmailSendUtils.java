package com.donggua.my.shop.commons.utils;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/14 16:17
 **/
public class EmailSendUtils {

	@Autowired
	private Email email;

	public void send(String subject, String msg, String... to) throws EmailException {
		email.setSubject(subject);
		email.setMsg(msg);
		email.addTo(to);
		email.send();
	}
}
