SELECT SUM("cantidad"*"PvP")/2 AS "Dinero premiado"
	FROM "Articulo"
	INNER JOIN (SELECT "Codigo_Barras","cantidad"
			FROM "Ticket"
			INNER JOIN "Contiene" ON "Ticket"."Codigo" = "Contiene"."Codigo"
			WHERE "Fecha_premiado" IS NOT NULL) AS "TABLA" ON "Articulo"."Codigo_Barras" = "TABLA"."Codigo_Barras"
	