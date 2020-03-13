package com.donggua.my.shop.web.admin.service;

import com.donggua.my.shop.commons.persistence.BaseService;
import com.donggua.my.shop.domain.TbUser;

import java.util.List;

public interface TbUserService extends BaseService<TbUser> {
    /**
     * 用户登录
     *
     * @param email
     * @param password
     * @return
     */
    TbUser login(String email, String password);
}
