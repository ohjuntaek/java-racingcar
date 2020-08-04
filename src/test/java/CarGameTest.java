import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class CarGameTest {

    @Test
    @DisplayName("randomNumber 가 4 이하면 이하의 자동차를 진행시지 않는다.")
    void goTest() {
        FakeDiceRoller diceRoller = new FakeDiceRoller(new Random());
        diceRoller.setRandomNumber(2);
        Car car = new Car(diceRoller);
        int beforeLength = car.getLength();
        car.go();
        int length = car.getLength();

        assertEquals(diceRoller.getRandomNumber(), 2);
        assertEquals(length, beforeLength);
    }

}