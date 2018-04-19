/*
Created		13/03/2018
Modified		17/04/2018
Project		
Model			
Company		
Author		
Version		
Database		PostgreSQL 8.1 
*/



/* Create Domains */



/* Create Tables */


Create table "Empleado"
(
	"DNI" Char(10) NOT NULL UNIQUE,
	"dni_jefe" Char(10),
	"Sexo" Char(10) NOT NULL,
	"Correo" Char(80) NOT NULL UNIQUE,
	"Turno" Char(20) NOT NULL,
	"Nombre" Char(40) NOT NULL,
	"Localidad" Char(40) NOT NULL,
	"Calle" Char(40) NOT NULL,
	"Numero" Integer NOT NULL,
	"Piso" Char(10),
	"CP" Integer NOT NULL,
	"Numero_surtidor" Integer,
	"Tipo" Char(20),
 primary key ("DNI")
) Without Oids;


Create table "Surtidor"
(
	"Numero_surtidor" Integer NOT NULL UNIQUE,
	"Precio" Double precision NOT NULL,
	"Capacidad" Double precision NOT NULL,
	"Fecha_Reabastecimiento" Timestamp with time zone UNIQUE,
	"Fecha_Reapertura" Timestamp with time zone UNIQUE,
	"Descripcion" Char(100),
 primary key ("Numero_surtidor")
) Without Oids;


Create table "Tienda"
(
	"Tipo" Char(20) NOT NULL UNIQUE,
	"Horario" Char(40) NOT NULL,
 primary key ("Tipo")
) Without Oids;


Create table "Oferta"
(
	"Tipo_Oferta" Char(20) NOT NULL,
	"Duracion" Integer NOT NULL,
	"Fecha_inicio" Timestamp with time zone NOT NULL UNIQUE,
	"Tipo" Char(20) NOT NULL,
 primary key ("Tipo_Oferta","Tipo")
) Without Oids;


Create table "Ticket"
(
	"Codigo" Integer NOT NULL UNIQUE,
	"Fecha_emision" Timestamp with time zone NOT NULL UNIQUE,
	"Tipo" Char(20) NOT NULL,
	"Fecha_premiado" Timestamp with time zone UNIQUE,
 primary key ("Codigo","Tipo")
) Without Oids;


Create table "Aritculo"
(
	"Codigo_Barras" Char(40) NOT NULL UNIQUE,
	"PvP" Double precision NOT NULL,
 primary key ("Codigo_Barras")
) Without Oids;


Create table "Cliente"
(
	"Nombre_Usuario" Char(20) NOT NULL UNIQUE,
	"DNI" Char(10) NOT NULL UNIQUE,
	"Nombre" Char(20) NOT NULL,
	"Correo" Char(20) NOT NULL UNIQUE,
	"Puntos" Integer NOT NULL,
 primary key ("Nombre_Usuario")
) Without Oids;


Create table "Opinion"
(
	"Fecha_Hora" Timestamp with time zone NOT NULL UNIQUE,
	"Puntos" Integer NOT NULL,
	"Opinion" Char(50) NOT NULL,
	"Nombre_Usuario" Char(20) NOT NULL,
 primary key ("Fecha_Hora","Nombre_Usuario")
) Without Oids;


Create table "Telefono"
(
	"numero" Integer NOT NULL UNIQUE,
	"DNI" Char(10) NOT NULL,
 primary key ("numero","DNI")
) Without Oids;


Create table "Gasolina"
(
	"Tipo" Char(20) NOT NULL,
	"Numero_surtidor" Integer NOT NULL,
	"Numero" Integer NOT NULL UNIQUE,
 primary key ("Numero")
) Without Oids;


Create table "Hidrogeno"
(
	"Numero" Integer NOT NULL UNIQUE,
	"Numero_surtidor" Integer NOT NULL,
	"Temperatura" Double precision NOT NULL,
	"Aislante" Char(20) NOT NULL,
	"Densidad" Double precision NOT NULL,
 primary key ("Numero")
) Without Oids;


Create table "Gasoleo"
(
	"Tipo" Char(20) NOT NULL,
	"Numero_surtidor" Integer NOT NULL,
	"Numero" Integer NOT NULL UNIQUE,
 primary key ("Numero")
) Without Oids;


