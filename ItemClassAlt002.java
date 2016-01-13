
public class ItemClassAlt002 {
	public static void main(String[] args){
		comparing();
		
		int[] gerint = new int [5];
			
		gerint[0] = 12;
		
		if(gerint[0] == 12){
			gerint[1] = 4;
			gerint[2] = 8;
			
			if(gerint[1] < gerint[2]){
				gerint[3] = gerint[1] + gerint[2];
				
				if(gerint[3] > 12){
					System.out.println("gerint[3] is bigger than 12");
				}
				else if(gerint[3] < 11){
					System.out.println("gerint[3] < 11");
				} 
				else{
					System.out.println("gerint[3] is 12");
				}
			}
		}
	}
	public static void comparing(){
		String str = "10";
		int ger = 10;
		String integer = ger + ""; //De integer a string
		
		int ing = Integer.valueOf(str);
		
		if(ger == ing){
			System.out.println("10 is 10");
		}
	}
}
