<?php
include 'conexion.php';

$name    = $_POST['name'] ?? '';
$email   = $_POST['email'] ?? '';
$phone   = $_POST['phone'] ?? '';
$message = $_POST['message'] ?? '';

// 👇 Usar $conexion, no $conn
$stmt = $conexion->prepare("INSERT INTO forms (name, email, phone, message) VALUES (?, ?, ?, ?)");
if (!$stmt) {
    die("Error en prepare: " . $conexion->error);
}

$stmt->bind_param("ssss", $name, $email, $phone, $message);

if ($stmt->execute()) {
    echo "Datos guardados correctamente";
} else {
    echo "Error en execute: " . $stmt->error;
}

$stmt->close();
$conexion->close();
?>
