-- Integrantes: Gonzalo Fuentes, Aaron Centeno, Benjamin Pizarro, Ignacio Navarrete

La carpeta *ANDROID* contiene los archivos PHP que se realizaron para la conexión a la MYSQL
Si es necesario, hay que cambiar la ruta de la conexión en *LINEA 48* executeService("http://172.26.10.184:80/android/insertar.php") que es mi localhost. Archivo Formsactivity.java
también en *LINEA 24* String URL = "http://172.26.10.184:80/android/select.php"

-- Hay que insertar varios valores para que se active el scroll>

INSERT INTO forms (name, email, Phone, message) VALUES
('Carlos Muñoz', 'carlos.munoz@example.com', '+56912345678', 'Quisiera más información sobre el producto A.'),
('María González', 'maria.glez@example.com', '+56998765432', '¿Hacen envíos a regiones?'),
('Pedro Rojas', 'projas@example.com', '+56987654321', 'Estoy interesado en una cotización.'),
('Ana López', 'ana.lopez@example.com', '+56911112222', '¿Cuánto tarda la entrega?'),
('Jorge Castillo', 'jorge.castillo@example.com', '+56933334444', 'Me gustaría agendar una reunión.'),
('Fernanda Torres', 'fernanda.torres@example.com', '+56955556666', '¿Aceptan pagos con tarjeta de crédito?'),
('Luis Ramírez', 'lramirez@example.com', '+56977778888', 'Tengo un problema con mi pedido anterior.'),
('Camila Herrera', 'camila.herrera@example.com', '+56999990000', '¿Puedo solicitar factura electrónica?'),
('Andrés Soto', 'andres.soto@example.com', '+56922223333', '¿Cuáles son los métodos de pago disponibles?'),
('Valentina Díaz', 'valentina.diaz@example.com', '+56944445555', 'Estoy buscando promociones actuales.'),
('Cristian Vega', 'cristian.vega@example.com', '+56966667777', 'Quisiera saber si tienen stock disponible.'),
('Paula Navarro', 'paula.navarro@example.com', '+56988889999', '¿Tienen soporte técnico post-venta?'),
('Rodrigo Paredes', 'rodrigo.paredes@example.com', '+56910101010', '¿Puedo cambiar mi dirección de envío?'),
('Sofía Morales', 'sofia.morales@example.com', '+56920202020', 'Necesito un presupuesto detallado.'),
('Ignacio Fuentes', 'ignacio.fuentes@example.com', '+56930303030', '¿Cuánto cuesta el envío express?'),
('Daniela Reyes', 'daniela.reyes@example.com', '+56940404040', 'Me gustaría hacer una compra al por mayor.'),
('Matías Vargas', 'matias.vargas@example.com', '+56950505050', '¿Cuál es el horario de atención?'),
('Isidora Contreras', 'isidora.contreras@example.com', '+56960606060', 'Tengo dudas sobre la garantía.'),
('Felipe Araya', 'felipe.araya@example.com', '+56970707070', '¿Puedo retirar en tienda directamente?'),
('Constanza Silva', 'constanza.silva@example.com', '+56980808080', 'Estoy interesada en una suscripción mensual.');

Datos randoms generados con IA
