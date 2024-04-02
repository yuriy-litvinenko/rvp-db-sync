package kz.izipaq.rvpdbsync.repository;

import kz.izipaq.rvpdbsync.model.RVPFamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RVPFamilyMemberRepository extends JpaRepository<RVPFamilyMember, UUID> {
}
