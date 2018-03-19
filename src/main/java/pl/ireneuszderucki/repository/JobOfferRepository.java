package pl.ireneuszderucki.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.ireneuszderucki.entity.JobOffer;

public interface JobOfferRepository extends JpaRepository<JobOffer, Long> {
	List<JobOffer> findByUserUsername(String username);

}
