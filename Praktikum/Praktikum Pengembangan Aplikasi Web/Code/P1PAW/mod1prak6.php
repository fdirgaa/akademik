<?php 
	$ia = 4; // decimal 
	$ib = -20; // decimal negatif 
	$ic = 0232; // octal 
	$id = 0x5DF; // hexadecimal 
	$jumlah = $ia + 3; 
	// Single quoted 
	echo 'single quoted <br />'; 
	echo 'Budi berkata, "I\'ll do the PHP code" <br />'; 
	echo 'PHP ini terletak di C:\\php\<br />'; 
	echo 'Variabel seperti $jumlah tidak akan ditulis valuenya <br />';
	echo '=====================================<br/>'; 
	/* Single quoted membuat single quoted dan backslah harus ditambahkan
	backslah sebelum karakternya dan bisa membaca tanda $*/
	// Double quoted 
	echo "double quoted <br />"; 
	echo "Budi berkata, 'I\"ll do the PHP code' <br />";
	echo "PHP ini terletak di C:\php\<br />"; 
	echo "Variabel \$jumlah mempunyai value $jumlah </br>";
	/* Double quoted membuat double quoted dan dollar sign harus ditambahkan
	backslah sebelum karakternya dan bisa langsung membaca backslah tanpa harus
	double pada backslah*/
?>