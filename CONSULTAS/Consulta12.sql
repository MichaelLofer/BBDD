(SELECT AVG("Precio") AS "PRECIO MEDIO", AVG("Capacidad") AS "CAPACIDAD MEDIA"
	FROM "Surtidor"
	INNER JOIN "Gasolina" ON "Surtidor"."Numero_surtidor" = "Gasolina"."Numero_surtidor")
UNION
(SELECT AVG("Precio") AS "PRECIO MEDIO", AVG("Capacidad") AS "CAPACIDAD MEDIA"
	FROM "Surtidor"
	INNER JOIN "Gasoleo" ON "Surtidor"."Numero_surtidor" = "Gasoleo"."Numero_surtidor")	
	