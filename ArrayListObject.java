public class ArrayListObject {


	public static void main(String[] args) {
		mahasiswa mhs = new mahasiswa();
		mhs.nama = "Nurdina";
		mhs.nim = "D0217316";
		mhs.kelas = 'D';
		mhs.alamat = "Campalagian";
		
		mahasiswa mhs1 = new mahasiswa();
		mhs1.nama = "Nurfadilah";
		mhs1.nim = "D0217315";
		mhs1.kelas = 'D';
		mhs1.alamat = "Campalagian";
		
		mahasiswa mhs2 = new mahasiswa();
		mhs2.nama = "Nismawati";
		mhs2.nim = "D0217314";
		mhs2.kelas = 'D';
		mhs2.alamat = "Campalagian";
		
//		mhs.printNama();
//		mhs.printNim();
//		mhs.printkelas();
//		mhs.printAlamat();
		mahasiswa[] arrMhs = new mahasiswa[3];
		arrMhs[0]= mhs;
		arrMhs[1]= mhs1;
		arrMhs[2]= mhs2;
		
		for (int i=0;i<arrMhs.length;i++) {
			arrMhs [i].printNama();
			arrMhs [i].printNim();
			arrMhs [i].printkelas();
			arrMhs [i].printAlamat();
		
		}
	}
}
