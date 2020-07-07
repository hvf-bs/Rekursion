
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse RekursionTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class RekursionTest
{
    /**
     * Konstruktor fuer die Test-Klasse RekursionTest
     */
    public RekursionTest()
    {
    }

    @Test
    public void fakultaet_r()
    /** Die Fakultät von a ist das Produkt der Zahlen bis a.
     * Die Rechnung soll einmal rekursiv
     */
    {
        Rekursion Rekursion1 = new Rekursion();
        assertEquals(6, Rekursion1.fakultaet_r(3));
        assertEquals(1, Rekursion1.fakultaet_r(1));
        assertEquals(1, Rekursion1.fakultaet_r(0));
        assertEquals(3628800, Rekursion1.fakultaet_r(10));
    }

    


    @Test
    public void ggT()
    /**
     * Wir können den größten gemeinsamen Teiler durch Wechselwegnahme
     * finden. Dazu wird immer von der größeren Zahl die kleinere Zahl abgezogen.
     * ggT(7,3) = ggT(4,3)  = ggT(1,3) = ggT( 1,2)= ggT(1,1) =1
     * Sind die Zahlen gleich, dann ist der ggT gefunden.
     * ggT(12,9) = ggT(3,9) = ggT(3,6) = ggT(3,3) = 3
     * Und das Ganze jetzt rekursiv
     */
    {
        Rekursion Rekursion1 = new Rekursion();
        assertEquals(1, Rekursion1.ggT(7, 3));
        assertEquals(3, Rekursion1.ggT(12, 9));
        assertEquals(112, Rekursion1.ggT(112, 112));
    }

    @Test
    public void kgV()
    /**
     * Das kleinste gemeinsame Vielfache ist dann 
     * einfach das Produkt aus a und b geteilt durch den ggT
     */
    {
        Rekursion Rekursion1 = new Rekursion();
        assertEquals(21, Rekursion1.kgV(7, 3));
        assertEquals(36, Rekursion1.kgV(12, 9));
        assertEquals(112, Rekursion1.kgV(112, 112));
    }
  
  @Test 
  public void bino() {
    Rekursion Rekursion1 = new Rekursion();
    assertEquals("bino(0,0)",1, Rekursion1.bino(0,0));
    assertEquals("bino(30,0)",1, Rekursion1.bino(30,0));
    assertEquals("bino(40,40)",1, Rekursion1.bino(40,40));
    
    int n=2;
    int[] liste= new int[] {1, 2, 1};
    for (int k = 0; k< liste.length; k++) {
        assertEquals("bino("+n+" , "+k+")",liste[k], Rekursion1.bino(n, k));
    }
    n=4;
    liste= new int[] {1, 4, 6, 4, 1};
    for (int k = 0; k< liste.length; k++)
        assertEquals("bino("+n+" , "+k+")",liste[k], Rekursion1.bino(n, k));
    }
  
  @Test
  public void heron()
  {
    Rekursion Rekursion1 = new Rekursion();
    assertEquals(4.0, Rekursion1.heron(16), 1e-6);
    assertEquals(1.4142, Rekursion1.heron(2), 1e-3);
    assertEquals(0.7071, Rekursion1.heron(0.5), 1e-4);    
  }
  
  
   @Test
    public void palindrom()
    
     {
         Rekursion Rekursion1 = new Rekursion();
         assertEquals(true, Rekursion1.palindrom("abba"));
         assertEquals(false, Rekursion1.palindrom("lala"));
         assertEquals(true,  Rekursion1.palindrom("abcba"));
         assertEquals(true,  Rekursion1.palindrom("tacocat"));
         assertEquals(true,  Rekursion1.palindrom("reliefpfeiler"));
         assertEquals(true,  Rekursion1.palindrom("lagertonnennotregal"));
     }
     
     @Test
    public void nameGedreht()
    
     {
         Rekursion Rekursion1 = new Rekursion();
         assertEquals("hallo", Rekursion1.nameGedreht("ollah"));
         assertEquals("tacocaT", Rekursion1.nameGedreht("Tacocat"));
         assertEquals("g",  Rekursion1.nameGedreht("g"));
         assertEquals("",  Rekursion1.nameGedreht(""));
         assertEquals("Otternasen", Rekursion1.nameGedreht(Rekursion1.nameGedreht("Otternasen")));
     }
}


