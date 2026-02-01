package com.zeus.mapper;

import com.zeus.model.Medicine;
import java.util.List;

public interface MedicineMapper {

    // 전체 약 조회
    List<Medicine> selectAllMedicines();

    // ID로 약 조회
    Medicine selectMedicineById(int medId);

    // 약 추가
    int insertMedicine(Medicine medicine);

    // 약 수정
    int updateMedicine(Medicine medicine);

    // 약 삭제
    int deleteMedicine(int medId);
}