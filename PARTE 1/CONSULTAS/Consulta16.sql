SELECT SUM("PvP") AS "Dinero"
	FROM "Canjea"
	INNER JOIN "Articulo" ON "Canjea"."Codigo_Barras" = "Articulo"."Codigo_Barras";