Create table "GLP"
(
	"Numero" Integer NOT NULL UNIQUE,
	"Numero_surtidor" Integer NOT NULL,
	"Temperatura" Double precision NOT NULL,
	"Presion" Double precision NOT NULL,
 primary key ("Numero")
) Without Oids;


Create table "Canjea"
(
	"Nombre_Usuario" Char(20) NOT NULL,
	"Codigo_Barras" Char(40) NOT NULL,
	"Puntos_canjeados" Integer NOT NULL,
	"Fecha" Timestamp with time zone NOT NULL UNIQUE,
 primary key ("Nombre_Usuario","Codigo_Barras","Fecha")
) Without Oids;


Create table "reposta"
(
	"Nombre_Usuario" Char(20) NOT NULL,
	"Numero_surtidor" Integer NOT NULL,
	"puntos" Integer NOT NULL,
	"litros" Double precision NOT NULL,
	"Fecha" Timestamp with time zone NOT NULL UNIQUE,
 primary key ("Nombre_Usuario","Numero_surtidor","Fecha")
) Without Oids;


Create table "Contiene"
(
	"Codigo" Integer NOT NULL,
	"Tipo" Char(20) NOT NULL,
	"Codigo_Barras" Char(40) NOT NULL,
	"cantidad" Integer NOT NULL,
 primary key ("Codigo","Tipo","Codigo_Barras")
) Without Oids;



/* Create Tab 'Others' for Selected Tables */


/* Create Alternate Keys */



/* Create Indexes */



/* Create Foreign Keys */

Alter table "Telefono" add  foreign key ("DNI") references "Empleado" ("DNI") on update cascade on delete cascade;

Alter table "Empleado" add  foreign key ("dni_jefe") references "Empleado" ("DNI") on update cascade on delete set null;

Alter table "Gasolina" add  foreign key ("Numero_surtidor") references "Surtidor" ("Numero_surtidor") on update cascade on delete cascade;

Alter table "Gasoleo" add  foreign key ("Numero_surtidor") references "Surtidor" ("Numero_surtidor") on update cascade on delete cascade;

Alter table "GLP" add  foreign key ("Numero_surtidor") references "Surtidor" ("Numero_surtidor") on update cascade on delete cascade;

Alter table "Hidrogeno" add  foreign key ("Numero_surtidor") references "Surtidor" ("Numero_surtidor") on update cascade on delete cascade;

Alter table "Empleado" add  foreign key ("Numero_surtidor") references "Surtidor" ("Numero_surtidor") on update cascade on delete set null;

Alter table "reposta" add  foreign key ("Numero_surtidor") references "Surtidor" ("Numero_surtidor") on update cascade on delete cascade;

Alter table "Empleado" add  foreign key ("Tipo") references "Tienda" ("Tipo") on update cascade on delete set null;

Alter table "Oferta" add  foreign key ("Tipo") references "Tienda" ("Tipo") on update cascade on delete cascade;

Alter table "Ticket" add  foreign key ("Tipo") references "Tienda" ("Tipo") on update cascade on delete cascade;

Alter table "Contiene" add  foreign key ("Codigo","Tipo") references "Ticket" ("Codigo","Tipo") on update cascade on delete cascade;

Alter table "Canjea" add  foreign key ("Codigo_Barras") references "Aritculo" ("Codigo_Barras") on update cascade on delete cascade;

Alter table "Contiene" add  foreign key ("Codigo_Barras") references "Aritculo" ("Codigo_Barras") on update cascade on delete cascade;

Alter table "Canjea" add  foreign key ("Nombre_Usuario") references "Cliente" ("Nombre_Usuario") on update cascade on delete cascade;

Alter table "Opinion" add  foreign key ("Nombre_Usuario") references "Cliente" ("Nombre_Usuario") on update cascade on delete cascade;

Alter table "reposta" add  foreign key ("Nombre_Usuario") references "Cliente" ("Nombre_Usuario") on update cascade on delete cascade;



/* Create Procedures */



/* Create Views */



/* Create Referential Integrity Triggers */

/* Referential integrity for update on table "Empleado" */
 
