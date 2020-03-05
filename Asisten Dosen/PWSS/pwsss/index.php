<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Tugas</title>
</head>
<body>
    <form action="proses.php" method="post">
        <table>
        <tr>
            <td>NIM</td>
            <td>:</td>
            <td><input type="text" name="nim"></td>
        </tr>
        <tr>
            <td>Nama</td>
            <td>:</td>
            <td><input type="text" name="nama"></td>
        </tr>
        <tr>
            <td>Ukuran Kamar</td>
            <td>:</td>
            <td><select name="ukuran" id="ukuran">
                <option value=" ">Pilih</option>
                <option value="1">3 X 3</option>
                <option value="2">3 X 4</option>
                <option value="3">4 X 4</option>
            </select></td>
        </tr>
        <tr>
            <td>Fasilitas</td>
            <td>:</td>
            <td>
                <input type="checkbox" name="fas[]" value="Kamar Mandi"> Kamar Mandi
                <input type="checkbox" name="fas[]" value="WiFi"> WiFi
                <input type="checkbox" name="fas[]" value="TV"> TV
                <input type="checkbox" name="fas[]" value="AC"> AC
            </td>
        </tr>
        <tr>
            <td>Identitas </td>
            <td>:</td>
            <td>
                <input type="radio" name="memberid" value="KTP"> KTP
                <input type="radio" name="memberid" value="SIM"> SIM
                <input type="radio" name="memberid" value="KTM"> KTM
            </td>
        </tr>
        <tr>
            <td>Lama Sewa</td>
            <td>:</td>
            <td><input type="text" name="sewa"></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" value="SUBMIT"></td>
        </tr>
        </table>
    </form>
</body>
</html>