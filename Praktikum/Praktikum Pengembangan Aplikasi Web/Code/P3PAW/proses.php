<?php
	$p = $_POST["pinjaman"];
	$w = $_POST["waktu"];
	$b = $_POST["bunga"];
	$u = $_POST["ulang"];

	echo "Total Pinjaman : $p <br>" ;
	echo "Jangka Waktu : $w<br>" ;
	echo "Bunga % / Tahun : $b <br>" ;

	echo "<table cellspacing='1px' border='1px'>";
	echo "<tr>";
	echo "<th>Angsuran Ke</th>";
	echo "<th>Pokok</th>";
	echo "<th>Bunga</th>";
	echo "<th>Subtotal</th>";
	echo "<tr>";

	if($u=="for"){
		for ($i=1; $i <= $w; $i++) { 
			$tp = $p / $w;
			$tb = (($b / 100) * $p)/$w;
			$st = $tp + $tb;
			echo "<tr>";
			echo "<td>$i</td>";
			echo "<td>$tp</td>";
			echo "<td>$tb</td>";
			echo "<td>$st</td>";
			echo "<tr>";
		}
	} else if($u=="while"){
		$i=1;
		while($i<=$w){
			$tp = $p / $w;
			$tb = (($b / 100) * $p)/$w;
			$st = $tp + $tb;
			echo "<tr>";
			echo "<td>$i</td>";
			echo "<td>$tp</td>";
			echo "<td>$tb</td>";
			echo "<td>$st</td>";
			echo "<tr>";
			$i++;
		}
	}
	echo "</table>"
?>