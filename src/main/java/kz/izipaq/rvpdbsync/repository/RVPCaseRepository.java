package kz.izipaq.rvpdbsync.repository;

import kz.izipaq.rvpdbsync.model.RVPCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RVPCaseRepository extends JpaRepository<RVPCase, UUID> {
}
