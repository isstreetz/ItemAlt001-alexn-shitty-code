
public class Class2 {
public static void main (String[] args){
	ghost();
	ghostInt();
	ghostForeach();
	
}

public static void ghost(){
	
	boolean ValueTOF = false;
	
	if(ValueTOF){
		System.out.println("ValuteTOF es verdadero");
	}
	else{
		System.out.println("ValueTOF es falso");
	}
}

public static void ghostInt(){
	int [] TOFValue = {1, 547, 236, 8, 78};
	System.out.println(TOFValue[2]);
	
	int[] TOFValue2 = {2, 257, 456, 852, 159};
	System.out.println(TOFValue2[4]);
}

public static void ghostForeach(){
	String[] arraycuerda = {"TOF" , "is enabled" , "is disabled"};
 	
	for (String str : arraycuerda) {
		System.out.println(str);
	}
	
		
		
	}
}
	
