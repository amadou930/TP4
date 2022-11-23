class Personne {
  // attributs
  private String nom;
  private String prenom;
  private String secu;

  // constructeur de la classe
  public Personne(String nom, String prenom, String secu) {
    this.nom = nom;
    this.prenom = prenom;
    this.secu = secu;
  }

  // acceseur
  public String getNom() {
    return this.nom;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public String getSecu() {
    return this.secu;
  }

  // méthode toString
  @Override
  public String toString() {
    return "nom : " + this.nom + "\n" + "prenom : " + this.prenom + "\n" + "numero de sécu: " + this.secu;
  }

  // méthode equals
  @Override
  public boolean equals(Object p) {

    if (this == p) {
      return true;
    }
    if (p == null || !(p instanceof Personne)) {
      return false;
    }
    Personne p1 = (Personne) p;
    if (nom.equals(p1.nom) && prenom.equals(p1.prenom) && secu.equals(p1.secu))
      return true;

    return false;
  }

  public boolean estHomme() {
    boolean esthomme = false;
    ;
    if (this.secu.charAt(0) == '1')
      esthomme = true;
    else {
      esthomme = false;
    }
    return esthomme;
  }
}