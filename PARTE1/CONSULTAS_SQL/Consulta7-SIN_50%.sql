SELECT SUM("Precio_Compra") AS "Dinero premiado"
	FROM "Ticket"
	INNER JOIN "Sorteo" ON "Ticket"."Codigo" = "Sorteo"."Codigo"
	where valido = true
