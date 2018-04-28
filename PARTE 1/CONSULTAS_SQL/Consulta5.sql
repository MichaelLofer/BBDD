SELECT "Nombre_Usuario", SUM ("Puntos_canjeados")as "Puntos Totales"
	FROM "Canjea"
	GROUP BY "Nombre_Usuario"
	