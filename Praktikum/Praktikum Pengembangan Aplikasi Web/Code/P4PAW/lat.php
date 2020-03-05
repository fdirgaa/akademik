<?php
$var = array(
	array("Ferdi","jogja","065421"),
	array("Fadhil","jogja","021655"),
	array("Anang","jogja","032150"),
	array("Aji","jogja","032134"),
	array("tia","bantul","083263"),
	array("andi","jakarta","021602"),
	array("ali","bandung","012812"),
	array("ajeng","malang","032521"),
	array("elin","bandung","021616"),
	array("dimas","lombok","032116"),
	);
    

?>
<table border="1">
	<tr>
		<th>Nama</th>
		<th>Alamat</th>
		<th>No HP</th>
	</tr>
	<?php
		for ($row = 0; $row < 10; $row++) {
  echo "<tr>";
  for ($col = 0; $col < 3; $col++) {
    echo "<td>".$var[$row][$col]."</td>";
  }
  echo "</tr>";
}
	?>
</table>