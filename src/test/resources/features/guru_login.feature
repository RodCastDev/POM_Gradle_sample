Feature: Iniciar sesion de forma exitos
  Yo como aprendiz de sphos academy
  Necesito inciar sesion en la pagina de guru
  Para validar que el mensaje de bienvenida sea correcto

  Scenario: Iniciar sesion en Guru99
    Given Deseo ir a la pagina de "http://demo.guru99.com/V4/"
    When Ingreso nombre de usuario "mngr461401" y password "datyjUt"
    Then Valido que el titulo sea "Manger Id : mngr461401"

