<?php
	$nm = $_POST['nama'];
	$jml = $_POST['jumlah'];
	$hrg = $_POST['harga'];
	$ttl = $jml * $hrg;
	
?>
<?php for($i=1;$i<=3;$i++){ ?>
	Nomor		: <?php echo $i; ?> <br>
	Nama Barang	: <?php echo $nm; ?> <br>
	Jumlah 		: <?php echo $jml; ?> <br>
	Harga Barang	: <?php echo $hrg; ?> <br>
	Total		:  <?php echo $ttl ?>
	<hr>
<?php }	?>
