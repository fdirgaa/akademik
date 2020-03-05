<h2>::ISI DATA::</h2>
<form action="m7l2.php" method="post">
	<table border="1">
		<tr>
			<td>NIM </td>
			<td> <input type="text" name="nim"> </td>
		</tr>
		<tr>
			<td>Nama </td>
			<td> <input type="text" name="nama"> </td>
		</tr>
		<tr>
			<td>Jenis Kelamin</td>
			<td><input type="radio" name="jk" value="L" checked="checked"> Pria <input type="radio" name="jk" value="W"> Wanita</td>
		</tr>
		<tr>
			<td>Jurusan</td>
			<td>
				<select name="jur">
					<option value=""> </option>
					<option value="TI">Teknik Informatika</option>
					<option value="SI">Sistem Informasi</option>
					<option value="MI">Manaj. Informatika  </option>
					<option value="TK">Teknik Komputer</option>
					<option value="KA">Komp. Akuntansi</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Tahun Akademik</td>
			<td>
				<select name="thnakad">
					<option value=""> </option>
					<option value="2014">2014</option>
					<option value="2015">2015</option>
					<option value="2016">2016</option>
					<option value="2017">2017</option>
					<option value="2018">2018</option>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="Simpan" name="proses">
				<input type="submit" value="Tampilkan" name="proses">
			</td>
		</tr>
	</table>
</form>