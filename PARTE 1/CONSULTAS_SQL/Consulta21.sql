SELECT DISTINCT "Canjea"."Codigo_Barras"
	FROM "Canjea"
	INNER JOIN "Contiene" ON "Canjea"."Codigo_Barras" = "Contiene"."Codigo_Barras"
	WHERE "Canjea"."Codigo_Barras" NOT IN (SELECT "Codigo_Barras"
							FROM "Contiene"
							INNER JOIN "Ticket" ON "Contiene"."Codigo" = "Ticket"."Codigo"
							WHERE "Ticket"."Fecha_premiado" IS NOT NULL)
						