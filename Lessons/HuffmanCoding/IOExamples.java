import huffman_toolkit.*;

/*
 * src = sorgente
 * dst = destinazione
 *
 * copyFile(primofile.java, secondofile.txt)
 *
 */

public class IOExamples {

  public static int copyFile(String src, String dst) {
  
    InputTextFile in = new InputTextFile( src );
    OutputTextFile out = new OutputTextFile( dst );
    int count = 0;
    
    while ( in.bitsAvailable() ) {
      
    //  String line = in.readTextLine();   leggo il numero di linee
    //  out.writeTextLine( line );
      
    //  char c = in.readChar();   leggo il numero di caratteri
    //  out.writeChar( c );
      
     // int bit = in.readBit();   leggo il numero di bit
     // out.writeBit( bit );
      
      String bits = in.readCode(7); //leggo 7 bit alla volta
      out.writeCode (bits);
      
     count = count + 1;
      
      
    }
    
    in.close();
    out.close();
    
    return count;
    
  }

} // class IOExamples





