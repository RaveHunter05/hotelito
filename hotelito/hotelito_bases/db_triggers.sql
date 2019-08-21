 
 /*trigger para actualizar el subtototal de reservacion_pago*/
 
 CREATE TRIGGER subtotal_reservacion_pago
 BEFORE INSERT ON reservacion_habitaciones
  FOR EACH ROW
 set @subtotal = (select precio_hab from habitacion where id_hab = new.id_hab)
 update reservacion_habitaciones set subtotal = () ;
 
CREATE TRIGGER hotelito.tri_reservacionpago
after INSERT ON reservacion_habitaciones FOR EACH ROW
Update  reservacion_habitaciones
set subtotal = 5
where id_res = new.id_res;

drop trigger hotelito.tri_reservacionpago;