/* Function "fn_tu_Empleado"() for trigger "tu_Empleado" */
Create function "fn_tu_Empleado"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Empleado", when child table "Empleado" changes. */
 if new."dni_jefe" != old."dni_jefe" then
 	select count(*) into nRows
 	from "Empleado"
 	where new."dni_jefe" = "Empleado"."DNI";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Empleado". Cannot update child table "Empleado".'';
 	end if;
 end if;	
 /* Check parent table "Surtidor", when child table "Empleado" changes. */
 if new."Numero_surtidor" != old."Numero_surtidor" then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot update child table "Empleado".'';
 	end if;
 end if;	
 /* Check parent table "Tienda", when child table "Empleado" changes. */
 if new."Tipo" != old."Tipo" then
 	select count(*) into nRows
 	from "Tienda"
 	where new."Tipo" = "Tienda"."Tipo";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Tienda". Cannot update child table "Empleado".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_Empleado" for table "Empleado" */
Create trigger "tu_Empleado"
after update on "Empleado"
for each row execute procedure "fn_tu_Empleado"();

/* Referential integrity for update on table "Oferta" */
 
/* Function "fn_tu_Oferta"() for trigger "tu_Oferta" */
Create function "fn_tu_Oferta"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Tienda", when child table "Oferta" changes. */
 if new."Tipo" != old."Tipo" then
 	select count(*) into nRows
 	from "Tienda"
 	where new."Tipo" = "Tienda"."Tipo";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Tienda". Cannot update child table "Oferta".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_Oferta" for table "Oferta" */
Create trigger "tu_Oferta"
after update on "Oferta"
for each row execute procedure "fn_tu_Oferta"();

/* Referential integrity for update on table "Ticket" */
 
/* Function "fn_tu_Ticket"() for trigger "tu_Ticket" */
Create function "fn_tu_Ticket"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Tienda", when child table "Ticket" changes. */
 if new."Tipo" != old."Tipo" then
 	select count(*) into nRows
 	from "Tienda"
 	where new."Tipo" = "Tienda"."Tipo";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Tienda". Cannot update child table "Ticket".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_Ticket" for table "Ticket" */
Create trigger "tu_Ticket"
after update on "Ticket"
for each row execute procedure "fn_tu_Ticket"();

/* Referential integrity for update on table "Opinion" */
 
/* Function "fn_tu_Opinion"() for trigger "tu_Opinion" */
Create function "fn_tu_Opinion"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Cliente", when child table "Opinion" changes. */
 if new."Nombre_Usuario" != old."Nombre_Usuario" then
 	select count(*) into nRows
 	from "Cliente"
 	where new."Nombre_Usuario" = "Cliente"."Nombre_Usuario";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Cliente". Cannot update child table "Opinion".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_Opinion" for table "Opinion" */
Create trigger "tu_Opinion"
after update on "Opinion"
for each row execute procedure "fn_tu_Opinion"();

/* Referential integrity for update on table "Telefono" */
 
/* Function "fn_tu_Telefono"() for trigger "tu_Telefono" */
Create function "fn_tu_Telefono"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Empleado", when child table "Telefono" changes. */
 if new."DNI" != old."DNI" then
 	select count(*) into nRows
 	from "Empleado"
 	where new."DNI" = "Empleado"."DNI";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Empleado". Cannot update child table "Telefono".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_Telefono" for table "Telefono" */
Create trigger "tu_Telefono"
after update on "Telefono"
for each row execute procedure "fn_tu_Telefono"();

/* Referential integrity for update on table "Gasolina" */
 
/* Function "fn_tu_Gasolina"() for trigger "tu_Gasolina" */
Create function "fn_tu_Gasolina"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Surtidor", when child table "Gasolina" changes. */
 if new."Numero_surtidor" != old."Numero_surtidor" then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot update child table "Gasolina".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_Gasolina" for table "Gasolina" */
Create trigger "tu_Gasolina"
after update on "Gasolina"
for each row execute procedure "fn_tu_Gasolina"();

/* Referential integrity for update on table "Hidrogeno" */
 
/* Function "fn_tu_Hidrogeno"() for trigger "tu_Hidrogeno" */
Create function "fn_tu_Hidrogeno"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Surtidor", when child table "Hidrogeno" changes. */
 if new."Numero_surtidor" != old."Numero_surtidor" then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot update child table "Hidrogeno".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_Hidrogeno" for table "Hidrogeno" */
Create trigger "tu_Hidrogeno"
after update on "Hidrogeno"
for each row execute procedure "fn_tu_Hidrogeno"();

/* Referential integrity for update on table "Gasoleo" */
 
