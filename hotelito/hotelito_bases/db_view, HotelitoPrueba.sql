 create view view_habitaciones
 as
 select numero_hab, tipo_hab, precio_hab from habitacion where estado_hab = 'disponible';
 
 select * from view_habitaciones;
 
 /*vista para la factura*/
 create view view_facturaReservacion
 as
 select concat(c.prinombre_cli," ",c.segnombre_cli," ",c.priapellido_cli," ",c.segapellido_cli) as Nombre_Completo,
 c.cedula_cli, 
 pr.fecha as Fecha_Pago, 
 r.cantidad_hab, r.cantidad_personas, datediff(r.fecha_salida,r.fecha_entrada) as dias,
 r.fecha_entrada, r.fecha_salida,
 r.total_res
 from pago_reservacion pr
 inner join reservacion r on pr.id_res = r.id_Res 
 inner join cliente c on r.id_cli = c.id_cli
 where pr.id_res = 2;
 
 select * from view_facturaReservacion;
 
 /*vista para el detalle de la factura*/
 create view view_detalleHabitaciones
 as
 select h.tipo_hab, count(h.tipo_hab) as cantidad, h.precio_hab, 
 count(h.tipo_hab) * h.precio_hab as total
 from reservacion_habitaciones rh
 inner join habitacion h on rh.id_hab = h.id_hab
 where rh.id_res = 2
 group by h.tipo_hab;
 
  
 update reservacion_habitaciones rh
 set  subtotal = (select h.precio_hab from habitacion h 
 where rh.id_hab = h.id_hab) where rh.id_res = 2; 
 
 
 
 