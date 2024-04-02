package kz.izipaq.rvpdbsync.repository;

import kz.izipaq.rvpdbsync.model.DSimpleRefVal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DSimpleRefValRepository extends JpaRepository<DSimpleRefVal, String> {
}
