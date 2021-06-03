package updateuser.rest.suites;

import java.util.Random;

public class RandomEmailGenerator {
    private static final Random random = new Random();

    public static String randomEmail() {
        return "test" + random.nextInt(10000) + "@test.com";
    }
}