package com.zeus.medel;

import java.util.Date;

import lombok.Data;

@Data
public class Medicine {
	private long medID;
	private String med_name;
	private String manufacturer;
	private Integer stock_qty;
	private Date regdage;

}
