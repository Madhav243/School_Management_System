-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 02, 2019 at 11:57 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schooldb`
--

-- --------------------------------------------------------

--
-- Table structure for table `feetable`
--

CREATE TABLE `feetable` (
  `admno` int(10) NOT NULL,
  `totalfee` int(100) NOT NULL,
  `paid` int(100) NOT NULL,
  `term` varchar(100) NOT NULL,
  `mode` varchar(100) NOT NULL,
  `due` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `managementhead`
--

CREATE TABLE `managementhead` (
  `Username` varchar(200) NOT NULL,
  `Password` varchar(200) NOT NULL,
  `FirstName` varchar(200) NOT NULL,
  `LastName` varchar(200) NOT NULL,
  `Qualification` varchar(200) NOT NULL,
  `EmailAddress` varchar(500) NOT NULL,
  `Salary` varchar(200) NOT NULL,
  `Gender` varchar(200) NOT NULL,
  `PhoneNumber` varchar(200) NOT NULL,
  `Address` varchar(500) NOT NULL,
  `Image` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `studenttable`
--

CREATE TABLE `studenttable` (
  `admno` int(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `fathername` varchar(100) NOT NULL,
  `mothername` varchar(100) NOT NULL,
  `foccu` varchar(100) NOT NULL,
  `moccu` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `class` varchar(100) NOT NULL,
  `section` varchar(100) NOT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `bloodgroup` varchar(100) NOT NULL,
  `landline` int(100) NOT NULL,
  `religion` varchar(100) NOT NULL,
  `address` varchar(500) NOT NULL,
  `studentimage` varchar(2000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teachingstaff`
--

CREATE TABLE `teachingstaff` (
  `FirstName` varchar(200) NOT NULL,
  `LastName` varchar(200) NOT NULL,
  `Qualification` varchar(200) NOT NULL,
  `EmailAddress` varchar(200) NOT NULL,
  `Subject` varchar(200) NOT NULL,
  `Salary` varchar(200) NOT NULL,
  `Class` varchar(200) NOT NULL,
  `Gender` varchar(200) NOT NULL,
  `PhoneNumber` varchar(200) NOT NULL,
  `Address` varchar(500) NOT NULL,
  `Image` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `usertable`
--

CREATE TABLE `usertable` (
  `Username` varchar(200) NOT NULL,
  `Password` varchar(200) NOT NULL,
  `Usertype` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `feetable`
--
ALTER TABLE `feetable`
  ADD KEY `admno` (`admno`);

--
-- Indexes for table `managementhead`
--
ALTER TABLE `managementhead`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `studenttable`
--
ALTER TABLE `studenttable`
  ADD PRIMARY KEY (`admno`);

--
-- Indexes for table `teachingstaff`
--
ALTER TABLE `teachingstaff`
  ADD PRIMARY KEY (`PhoneNumber`);

--
-- Indexes for table `usertable`
--
ALTER TABLE `usertable`
  ADD PRIMARY KEY (`Username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `studenttable`
--
ALTER TABLE `studenttable`
  MODIFY `admno` int(100) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `feetable`
--
ALTER TABLE `feetable`
  ADD CONSTRAINT `addcon` FOREIGN KEY (`admno`) REFERENCES `studenttable` (`admno`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
