# Created by LisethElianaOsorioRe at 6/11/2025
Feature: Inicio de sesión - Persona jurídica

  Scenario: Usuario inicia sesión como persona jurídica con credenciales válidas
    Given el usuario está en la página de inicio de sesión
    And selecciona "Persona jurídica"
    When ingresa NIT "123456789-0", correo "empresa@example.com" y contraseña "EmpresaPass123"
    And hace clic en "Ingresar"
    Then accede correctamente a la plataforma
