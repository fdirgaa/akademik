<?php
$nim = $_POST['nim'];
$nama = $_POST['nama'];
$roomPrice = 0;
$ukuran = $_POST['ukuran'];
$ukrnKmr = "";
if($ukuran==1){
    $roomPrice += 1000000;
    $ukrnKmr = "3 X 3";
} elseif($ukuran==2){
    $roomPrice += 2000000;
    $ukrnKmr = "3 X 4";
} elseif($ukuran==3){
    $roomPrice += 3000000;
    $ukrnKmr = "4 X 4";
}

$fasPrice = 0;
if(!empty($_POST['fas'])){
    $fas = $_POST['fas'];
}
$memberid = $_POST['memberid'];
$sewa = $_POST['sewa'];

echo "<h1>Data Anda</h1><hr>";
echo "NIM : $nim </br>";
echo "Nama : $nama </br> ";
echo "Ukuran Kamar : $ukrnKmr </br>";
echo "Fasilitas yang diambil: </br>";
foreach($fas as $key=>$selected){
    if($selected=="Kamar Mandi"){
        $fasPrice += 100000;
    } elseif($selected=="WiFi"){
        $fasPrice += 50000;
    } elseif($selected=="TV"){
        $fasPrice += 30000;
    } elseif($selected=="AC"){
        $fasPrice = 20000;
    } else{
        $fasPrice = 0;
    }
    echo ($key + 1).". ".$selected."</br>";
}
echo "ID : $memberid </br>";
echo "Lama Penyewaan : $sewa hari<hr>";

echo "<h2>Pembayaran</h2><hr>";
echo "";
$discRoom = 0;
if($sewa>14){
    $discRoom = $roomPrice * 0.1;
    echo "<b>Anda Mendapatkan Diskon 10% untuk Kamar</b> <br>";
    if(count($fas)==4){
        $discFas = $fasPrice * 0.2;
        echo "<b>Tambahan diskon fasilitas 20%</b> <br>";
    }  else{
        $discFas = 0;
    }
} elseif($sewa>30){
    $discRoom = $roomPrice * 0.15;
    echo "<b>Anda Mendapatkan Diskon 15% untuk Kamar</b> <br>";
    if(count($fas)==4){
        $discFas = $fasPrice * 0.2;
        echo "<b>Tambahan diskon fasilitas 20%</b> <br>";
    }  else{
        $discFas = 0;
    }
} else{
    $discRoom = 0;
    echo "<b>Tidak ada diskon kamar</b> <br>";
    if(count($fas)==4){
        $discFas = $fasPrice * 0.2;
        
        echo "<b>Tambahan diskon fasilitas 20%</b> <br>";
    } else{
        $discFas = 0;
    }
}
$roomPay = $roomPrice - $discRoom;
$fasPay = $fasPrice - $discFas;
$ttlBayar = $roomPay + $fasPay;
echo "Harga Kamar : Rp.$roomPrice <br>";
echo "Diskon Kamar : Rp.$discRoom <br>";
echo "Fasilitas : Rp.$fasPrice <br>";
echo "Diskon Fasilitas : Rp.$discFas <br>";
echo "Total Bayar Kamar : Rp.$roomPay <br>";
echo "Total Bayar Fasilitas : Rp.$fasPay <hr>";
echo "Total Pembayaran : Rp.". $ttlBayar;
?>