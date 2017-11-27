package dospuntcero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		while (true) {
			BufferedReader st =new BufferedReader(new InputStreamReader (System.in));
			
			String s=st.readLine();	
			
			if (s.toLowerCase().equals("exit")) {
				System.exit(0);
			}

			System.out.println(s);
			
			switch (s.toLowerCase()) {
				case "exit": 
					System.exit(0);
					break;
				case "ramiro":
					System.out.println("Cornejo");
					break;
				default:
					System.out.println(s);
					break;
			
			}
			
		}
	}

}
