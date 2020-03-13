package com.donggua.my.shop.domain;

import com.donggua.my.shop.commons.persistence.BaseEntity;
import com.donggua.my.shop.commons.persistence.BaseTreeEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @author DongGua
 * @date 2020/3/11 23:38
 * @version 1.0.0
 **/

@Data
@EqualsAndHashCode(callSuper = true)
public class TbContentCategory extends BaseTreeEntity {
    @Length(min = 1, max = 20, message = "分类名称必须介于 1 - 20 位之间")
    private String name;
    private Integer status;

    @NotNull(message = "排序不能为空")
    private Integer sortOrder;
    private Boolean isParent;
    private TbContentCategory parent;
}
