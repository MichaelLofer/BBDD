SELECT "Codigo_Barras"
	FROM "Articulo"
	WHERE "Codigo_Barras" NOT IN (	(SELECT "Codigo_Barras"
						FROM "Contiene")
					UNION
					(SELECT "Codigo_Barras"
						FROM "Canjea"))