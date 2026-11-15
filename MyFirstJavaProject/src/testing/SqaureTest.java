package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SqaureTest {

    @Test
    void test() {
        JUnitTesting obj = new JUnitTesting();
        int output_obj = obj.square(5);
        assertEquals(25, output_obj);
    }
}