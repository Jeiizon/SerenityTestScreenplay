Feature: Registrar una reunión

  Scenario: Logueo y creación de unidad para asignarla a una reunión nueva
    Given Jeison ingresa al sitio
    When Mis credenciales de acceso "admin" "serenity" organization "Unidad J"
    Then Registramos reunion con nombre "Interview Jeison Soler" en la unidad "Unidad J"

