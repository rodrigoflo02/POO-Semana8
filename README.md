Autor del proyecto
Nombre: Rodrigo Flores Elizondo
Seccion 003_A
Carrera: Analista Programador Computacional
Sede: Campus Online

Descripcion del proyecto
El proyecto es una continuacion del proyecto de Salmontt. Esta version resuelve la problematica de contrato de comportamiento comun para distintas entidades, validacion del tipo de objeto y de interfaz grafica facilitando el ingreso y visualizacion de registro.

Estructura general del proyecto
El proyecto esta estructurado en 3 paquetes: Model que contiene las la interfaz Registrable y clases UnidadOperativa, CentroCultivo, PlantaProceso, Persona y Empleado; Data que contiene las clase GestorDatos encargado del proceso de creacion de instancias; y UI que contiene la clase main donde se ejecuta el codigo.

Instrucciones
1- Clone el repositorio desde Github https://github.com/rodrigoflo02/POO-Semana7.git
2- Abrir el proyecto con Intellij Idea 
3- En menu, abrir el proyecto seleccionando la carpeta de este 
4- Para modificar las plantas o centros en la clase GestorDatos use la sintaxis del comando PlantaProceso nombreplanta = new PlantaProceso("nombre","comuna",capacidadproceso,numerolineas) o 
CentroCultivo nombre = new CentroCultivo("Nombre", "Comuna", TonaladasdeProducicion (con decimales), numerojaulas (con enteros)); en el codigo hay ejemplos con que se puede guiar.
5- Si desea agregar mas plantas o procesos añada a la lista con el comando ListaUnidadOperativa.add(); donde dentro de () debe colocar el nombre de la variable de la planta o centro
6- Ejecutar el Archivo Main.java desde el paquete UI (Ctrl + F5).

