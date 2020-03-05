<form action="prosesdata.php" name="formdata" method="POST">
    NIM : <input type="text" name="nim"/><br>
    NAMA : <input type="text" name="nama"><br>
    JENIS KELAMIN : <input type="radio" name="jk" value="laki-laki" checked> Laki-Laki
                    <input type="radio" name="jk" value="perempuan"> Perempuan <br>
    TAHUN ANGKATAN :
    <select name="angkatan">
        <option value=" "> Pilih </option>
        <option value="2015"> 2015 </option>
        <option value="2016"> 2016 </option>
        <option value="2017"> 2017 </option>
        <option value="2018"> 2018 </option>
    </select><br>
    JURUSAN : 
    <select name="jurusan">
        <option value=" "> Pilih </option>
        <option value="TI"> Teknik Informatika </option>
        <option value="SI"> Sistem Informasi </option>
        <option value="MI"> Manajemen Informatika </option>
        <option value="TK"> Teknik Komputer </option>
        <option value="KA"> Komputerisasi Akuntansi</option>
    </select><br>

    HOBY : <br>
    <input type="checkbox" name="hobi[]" value="Photography"> Photography <br>
    <input type="checkbox" name="hobi[]" value="Film"> Film <br>
    <input type="checkbox" name="hobi[]" value="Programming"> Programming <br>
    <input type="checkbox" name="hobi[]" value="Travel"> Travel <br>

    <input type="submit" value="SUBMIT" name="submit">
</form>