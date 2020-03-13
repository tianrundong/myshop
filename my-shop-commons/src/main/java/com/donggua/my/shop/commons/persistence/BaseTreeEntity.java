package com.donggua.my.shop.commons.persistence;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author DongGua
 * @version 1.0.0
 * @date 2020/3/13 0:46
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BaseTreeEntity<T extends BaseEntity> extends BaseEntity implements Serializable {
	private T parent;
	private Boolean isParent;
}
