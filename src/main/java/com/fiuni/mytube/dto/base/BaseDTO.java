package com.fiuni.mytube.dto.base;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer _id;
}
