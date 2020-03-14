package com.donggua.my.shop.web.api.web.dto;

import lombok.Data;

import java.io.Serializable;


/**
 *内容数据传输对象
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/13 19:38
 **/

@Data
public class TbContentDTO implements Serializable {
	private Long id;
	private String title;
	private String subTitle;
	private String titleDesc;
	private String url;
	private String pic;
	private String pic2;
}