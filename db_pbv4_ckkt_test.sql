-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 11 Octobre 2016 à 13:55
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `db_pbv4_ckkt_test`
--

-- --------------------------------------------------------

--
-- Structure de la table `adresse`
--

CREATE TABLE `adresse` (
  `idAdresse` bigint(20) NOT NULL,
  `codePostal` int(11) NOT NULL,
  `nomRue` varchar(255) DEFAULT NULL,
  `numRue` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `adresse`
--

INSERT INTO `adresse` (`idAdresse`, `codePostal`, `nomRue`, `numRue`, `ville`) VALUES
(1, 69005, 'rue de la paix', '84', 'Lyon'),
(2, 69005, 'rue de la guerre', '53', 'Lyon'),
(3, 69005, 'rue de charlemagne', '74', 'Lyon'),
(4, 69005, 'rue du champs', '41', 'Lyon'),
(5, 69005, 'rue du code', '68', 'Lyon'),
(6, 69005, 'rue de la victoire', '92', 'Lyon'),
(21, 69003, 'Choisir un nom de rue', '45', 'Choisir une ville');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `idPersonne` bigint(20) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `adresse_idAdresse` bigint(20) DEFAULT NULL,
  `conseiller_idPersonne` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`idPersonne`, `nom`, `prenom`, `mail`, `telephone`, `adresse_idAdresse`, `conseiller_idPersonne`) VALUES
(4, 'Marley', 'bob', 'marley@chanson.com', '06.23.04.98.62', 1, 1),
(5, 'Morose', 'Marylin', 'marley@gmail.com', '06.23.04.98.62', 2, 1),
(6, 'Marteau', 'Jean', 'Jean@gmail.com', '06.23.04.98.62', 3, 2),
(7, 'Marcheciel', 'Luc', 'Luc@gmail.com', '06.23.04.98.62', 4, 2),
(8, 'Pacreau', 'Sylvie', 'Sylvie@gmail.com', '06.23.04.98.62', 5, 3),
(9, 'Cousteau', 'Fernand', 'Fernand@gmail.com', '06.23.04.98.62', 6, 3);

-- --------------------------------------------------------

--
-- Structure de la table `comptebancaire`
--

CREATE TABLE `comptebancaire` (
  `TYPE_COMPTE` varchar(31) NOT NULL,
  `idCompte` bigint(20) NOT NULL,
  `dateOuverture` datetime DEFAULT NULL,
  `numCompte` bigint(20) NOT NULL,
  `solde` double NOT NULL,
  `decouvertAutorise` double DEFAULT NULL,
  `tauxRemuneration` double DEFAULT NULL,
  `proprietaire_idPersonne` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `comptebancaire`
--

INSERT INTO `comptebancaire` (`TYPE_COMPTE`, `idCompte`, `dateOuverture`, `numCompte`, `solde`, `decouvertAutorise`, `tauxRemuneration`, `proprietaire_idPersonne`) VALUES
('EPARGNE', 7, '2016-10-08 19:11:15', 101, 5968, NULL, 0, 4),
('EPARGNE', 8, '2016-10-08 19:11:15', 102, 1508, NULL, 0, 5),
('EPARGNE', 9, '2016-10-08 19:11:15', 103, 1416, NULL, 0, 6),
('EPARGNE', 10, '2016-10-08 19:11:15', 104, 6987, NULL, 0, 7),
('EPARGNE', 11, '2016-10-08 19:11:15', 105, 4361, NULL, 0, 8),
('COURANT', 12, '2016-10-08 19:11:15', 201, -821, 0, NULL, 4),
('COURANT', 13, '2016-10-08 19:11:15', 202, 9345, 0, NULL, 5),
('COURANT', 14, '2016-10-08 19:11:15', 203, -350, 0, NULL, 6),
('COURANT', 15, '2016-10-08 19:11:15', 204, 1540, 0, NULL, 7);

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(22),
(22),
(22);

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequences`
--

CREATE TABLE `hibernate_sequences` (
  `sequence_name` varchar(255) NOT NULL,
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `hibernate_sequences`
--

INSERT INTO `hibernate_sequences` (`sequence_name`, `next_val`) VALUES
('default', 12);

-- --------------------------------------------------------

--
-- Structure de la table `transaction`
--

CREATE TABLE `transaction` (
  `idTransaction` bigint(20) NOT NULL,
  `dateTransaction` datetime DEFAULT NULL,
  `montant` double NOT NULL,
  `compteCrediteur_idCompte` bigint(20) DEFAULT NULL,
  `compteDebiteur_idCompte` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `transaction`
--

INSERT INTO `transaction` (`idTransaction`, `dateTransaction`, `montant`, `compteCrediteur_idCompte`, `compteDebiteur_idCompte`) VALUES
(16, '2016-10-11 12:37:56', 850, 8, 8),
(17, '2016-10-11 12:40:12', 542, 7, 14),
(18, '2016-10-11 12:40:28', 763, 13, 11),
(19, '2016-10-11 12:40:45', 470, 9, 9),
(20, '2016-10-11 12:41:20', 1000, 13, 14);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `role` varchar(31) NOT NULL,
  `idPersonne` bigint(20) NOT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`role`, `idPersonne`, `login`, `nom`, `password`, `prenom`) VALUES
('gerant', 1, 'Clement', 'Castro', '21232f297a57a5a743894a0e4a801fc3', 'Clement'),
('conseiller', 2, 'Konrad', 'Thomas', '21232f297a57a5a743894a0e4a801fc3', 'Konrad'),
('conseiller', 3, 'Thomas', 'Theodorou', '21232f297a57a5a743894a0e4a801fc3', 'Thomas');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `adresse`
--
ALTER TABLE `adresse`
  ADD PRIMARY KEY (`idAdresse`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`idPersonne`),
  ADD KEY `FKco6y0jlw3xw2bl5doqfc2k23g` (`adresse_idAdresse`),
  ADD KEY `FKhcr56j313q6k33gqqohqe6mw6` (`conseiller_idPersonne`);

--
-- Index pour la table `comptebancaire`
--
ALTER TABLE `comptebancaire`
  ADD PRIMARY KEY (`idCompte`),
  ADD KEY `FK6sjwai8jraxydm0n654h7tn4l` (`proprietaire_idPersonne`);

--
-- Index pour la table `hibernate_sequences`
--
ALTER TABLE `hibernate_sequences`
  ADD PRIMARY KEY (`sequence_name`);

--
-- Index pour la table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`idTransaction`),
  ADD KEY `FKidgbj4hp9hq158nyk6lsptcd` (`compteCrediteur_idCompte`),
  ADD KEY `FKrs7nsaycrfah4hvyihfhkilo9` (`compteDebiteur_idCompte`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idPersonne`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
