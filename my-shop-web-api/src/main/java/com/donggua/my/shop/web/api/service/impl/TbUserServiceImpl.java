package com.donggua.my.shop.web.api.service.impl;

import com.donggua.my.shop.domain.TbUser;
import com.donggua.my.shop.web.api.dao.TbUserDao;
import com.donggua.my.shop.web.api.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/13 18:49
 **/
@Service
public class TbUserServiceImpl implements TbUserService {

	@Autowired
	private TbUserDao tbUserDao;

	@Override
	public TbUser login(TbUser tbUser) {
		TbUser user = tbUserDao.login(tbUser);

		if (user != null) {
			// 将明文密码加密
			String password = DigestUtils.md5DigestAsHex(tbUser.getPassword().getBytes());
			if (password.equals(user.getPassword())) {
				return user;
			}
		}

		return null;
	}
}
