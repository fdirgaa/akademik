<h1>TRANSAKSI</h1>
<hr>
<form action="kirim.php" method="post">
	<?php for($i=1;$i<=3;$i++){ ?>
		Nomor		: <?php echo $i; ?> <br>
		Nama Barang	: <?php echo "<input type='text' name='nama[$i]'>" ?> <br>
		Jumlah 		: <?php echo "<input type='text' name='jumlah[$i]' >" ?> <br>
		Harga Barang	: <?php echo "<input type='text' name='harga[$i]' >" ?> <br>
	<hr>
	<?php }	?>
	<input type="submit" value="HITUNG" name="hitung">
	<input type="submit" value="BATAL" name="batal">
</form>