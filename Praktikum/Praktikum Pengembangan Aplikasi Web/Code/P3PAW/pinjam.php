<form name="form" action="proses.php" method="post">
	Total Pinjaman : <input type="text" name="pinjaman"><br>
	jangka Waktu :
	<select name="waktu">
		<option value="6"> 6</option>
		<option value="12"> 12</option>
		<option value="24"> 24</option>
		<option value="31"> 36</option>
	</select><br>
	Bunga % / Tahun : <input type="text" name="bunga"> <br>
	<input type="radio" name="ulang" value="for"> For
	<input type="radio" name="ulang" value="while"> While <br>
	<input type="submit" value="LIHAT RINCIAN">
</form>