SELECT "Descripcion", COUNT(*)*100/
	(SELECT COUNT(*)
		FROM "Surtidor")AS "Porcentaje"
	FROM "Surtidor"
	GROUP BY "Descripcion"