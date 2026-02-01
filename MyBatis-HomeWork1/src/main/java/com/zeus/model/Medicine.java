package com.zeus.model;

import java.util.Date;

import lombok.Data;

@Data
public class Medicine {
	private Long medId;
	private String medName;
	private String manufacturer;
	private Integer stockQty;
	private Date regDate;

}
