package io.s3rice.riceservice.repository;
import io.s3rice.riceservice.model.RiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiceRepository extends JpaRepository<RiceType,Integer> {
}
