package core.basesyntax;

import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if ("Birthday".equals(specialEvent)) {
            return new BirthdayDiscountService();
        }
        if ("BlackFriday".equals(specialEvent)) {
            return new BlackFridayDiscountService();
        }
        if ("NewYear".equals(specialEvent)) {
            return new NewYearDiscountService();
        }
        return new DefaultDiscountService();
    }
}
