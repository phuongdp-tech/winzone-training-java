package winzonevn.training;

import winzonevn.training.entity.Candidate;
import winzonevn.training.function.impl.SeniorPassingCriteria;
import winzonevn.training.function.impl.FresherPassingCriteria;
import winzonevn.training.service.CandidateService;

import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="mailto:phuongdp.tech@gmail.com">PhuongDP</a>
 */
public class CandidateManagement {

    public static void main(String[] args) {
        CandidateService candidateService = new CandidateService();

        Candidate candidate01 = new Candidate("candidate01@gmail.com", 7);
        Candidate candidate02 = new Candidate("candidate02@gmail.com", 9);
        Candidate candidate03 = new Candidate("candidate03@gmail.com", 6);
        List<Candidate> candidateList = Arrays.asList(candidate01, candidate02, candidate03);


        System.out.println("Candidate apply FRESHER position: ");
        candidateService.displayResult(candidateList, new FresherPassingCriteria());
        System.out.println("\n-----------------------------------");
        System.out.println("\nCandidate apply SENIOR position: ");
        candidateService.displayResult(candidateList, new SeniorPassingCriteria());
    }
}
