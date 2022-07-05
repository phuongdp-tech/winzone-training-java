package winzonevn.training.function;

/**
 * @author <a href="mailto:phuongdp.tech@gmail.com">PhuongDP</a>
 */
@FunctionalInterface
public interface PassingCriteria {

    /**
     * Check Candidate is Qualified or Unqualified
     *
     * @param entryTest: Candidate's entryTest
     * @return
     * If Candidate's entryTest is passing criteria return true
     * otherwise return false
     */
    boolean pass(float entryTest);
}
