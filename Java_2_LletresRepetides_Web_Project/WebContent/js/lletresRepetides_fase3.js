//------
//FASE 3
//------

var resultat = "";
var llistaNom = [];

llistaNom.push('I');
llistaNom.push('v');
llistaNom.push('a');
llistaNom.push('n');
llistaNom.push('A');
llistaNom.push('i');

var lletra = '';
var myMap = new Map();
var contador = 0;

for(var i=0;i<llistaNom.length;i++){
	
	lletra = llistaNom[i].toLowerCase();
	
	if(myMap.has(lletra)==false){
		myMap.set(lletra,1);
	}else{
		contador=myMap.get(lletra);
		contador++;
		myMap.set(lletra,contador);
	}

}

var nom = llistaNom.toString();
resultat += nom;
resultat += "<BR>";


for (var [key, value] of myMap) {

	resultat += "La lletra \"" + key + "\" apareix " + value + " vegades";
	resultat += "<BR>";
	
}

document.getElementById("fase3").innerHTML = resultat;

