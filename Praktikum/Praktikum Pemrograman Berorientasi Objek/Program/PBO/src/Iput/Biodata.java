/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iput;

/**
 *
 * @author ferdi
 */
// SuperClass
class Biodata {
  String nama;
  int umur;
  char jenis_kelamin; // L/P
  String alamat;
  String pekerjaan;

  // Konstruktor Overloading
  public Biodata(String nama, int umur, char jenis_kelamin, String alamat, String pekerjaan) {
    this.nama = nama;
    this.umur = umur;
    this.jenis_kelamin = jenis_kelamin;
    this.alamat = alamat;
    this.pekerjaan = pekerjaan;
  }

  public Biodata(String nama, int umur, char jenis_kelamin) {
    this.nama = nama;
    this.umur = umur;
    this.jenis_kelamin = jenis_kelamin;
    this.alamat = "-";
    this.pekerjaan = "-";
  }

  // setter
  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public void setPekerjaan(String pekerjaan) {
    this.pekerjaan = pekerjaan;
  }

  // getter
  public String getJk() {
    switch(this.jenis_kelamin) {
      case 'L': return "Laki-laki";
      case 'P': return "Perempuan";
      default: return "-";
    }
  }

  // cetak
  public void detail() {
    System.out.println("==================================");
    System.out.println("Nama          : " + this.nama);
    System.out.println("Umur          : " + this.umur);
    System.out.println("Jenis Kelamin : " + getJk());
    System.out.println("Alamat        : " + this.alamat);
    System.out.println("Pekerjaan     : " + this.pekerjaan);
  }
}


// SubClass
class BiroJodoh extends Biodata {
  char status; // M = Menikah, B = Bujang

  public BiroJodoh(String nama, int umur, char jenis_kelamin, char status) {
    super(nama, umur, jenis_kelamin);
    this.status = status;
  }

  public BiroJodoh(String nama, int umur, char jenis_kelamin, char status, String alamat, String pekerjaan) {
    super(nama, umur, jenis_kelamin, alamat, pekerjaan);
    this.status = status;
  }

  public static void main(String args[]) {
    Biodata calon1 = new Biodata("Fulani", 19, 'P');
    BiroJodoh calon2 = new BiroJodoh("Ichwan", 24, 'L', 'B');
    BiroJodoh calon3 = new BiroJodoh("Aan", 15, 'L', 'B', "Bantul Regency", "Pelajar");

    calon1.setPekerjaan("Mahasiswi");
    calon2.setAlamat("Seleman, Gg. Buntu No.1");
    calon2.setPekerjaan("Takmir");

    calon1.detail();
    calon2.detail();
    calon3.detail();
  }

  // getter
  public String getStatus() {
    switch(this.status) {
      case 'B': return "Bujang";
      case 'M': return "Menikah";
      default: return "Gaje";
    }
  }

  // cek dari biro
  public String hasil() {
    if(this.umur >= 17 && this.status == 'B') {
      return "Diterima";
    }
    return "Ditolak";
  }

  public void detail() {
    super.detail();
    System.out.println("Status        : " + getStatus());
    System.out.println("==================================");
    System.out.println("Hasil Biro    : " + hasil());
  }
}
