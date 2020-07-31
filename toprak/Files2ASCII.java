import java.io.*;
import java.util.Locale;

public class Files2ASCII {
    public static char convert(char c) {
        if (c==' ' || c=='.') return c;
        if (c>='a' && c<='z') return c;
        switch(c) {
          case 'ð': return 'g';
          case 'ç': return 'c';
          case 'þ': return 's';
          case 'ý': return 'i';
          case 'ö': return 'o';
          case 'ü': return 'u';
          default: return '#';
        }
    }
    public static void process(File f) {
        char[] ca = f.getName().toLowerCase().toCharArray();
        String sa = "";
        for (int i=0; i<ca.length; i++) {
            char c = convert(ca[i]);
            if (c != '#') sa += c;
        }
        String[] a = sa.split(" |\\.");
        String m = a[0];
        String n = a[1];
        String x = a[a.length-1];
        String s = m+'-'+n+'.'+x;  //hyphen
        File g = new File(f.getParent(), s);
        System.out.println(s+' '+f.renameTo(g));
    }
    public static void iterate(File f) {
        int n = 0;
        File[] a = f.listFiles(); 
        for (int i=0; i<a.length; i++) if (a[i].isFile()) {
            process(a[i]); n++;
        }
        System.out.println(n+" files renamed");
    }
    public static void main(String[] args) {
        iterate(new File("toprak","jpg"));
    }
}
