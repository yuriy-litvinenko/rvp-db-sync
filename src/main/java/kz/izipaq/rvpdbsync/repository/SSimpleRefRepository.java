package kz.izipaq.rvpdbsync.repository;

import kz.izipaq.rvpdbsync.model.SSimpleRef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SSimpleRefRepository extends JpaRepository<SSimpleRef, String> {
}
