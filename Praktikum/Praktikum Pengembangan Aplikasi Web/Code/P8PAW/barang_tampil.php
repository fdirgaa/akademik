<?php
include "koneksi.php";
$tampil = mysqli_query($kon,"select * from barang");
?>
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<th>Kode Barang</th>
		<th>Nama Barang</th>
		<th>Harga</th>
		<th>Stok</th>
		<th>Gambar</th>
	</tr>
	<?php if(mysqli_num_rows($tampil)>0){ ?>
	<?php
	$no = 1;
	while($data = mysqli_fetch_array($tampil)){
		?>
		<tr>
			<td><?php echo $data["idbarang"]; ?></td>
			<td><?php echo $data["nama"];?></td>
			<td><?php echo $data["harga"];?></td>
			<td><?php echo $data["stok"];?></td>
			<td><?php echo '<img src="pict/'.$data['foto'].'" width="150px"/>';?></td>
		</tr>
		<?php $no++; } ?>
		<?php } ?>
	</table>