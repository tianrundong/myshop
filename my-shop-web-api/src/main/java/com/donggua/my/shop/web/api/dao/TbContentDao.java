package com.donggua.my.shop.web.api.dao;

import com.donggua.my.shop.domain.TbContent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 会员管理
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/13 18:40
 **/

@Repository
public interface TbContentDao {
	/**
	 * 根据类别 ID 查询内容列表
	 * @param tbContent
	 * @return
	 */
	List<TbContent> selectByCategoryId(TbContent tbContent);
}
