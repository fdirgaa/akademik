<?php
$barang_pilih = 0;
if(isset($_COOKIE['keranjang'])){
	$barang_pilih = $_COOKIE['keranjang'];
}
if(isset($_GET['idbarang'])){
	$idbarang = $_GET['idbarang'];
	$barang_pilih = $barang_pilih ."," . $idbarang;
	setcookie('keranjang',$barang_pilih,time()+3600);
}
include "koneksi.php";
$sql = "select * from barang where idbarang not in (".$barang_pilih.")
		and stok > 0 order by idbarang desc";
$hasil = mysqli_query($kon,$sql);
if(!$hasil)
	die("Gagal query...".mysql_error());
?>
<h2>DAFTAR BARANG TERSEDIA</h2>

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
					echo "<a href='".$_SERVER['PHP_SELF']."?idbarang=".$row['idbarang']."'>BELI</a>";
				 ?>
			</td>
		</tr>
		<?php $no++; } ?>
	
	</table>
