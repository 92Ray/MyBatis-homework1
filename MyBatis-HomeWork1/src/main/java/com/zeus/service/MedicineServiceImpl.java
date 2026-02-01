package com.zeus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zeus.mapper.MedicineMapper;
import com.zeus.model.Medicine;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineMapper mapper;

    /* ===================== 등록 ===================== */

    @Override
    @Transactional
    public int registerMedicine(Medicine medicine) throws Exception {
        return mapper.createMedicine(medicine);
    }

    /* ===================== 목록 ===================== */

    @Override
    public List<Medicine> medicineList() throws Exception {
        return mapper.selectMedicineList();
    }

    /* ===================== 상세 ===================== */

    @Override
    public Medicine readMedicine(Medicine medicine) throws Exception {
        return mapper.selectMedicine(medicine);
    }

    /* ===================== 수정 ===================== */

    @Override
    @Transactional
    public int updateMedicine(Medicine medicine) throws Exception {
        return mapper.updateMedicine(medicine);
    }

    /* ===================== 삭제 ===================== */

    @Override
    @Transactional
    public int deleteMedicine(Medicine medicine) throws Exception {
        return mapper.deleteMedicine(medicine);
    }

    /* ===================== 검색 ===================== */

    @Override
    public List<Medicine> searchMedicine(Medicine medicine) throws Exception {
        return mapper.searchMedicine(medicine);
    }
}
