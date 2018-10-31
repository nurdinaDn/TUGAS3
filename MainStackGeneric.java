public class MainStackGeneric {

	public static void main(String[] args) {
		StackGeneric<String> nama = new StackGeneric<String>();
		nama.setMahasiswa("Nurdina");
		System.out.println("Nama : " + nama.getMahasiswa());
		
		StackGeneric<String> nim = new StackGeneric<String>();
		nim.setMahasiswa("D0217316");
		System.out.println("NIM : " + nim.getMahasiswa());
		
		StackGeneric<Float> ipk = new StackGeneric<Float>();
		ipk.setMahasiswa(3.5f);
		System.out.println("IPK : " + ipk.getMahasiswa());


	}

}
