//------
//FASE 2
//------

function esConsonant(lletra) {
	return "bcdfghjklmnñpqrstvwxyz".includes(lletra.toLowerCase());
}

function esVocal(lletra) {
	return "aeiou".includes(lletra.toLowerCase());
}

function esNumero(lletra) {
	return "1234567890".includes(lletra);
}

var nom = [];

nom.push('I');
nom.push('v');
nom.push('a');
nom.push('n');
nom.push('3');

var resultat = "";

for(var i=0;i<nom.length;i++){
	
	if(esVocal(nom[i])){
		
		resultat += nom[i] + " &eacute;s VOCAL";
		resultat += "<BR>";
		
	}else if(esConsonant(nom[i])){
		
		resultat += nom[i] + " &eacute;s CONSONANT";
		resultat += "<BR>";
		
	}else if(esNumero(nom[i])){
		
		resultat += nom[i] + " &eacute;s N&Uacute;MERO i els noms de persones no contenen n&uacute;meros!";
		resultat += "<BR>";
		
	}else{
		
		resultat += nom[i];
		resultat += "<BR>";
		
	}
	
}

document.getElementById("fase2").innerHTML = resultat;

