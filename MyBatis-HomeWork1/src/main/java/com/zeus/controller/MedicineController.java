package com.zeus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeus.model.Medicine;
import com.zeus.service.MedicineService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/medicine")
public class MedicineController {
	
	@Autowired
	private MedicineService medicineService;
	
	@GetMapping("/insert")
	public String medicineInsertForm(Model model) {
		log.info("약 등록 폼 이동");
		return "medicine/insert";
	}
	
	@PostMapping("/insert")
	public String medicineInsert(Medicine medicine) throws Exception {
	    log.info("insert medicine = {}", medicine);

	    medicineService.registerMedicine(medicine);

	    return "redirect:/medicine/list";
	}

}
