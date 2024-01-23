package com.citasMedicas.api.repository;

import java.util.List;
import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.citasMedicas.api.entity.Doctor;

@Repository
public interface RepoDoctor extends JpaRepository<RepoDoctor, Integer>{

    @Query(value = "SELECT * FROM doctores WHERE id_doctor = :id_doctor", nativeQuery=true)
    List<Doctor> findByIdDoctor(@Param("id_doctor") Integer id_doctor);

    /**
    Doctor findByIdDoctor(Integer id_doctor);
    Doctor findByName(String name, String firstLastname, String secondLastname);

    @Modifying
    @Transactional
    @Query(value = "")
    */
}
