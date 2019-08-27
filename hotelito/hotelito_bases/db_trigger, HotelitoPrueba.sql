
/*trigger para actualizar el campo cantidad_hab y total_res en la table reservacion*/
create trigger act_res after insert on reservacion_habitaciones
for each row 
update reservacion set 
cantidad_hab = (select count(rh.id_hab) from reservacion_habitaciones rh where id_res = new.id_res),
total_res = ((select sum(rh.subtotal) from reservacion_habitaciones rh where rh.id_res = new.id_res))
where id_res = new.id_res;

drop trigger act_res;


/*trigger para actualizar el campo cantidad_per en la table reservacion*/
create trigger act_cant_per after insert on reservacion_huesped
for each row 
update reservacion set cantidad_personas = (select count(rh.id_cli) from reservacion_huesped rh
where id_res = new.id_res) where id_res = new.id_res;

drop trigger act_cant_per;


/*trigger para actualizar el campo estado en la table reservacion*/
create trigger act_est_res after insert on pago_reservacion
for each row 
update reservacion set estado = 'cancelado' where id_res = new.id_res;

drop trigger act_cant_per;


select count(rh.id_hab) from reservacion_habitaciones rh
where rh.id_res = 2;

select count(rh.id_cli) from reservacion_huesped rh
where rh.id_res = 1; 

select sum(rh.subtotal) from reservacion_habitaciones rh
where rh.id_res = 2;

select r.estado from reservacion r where r.id_res = 2;


