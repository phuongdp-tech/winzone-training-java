package winzonevn.training;

import winzonevn.training.entity.Candidate;
import winzonevn.training.service.CandidateService;

import java.util.Arrays;
import java.util.List;

public class CandidateMngtByLambdaExpression {

    public static void main(String[] args) {
        Candidate candidate01 = new Candidate("candidate01@gmail.com", 7);
        Candidate candidate02 = new Candidate("candidate02@gmail.com", 9);
        Candidate candidate03 = new Candidate("candidate03@gmail.com", 6);

        List<Candidate> candidateList = Arrays.asList(candidate01, candidate02, candidate03);

        CandidateService candidateService = new CandidateService();
        // Check for Fresher position
        candidateService.displayResult(candidateList, entryTest -> entryTest >= 6);

        // Other ways
        // candidateService.displayResult(candidateList, (float entryTest) -> entryTest >= 6);
        // candidateService.displayResult(candidateList, (float entryTest) -> {return entryTest >= 6; });

        // Check for Senior position
        candidateService.displayResult(candidateList, entryTest -> entryTest >= 8.5);
        
    }

}
