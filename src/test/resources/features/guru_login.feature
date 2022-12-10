Feature: Iniciar sesion de forma exitosa
  Yo como aprendiz de sphos academy
  Necesito inciar sesion en la pagina de guru
  Para validar que el mensaje de bienvenida sea correcto

  Scenario: Iniciar sesion en Guru99
    Given Deseo ir a la pagina de "https://academy.sophossolutions.com/login/index.php"
    When Ingreso nombre de usuario y password
      | Usuario                   | Password      |
      | rodrigocastp05@gmail.com  | Semillero#2022 |
    Then Valido que el homepages tenga el nombre de "Rodrigo Alfredo Castiblanco Pardo"

