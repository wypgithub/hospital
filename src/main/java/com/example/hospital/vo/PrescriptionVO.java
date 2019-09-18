package com.example.hospital.vo;

import com.example.hospital.po.MedicinePrescription;
import com.example.hospital.po.MedicinePrescriptionDetail;

import java.util.List;

/**
 * Description:
 * date: 2019/9/17 0017
 *
 * @author WYP
 */
public class PrescriptionVO {
    private MedicinePrescription medicinePrescription;

    private List<MedicinePrescriptionDetail> medicinePrescriptionDetail;

    public MedicinePrescription getMedicinePrescription() {
        return medicinePrescription;
    }

    public void setMedicinePrescription(MedicinePrescription medicinePrescription) {
        this.medicinePrescription = medicinePrescription;
    }

    public List<MedicinePrescriptionDetail> getMedicinePrescriptionDetail() {
        return medicinePrescriptionDetail;
    }

    public void setMedicinePrescriptionDetail(List<MedicinePrescriptionDetail> medicinePrescriptionDetail) {
        this.medicinePrescriptionDetail = medicinePrescriptionDetail;
    }
}
