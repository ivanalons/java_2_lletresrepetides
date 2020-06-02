//------
//FASE 1
//------

var nom = ['I','v','a','n'];

var resultat = "";

for(var i=0;i<nom.length;i++){
	resultat += nom[i];
	resultat += "<BR>";
}

document.getElementById("fase1").innerHTML = resultat;