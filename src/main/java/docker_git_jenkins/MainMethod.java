package docker_git_jenkins;

public class MainMethod {

	public static void main(String[] args) {
		
		boolean b = isOddEven(56);
		System.out.println(b);

	}
	
	public static boolean isOddEven(int num) {
		if(num %2==0) {
			return true;
		}
		else
			return false;
	}

}
