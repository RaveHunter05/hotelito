use hotelito_prueba;

select * from cliente;
select * from servicio;
select * from habitacion;

INSERT INTO `hotelito_prueba`.`habitacion`
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