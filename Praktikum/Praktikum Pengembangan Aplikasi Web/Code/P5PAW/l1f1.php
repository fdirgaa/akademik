<?php
	
	function HitungAngsuran($jp,$la,$b){
		echo "<table cellspacing='1px' border='1px'>";
		echo "<tr>";
		echo "<th>Angsuran Ke</th>";
		echo "<th>Pokok</th>";
		echo "<th>Bunga</th>";
		echo "<th>Subtotal</th>";
		echo "</tr>";
		for ($i=1; $i <= $la; $i++) { 
			$tp = $jp / $la;
			$tb = (($b / 100) * $jp);
			$st = $tp + $tb;
			echo "<tr>";
			echo "<td>$i</td>";
			echo "<td>$tp</td>";
			echo "<td>$tb</td>";
			echo "<td>$st</td>";
			echo "<tr>";
		}
		echo "</table>";
	}

	HitungAngsuran(1200000,12,5); 
?>

