SELECT SUM("PVP") AS "Dinero"
	FROM "Canjea"
	INNER JOIN "Articulo" ON "Canjea"."Codigo_Barras" = "Articulo"."Codigo_Barras";
