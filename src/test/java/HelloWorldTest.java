import org.testng.annotations.Test;

public class HelloWorldTest {
    @Test
    public  void test()
    {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.helloMethod();
    }

}
