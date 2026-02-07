package com.zeus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeus.model.Medicine;
import com.zeus.service.MedicineService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/medicine")
@Slf4j
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    /* ---------------- 약 등록 ---------------- */
    @GetMapping("/insert")
    public String medicineInsertForm(Model model) {
        log.info("약 등록 폼 이동");
        return "medicine/insert";
    }

    @PostMapping("/insert")
    public String medicineInsert(Medicine medicine, Model model) {
        try {
            medicineService.registerMedicine(medicine);
            model.addAttribute("msg", "약품 등록 성공!");
            model.addAttribute("redirectUrl", "/medicine/list");
            return "medicine/success";
        } catch (Exception e) {
            model.addAttribute("msg", "약품 등록 실패: " + e.getMessage());
            model.addAttribute("redirectUrl", "/medicine/insert");
            return "medicine/failed";
        }
    }

    /* ---------------- 목록 / 검색 ---------------- */
    @GetMapping("/list")
    public String medicineList(Medicine medicine, Model model) throws Exception {
        List<Medicine> list;

        if ((medicine.getMedName() != null && !medicine.getMedName().isEmpty()) ||
            (medicine.getManufacturer() != null && !medicine.getManufacturer().isEmpty())) {

            list = medicineService.searchMedicine(medicine);
        } else {
            list = medicineService.medicineList();
        }

        model.addAttribute("list", list);
        model.addAttribute("medicine", medicine); // 검색값 유지용

        return "medicine/list";
    }

    /* ---------------- 상세 ---------------- */
    @GetMapping("/read")
    public String medicineRead(Medicine medicine, Model model) throws Exception {
        try {
            Medicine result = medicineService.readMedicine(medicine);
            if(result == null) throw new Exception("약품을 찾을 수 없습니다.");
            model.addAttribute("medicine", result);
            return "medicine/read";
        } catch (Exception e) {
            model.addAttribute("msg", "상세보기 실패: " + e.getMessage());
            model.addAttribute("redirectUrl", "/medicine/list");
            return "medicine/failed";
        }
    }

    /* ---------------- 수정 ---------------- */
    @GetMapping("/update")
    public String medicineUpdateForm(Medicine medicine, Model model) throws Exception {
        Medicine result = medicineService.readMedicine(medicine);
        model.addAttribute("medicine", result);
        return "medicine/update";
    }

    @PostMapping("/update")
    public String medicineUpdate(Medicine medicine, Model model) {
        try {
            medicineService.updateMedicine(medicine);
            model.addAttribute("msg", "약품 수정 성공!");
            model.addAttribute("redirectUrl", "/medicine/read?medId=" + medicine.getMedId());
            return "common/success";
        } catch (Exception e) {
            model.addAttribute("msg", "약품 수정 실패: " + e.getMessage());
            model.addAttribute("redirectUrl", "/medicine/update?medId=" + medicine.getMedId());
            return "medicine/failed";
        }
    }

    /* ---------------- 삭제 ---------------- */
    @PostMapping("/delete")
    public String medicineDelete(Medicine medicine, Model model) {
        try {
            medicineService.deleteMedicine(medicine);
            model.addAttribute("msg", "약품 삭제 성공!");
            model.addAttribute("redirectUrl", "/medicine/list");
            return "common/success";
        } catch (Exception e) {
            model.addAttribute("msg", "약품 삭제 실패: " + e.getMessage());
            model.addAttribute("redirectUrl", "/medicine/read?medId=" + medicine.getMedId());
            return "medicine/failed";
        }
    }

}

