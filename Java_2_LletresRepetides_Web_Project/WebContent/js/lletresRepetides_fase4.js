//------
//FASE 3
//------

var resultat = "";
var llistaName = [];

llistaName.push('I');
llistaName.push('v');
llistaName.push('a');
llistaName.push('n');

var surname = [];

surname.push('P');
surname.push('e');
surname.push('r');
surname.push('e');
surname.push('z');

var fullName = llistaName.concat(" ");
fullName = fullName.concat(surname);

resultat = "["+fullName.toString()+"]";

document.getElementById("fase4").innerHTML = resultat;
