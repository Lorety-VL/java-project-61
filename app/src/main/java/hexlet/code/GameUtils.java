package hexlet.code;

import java.util.Random;

public class GameUtils {
    public static int getRandomInt(int min, int max) {
        var random = new Random();
        return (random.nextInt(min, max));
    }
    public static int getRandomInt(int max) {
        return getRandomInt(0, max);
    }
}
