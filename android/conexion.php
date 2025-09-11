<?php
$hostname = 'localhost';
$database = 'android';
$username = 'root';
$password = 'root';

$conexion = new mysqli($hostname, $username, $password, $database);
if($conexion -> connect_errno)
{
    echo "No se pudo realizar la conexión a la base de datos";
}
?>