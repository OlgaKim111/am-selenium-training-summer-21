import org.junit.jupiter.api.*;

public class FirstTest {


    @BeforeAll
    public static void start()
    {
        System.out.println("Start Test");
    }

    @Test
    public void actualTest()
    {

        Assertions.assertEquals(1,66);
    }

    @Test
    public void actualTest1()
    {
        Assertions.assertTrue(true );
    }

    @Test
    public void actualTest2()
    {
        System.out.println("Test... 3");
    }

    @AfterAll
    public static void end()
    {
        System.out.println("End Test");
    }

}