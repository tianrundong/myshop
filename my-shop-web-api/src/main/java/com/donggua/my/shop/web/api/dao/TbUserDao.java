package com.donggua.my.shop.web.api.dao;

import com.donggua.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/13 18:45
 **/

@Repository
public interface TbUserDao {
	/**
	 * 登录
	 * @param tbUser
	 * @return
	 */
	TbUser login(TbUser tbUser);
}