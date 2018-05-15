SELECT DISTINCT "Canjea"."Codigo_Barras"
	FROM "Canjea"
	INNER JOIN "Contiene" ON "Canjea"."Codigo_Barras" = "Contiene"."Codigo_Barras"
	WHERE "Canjea"."Codigo_Barras" NOT IN (SELECT "Codigo_Barras"
							FROM "Ticket"
							INNER JOIN "Contiene" ON "Ticket"."Codigo" = "Contiene"."Codigo" INNER JOIN "Sorteo" ON "Ticket"."Codigo" = "Sorteo"."Codigo")
