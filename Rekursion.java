

/**
 * Wir berechnen Sachen, die wir schon können,
 * neu mit Rekursionen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Rekursion
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    

    /**
     * Konstruktor für Objekte der Klasse Rekursion
     */
    public Rekursion()
    {
        // Instanzvariable initialisieren
       
    }

    /**
     * Ganzzahlige Rekursionen
     */
    public int fibonacci(int y)
    {
        if (y==0) {
            return 0;
        } 
        if (y==1) {
            return 1;
        }
            return fibonacci(y-1)+fibonacci(y-2); 
    }
    
    public int multi(int a, int b) {
        if (a==1) {
            return b;
        }
        return multi(a-1, b)+b;
    }
    
    public int fakultaet_r(int a) {
        if (a<=1) {
            return 1;
        }
        return a* fakultaet_r(a-1);
    }
    
    public int fakultaet_i(int a) {
        int result=1;
        for (int i=2; i<=a; i++) {
            result*= i;
        }
        return result;
    }
  
  public int ggT (int a, int b) {
     /**
      * Wir können den größten gemeinsamen Teiler durch Wechselwegnahme
      * finden. Dazu wird immer von der größeren Zahl die kleinere Zahl abgezogen.
      * ggT(7,3) = ggT(4,3)  = ggT(1,3) = ggT( 1,2)= ggT(1,1) =1
      * Sind die Zahlen gleich, dann ist der ggT gefunden.
      * ggT(12,9) = ggT(3,9) = ggT(3,6) = ggT(3,3) = 3
      * Und das Ganze jetzt rekursiv
      */
      if(a == b) {
          return a;
        } else if(a<b) {
            return ggT(a, b-a);
        } else {
            return ggT(a-b, b);
        }
    }
    
    public int kgV(int a, int b) {
        /**
         * Das kleinste gemeinsame Vielfache ist dann 
         * einfach das Produkt aus a und b geteilt durch den ggT
         */
        return a*b/ggT(a,b);
    }
  
  public int bino(int n, int k) {
    /**    k ->
    *  n  1
    *     1  1
    *     1  2  1           
    *     1  3  3  1
    */
    if(k==n || k==0) {
      return 1; 
    }
    return bino(n-1,k-1)+ bino(n-1,k);
  }
  
  /**
   *  Rekursionen mit float
   */
   public double heron(double radikant, double seiteX) {
    /**
    * LS 9 S.17
    */
    
    double seiteY= radikant/seiteX;
    double mittel= (seiteX+seiteY)/2;
    if (Math.abs(seiteY-seiteX)<1e-5) {  
      return mittel;
    }
    return heron(radikant, mittel);
  }
  
  public double heron(double radikant) {
    return heron(radikant, 1);
  } 
  
    /**
   *   Rekursionen mit Strings
   */
    
    public boolean palindrom(String text) {
        if (text.length() <=1){
            return true;
        }
        if (text.charAt(0) == text.charAt(text.length()-1)) {
            return palindrom(text.substring(1, text.length()-1));
        } else {
            return false;
        }
    }
    
    public String nameGedreht (String text) {
       if (text.length()<=1) {
           return text;
        }
        return text.charAt(text.length()-1)+ nameGedreht(text.substring(0, text.length()-1));
    }
    
    
   /**
   * Die Methode nameGedreht erhält als Parameter einen Namen und gibt diesen 
   * rückwärts zurück.
   *
   * "einstreuen" fügt zwischen je zwei Buchstaben eines übergebenen Strings
   * einen Unterstrich ein und gibt diesen zurück
   *
   * "einstreuenText" ist eine Erweiterung von "einstreuen": Der Anwender übergibt
   * eine einzustreuende Zeichenkette als Parameter.
   *
   * "r2l" ersetzt in einem String alle r durch ein l. Groß- und Kleinschreibung
   * beachten.
   */
  
  /**
   *   Rekursion mit Listen
   *  
   * "listensumme" berechnet die Summe einer übergebenen Zahlenliste.
   * "umgedreht" erhält als Parameter eine Zahlenliste und gibt diese umgedreht zurück
   * 
   * "mapl" erhält als Parameter eine Zahlenliste und eine Zahl. Alle Zahlen der Liste werden
   * um die vom Anwender übergebene Zahl erhöht und die modifizierte Liste wird zurückgegeben.
   *
   * "enthalten" wird eine Zahlenliste übergeben, die prüft, ob ein vom Anwender übergebener
   * Wert enthalten ist. "enthalten" liefert einen Wahrheitswert zurück.
   * 
   * "delDoppel" hat als Parameter eine Zahlenliste. Alle doppelt vorkommenden Zahlen werden gelöscht
   * und die Liste wird ohne die Doppelten zurückgegeben.
   * Tipp: Stütze die Funktion auf "enthalten" ab.
  
   */
   
    
    public void sandkiste() {
      for (int i=0; i<20; i++) {
          System.out.print(fibonacci(i)+"; ");
        }
        
       System.out.println( multi(10, 5));
    } 
}
