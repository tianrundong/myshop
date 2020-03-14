package com.donggua.my.shop.web.ui.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/14 14:26
 **/
@Data
public class TbContent implements Serializable {
	private Long id;
	private String title;
	private String subTitle;
	private String titleDesc;
	private String url;
	private String pic;
	private String pic2;
	private String content;
}

