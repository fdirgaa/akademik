<?php
	$arr_jurusan = array("TI" =>"Teknik Informatika",
		"SI" =>"Sistem Informasi","MI" =>"Manajemn Informatika",
		"KA" =>"Komputer Akuntansi","TK" =>"Teknik Komputer");
	$nama  = $_POST["nama"];
	$kd  = $_POST["jurusan"];
?>
<h2>Jurusan Anda</h2>
<pre>
	Nama 			: <?php echo $nama ?> <br>
	Kode Jurusan 		: <?php echo $kd ?> <br>
	Jurusan 		: <?php echo $arr_jurusan[$kd] ?> <br>
</pre>