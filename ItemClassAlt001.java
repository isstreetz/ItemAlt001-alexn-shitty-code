
public class ItemClassAlt001 {
public static void main(String[] args){
	prank();
	granbomba();
	array();
}
	public static void prank(){
		double a = 8.32;
		double b = 3.68;
		double c = a + b;
		
		System.out.println(c);
		
	}

	public static void granbomba(){
		String key = "just a prank";
		
		switch (key) {
		case "mundodesconocido":
			
			break;
		case "just a prank":
			System.out.println("se está ejecutando");

		default:
			break;
		}
	}
	
	public static void array(){
		String[] primerArray = {"hola a todos" , "y" , "bienvenidos a mundodesconocido punto es"};
		
		System.out.println(primerArray[0]);
	}
}
