-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-02-2017 a las 00:23:14
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `progra3_exa2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `author`
--

CREATE TABLE `author` (
  `id_author` int(11) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `author`
--

INSERT INTO `author` (`id_author`, `name`) VALUES
(1, 'J.R.R. Tolkien'),
(2, 'J.K. Rowling'),
(3, 'Andrzej Sapkowski'),
(4, 'Bram Stocker');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `authorcontact`
--

CREATE TABLE `authorcontact` (
  `id_authorContact` int(11) NOT NULL,
  `id_author` int(11) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `authorcontact`
--

INSERT INTO `authorcontact` (`id_authorContact`, `id_author`, `contact`, `type`) VALUES
(1, 1, 'tolkienCommunity@google.com', 'email'),
(2, 2, 'www.RowlingMasterPiece.com', 'web page'),
(3, 3, 'TheWitcherSociety.blogspot.com', 'blog'),
(4, 4, 'bram_stocker@hotmail.com', 'email');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book`
--

CREATE TABLE `book` (
  `id_book` int(11) NOT NULL,
  `id_author` int(11) NOT NULL,
  `id_type` int(11) NOT NULL,
  `name` varchar(60) NOT NULL,
  `dateRelease` text NOT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `book`
--

INSERT INTO `book` (`id_book`, `id_author`, `id_type`, `name`, `dateRelease`, `price`) VALUES
(1, 1, 1, 'The Lord of the Rings', '1998-11-13', 10000),
(2, 2, 2, 'Harry Potter', '1995-06-12', 9900),
(3, 3, 3, 'The last Wish', '2001-03-24', 7550),
(4, 4, 4, 'Dracula', '1975-04-15', 10100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `booktype`
--

CREATE TABLE `booktype` (
  `id_type` int(11) NOT NULL,
  `type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `booktype`
--

INSERT INTO `booktype` (`id_type`, `type`) VALUES
(1, 'Fantasy'),
(2, 'Epic'),
(3, 'Novel'),
(4, 'Horror');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`id_author`);

--
-- Indices de la tabla `authorcontact`
--
ALTER TABLE `authorcontact`
  ADD PRIMARY KEY (`id_authorContact`);

--
-- Indices de la tabla `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id_book`);

--
-- Indices de la tabla `booktype`
--
ALTER TABLE `booktype`
  ADD PRIMARY KEY (`id_type`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `author`
--
ALTER TABLE `author`
  MODIFY `id_author` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `authorcontact`
--
ALTER TABLE `authorcontact`
  MODIFY `id_authorContact` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `book`
--
ALTER TABLE `book`
  MODIFY `id_book` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `booktype`
--
ALTER TABLE `booktype`
  MODIFY `id_type` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
