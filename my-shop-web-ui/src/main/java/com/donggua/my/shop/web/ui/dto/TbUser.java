package com.donggua.my.shop.web.ui.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/14 14:26
 **/
@Data
public class TbUser implements Serializable {
	private Long id;
	private String username;
	private String password;
	private String phone;
	private String email;
	private String verification;
}