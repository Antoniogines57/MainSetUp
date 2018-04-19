alert("Estamos ejecutando un script");

function pedirTexto(){
    var funi=prompt("Introduce una cadena de texto");
    return funi;
}
var $globalText=pedirTexto();
alert($globalText);

function checkAge(edad){
    if(edad>=18){
        alert("Eres mayor de edad");
    } else {
        alert("Eres menor de edad");
    }
}
