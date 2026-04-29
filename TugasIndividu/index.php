<!DOCTYPE html>
<html>
<head>
    <title>Tugas Individu</title>
</head>
<body style="background-color:antiquewhite;font-family:Calibri;">
<?php
$host = "localhost";
$db = "bukudb";
$username = "root";
$password = "Sql.06";

try {
    $pdo = new PDO("mysql:host={$host};dbname={$db}", $username, $password);
    echo "Koneksi Berhasil!<br>";
} catch (\PDOException $e){
    die("Koneksi gagal : " . $e->getMessage());
}

if(empty($_REQUEST)){
    $stmt = $pdo->query("SELECT * FROM buku");
    $rows = $stmt->fetchAll();
    echo "Data buku (ISBN - Judul Buku - Harga - Stok):<br>";
    foreach($rows as $row){
        $buku_isbn = $row['buku_isbn'];
        $buku_judul = $row['buku_judul'];   
        $penerbit_id = $row['penerbit_id'];  
        $buku_tglterbit = $row['buku_tglterbit'];  
        $buku_jmlhalaman = $row['buku_jmlhalaman']; 
        $buku_deskripsi = $row['buku_deskripsi'];  
        $buku_harga = $row['buku_harga'];   
        $stok = $row['stok'];
    echo "{$buku_isbn} - {$buku_judul}  - Rp{$buku_harga} - {$stok}<br>";     
    }
}
?>
</body>
</html>