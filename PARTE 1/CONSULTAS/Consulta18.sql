SELECT "Empleado"."DNI", "Empleado"."Nombre"
	FROM(SELECT DISTINCT "Empleado"."dni_jefe" AS "DNI"
		FROM "Reposta"
		INNER JOIN "Canjea"ON "Reposta"."Nombre_Usuario" = "Canjea"."Nombre_Usuario" INNER JOIN "Surtidor" ON "Reposta"."Numero_surtidor" = "Surtidor"."Numero_surtidor" INNER JOIN "Empleado" ON "Reposta"."Numero_surtidor" = "Empleado"."Numero_surtidor" 
		WHERE "Surtidor"."Descripcion" = 'GLP')AS "JEFES"
	INNER JOIN "Empleado" ON "JEFES"."DNI" = "Empleado"."DNI"
	