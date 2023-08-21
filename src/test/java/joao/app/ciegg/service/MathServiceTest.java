package joao.app.ciegg.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class MathServiceTest {

    @InjectMocks
    private MathService mathService;

    @Test
    public void sum_two_valid_numbers_successfully() {
        int expected = 35;
        assertEquals(expected, mathService.sum(20, 15));
    }

}