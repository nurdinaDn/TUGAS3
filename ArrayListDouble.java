import java.util.ArrayList;


public class ArrayListDouble {

	public static void main(String[] args) {
		ArrayList<Double> arld= new ArrayList<Double>();

		arld.add(34.98456789d);
		arld.add(3.5456789d);
		arld.add(3.24489902d);
		System.out.println(arld);
	
		arld.remove(3.24489902d);
		System.out.println(arld);
		
		ArrayList<Double> arlD= (ArrayList<Double>)arld.clone();
		arlD.add(2.36790d);
		System.out.println("arld" +arld);
		System.out.println("arlD" +arld);
		
		System.out.println("kosongkah:" + arld.isEmpty());
		if (arld.contains(3.545588d))
			System.out.println(" ada 3.545588");
		else{
			System.out.println("tak ada angka 3.545588");
		}
		System.out.println("arld" +arld);
		System.out.println("arlD" +arlD);
	}

}
