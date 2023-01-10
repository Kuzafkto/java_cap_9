Conceptos de Poo:

Ejercicio 1:

¿Cuáles serían los atributos de la clase PilotoDeFormula1? ¿Se te ocurren algunas
instancias de esta clase?

Los atributos de la clase PilotoDeFormula1 podrían ser nombre,apellido, sexo,DNI,nombreEquipo,modeloCoche,puntaje,edad,etc.

PilotoFormula1=new PilotoFormula1 ("Juan","Donetti",20410783,"EquipoFord","W12_E_Performance",7200,31);

PilotoFormula1=new PilotoFormula1 ("Patricio","Zorgola",1025698,5217,24);



Ejercicio 2:

A continuación tienes una lista en la que están mezcladas varias clases con
instancias de esas clases. Para ponerlo un poco más difícil, todos los elementos
están escritos en minúscula. Di cuáles son las clases, cuáles las instancias,
a qué clase pertenece cada una de estas instancias y cuál es la jerarquía
entre las clases: paula, goofy, gardfiel, perro, mineral, caballo, tom, silvestre,
pirita, rocinante, milu, snoopy, gato, pluto, animal, javier, bucefalo, pegaso,
ayudante_de_santa_claus, cuarzo, laika, persona, pato_lucas.

Clases: perro,mineral,gato,animal,persona,caballo,bucefalo,pegaso
Instancias: paula,goofy,gardfield,tom,silvestre,pirita,rocinante,milu,snoopy,pluto,javier,cuarzo,laika,pato_lucas.

Jerarquía:  Persona->ayudante_de_santa_claus
            Animal->gato,caballo,bucefalo,pegaso,perro,persona
            Mineral

Instancias  Gato-> tom,silvestre,gardfield
            Pato->pato_lucas
            mineral->cuarzo,pirita
            caballo->rocinante,pegaso
            persona->Javier,Paula
            perro-> laika,snoopy,milu,pluto,goofy

Ejercicio 3:

¿Cuáles serían los atributos de la clase Vivienda? ¿Qué subclases se te ocurren?

Los atributos podrían ser dirección, metrosCuadrados,cantHabitantes.

subclases: Departamento, Casa, PH.

Ejercicio 4:

Piensa en la liga de baloncesto, ¿qué 5 clases se te ocurren para representar 5
elementos distintos que intervengan en la liga?

Equipo, Jugador, Entrenador, Referee, Cancha, Mascota

Ejercicio 5:

Haz una lista con los atributos que podría tener la clase caballo. A continuación
haz una lista con los posibles métodos (acciones asociadas a los caballos).

atributos: raza, velocidadMaxima, edad, velocidadMedia, peso, altura.

metodos: relincha,correr,trotar,rampar

Ejercicio 6:

Lista los atributos de la clase Alumno ¿Sería nombre uno de los atributos de la clase?
Razona tu respuesta

nombre sería uno de los atributos porque si el nombre es demasiado largo o tiene caracteres especificos es mejor guardarlos en una variable que tenerlos almacenados como el nombre de la instancia. (es preferible que la instancia de Alumno se llame Alumno3 a que se llame JuanAlbertoDeLaTorrePabloSegundoCañizares)

Ejercicio 7:

¿Cuáles serían los atributos de la clase Ventana (de ordenador)? ¿cuáles serían
los métodos? Piensa en las propiedades y en el comportamiento de una ventana
de cualquier programa.

atributos: estaMinimiZada, posición,anchura,altura,tieneelMouse.

metodos:cerrar,abrir,cambiarTamaño,asignarFoco.