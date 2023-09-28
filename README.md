# taller02_Huenchunir1_Powell_Munoz

Contexto del caso:
Pensando en el fomento del turismo, el dueño de un hotel familiar llamado "Donde cabe 1, caben 2", ubicado en la ciudad lacustre de Pucón, le pide crear una solución que le ayude a mejorar la administración de las habitaciones de su hotel.
Considere que el hotel tiene 10 habitaciones cada una con un valor de $30.000 por noche (sin comida) y $45.000 por noche (con desayuno y cena).
El administrador del hotel debe, por medio de un menú, poder consultar el estado de las 10 habitaciones. Considere que una habitación puede estar en uno de tres posibles estados: Ocupada ('OA', con alimentación o 'OS', ocupada sin alimentación), Reservada ('R') y Disponible ('D').
El administrador debe poder hacer una reserva de una habitación, ocupar la habitación o dejar la habitación disponible.
Para hacer una reserva, se debe saber la cantidad de noches que se usará la habitación y si se pedirá servicio de alimentación o no.
Para que la habitación quede efectivamente ocupada, se debe confirmar la reserva.
El administrador debe poder imprimir una boleta, de una habitación que deje libre un pasajero, mostrando el detalle que indique:
la cantidad de noches que se usó
si fue con o sin alimentación
el monto total a cancelar.
Luego de cancelado el pago, la habitación debe quedar en estado disponible.
El administrador debe tener la posibilidad de reiniciar el hotel completo, quedando todas las habitaciones en estado disponible, previa confirmación de la clave "resetAll".
Por último, considere que el programa debe ejecutarse hasta que el administrador desee salir.

OBS: considere que hay ciertos escenarios que NO se pueden dar:

- reservar una habitación ya reservada u ocupada

- imprimir boleta de una habitación disponible

- mostrar como ocupada una habitación que ha sido pagado su uso

- mostrar como disponible una habitación reservada u ocupada

i. Antes de programar (pensar) ---> diseñar!!!

Identifique las principales secciones de la solución.
Para c/u de las anterior, diseñe uno o más métodos que respondan a ese requerimiento (tipo, nombres y parámetros).
Establecer que relaciones observa entre los métodos identificados (quien invoca a quien).

Métodos identificados:
crearHabitaciones():  crearemos un map, donde la clave será la habitación y el valor una lista con los datos (estado, servicio Comida, cantidad Días)//son 10 habitaciones
por defecto el valor sera (disponible, S.E, S.E )(vale).
exepciones: este método se tiene que llamar por defecto por lo cual no tiene excepciones

reservar(): método donde se consultara por la disponibilidad de las habitaciones.
este método obtiene el valor de cada habitacion y entrega las que destro de su valor, el cual es una lista, tenga el "disponible" (Vale).
exepciones: al no tener interaccion con el usuario tampoco identifico excepciones

servicioComida(): en este método se consultará si desea o no agregar el servicio de comida (Feña).

cantidadDias(): metodo donde se consulta la cantidad que días que la persona va a estar.(Feña).

confirmarReserva(): confirmar si se va a ocupar la reservar(Feña), en caso de confirmar llama al metodo cambiarEstadoHabitacion.

imprimirBoleta(): al imprimir la boleta se libera completamente, actualizar nuestro map con (disponible, –, –) (Mjose).

resetAll(): limpiar todos los valores de nuestro map, dejando disponible todas las habitaciones(Vale).
exepciones: al no tener interaccion con el usuario tampoco identifico excepciones, ya que este se llama en el menu 


menu(): El menu mostrará las opciones de reservar(), imprimir() y resetAll(). (mjose).

primer commit: 
Huenchuñir: entregue el metodo crearHabitaciones.
muñoz:.entrega metodos servicioComida()
powell:.

segundo commit:
Huenchuñir: entregue el metodo reservar().
muñoz: entrega metodos servicioComida(), confirmarReserva() y cantidadDias() actualizado
powell:.

tercer commit:
Huenchuñir: entregue el metodo resetAll().
muñoz: entrega metodos servicioComida(), confirmarReserva() y cantidadDias() arreglado debido a mala sintaxis
powell:.


posibles errrores y excepciones
- Al ingresar dias negativos
- Anotar numero de habitacion negativo
- En las opciones de elegir y que la letra solo sea especifica (ej: en vez de una S mayuscula anotan una s minuscula







