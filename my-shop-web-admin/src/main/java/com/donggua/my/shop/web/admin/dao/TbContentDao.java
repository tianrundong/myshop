package com.donggua.my.shop.web.admin.dao;

import com.donggua.my.shop.commons.persistence.BaseDao;
import com.donggua.my.shop.domain.TbContent;
import org.springframework.stereotype.Repository;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/12 14:34
 **/

@Repository
public interface TbContentDao extends BaseDao<TbContent> {
	/**
	 * 根据类目 ID 删除内容
	 *
	 * @param categoryIds
	 */
	void deleteByCategoryId(String[] categoryIds);
}
