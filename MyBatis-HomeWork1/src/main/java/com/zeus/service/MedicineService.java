package com.zeus.service;

import com.zeus.mapper.MedicineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;

    public void test() {
        medicineMapper.selectAllMedicines();
    }
}
