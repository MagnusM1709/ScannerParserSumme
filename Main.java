import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		while(true){
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
			try {
				new Analyse(in.readLine() + "#");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	}

}
