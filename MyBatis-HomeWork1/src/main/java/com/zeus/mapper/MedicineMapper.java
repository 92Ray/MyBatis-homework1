package com.zeus.mapper;

import java.util.List;

import com.zeus.model.Medicine;

public interface MedicineMapper {

    // 등록
    int createMedicine(Medicine medicine);

    // 목록
    List<Medicine> selectMedicineList();

    // 상세
    Medicine selectMedicine(Medicine medicine);

    // 수정
    int updateMedicine(Medicine medicine);

    // 삭제
    int deleteMedicine(Medicine medicine);

    // 검색
    List<Medicine> searchMedicine(Medicine medicine);
}
