SELECT "Descripcion", COUNT(*) AS "Cantidad"
	FROM "Surtidor"
	GROUP BY "Descripcion"
	ORDER BY "Cantidad" DESC