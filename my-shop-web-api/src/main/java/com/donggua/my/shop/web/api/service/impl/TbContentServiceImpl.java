package com.donggua.my.shop.web.api.service.impl;

import com.donggua.my.shop.domain.TbContent;
import com.donggua.my.shop.domain.TbContentCategory;
import com.donggua.my.shop.web.api.dao.TbContentDao;
import com.donggua.my.shop.web.api.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/13 18:47
 **/
@Service
@Transactional(readOnly = true)
public class TbContentServiceImpl implements TbContentService {

	@Autowired
	private TbContentDao tbContentDao;

	@Override
	public List<TbContent> selectByCategoryId(Long categoryId) {
		TbContentCategory tbContentCategory = new TbContentCategory();
		tbContentCategory.setId(categoryId);

		TbContent tbContent = new TbContent();
		tbContent.setTbContentCategory(tbContentCategory);

		return tbContentDao.selectByCategoryId(tbContent);
	}
}
