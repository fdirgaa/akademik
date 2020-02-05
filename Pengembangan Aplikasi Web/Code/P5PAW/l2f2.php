<?php
function inForm($b){
		for($a=1;$a<=$b;$a++){
			echo "Nilai Mahasiswa Ke-$a <input type='text' name='mahasiswa[$a]'/> <br>";
		}
		echo "<input type='submit' value='Tampilkan Nilai'>";
}
?>

<form action="l2f3.php" method="post">
	<?php inForm($_POST["jml"]) ?>
</form>