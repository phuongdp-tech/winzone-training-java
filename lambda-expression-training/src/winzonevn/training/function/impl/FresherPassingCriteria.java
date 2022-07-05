package winzonevn.training.function.impl;

import winzonevn.training.function.PassingCriteria;

/**
 * @author <a href="mailto:phuongdp.tech@gmail.com">PhuongDP</a>
 */
public class FresherPassingCriteria implements PassingCriteria {

    @Override
    public boolean pass(float entryTest) {
        return entryTest >= 6;
    }
}
