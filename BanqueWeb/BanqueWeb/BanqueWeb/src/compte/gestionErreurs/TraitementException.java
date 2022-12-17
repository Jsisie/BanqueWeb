package gestionErreurs;

public class TraitementException extends Exception {

	public TraitementException(String numException) throws TraitementException {
		super(MessagesDErreurs.getMessageDerreur(numException));
	}
}