/* Function "fn_tu_Gasoleo"() for trigger "tu_Gasoleo" */
Create function "fn_tu_Gasoleo"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Surtidor", when child table "Gasoleo" changes. */
 if new."Numero_surtidor" != old."Numero_surtidor" then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot update child table "Gasoleo".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_Gasoleo" for table "Gasoleo" */
Create trigger "tu_Gasoleo"
after update on "Gasoleo"
for each row execute procedure "fn_tu_Gasoleo"();

/* Referential integrity for update on table "GLP" */
 
/* Function "fn_tu_GLP"() for trigger "tu_GLP" */
Create function "fn_tu_GLP"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Surtidor", when child table "GLP" changes. */
 if new."Numero_surtidor" != old."Numero_surtidor" then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot update child table "GLP".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_GLP" for table "GLP" */
Create trigger "tu_GLP"
after update on "GLP"
for each row execute procedure "fn_tu_GLP"();

/* Referential integrity for update on table "Canjea" */
 
/* Function "fn_tu_Canjea"() for trigger "tu_Canjea" */
Create function "fn_tu_Canjea"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Cliente", when child table "Canjea" changes. */
 if new."Nombre_Usuario" != old."Nombre_Usuario" then
 	select count(*) into nRows
 	from "Cliente"
 	where new."Nombre_Usuario" = "Cliente"."Nombre_Usuario";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Cliente". Cannot update child table "Canjea".'';
 	end if;
 end if;	
 /* Check parent table "Aritculo", when child table "Canjea" changes. */
 if new."Codigo_Barras" != old."Codigo_Barras" then
 	select count(*) into nRows
 	from "Aritculo"
 	where new."Codigo_Barras" = "Aritculo"."Codigo_Barras";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Aritculo". Cannot update child table "Canjea".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_Canjea" for table "Canjea" */
Create trigger "tu_Canjea"
after update on "Canjea"
for each row execute procedure "fn_tu_Canjea"();

/* Referential integrity for update on table "reposta" */
 
/* Function "fn_tu_reposta"() for trigger "tu_reposta" */
Create function "fn_tu_reposta"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Cliente", when child table "reposta" changes. */
 if new."Nombre_Usuario" != old."Nombre_Usuario" then
 	select count(*) into nRows
 	from "Cliente"
 	where new."Nombre_Usuario" = "Cliente"."Nombre_Usuario";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Cliente". Cannot update child table "reposta".'';
 	end if;
 end if;	
 /* Check parent table "Surtidor", when child table "reposta" changes. */
 if new."Numero_surtidor" != old."Numero_surtidor" then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot update child table "reposta".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_reposta" for table "reposta" */
Create trigger "tu_reposta"
after update on "reposta"
for each row execute procedure "fn_tu_reposta"();

/* Referential integrity for update on table "Contiene" */
 
/* Function "fn_tu_Contiene"() for trigger "tu_Contiene" */
Create function "fn_tu_Contiene"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	 
	/* Check parent table "Ticket", when child table "Contiene" changes. */
 if new."Codigo" != old."Codigo" or new."Tipo" != old."Tipo" then
 	select count(*) into nRows
 	from "Ticket"
 	where new."Codigo" = "Ticket"."Codigo" and 
        			new."Tipo" = "Ticket"."Tipo";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Ticket". Cannot update child table "Contiene".'';
 	end if;
 end if;	
 /* Check parent table "Aritculo", when child table "Contiene" changes. */
 if new."Codigo_Barras" != old."Codigo_Barras" then
 	select count(*) into nRows
 	from "Aritculo"
 	where new."Codigo_Barras" = "Aritculo"."Codigo_Barras";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Aritculo". Cannot update child table "Contiene".'';
 	end if;
 end if;	
 
return old;
end;'
language 'plpgsql';
					
/* Update trigger "tu_Contiene" for table "Contiene" */
Create trigger "tu_Contiene"
after update on "Contiene"
for each row execute procedure "fn_tu_Contiene"();



/* Referential integrity for insert on table "Empleado" */
 
