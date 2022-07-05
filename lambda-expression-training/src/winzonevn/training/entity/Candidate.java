package winzonevn.training.entity;

/**
 * @author <a href="mailto:phuongdp.tech@gmail.com">PhuongDP</a>
 */
public class Candidate {
    private String email;
    private float entryTest;

    public Candidate() {
    }

    public Candidate(String email, float entryTest) {
        this.email = email;
        this.entryTest = entryTest;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getEntryTest() {
        return entryTest;
    }

    public void setEntryTest(float entryTest) {
        this.entryTest = entryTest;
    }
}
