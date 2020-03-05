<?php
	$pemilik["AD 92343 ZA"] = "Umar";
	$pemilik["AB 89332 NA"] = "Bakri";
	$pemilik["B 347622 BU"] = "Tika";
	$pemilik["D 88780 AS"] = "Tutik";
	$pemilik["L 87332 KL"] = "Budi";

	$indek = "D 88780 AS";
	echo "Pemilik kendaran No.Pol ".$indek." adalah ".$pemilik[$indek];

	echo "<h2>Daftar Pemilik Kendaraan</h2>";

	foreach($pemilik as $nomor => $nama){
		echo "Nomor Polisi : $nomor <br/>";
		echo "nama Pemilik : $nama <br/>";
	}
?>