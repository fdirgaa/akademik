<?php
$nama_barang = "";
if(isset($_POST["nama_barang"]))
	$nama_barang = $_POST["nama_barang"];
include "koneksi.php";
$sql = "select * from barang where nama like '%".$nama_barang."%' order by idbarang desc";
$hasil = mysqli_query($kon,$sql);
if(!$hasil)
	die("Gagal Query...".mysqli_error($kon));
?>
<a href="barang_isi.php">INPUT BARANG</a>
&nbsp; &nbsp; &nbsp;
<a href="barang_cari.php">CARI BARANG</a>
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<th>Foto</th>
		<th>Nama Barang</th>
		<th>Harga Jual</th>
		<th>Stok</th>
		<th>Operasi</th>
	</tr>
	
	<?php
	$no = 0;
	while($row = mysqli_fetch_assoc($hasil)){
		?>
		<tr>
			<td><?php echo '<a href="pict/'.$row["foto"].'"/>
			<img src="thumb/'.$row['foto'].'" width="100px"/></a>';?></td>
			<td><?php echo $row["nama"];?></td>
			<td><?php echo $row["harga"];?></td>
			<td><?php echo $row["stok"];?></td>
			<td>
				<?php 
					echo "<a href='barang_edit.php?idbarang=".$row['idbarang']."'>EDIT</a>";
					echo "&nbsp;&nbsp";
					echo "<a href='barang_hapus.php?idbarang=".$row['idbarang']."'>HAPUS</a>";
				 ?>
			</td>
		</tr>
		<?php $no++; } ?>
	
	</table>
