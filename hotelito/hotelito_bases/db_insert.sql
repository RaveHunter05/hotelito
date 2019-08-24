use hotelito;

/*insetando empleado*/

INSERT INTO `hotelito`.`empleado`
(`cedula_em`,
`prinombre_emp`,
`segnombre_emp`,
`priapellido_emp`,
`segapellido_emp`,
`foto_emp`,
`nacimiento_emp`,
`telefono_emp`,
`email_emp`,
`cargo_emp`,
`sueldo_emp`,
`estado_emp`)
VALUES
('001-110599-1003B',
'Samuel',
'Mohasir',
'Barberena',
'Fuentes',
'null',
'1999-05-11',
86459488,
'samuelbarberena12@gmail.com',
'Gerente',
200000,
'activo');

INSERT INTO `hotelito`.`empleado`
(`cedula_em`,
`prinombre_emp`,
`segnombre_emp`,
`priapellido_emp`,
`segapellido_emp`,
`foto_emp`,
`nacimiento_emp`,
`telefono_emp`,
`email_emp`,
`cargo_emp`,
`sueldo_emp`,
`estado_emp`)
VALUES
('001-010296-1043A',
'Francisco',
'Paul',
'Sotelo',
'Rocha',
'null',
'1996-01-02',
85412369,
'sotelo@gmail.com',
'Cajero',
20000,
'activo');

INSERT INTO `hotelito`.`empleado`
(`cedula_em`,
`prinombre_emp`,
`segnombre_emp`,
`priapellido_emp`,
`segapellido_emp`,
`foto_emp`,
`nacimiento_emp`,
`telefono_emp`,
`email_emp`,
`cargo_emp`,
`sueldo_emp`,
`estado_emp`)
VALUES
('001-014795-1005A',
'Pedro',
'Jose',
'Gonzales',
'Ruiz',
'null',
'1998-06-12',
84256515,
'pedrito@gmail.com',
'Cajero',
15000,
'activo');

INSERT INTO `hotelito`.`empleado`
(`cedula_em`,
`prinombre_emp`,
`segnombre_emp`,
`priapellido_emp`,
`segapellido_emp`,
`foto_emp`,
`nacimiento_emp`,
`telefono_emp`,
`email_emp`,
`cargo_emp`,
`sueldo_emp`,
`estado_emp`)
VALUES
('001-091273-0050X',
'Irma',
'Teresa',
'Fuentes',
'Gonzales',
'null',
'1973-12-09',
84789418,
'irmita@gmail.com',
'cajero',
15000,
'activo');

select * from empleado;
----------------------------------------------------------------------------------------------------------

/*insertando usuario*/

INSERT INTO `hotelito`.`usuario`
(`id_emp`,
`username_user`,
`password_user`,
`estado_user`)
VALUES
(1,
'sbarberena',
'H_sb2019',
'activo');

INSERT INTO `hotelito`.`usuario`
(`id_emp`,
`username_user`,
`password_user`,
`estado_user`)
VALUES
(4,
'fsotelo',
'Hfs2019',
'activo');

INSERT INTO `hotelito`.`usuario`
(`id_emp`,
`username_user`,
`password_user`,
`estado_user`)
VALUES
(5,
'pgonzales',
'Hpg2019',
'activo');

INSERT INTO `hotelito`.`usuario`
(`id_emp`,
`username_user`,
`password_user`,
`estado_user`)
VALUES
(6,
'ifuentes',
'Hif2019',
'activo');


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
' ',
'Lopez',
' ',
'21',
'84562147',
'pedritoL@gmail.com',
'Ingeniero',
'Huesped',
'activo');

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
('002-12148-1002D',
'Juan',
'Luis',
'Guerra',
' ',
'52',
'85412369',
'luisitoguerra@gmail.com',
'Cantante',
'Huesped',
'activo');

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
('001-845658-1002P',
'Walter',
'',
'White',
'',
'51',
'89541263',
'heinsenberg@gmail.com',
'Cocinero',
'Huesped',
'activo');

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
('001-021458-1485J',
'Jesse',
'',
'Pinkman',
'',
'32',
'81247566',
'pikman001@gmail.com',
'Comerciante',
'Huesped',
'activo');

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
('006-011685-1525G',
'Jhon',
'',
'Targaryen',
'',
'21',
'84135908',
'jhon@gmail.com',
'Guardian',
'Huesped',
'activo');

