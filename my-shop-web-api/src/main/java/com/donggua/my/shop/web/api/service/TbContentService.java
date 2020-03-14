package com.donggua.my.shop.web.api.service;

import com.donggua.my.shop.domain.TbContent;

import java.util.List;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/13 18:46
 **/
public interface TbContentService {
	/**
	 * 根据类别 ID 查询内容列表
	 * @param categoryId
	 * @return
	 */
	List<TbContent> selectByCategoryId(Long categoryId);
}
