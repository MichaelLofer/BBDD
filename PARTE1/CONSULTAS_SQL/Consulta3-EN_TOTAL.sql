﻿SELECT sum ("PVP"*"cantidad") as "Dinero"
	FROM "Contiene"
	INNER JOIN "Articulo" ON "Contiene"."Codigo_Barras" = "Articulo"."Codigo_Barras"
