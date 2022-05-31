class Angsa{
	private static String Jenis_unggas = "Angsa";
	private static int Jumlah_kaki = 2;
	
	private static String getJenisUnggas(){
		return jenis_unggas;
	}
	
	publc static int getJumlahKaki(){
		return jumlah_kaki;
	}
	
	private static void berkokok(){
		System.out.println("Aku berkokok");
	}
	
	private static void berlari(){
		System.out.println("Aku berlari");
	}
	
	public static void main(String [] args){
		System.out.println(String.format("Jenis Unggas:&s", getJenisUnggas()));
		System.out.println(String.format("Jumlah Kaki:&s", getJumlahKaki()));
		berkokok();
		berlari();
	}
}
