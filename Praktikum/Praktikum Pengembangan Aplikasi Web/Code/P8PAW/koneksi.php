<?php
	error_reporting(E_ALL ^ E_DEPRECATED);
	$host = "localhost";
	$user = "root";
	$pass = "";
	$dbName = "toko_ol";

	$kon = mysqli_connect($host, $user, $pass);
	if(!$kon)
		die("Gagal Koneksi...");

	$hasil = mysqli_select_db($kon, $dbName);
	if(!$hasil){
		$hasil = mysqli_query($kon, "CREATE DATABASE $dbName");
		if(!$hasil)
			die("Gagal Buat Database");
		else
			$hasil = mysqli_select_db($kon, $dbName);
		if(!$hasil) die ("Gagal Konek Database");
 	}

 	$sqlTabelBarang = "create table if not exists barang(
 	idbarang int auto_increment not null primary key,
 	nama varchar(40) not null,
 	harga int not null default 0,
 	stok int not null default 0,
 	foto blob not null default '',
 	KEY(nama))";

	mysqli_query($kon, $sqlTabelBarang) or die("Gagal Buat Tabel Barang");

	// $sqlMhs = "create table if not exists mhs(
	// 	nim int not null primary key,
	// 	nama varchar(40) not null,
	// 	jk varchar(1) not null,
	// 	kdjur varchar(2) not null,
	// 	thnakad int(4) not null)";
	
	// mysqli_query($kon, $sqlMhs) or die("Gagal Buat Tabel Mahasiswa");
 	
?>


<?php
 	
?>	