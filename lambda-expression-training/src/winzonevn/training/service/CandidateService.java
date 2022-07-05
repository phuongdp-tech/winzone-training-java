package winzonevn.training.service;

import winzonevn.training.entity.Candidate;
import winzonevn.training.function.PassingCriteria;

import java.util.List;

/**
 * @author <a href="mailto:phuongdp.tech@gmail.com">PhuongDP</a>
 */
public class CandidateService {

    public void displayResult(List<Candidate> candidates, PassingCriteria criteria) {
        for (Candidate candidate : candidates) {
            if (criteria.pass(candidate.getEntryTest())) {
                System.out.printf("Candidate: %s is QUALIFIED with entry test = %.2f!\n",
                        candidate.getEmail(), candidate.getEntryTest());
            } else {
                System.out.printf("Candidate: %s is UNQUALIFIED with entry test = %.2f!\n",
                        candidate.getEmail(), candidate.getEntryTest());
            }
        }
    }
}
