import java.util.*;
import java.util.stream.Collectors;
public class count {
	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			System.out.println("Inside Loop 1 =>"+i);
			for(int j=i;j<2;j++) {
				System.out.println("Inside Nested Loop 2 =>"+j);
				//int var;
				switch(j){
					case 0:
						if(true) {
							System.out.println("if-else block");
							return;
						}
					case 1:
						System.out.println(j);
						break;
				}
			}
		}

	}

}
