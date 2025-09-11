<?php
include 'conexion.php';

$query = "SELECT ID_forms, name, email, Phone, message FROM forms";
$result = $conexion->query($query);

$datos = array();

if ($result->num_rows > 0) {
    while($row = $result->fetch_assoc()) {
        $datos[] = $row;
    }
    echo json_encode($datos, JSON_UNESCAPED_UNICODE);
} else {
    echo json_encode(array());
}

$conexion->close();
?>
