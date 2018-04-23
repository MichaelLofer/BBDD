SELECT "Codigo_Barras", COUNT (*) as "VECES"
	FROM "Canjea"
	GROUP BY "Codigo_Barras"
	ORDER BY "VECES" DESC
	LIMIT 5
	