(SELECT "Surtidor"."Descripcion" AS "TIPO", AVG ("Surtidor"."Precio") AS "PRECIO MEDIO", AVG ("Surtidor"."Capacidad") AS "CAPACIDAD MEDIA"
	FROM "Gasolina"
	INNER JOIN "Surtidor" ON "Gasolina"."Numero_surtidor" = "Surtidor"."Numero_surtidor"
	GROUP BY "TIPO")
UNION
(SELECT "Surtidor"."Descripcion" AS "TIPO", AVG ("Surtidor"."Precio") AS "PRECIO MEDIO", AVG ("Surtidor"."Capacidad") AS "CAPACIDAD MEDIA"
	FROM "Gasoleo"
	INNER JOIN "Surtidor" ON "Gasoleo"."Numero_surtidor" = "Surtidor"."Numero_surtidor"
	GROUP BY "TIPO")
	