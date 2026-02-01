package com.zeus.service;

import java.util.List;

import com.zeus.model.Medicine;

public interface MedicineService {

    // 등록
    int registerMedicine(Medicine medicine) throws Exception;

    // 목록
    List<Medicine> medicineList() throws Exception;

    // 상세
    Medicine readMedicine(Medicine medicine) throws Exception;

    // 수정
    int updateMedicine(Medicine medicine) throws Exception;

    // 삭제
    int deleteMedicine(Medicine medicine) throws Exception;

    // 검색
    List<Medicine> searchMedicine(Medicine medicine) throws Exception;
}
