SELECT DISTINCT "Canjea"."Codigo_Barras"
	FROM "Canjea"
	INNER JOIN "Contiene" ON "Canjea"."Codigo_Barras" = "Contiene"."Codigo_Barras"