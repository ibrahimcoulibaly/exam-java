-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 05, 2024 at 08:00 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `examenjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `cours`
--

DROP TABLE IF EXISTS `cours`;
CREATE TABLE IF NOT EXISTS `cours` (
  `id_cours` int(100) NOT NULL AUTO_INCREMENT,
  `date_cours` date NOT NULL,
  `time_cours` time NOT NULL,
  `id_module` int(11) NOT NULL,
  PRIMARY KEY (`id_cours`),
  UNIQUE KEY `id_module` (`id_module`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `module`
--

DROP TABLE IF EXISTS `module`;
CREATE TABLE IF NOT EXISTS `module` (
  `id_module` int(100) NOT NULL AUTO_INCREMENT,
  `nom_module` varchar(255) NOT NULL,
  PRIMARY KEY (`id_module`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `professeur`
--

DROP TABLE IF EXISTS `professeur`;
CREATE TABLE IF NOT EXISTS `professeur` (
  `id_professeur` int(100) NOT NULL AUTO_INCREMENT,
  `nom_professeur` varchar(255) NOT NULL,
  `prenom_professeur` varchar(255) NOT NULL,
  `id_module` int(100) NOT NULL,
  PRIMARY KEY (`id_professeur`),
  UNIQUE KEY `id_module` (`id_module`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cours`
--
ALTER TABLE `cours`
  ADD CONSTRAINT `cours_ibfk_1` FOREIGN KEY (`id_module`) REFERENCES `module` (`id_module`);

--
-- Constraints for table `professeur`
--
ALTER TABLE `professeur`
  ADD CONSTRAINT `professeur_ibfk_1` FOREIGN KEY (`id_module`) REFERENCES `professeur` (`id_professeur`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
