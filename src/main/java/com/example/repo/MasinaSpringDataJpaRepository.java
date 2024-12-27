package com.example.repo;

import com.example.entity.Masina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MasinaSpringDataJpaRepository extends JpaRepository<Masina, String> {

    List<Masina> findByNrInmatriculare(String nrInmatriculare);

    List<Masina> findByAnFabricatieGreaterThan(int anFabricatie);

    int countByNrKilometriiLessThan(int nrKilometrii);

    int countByMarca(String marca);

    void deleteByNrInmatriculare(String nrInmatriculare);
}
