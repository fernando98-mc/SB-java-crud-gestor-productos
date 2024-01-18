
--
-- Base de datos: `gestion_productos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` bigint(20) NOT NULL,
  `marca` varchar(60) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `origen` varchar(60) NOT NULL,
  `precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `marca`, `nombre`, `origen`, `precio`) VALUES
(1, 'Tv', 'sony', 'JP', 8000),
(3, 'Tv', 'Roku', 'CH', 8700),
(4, 'Barra sonido', 'Sony', 'JP', 5000),
(6, 'Celular', 'Oppo', 'CH', 4500),
(7, 'Refrigerador', 'Mabe', 'MEX', 6700),
(9, 'Licuadora', 'Oster', 'MEX', 6700),
(10, 'Oster', 'Ventilador', 'Mexico', 490),
(11, 'whirpol', 'microndas', 'mex', 1400);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;
