package com.hjb.spring.cloud.dao.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author haojingbin
 * @Description:
 * @Date 2018/5/17
 * @Modified By:
 */
@Entity
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class Properties {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String uid;
    private String application;
    private String profilee;
    private String label;
    private String keye;
    private String valuee;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getProfilee() {
        return profilee;
    }

    public void setProfilee(String profilee) {
        this.profilee = profilee;
    }

    public String getKeye() {
        return keye;
    }

    public void setKeye(String keye) {
        this.keye = keye;
    }

    public String getValuee() {
        return valuee;
    }

    public void setValuee(String valuee) {
        this.valuee = valuee;
    }
}
