import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import docker_git_jenkins.MainMethod;

public class TestMain {
	@Test
	public static void main(String[] args) {
	
		assertTrue(MainMethod.isOddEven(27));

	}

}
