create database hotelito;

use hotelito;

create table cliente(
id_cli int primary key not null auto_increment,
cedula_cli varchar(16)  not null, 
prinombre_cli varchar(50) not null,
segnombre_cli varchar(50) default null,
priapellido_cli varchar(50) not null,
segapellido_cli varchar(50) default null,
telefono_cli varchar(15) not null,
email_cli varchar(80) not null,
titulo_cli varchar(20) default null
);

create table empleado(
id_emp int primary key not null auto_increment,
cedula_em varchar(16) not null,
prinombre_emp varchar(50) not null,
segnombre_emp varchar(50) default null,
priapellido_emp varchar(50) not null,
segapellido_emp varchar(50) default null,
foto_emp varchar(100) not null,
nacimiento_emp date not null,
telefono_emp varchar(15) not null,
email_emp varchar(80) not null,
cargo_emp varchar(50) not null,
sueldo_emp float default null
);

create table usuario(
id_user int primary key not null auto_increment,
id_emp int not null,
username_user varchar(50) not null,
password_user varchar(15) not null,
foreign key (id_emp) references empleados(id_emp)
);

create table habitacion(
id_hab int primary key not null auto_increment,
numero_hab char(3) not null,
tipo_hab varchar(20) not null,
descripcion_hab varchar(50) default null,
precio_hab float default null,
estado_hab boolean default "true"
);

create table mueble(
id_mue int primary key not null auto_increment,
nombre_mue varchar(50) default null,
descripcion_mue varchar(80) default null,
precio_mue float not null
);

create table habitacion_mueble(
id_mue int primary key not null,
id_hab char(3) not null,
foreign key (id_hab) references habitacion(id_hab)
);

create table servicio(
id_ser int primary key not null auto_increment,
nombre_ser varchar(20) not null,
descripcion_ser varchar(80) default null,
precio_ser float default null
);

create table insumo(
id_insumo int primary key not null auto_increment,
nombre_insumo varchar(50) not null,
descripcion varchar(80)  default null,
cantidad int default null,
fecha_pedido date NOT NULL,
fecha_a_pedir date NOT NULL,
cantidad_a_pedir date NOT NULL
);

create table reservacion(
id_res int primary key not null auto_increment,
id_cli int not null,
cantidad_hab int,
cantidad_personas int,
fecha_entrada date not null,
fecha_salida date not null,
total_res float,
foreign key (id_cli) references clientes(id_cli)
);

create table invitados(
id_res int not null,
prinombre_cli varchar(50) not null,
segnombre_cli varchar(50) default null,
priapellido_cli varchar(50) not null,
segapellido_cli varchar(50) default null,
edad_inv int not null,
foreign key (id_res) references reservacion(id_res)
);

create table habitaciones_reservados(
id_res int not null,
id_hab char(3) not null,
subtotal float
); 

create table factura(
num_fact char(10) primary key not null,
id_cli int not null,
fecha date,
forma_pago varchar(20),
costo_servicios float, 
costo_danos float,
total_fact float
);

create table servicios_contratados(
id_fact int not null,
id_ser int not null,
id_hab char(3) not null,
cantidad int,
subtotal float,
foreign key (id_fact) references factura(id_fact),
foreign key (id_ser) references servicios(id_ser),
foreign key (id_hab) references habitacion(id_hab)
);

create table danos(
id_fact int not null,
id_mue int not null,
subtotal float,
foreign key (id_fact) references factura(id_fact),
foreign key (id_mue) references muebles(id_mue)
);




