package com.example.repo;

import com.example.entity.Masina;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class MasinaJpaRepository {
    @PersistenceContext
    EntityManager entityManager;

    public List<Masina> findAll() {
        TypedQuery<Masina> query = entityManager.createQuery("from Masina", Masina.class);
        return query.getResultList();
    }

    public Masina findByNr_inmatriculare(String nr_inmatriculare) {
        return entityManager.find(Masina.class, nr_inmatriculare);
    }

    public int countByMarca(String marca) {
        TypedQuery<Masina> query = entityManager.createQuery("from Masina where marca = :marca",
                Masina.class);
        query.setParameter("marca", marca);
        return query.getResultList().size();
    }

    public int countByNr_kilometrii_smallerThan(int nr_kilometrii) {
        TypedQuery<Masina> query =
                entityManager.createQuery("from Masina where nrKilometrii < 100000", Masina.class);
        return query.getResultList().size();
    }

    public List<Masina> findMasiniNoi(int an_curent) {

        int an = an_curent - 5;
        TypedQuery<Masina> query = entityManager.createQuery("from Masina where anFabricatie >= :an",
                Masina.class);
        return query.setParameter("an", an).getResultList();
    }

    public void deleteByNr_inmatriculare(String nr_inmatriculare) {
        Masina masina = findByNr_inmatriculare(nr_inmatriculare);
        if (masina != null) {
            entityManager.remove(masina);
        }
    }

    public Masina insert(Masina masina) {
        return entityManager.merge(masina);
    }
}
