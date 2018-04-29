DECLARE

BEGIN
	IF(NEW.Precio_sin_IVA<=0) THEN
		RAISE EXCEPTION 'El precio no puede ser negativo';
	END IF;
	NEW.PVP := NEW.Precio_sin_IVA*1,21;
	RETURN NEW;
END;