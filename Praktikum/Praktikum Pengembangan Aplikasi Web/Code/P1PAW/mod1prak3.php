<?php 
$a = 20; //variable dengan value 20
$b = 5; //variable dengan value 5
$c = $a * $b; //menampung hasil kali var a dan b
$d = $c / $b; //menampung hasil bagi var c dan b
$e = $d - $b; // menampung hasil kurang var d dan b
echo "$c \t $d \t $e"; //menampilkan value variable c, d, e
echo "<br />"; //Line break
// Contoh penggunaan . 
$a = "Yogyakarta "; //menampung string "Yogyakarta"
$a = $a."Kotaku"; //menggabungkan string "Yogyakarta" dan "Kotaku"
echo "$a <br />"; //Menampilkan value var a dan Line Break
// Contoh penggunaan .= 
$b = "STMIK AKAKOM "; //menampung string "STMIK AKAKOM"
$b .= "Kampusku"; //menggabungkan "STMIK AKAKOM" dengan "Kampusku"
echo "$b"; //menampilkan value var b
?>