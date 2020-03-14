package com.donggua.my.shop.web.ui.api;

import com.donggua.my.shop.commons.utils.HttpClientUtils;
import com.donggua.my.shop.commons.utils.MapperUtils;
import com.donggua.my.shop.web.ui.dto.TbContent;

import java.util.List;

/**
 * 内容管理接口
 *
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/14 14:38
 **/
public class ContentsApi {

	/**
	 * 请求幻灯片
	 *
	 * @return
	 */
	public static List<TbContent> ppt() {
		List<TbContent> tbContents = null;
		String result = HttpClientUtils.doGet(API.API_CONTENTS_PPT);
		try {
			tbContents = MapperUtils.json2listByTree(result, "data", TbContent.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tbContents;
	}
}
