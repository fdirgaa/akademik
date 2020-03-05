<?php
	$awal = $_POST["awal"];
	$akhir = $_POST["akhir"];
	$kelipatan = $_POST["lipatan"];
	for($i=$awal; $i <= $akhir; $i+=$kelipatan) { 
		echo "<br> for ke $i.";
	}
?>