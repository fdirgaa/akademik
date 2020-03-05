-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 24, 2019 at 09:13 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko_ol`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `idbarang` int(11) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `harga` int(11) NOT NULL DEFAULT '0',
  `stok` int(11) NOT NULL DEFAULT '0',
  `foto` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`idbarang`, `nama`, `harga`, `stok`, `foto`) VALUES
(1, 'Flashdisk', 80000, 1, 0x68756d616e2d6572615f3139323078313038302e6a7067),
(3, 'Smartphone', 3000000, 50, 0x63756269632d6e6f76656d6265725f3139323078313038302e6a7067),
(5, 'Kacamata', 75000, 6, 0x6f766572636f6d655f3139323078313038302e6a7067),
(6, 'Buku', 70000, 2, 0x756e697465645f3139323078313038302e6a7067),
(7, 'Mouse', 51000, 3, 0x63756269632d6e6f76656d6265725f3139323078313038302e6a7067),
(8, 'tyu', 9000, 0, 0x63756269632d6e6f76656d6265725f3139323078313038302e6a7067);

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `idbuku` int(11) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `judul` varchar(40) NOT NULL,
  `pengarang` varchar(40) NOT NULL,
  `penerbit` varchar(40) NOT NULL,
  `stok` int(11) NOT NULL,
  `foto` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`idbuku`, `kode`, `judul`, `pengarang`, `penerbit`, `stok`, `foto`) VALUES
(1, 'FD1234', 'The Power of Mindset', 'Ferdi Dirgantara', 'Book Inspired', 65, 'overcome_1920x1080.jpg'),
(2, 'FD46578', 'Rich Dad Poor Dad', 'Robert Kiyosaki', 'Toko Buku', 100, 'universal-gathering_1920x1080.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `djual`
--

CREATE TABLE `djual` (
  `iddjual` int(11) NOT NULL,
  `idhjual` int(11) NOT NULL,
  `idbarang` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `djual`
--

INSERT INTO `djual` (`iddjual`, `idhjual`, `idbarang`, `qty`, `harga`) VALUES
(10, 5, 7, 1, 51000),
(11, 5, 1, 1, 80000);

-- --------------------------------------------------------

--
-- Table structure for table `hjual`
--

CREATE TABLE `hjual` (
  `idhjual` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `namacust` varchar(40) NOT NULL,
  `email` varchar(50) NOT NULL DEFAULT '',
  `notelp` varchar(20) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hjual`
--

INSERT INTO `hjual` (`idhjual`, `tanggal`, `namacust`, `email`, `notelp`) VALUES
(5, '2019-06-24', 'ferdi', 'ferdi@mail.com', '0871133322');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`idbarang`),
  ADD KEY `nama` (`nama`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`idbuku`);

--
-- Indexes for table `djual`
--
ALTER TABLE `djual`
  ADD PRIMARY KEY (`iddjual`);

--
-- Indexes for table `hjual`
--
ALTER TABLE `hjual`
  ADD PRIMARY KEY (`idhjual`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `idbarang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `idbuku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `djual`
--
ALTER TABLE `djual`
  MODIFY `iddjual` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `hjual`
--
ALTER TABLE `hjual`
  MODIFY `idhjual` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
