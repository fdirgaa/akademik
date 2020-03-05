<a href="form.php">INPUT BUKU</a>
&nbsp; &nbsp; &nbsp;
<a href="form_cari.php">CARI BUKU</a>
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<th>Foto</th>
		<th>Kode</th>
		<th>Judul Buku</th>
		<th>Pengarang</th>
		<th>Penerbit</th>
		<th>Stok</th>
	</tr>
	<?php
	include "koneksi.php";
	$cari = "";
	if(isset($_POST["cari"])){
		$cari = $_POST["cari"];
		if($_POST["cari_buku"]=="judul"){
			$sql = "select * from buku where judul like '%".$cari."%' order by idbuku desc";
		} else if($_POST["cari_buku"]=="pengarang"){
			$sql = "select * from buku where pengarang like '%".$cari."%' order by idbuku desc";
		}
	} else{
		$sql = "select * from buku order by idbuku desc";
	}
	$hasil = mysqli_query($kon,$sql);
	if(!$hasil)
		die("Gagal Query...".mysqli_error($kon));
	$no = 0;
	while($row = mysqli_fetch_assoc($hasil)){
		?>
		<tr>
			<td><?php echo '<a href="pict/'.$row["foto"].'"/>
			<img src="pict/'.$row['foto'].'" width="100px"/></a>';?></td>
			<td><?php echo $row["kode"];?></td>
			<td><?php echo $row["judul"];?></td>
			<td><?php echo $row["pengarang"];?></td>
			<td><?php echo $row["penerbit"];?></td>
			<td><?php echo $row["stok"];?></td>
		</tr>
		<?php $no++; } ?>
	</table>

	