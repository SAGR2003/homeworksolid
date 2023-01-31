# homeworksolid

<h1 align="center">Integrantes</h1><h2 align="center"> Daniela Cortés Méndez <br> Sergio Andrés González Róa <br> Kareen Alejandra Latorre Martínez</h2>


***Carpeta main, clase main, método main*** <br>
Si se añade un nuevo estudiante, se crea un nuevo hijo, para que el método quede abierto a extensión y cerrado a modificación (Open/closed)

***Carpeta main, clase main, método verMateriasEstudiantes*** <br>
(Open/closed) Se usa para que no se tenga que modificar el método cada vez que se añada una carrera 

***Carpeta modelo, clase Daniel, clase Liliana, clase Monica*** <br>
(Open/closed) Si se añade un nuevo estudiante, se crea un nuevo hijo, para que el método quede abierto a extensión y cerrado a modificación.

***Carpeta modelo, clase Daniel, clase Liliana, clase Monica, método mostrarMaterias*** <br>
Usamos override (sobrescribir) de tal forma que la clase hija pueda comportarse de manera distinta al padre

***Carpeta modelo, clase Estudiante*** <br>
(Open/closed) Si se añade un nuevo estudiante, se crea un nuevo hijo, para que el método quede abierto a extensión y cerrado a modificación 
Una clase puede sustituirse por cualquiera de una clase hija (Liskov substitution) 

***Carpeta service, clase EmailOutlook, método conectarServidor*** <br>
Se creó otro método para que tengan un único propósito (Single Responsability) 

***Carpeta service, clase EnvioMaterial*** <br>
El envío del correo es de alto nivel, mientras que la obtención e impresión de los datos para ese email son operaciones de bajo nivel, por lo que eliminamos la dependencia entre las clases de alto nivel y bajo nivel mediante una abstracción (Inversión de dependencias)

***Carpeta service, clase EnvioMaterialAdministracion, clase EnvioMaterialIndustrial, clase EnvioMaterialInformatica*** <br>
Se creó la clase que implementa la interfaz para disminuir el acoplamiento (Inversión de dependencias)

***Carpeta service, clase EnvioMaterialAdministracion, clase EnvioMaterialIndustrial, clase EnvioMaterialInformatica, método enviarMaterialEstudiante*** <br>
Usamos override (sobrescribir) de tal forma que la clase hija pueda comportarse de manera distinta al padre

***Carpeta service, clase EnvioMaterialAdministracion, clase EnvioMaterialIndustrial, clase EnvioMaterialInformatica, método enviarEmail*** <br>
Usamos override (sobrescribir) de tal forma que la clase hija pueda comportarse de manera distinta al padre

***Carpeta service, interfaz IEnviar*** <br>
Se crea una interfaz y se le asigna lo que necesita hacer (Interface segregation) 

***Carpeta service, clase Main*** <br>
(Single responsability) Se crea esta clase para que cumpla el único propósito de enviar los materiales del estudiante
