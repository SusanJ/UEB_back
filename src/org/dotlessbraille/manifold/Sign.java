package org.dotlessbraille.manifold;
/**Generic object representing both print-to-braille and
  braille-to-print for a braille symbol.
*/
public abstract class Sign{

 public String aBrl;
 public String ink;
 public String inkTC;
 public String inkUC;
 public String dbCode;

 public String getBrl(){ return aBrl; }
 public String getInk(){ return ink; }
 public String getInkTC(){ return inkTC; }
 public String getInkUC(){ return inkUC; }
}//End Class.