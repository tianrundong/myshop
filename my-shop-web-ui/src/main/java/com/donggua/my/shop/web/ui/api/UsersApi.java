package com.donggua.my.shop.web.ui.api;

import com.donggua.my.shop.commons.utils.HttpClientUtils;
import com.donggua.my.shop.commons.utils.MapperUtils;
import com.donggua.my.shop.web.ui.dto.TbUser;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/14 16:15
 **/
public class UsersApi {

	/**
	 * 登录
	 * @param tbUser
	 * @return
	 */
	public static TbUser login(TbUser tbUser) throws Exception {
		List<BasicNameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("username", tbUser.getUsername()));
		params.add(new BasicNameValuePair("password", tbUser.getPassword()));

		String json = HttpClientUtils.doPost(API.API_USERS_LOGIN, params.toArray(new BasicNameValuePair[params.size()]));
		TbUser user = MapperUtils.json2pojoByTree(json, "data", TbUser.class);
		return user;
	}
}