/* Function "fn_ti_Empleado"() for trigger "ti_Empleado" */
Create function "fn_ti_Empleado"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Empleado" when values inserted into child table "Empleado" */
 if new."dni_jefe" is not null then
 	select count(*) into nRows
 	from "Empleado"
 	where new."dni_jefe" = "Empleado"."DNI";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Empleado". Cannot insert values into child table "Empleado".'';
 	end if;	
 end if;	
 /* Check parent table "Surtidor" when values inserted into child table "Empleado" */
 if new."Numero_surtidor" is not null then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot insert values into child table "Empleado".'';
 	end if;	
 end if;	
 /* Check parent table "Tienda" when values inserted into child table "Empleado" */
 if new."Tipo" is not null then
 	select count(*) into nRows
 	from "Tienda"
 	where new."Tipo" = "Tienda"."Tipo";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Tienda". Cannot insert values into child table "Empleado".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_Empleado" for table "Empleado" */
Create trigger "ti_Empleado"
before insert on "Empleado"
for each row execute procedure "fn_ti_Empleado"();

/* Referential integrity for insert on table "Oferta" */
 
/* Function "fn_ti_Oferta"() for trigger "ti_Oferta" */
Create function "fn_ti_Oferta"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Tienda" when values inserted into child table "Oferta" */
 if new."Tipo" is not null then
 	select count(*) into nRows
 	from "Tienda"
 	where new."Tipo" = "Tienda"."Tipo";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Tienda". Cannot insert values into child table "Oferta".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_Oferta" for table "Oferta" */
Create trigger "ti_Oferta"
before insert on "Oferta"
for each row execute procedure "fn_ti_Oferta"();

/* Referential integrity for insert on table "Ticket" */
 
/* Function "fn_ti_Ticket"() for trigger "ti_Ticket" */
Create function "fn_ti_Ticket"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Tienda" when values inserted into child table "Ticket" */
 if new."Tipo" is not null then
 	select count(*) into nRows
 	from "Tienda"
 	where new."Tipo" = "Tienda"."Tipo";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Tienda". Cannot insert values into child table "Ticket".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_Ticket" for table "Ticket" */
Create trigger "ti_Ticket"
before insert on "Ticket"
for each row execute procedure "fn_ti_Ticket"();

/* Referential integrity for insert on table "Opinion" */
 
/* Function "fn_ti_Opinion"() for trigger "ti_Opinion" */
Create function "fn_ti_Opinion"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Cliente" when values inserted into child table "Opinion" */
 if new."Nombre_Usuario" is not null then
 	select count(*) into nRows
 	from "Cliente"
 	where new."Nombre_Usuario" = "Cliente"."Nombre_Usuario";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Cliente". Cannot insert values into child table "Opinion".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_Opinion" for table "Opinion" */
Create trigger "ti_Opinion"
before insert on "Opinion"
for each row execute procedure "fn_ti_Opinion"();

/* Referential integrity for insert on table "Telefono" */
 
/* Function "fn_ti_Telefono"() for trigger "ti_Telefono" */
Create function "fn_ti_Telefono"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Empleado" when values inserted into child table "Telefono" */
 if new."DNI" is not null then
 	select count(*) into nRows
 	from "Empleado"
 	where new."DNI" = "Empleado"."DNI";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Empleado". Cannot insert values into child table "Telefono".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_Telefono" for table "Telefono" */
Create trigger "ti_Telefono"
before insert on "Telefono"
for each row execute procedure "fn_ti_Telefono"();

/* Referential integrity for insert on table "Gasolina" */
 
/* Function "fn_ti_Gasolina"() for trigger "ti_Gasolina" */
Create function "fn_ti_Gasolina"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Surtidor" when values inserted into child table "Gasolina" */
 if new."Numero_surtidor" is not null then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot insert values into child table "Gasolina".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_Gasolina" for table "Gasolina" */
Create trigger "ti_Gasolina"
before insert on "Gasolina"
for each row execute procedure "fn_ti_Gasolina"();

/* Referential integrity for insert on table "Hidrogeno" */
 
/* Function "fn_ti_Hidrogeno"() for trigger "ti_Hidrogeno" */
Create function "fn_ti_Hidrogeno"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Surtidor" when values inserted into child table "Hidrogeno" */
 if new."Numero_surtidor" is not null then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot insert values into child table "Hidrogeno".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_Hidrogeno" for table "Hidrogeno" */
Create trigger "ti_Hidrogeno"
before insert on "Hidrogeno"
for each row execute procedure "fn_ti_Hidrogeno"();

/* Referential integrity for insert on table "Gasoleo" */
 
