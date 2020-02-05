<h1>Data Barang</h1>
<hr>
<form action="output.php" method="post">
	Nama Barang <br>
	<input type="text" name="nama"><br>
	Jenis <br>
	<select name="jenis">
		<option value="PC">PC Komputer</option>
		<option value="LP">Laptop</option>
		<option value="PR">Peripheral</option>
		<option value="SP">Smart Phone</option>
		<option value="IP">I-Pad</option>
	</select><br>
	Nomor Seri<br>
	<input type="text" name="no_seri" maxlength="6"> <br>
	Merk <br>
	<input type="text" name="merk"><br>
	Negara Pembuat <br>
	<input type="text" name="np"><br>
	<fieldset><legend>Tanggal Pembuatan</legend>
		Tgl
		<select name="angka_hari">
			<?php 
				for($hari=1;$hari<=31;$hari++){
					$htgl = str_pad($hari,2,"0",STR_PAD_LEFT);
					echo "<option value='$htgl'>$htgl</option>";
				}
			 ?>
		</select>
		Bulan
		<select name="bulan">
			<?php 
				for($bulan=1;$bulan<=12;$bulan++){
					$bln = str_pad($bulan,2,"0",STR_PAD_LEFT);
					echo "<option value='$bln'>$bln</option>";
				}
			?>
		</select>
		Tahun
		<select name="tahun">
			<?php 
				$tahun_sekarang = date("Y");
				$tahun_awal = $tahun_sekarang-10;
				$tahun_akhir = $tahun_sekarang+10;
				for($tahun=$tahun_akhir;$tahun>=$tahun_awal;$tahun--){
					echo "<option value='$tahun'>$tahun</option>";
				}
			?>
		</select> 
	</fieldset>
	Harga Barang <br>
	Rp. <input type="text" name="harga" /> <br>
	Jumlah Stok <br>
	<input type="text" name="stok" /> <br>
	<hr>
	<input type="submit" value="SUBMIT" name="btn">
	<input type="submit" value="RESET" name="btn">
</form>