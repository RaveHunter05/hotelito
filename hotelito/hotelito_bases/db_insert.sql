use hotelito;

/*insetando empleado*/

select * from empleado;
----------------------------------------------------------------------------------------------------------

/*insertando usuario*/

select * from usuario;

----------------------------------------------------------------------------------------------------------

/*insertando cliente*/

INSERT INTO `hotelito`.`cliente`
(`cedula_cli`,
`prinombre_cli`,
`segnombre_cli`,
`priapellido_cli`,
`segapellido_cli`,
`edad_cli`,
`telefono_cli`,
`email_cli`,
`titulo_cli`,
`tipo_cli`,
`estado_cli`)
VALUES
('001-200699-1235A',
'Pedro',
'',
'Lopez',
'',
'21',
'84562147',
'pedritoL@gmail.com',
'Ingeniero',
'Huesped',
'activo');

select * from cliente;

----------------------------------------------------------------------------------------------------------

/*insertando habitacion*/

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('001',
'Doble',
'Habitacion con desayuno incluido',
2,
30,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('002',
'Doble',
'Habitacion con desayuno incluido',
2,
30,
'disponible');

select * from habitacion;

----------------------------------------------------------------------------------------------------------

/*insertando servicio*/

INSERT INTO `hotelito`.`servicio`
(`nombre_ser`,
`tipo_ser`,
`descripcion_ser`,
`precio_ser`,
`estado_ser`)
VALUES
('Almuerzo',
'Serv. Habitacion',
'Almuerzo incluye bebida',
120,
'disponible');

select * from servicio;

----------------------------------------------------------------------------------------------------------

/*insertando mueble*/

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0012',
'Sofa color rojo',
'1500',
1);

select * from mueble;

----------------------------------------------------------------------------------------------------------

/*insertando reservacion*/

INSERT INTO `hotelito`.`reservacion`
(`id_cli`,
`fecha_entrada`,
`fecha_salida`,
`cantidad_hab`,
`cantidad_personas`,
`estado`,
`total_res`)
VALUES
(1,
'2019-08-11',
'2019-08-13',
0,
0,
'',
0);


select * from reservacion;

----------------------------------------------------------------------------------------------------------

/*insertando reservacion_habitaciones*/

INSERT INTO `hotelito`.`reservacion_habitaciones`
(`id_res`,
`id_hab`,
`subtotal`)
VALUES
(1,
1,
(select precio_hab from habitacion where id_hab = '1'));

INSERT INTO `hotelito`.`reservacion_habitaciones`
(`id_res`,
`id_hab`,
`subtotal`)
VALUES
(1,
2,
30);

select * from reservacion_habitaciones;

----------------------------------------------------------------------------------------------------------

/*insertando reservacion_huesped*/

INSERT INTO `hotelito`.`reservacion_huesped`
(`id_res`,
`id_cli`)
VALUES
(1,
1);

select * from reservacion_huesped;

----------------------------------------------------------------------------------------------------------

/*insetando pado_reservacion*/

INSERT INTO `hotelito`.`pago_reservacion`
(`id_res`,
`fecha`,
`forma_pago`)
VALUES
(1,
'2019-08-11',
'tarjeta');


select * from pago_reservacion;
select * from reservacion inner join pago_reservacion;
----------------------------------------------------------------------------------------------------------

/*insertando factura*/

select * from factura;

----------------------------------------------------------------------------------------------------------

/*insertando servicios_contratados*/

select * from servicios_contratados;

----------------------------------------------------------------------------------------------------------

/*insertando danos*/

select * from danos;

----------------------------------------------------------------------------------------------------------
