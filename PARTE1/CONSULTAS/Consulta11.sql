SELECT "Numero_surtidor", SUM ("litros") AS "Litros"
	FROM "Reposta"
	WHERE "puntos" IS NOT NULL
	GROUP BY "Numero_surtidor"
	ORDER BY "Litros" ASC

	