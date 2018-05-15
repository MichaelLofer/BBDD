SELECT "Tipo", COUNT(*) AS "TIQUETS PREMIADOS"
	FROM "Ticket"
	INNER JOIN "Sorteo" ON "Ticket"."Codigo" = "Sorteo"."Codigo"
	GROUP BY "Tipo"
	ORDER BY "TIQUETS PREMIADOS" DESC
	LIMIT 1
