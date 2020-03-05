<?php
include "koneksi.php";
$tampil = mysqli_query($kon,"select * from mhs");
if($_POST['proses']=="Tampilkan"){ ?>
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<th>NIM</th>
		<th>Nama</th>
		<th>JK</th>
		<th>Jurusan</th>
		<th>Tahun Akademik</th>
	</tr>
	<?php if(mysqli_num_rows($tampil)>0){ ?>
	<?php
	$no = 1;
	while($data = mysqli_fetch_array($tampil)){
		?>
		<tr>
			<td><?php echo $data["nim"]; ?></td>
			<td><?php echo $data["nama"];?></td>
			<td><?php echo $data["jk"];?></td>
			<td><?php echo $data["kdjur"];?></td>
			<td><?php echo $data["thnakad"];?></td>
		</tr>
		<?php $no++; } ?>
		<?php } ?>
	</table>
	<?php } else { 
		$nim = $_POST['nim'];
		$nama = $_POST['nama'];
		$jk = $_POST['jk'];
		$jur = $_POST['jur'];
		$thnakad = $_POST['thnakad'];

		$dataValid = "YA";

		if(strlen(trim($nim))==0){
			echo "NIM Harus Diisi! <br>";
			$dataValid = "TIDAK";
		}
		if(strlen(trim($nama))==0){
			echo "Nama Harus Diisi! <br>";
			$dataValid = "TIDAK";
		}
		if(strlen(trim($jk))==0){
			echo "Jenis Kelamin Harus Dipilih! <br>";
			$dataValid = "TIDAK";
		}
		if(strlen(trim($jur))==0){
			echo "Jurusan Harus Dipilih! <br>";
			$dataValid = "TIDAK";
		}
		if(strlen(trim($thnakad))==0){
			echo "Tahun Akademik Harus Dipilih! <br>";
			$dataValid = "TIDAK";
		}
		if($dataValid == "TIDAK"){
			echo "Masih Ada Kesalaha, silahkan perbaiki! <br>";
			echo "<input type='button' value='Kembali' 
					onClick='self.history.back()'>";
			exit;
		}

		$sql = "insert into mhs(nim,nama,jk,kdjur,thnakad)
		values($nim,'$nama','$jk','$jur',$thnakad)";
		$hasil = mysqli_query($kon, $sql);

		if(!$hasil){
			echo "Gagal Simpan, silahkan diulangi! <br>";
			echo mysqli_error($kon);
			echo "<br> <input type='button' value='Kembali' 
			onClick='self.history.back()'>";
			exit;
		} else {
			echo "Simpan data berhasil";
		}

	} ?>