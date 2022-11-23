class  MoyenDeTransport implements Deplacement
  {
    //attribut de la classe
    private double x;
    private double y; 
    private const double vitesse=10;

    //constructeur de la classe
    public MoyenDeTransport(double x, double y)
    {
      this.x=x;
      this.y=y;
    }

    public void limitation(double vitesse1, double vitesse2)
    {
      this.vitesse=vitesse1;
      if(this.vitesse > vitesse2)
      {
        
      }
    }

    

    
  }