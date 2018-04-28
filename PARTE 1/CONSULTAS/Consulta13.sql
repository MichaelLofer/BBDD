SELECT "Tipo","Numero_surtidor", COUNT(*) AS "CANTIDAD"
	FROM "Empleado"
	GROUP BY "Tipo", "Numero_surtidor"
	ORDER BY "CANTIDAD" ASC
