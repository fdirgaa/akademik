<style type="text/css">
@media print{
    #tombol {
        display:none;
    }
}
</style>
<div id="tombol">
    <input type="button" value="Beli Lagi"
        onClick="window.location.assign('barang_tersedia.php')">
    <input type="button" value="Print"
        onClick="window.print()">
</div>
<?php
    $idhjual = $_GET["idhjual"];
    include "koneksi.php";
    $sqlhjual = "select * from hjual where idhjual = '$idhjual'";
    $hasilhjual = mysqli_query($kon,$sqlhjual);
    $row_hjual = mysqli_fetch_array($hasilhjual);

    echo "<pre>";
    echo "<h2>BUKTI PEMBELIAN</h2>";
    echo "NO. NOTA : ".date("Ymd").$row_hjual['idhjual']."<br/>";
    echo "TANGGAL  : ".$row_hjual['tanggal']."<br/>";
    echo "NAMA     : ".$row_hjual['namacust']."<br/>";
    $sqldjual = "select barang.nama,djual.harga,djual.qty,
                (djual.harga * djual.qty) as jumlah
                from djual inner join barang
                on djual.idbarang = barang.idbarang
                where djual.idhjual = $idhjual ";
    $hasildjual = mysqli_query($kon,$sqldjual);
    echo "<table border='1' cellpadding='10' cellspacing='0'>";
    echo "<tr>";
    echo "<th> Nama Barang </th>";
    echo "<th> Quantity </th>";
    echo "<th> Harga </th>";
    echo "<th> Jumlah </th>";
    echo "<tr>";
    $totalharga=0;
    while($rowdjual = mysqli_fetch_assoc($hasildjual)){
        echo "<tr>";
        echo "<td>".$rowdjual['nama']."</td>";
        echo "<td align='right'>".$rowdjual['qty']."</td>";
        echo "<td align='right'>".$rowdjual['harga']."</td>";
        echo "<td align='right'>".$rowdjual['jumlah']."</td>";
        echo "</tr>";
        $totalharga = $totalharga + $rowdjual['jumlah'];
    }
    echo "<tr>";
    echo "<td colspan='3' align='right'>";
    echo "    <strong>Total Jumlah</strong></td>";
    echo "<td align='right'><strong>$totalharga</strong></td>";
    echo "</tr>";
    echo "</table>";
    echo "</pre>";
?>



