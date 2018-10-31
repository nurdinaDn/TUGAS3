import java.util.ArrayList;


public class StackDouble {
	ArrayList<Double> angka= new ArrayList<Double>();
	int top = -1;
	
	public void push(Double value){
		top = top + 1;
		angka.add(top, value);
	}
	
	public Double pop(){
		Double value = 0.0d;
		if(!angka.isEmpty()){
			value = angka.get(top);
			angka.remove(top);
			top = top - 1;
			
		}
		return value;
	}
	
	public void cetak(){
		System.out.println("TOP :" +top+" # ANGKA: "+ angka.toString());
	}
}

