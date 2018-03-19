package pl.ireneuszderucki.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.ireneuszderucki.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
	@Query("SELECT c FROM Company c, JobOffer jo WHERE c=jo.company AND jo.user.username=?1")
	List<Company> searchUsername(String username);
}

