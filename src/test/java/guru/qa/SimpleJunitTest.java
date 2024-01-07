package guru.qa;

import org.junit.jupiter.api.*;

public class SimpleJunitTest {

    @BeforeAll
    static void beforeAll (){

        System.out.println("###   @BeforeAll\n");
    }
    @AfterAll
    static void afterAll (){

        System.out.println("###   @AfterAll\n");
    }
    @BeforeEach
    void beforeEach (){

        System.out.println("###    @BeforeEach");
    }
    @AfterEach
    void afterEach (){

        System.out.println("###    @AfterEach\n");
    }
@Test
void FirstTest () {
    System.out.println("### @Test FirstTest");
    Assertions.assertTrue(2*2 == 4);

}
    @Test
    void SecondTest () {
        System.out.println("### @Test SecondTest");
        Assertions.assertTrue(2+2 == 4);

    }
}