select * from cliente;

----------------------------------------------------------------------------------------------------------

/*insertando habitacion*/

/*habitaciones simples*/
INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('030',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('031',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('032',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('033',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('034',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('035',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('036',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('037',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('038',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('039',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('040',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('041',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('042',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('043',
'Personal',
' ',
1,
15,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('044',
'Personal',
' ',
1,
15,
'disponible');

/*habitaciones dobles*/
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

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('003',
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
('004',
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
('005',
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
('006',
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
('007',
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
('008',
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
('009',
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
('010',
'Doble',
'Habitacion con desayuno incluido',
2,
30,
'disponible');

/*habitaciones triples*/
INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('015',
'triple',
'Desayuno y WIFI incluido',
3,
40,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('016',
'triple',
'Desayuno y WIFI incluido',
3,
40,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('017',
'triple',
'Desayuno y WIFI incluido',
3,
40,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('018',
'triple',
'Desayuno y WIFI incluido',
3,
40,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('019',
'triple',
'Desayuno y WIFI incluido',
3,
40,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('020',
'triple',
'Desayuno y WIFI incluido',
3,
40,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('021',
'triple',
'Desayuno y WIFI incluido',
3,
40,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('022',
'triple',
'Desayuno y WIFI incluido',
3,
40,
'disponible');

INSERT INTO `hotelito`.`habitacion`
(`numero_hab`,
`tipo_hab`,
`descripcion_hab`,
`capacidad_hab`,
`precio_hab`,
`estado_hab`)
VALUES
('015',
'triple',
'Desayuno y WIFI incluido',
3,
40,
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

INSERT INTO `hotelito`.`servicio`
(`nombre_ser`,
`tipo_ser`,
`descripcion_ser`,
`precio_ser`,
`estado_ser`)
VALUES
('Cena',
'Serv. Habitacion',
'Cena no incluye bebida',
100,
'disponible');

INSERT INTO `hotelito`.`servicio`
(`nombre_ser`,
`tipo_ser`,
`descripcion_ser`,
`precio_ser`,
`estado_ser`)
VALUES
('Masaje Relajante',
'Serv. Habitacion',
'Elimina estrés y tensión',
50,
'disponible');

INSERT INTO `hotelito`.`servicio`
(`nombre_ser`,
`tipo_ser`,
`descripcion_ser`,
`precio_ser`,
`estado_ser`)
VALUES
('Masaje Japones',
'Serv. Habitacion',
'Técnica terapéutica que trabaja sobre la acupuntura',
120,
'disponible');

INSERT INTO `hotelito`.`servicio`
(`nombre_ser`,
`tipo_ser`,
`descripcion_ser`,
`precio_ser`,
`estado_ser`)
VALUES
('Desayuno',
'Serv. Habitacion',
' ',
80,
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

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0013',
'Sofa color rojo',
'1500',
2);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0014',
'Sofa color rojo',
'1500',
3);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0015',
'Sofa color rojo',
'1500',
4);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0016',
'Sofa color rojo',
'1500',
5);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0017',
'Sofa color rojo',
'1500',
6);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0018',
'Sofa color rojo',
'1500',
7);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0019',
'Sofa color rojo',
'1500',
8);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0020',
'Sofa color rojo',
'1500',
9);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0021',
'Sofa color rojo',
'1500',
10);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0022',
'Sofa color rojo',
'1500',
11);


INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0023',
'Sofa color rojo',
'1500',
12);
INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0024',
'Sofa color rojo',
'1500',
13);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0025',
'Sofa color rojo',
'1500',
14);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0026',
'Sofa color rojo',
'1500',
15);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0027',
'Sofa color rojo',
'1500',
16);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0028',
'Sofa color rojo',
'1500',
17);

INSERT INTO `hotelito`.`mueble`
(`nombre_mue`,
`descripcion_mue`,
`precio_mue`,
`id_hab`)
VALUES
('Sofa S0029',
'Sofa color rojo',
'1500',
18);


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

/*insetando pago_reservacion*/

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