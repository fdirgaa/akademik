<?php 
function tampil($mhs){
	foreach($mhs as $key => $nilai){
		echo "Nilai Mahasiswa Ke-$key : $nilai <br>";
	}
}
$mhs = $_POST['mahasiswa'];
tampil($mhs);
?>