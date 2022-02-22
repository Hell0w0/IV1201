package se.kth.iv1201.project.repository;

import org.springframework.transaction.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.kth.iv1201.project.domain.CompetenceProfile;

/**
 * Contains all database access concerning the CompetenceProfile of the Applicant.
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface CompetenceProfileRepository extends JpaRepository<CompetenceProfile, Integer>{

    CompetenceProfile saveCompetenceProfile(CompetenceProfile competenceProfile);

    CompetenceProfile findCompetenceProfileByPersonID(int id);


}
