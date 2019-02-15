package cityservices.com.example.PotholeReport.repositories;

import cityservices.com.example.PotholeReport.models.Pothole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotholeRepository extends JpaRepository<Pothole, Long> {
}
