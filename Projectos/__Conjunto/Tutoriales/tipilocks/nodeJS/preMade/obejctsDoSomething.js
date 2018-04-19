var Persona
{
    var edad;
    var Nombre;
    var Apellidos;
    var estatura;

    function Persona(edad, nombre, apellidos, estatura) {
        this.edad = edad;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.estatura = estatura;
    }
    function cumpleanios(){
        edad++;
    }
    function toString() {
        return Nombre+", "+Apellidos+
        "\n"+edad+"años, "+estatura+"cm.";
    }
}
function checkAge(una_edad){
    if(una_edad>18){
        alert("Felicidades!! eres un puto gilipollas mas.")
    } else{
        alert("Felicidades!! eres un subnormal menos.")
    }
}

var nonbre=prompt("Introduce tu noombre");
var apellidos=prompt("Introduce tus apellidos");
var edad=prompt("Introduce tu edad");
var estatura=prompt("Introduce tu estatura");

var newer=new Persona{this.edad,nombre,apellidos,this.estatura};
newer.toString();

var Carlos=new Persona(17,"Carlos","Ramirez",1.69);
Carlos.toString();

checkAge(Carlos.edad);


