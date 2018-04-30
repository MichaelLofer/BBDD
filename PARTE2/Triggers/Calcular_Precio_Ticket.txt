DECLARE
acumulador integer;
cantidad integer;
control1 boolean;
control2 boolean;
cursorContiene refcursor;
cursorArticulo refcursor;
filaArticulo "Articulo"%rowtype;
filaContiene "Contiene"%rowtype;


BEGIN
	OPEN cursorContiene for select * from "Contiene";
	OPEN cursorArticulo for select * from "Articulo";
	control1 := true;
	control2 := true;
	acumulador := 0;
	cantidad :=0;
	while control1 loop
		control2 := true;
		move first in cursorArticulo;
		fetch cursorContiene into filaContiene;
	if not found then
		control1 := false;
	else
		if filaContiene."Codigo" = NEW."Codigo" then
			cantidad := filaContiene."cantidad";
			--RAISE NOTICE 'cantidad loop= %', cantidad;
			while control2 loop
				fetch cursorArticulo into filaArticulo;
				if not found then
					control2 := false;
				else
					if filaContiene."Codigo_Barras"=filaArticulo."Codigo_Barras" then
							acumulador := acumulador+cantidad*filaArticulo."Precio_sin_IVA";
							--RAISE NOTICE 'Valor filaArticulo Precio sin IVA= %', filaArticulo."Precio_sin_IVA";
					end if;
					--RAISE NOTICE 'Otros precios: %', filaArticulo."Precio_sin_IVA";
				end if;
			end loop;
		end if;
	end if;
	END loop;
	--RAISE NOTICE 'Acumulador= %', acumulador;
	NEW."Precio_Compra" := acumulador;
	RAISE NOTICE 'PRECIO COMPRA JODER: %', NEW."Precio_Compra";
	RETURN NEW;
END;