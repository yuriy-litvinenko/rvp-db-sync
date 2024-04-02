package kz.izipaq.rvpdbsync.repository;

import kz.izipaq.rvpdbsync.model.HomeOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HomeOwnerRepository extends JpaRepository<HomeOwner, UUID> {
}
