public class MainQueueFloat {

	public static void main(String[] args) {
		QueueFloat angka = new QueueFloat();
		angka.cetak();
		
		angka.insert(3.905f);
		angka.cetak();
		
		angka.insert(4.7f);
		angka.cetak();
		
		angka.insert(5.6f);
		angka.cetak(); 
		
		Float o1 = angka.get();
		System.out.println(o1);
		angka.cetak();
		
		Float o2 = angka.get();
		System.out.println(o2);
		angka.cetak();
		
		Float o3 = angka.get();
		System.out.println(o3);
		angka.cetak();
		
		Float o4 = angka.get();
		System.out.println(o4);
		angka.cetak();
	}

}
