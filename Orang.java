public abstract class Orang {
	private String nama;
	private int umur;
	private String jenisKelamin;
	
	public Orang(){
		
	}
	
	public String getNama(){
		return nama;
	}
	
	public int getUmur(){
		return umur;
	}
	
	public String getAlamat {
		return alamat;
	}
	
	public String getjenisKelamin {
		return jenisKelamin;
	}
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public void setUmur(int umur){
		this.umur = umur;
	}
	
	public void setjenisKelamin(String jenisKelamin){
		this.jenisKelamin = jenisKelamin;
	}
	
	public void setAlamat(String alamat){
		this.alamat = alamat;
	}
}