package com.citasMedicas.api.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="doctores")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTIFY)
    @JsonProperty("id_doctor")
    @Column(name = "id_doctor")
    private Integer id_doctor;

    public Integer getId_doctor(){
        return id_doctor;
    }
    
}
