<?php
    $nim = $_POST["nim"];
    $nama = $_POST["nama"];
    $jk = $_POST["jk"];
    $angkatan = $_POST["angkatan"];
    $jurusan = $_POST["jurusan"];
    $hobi = $_POST["hobi"];
    $gender;
    $jur;

    if ($jk == "laki-laki") {
        $gender = "Laki-Laki";
    } elseif ($jk == "perempuan") {
        $gender = "Perempuan";
    } else {
        $gender = "Jenis kelamin kosong";
    }
    
    switch ($angkatan) {
        case 2015:
            $ta = "2015";
            break;
        case 2016:
            $ta = "2016";
            break;
        case 2017:
            $ta = "2017";
            break;
        case 2018:
            $ta = "2018";
            break;
        default:
            $ta = "Tahun angkatan kosong";
            break;
    }

    switch ($jurusan) {
        case "TI":
            $jur = "Teknik Informatika";
            break;
        case "SI":
            $jur = "Sistem Informasi";
            break;
        case "MI":
            $jur = "Manajemen Informatika";
            break;
        case "TK":
            $jur = "Teknik Komputer";
            break;
        case "KA":
            $jur = "Komputerisasi Akuntansi";
            break;
        default:
            $jur = "Jurusan kosong";
            break;
    }

     

    echo $nim . "<br>";
    echo $nama . "<br>";
    echo $gender . "<br>";
    echo $ta . "<br>";
    echo $jur . "<br>";
    
    if (empty($hobi)) {
        $hobi = "Tidak memilih hobi";
    } else {
        $N = count($hobi);

        for($i=0; $i < $N; $i++){
            echo ($hobi[$i] . ", ");
        }
    }
?>


