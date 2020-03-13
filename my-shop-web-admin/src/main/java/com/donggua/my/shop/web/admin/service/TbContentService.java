package com.donggua.my.shop.web.admin.service;

import com.donggua.my.shop.commons.persistence.BaseService;
import com.donggua.my.shop.domain.TbContent;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/12 14:35
 **/
public interface TbContentService extends BaseService<TbContent> {
	/**
	 * 根据类目 ID 删除内容
	 * @param categoryIds
	 */
	void deleteByCategoryId(String[] categoryIds);
}
