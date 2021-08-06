@stories
Feature: Registro en la pagina Utest
    Yo como usuario nuevo
    quiero registrarme en la pagina de Utest
    para tener acceso a su contenido

  @Registro
  Scenario: Registro de usuario
    Given que me encuentro en la pagina de registro de Utest
    When complete todos los campos del formulario de registro
    | strNombre | strApellido | strEmail               | strMes | strDia | strAnio | strLenguaje | strCiudad     | strPostal | strPais  | strSO | strVersionSo | strLenguageSo | strMobil| strModelo | strSOMobil | strPassword | strConfirmPas |
    | Cristiano | Ronaldo     | cristianoCR7@gmail.com | March  | 19     | 1987    | Spanish     | Braga         | 427000    | Portugal | Linux | Xebian       | English       | Apple   | iPhone 6  | iOS 10.2   | delantero7  | delantero7    |
    Then podre tener acceso a la pagina como usuario registrado
    | strMensaje    |
    | The last step |