/* Function "fn_ti_Gasoleo"() for trigger "ti_Gasoleo" */
Create function "fn_ti_Gasoleo"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Surtidor" when values inserted into child table "Gasoleo" */
 if new."Numero_surtidor" is not null then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot insert values into child table "Gasoleo".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_Gasoleo" for table "Gasoleo" */
Create trigger "ti_Gasoleo"
before insert on "Gasoleo"
for each row execute procedure "fn_ti_Gasoleo"();

/* Referential integrity for insert on table "GLP" */
 
/* Function "fn_ti_GLP"() for trigger "ti_GLP" */
Create function "fn_ti_GLP"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Surtidor" when values inserted into child table "GLP" */
 if new."Numero_surtidor" is not null then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot insert values into child table "GLP".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_GLP" for table "GLP" */
Create trigger "ti_GLP"
before insert on "GLP"
for each row execute procedure "fn_ti_GLP"();

/* Referential integrity for insert on table "Canjea" */
 
/* Function "fn_ti_Canjea"() for trigger "ti_Canjea" */
Create function "fn_ti_Canjea"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Cliente" when values inserted into child table "Canjea" */
 if new."Nombre_Usuario" is not null then
 	select count(*) into nRows
 	from "Cliente"
 	where new."Nombre_Usuario" = "Cliente"."Nombre_Usuario";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Cliente". Cannot insert values into child table "Canjea".'';
 	end if;	
 end if;	
 /* Check parent table "Aritculo" when values inserted into child table "Canjea" */
 if new."Codigo_Barras" is not null then
 	select count(*) into nRows
 	from "Aritculo"
 	where new."Codigo_Barras" = "Aritculo"."Codigo_Barras";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Aritculo". Cannot insert values into child table "Canjea".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_Canjea" for table "Canjea" */
Create trigger "ti_Canjea"
before insert on "Canjea"
for each row execute procedure "fn_ti_Canjea"();

/* Referential integrity for insert on table "reposta" */
 
/* Function "fn_ti_reposta"() for trigger "ti_reposta" */
Create function "fn_ti_reposta"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Cliente" when values inserted into child table "reposta" */
 if new."Nombre_Usuario" is not null then
 	select count(*) into nRows
 	from "Cliente"
 	where new."Nombre_Usuario" = "Cliente"."Nombre_Usuario";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Cliente". Cannot insert values into child table "reposta".'';
 	end if;	
 end if;	
 /* Check parent table "Surtidor" when values inserted into child table "reposta" */
 if new."Numero_surtidor" is not null then
 	select count(*) into nRows
 	from "Surtidor"
 	where new."Numero_surtidor" = "Surtidor"."Numero_surtidor";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Surtidor". Cannot insert values into child table "reposta".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_reposta" for table "reposta" */
Create trigger "ti_reposta"
before insert on "reposta"
for each row execute procedure "fn_ti_reposta"();

/* Referential integrity for insert on table "Contiene" */
 
/* Function "fn_ti_Contiene"() for trigger "ti_Contiene" */
Create function "fn_ti_Contiene"() returns trigger as '
declare
	nRows integer;	
	maxCard integer;										 
begin
	/* Check parent table "Ticket" when values inserted into child table "Contiene" */
 if new."Codigo" is not null and new."Tipo" is not null then
 	select count(*) into nRows
 	from "Ticket"
 	where new."Codigo" = "Ticket"."Codigo" and 
        			new."Tipo" = "Ticket"."Tipo";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Ticket". Cannot insert values into child table "Contiene".'';
 	end if;	
 end if;	
 /* Check parent table "Aritculo" when values inserted into child table "Contiene" */
 if new."Codigo_Barras" is not null then
 	select count(*) into nRows
 	from "Aritculo"
 	where new."Codigo_Barras" = "Aritculo"."Codigo_Barras";
 	if (nRows = 0) then
 		raise exception ''Parent does not exist in table "Aritculo". Cannot insert values into child table "Contiene".'';
 	end if;	
 end if;	
 
return new;
end;'
language 'plpgsql';
					
/* Insert trigger "ti_Contiene" for table "Contiene" */
Create trigger "ti_Contiene"
before insert on "Contiene"
for each row execute procedure "fn_ti_Contiene"();



/* Create User-Defined Triggers */



/* Create Roles */



/* Add Roles To Roles */



/* Create Role Permissions */
/* Role permissions on tables */

/* Role permissions on views */

/* Role permissions on procedures */






