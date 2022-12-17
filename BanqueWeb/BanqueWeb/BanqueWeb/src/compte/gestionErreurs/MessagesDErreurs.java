package gestionErreurs;

import java.util.HashMap;
import java.util.Map;

public class MessagesDErreurs {
	static private final Map<String,String> map = new HashMap<>() {{
		put("0", "Code réservé");
		put("3", "Problème pour accéder à ce compte client, vérifiez qu'il est bien valide");
		put("4", "Le N° de compte doit être numérique");
		put("5", "Le N° de compte doit comporter 4 caractères");
		put("10", "Code réservé"); 
		put("21", "Problème d'accès à la base de données, veuillez le signaler à votre administrateur");
		put("22", "Problème après traitement. Le traitement a été effectué correctement maisl il y a eu un problème à signaler à votre administrateur");
		put("24", "Opération refusée, débit demandé supérieur au crédit du compte");
		put("25", "La valeur doit être numérique");
		put("26", "Aucune valeur n'a été saisie");
		put("31", "La date initiale doit être inférieure à la date finale");
		put("32", "Il n'y a eu aucune opération durant cette période");
	}};
	
	/**
	 * Renvoie un message d'erreur correspondant au numéro d'erreur
	 * @param numéro correspondant au message d'erreur
	 * @return message d'erreur à afficher
	 */
	static public String getMessageDerreur(String num) {
		return map.get(num);
	}
}