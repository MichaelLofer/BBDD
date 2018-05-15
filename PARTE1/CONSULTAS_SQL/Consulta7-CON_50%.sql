SELECT SUM("Precio_Compra")/2 AS "Dinero premiado"
	FROM "Ticket"
	INNER JOIN "Sorteo" ON "Ticket"."Codigo" = "Sorteo"."Codigo"
	where valido = true
