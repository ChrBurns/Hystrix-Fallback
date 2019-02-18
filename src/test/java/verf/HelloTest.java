package verf;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import simple.HelloWorldCommandFail;
import simple.HelloWorldTest;

public class HelloTest {
	@Test
	public void test() throws Exception {
		HelloWorldCommandFail helloWorldCommand = new HelloWorldCommandFail("World");
		assertEquals("Hello Failure World!", helloWorldCommand.execute());
		
		HelloWorldTest ts= new HelloWorldTest();
		ts.testSynchronous();
	}
}
