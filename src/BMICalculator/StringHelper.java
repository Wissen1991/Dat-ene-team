package BMICalculator;

public class StringHelper {

	//methode om van ingevoerd karakter f een v te maken
    
	public static String replaceFwithV(String str){
    	return "f".equals(str) ? "v" : str;
    }
}