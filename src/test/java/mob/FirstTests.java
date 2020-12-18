package mob;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("FirstTests")
class FirstTests {

    @Test
    @DisplayName("Test one in SecondTests")
    void testOne() {}

    @Test
    @DisplayName("Test two in SecondTests")
    void testTwo() {}

    @Test
    @DisplayName("Test three in SecondTests")
    void testThree() {}

    @Test
    @DisplayName("Test four in SecondTests")
    void testFour() {}

    @Test
    @DisplayName("Test five in SecondTests")
    void testFive() {}

    @Test
    @DisplayName("Test 6 in SecondTests")
    void test6() {}

    @Test
    @DisplayName("Test 7 in SecondTests")
    void test7() {}
}
