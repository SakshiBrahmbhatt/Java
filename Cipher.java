class Cipher 
{
   String plainText;
   int key;
   int i;
   Cipher(String plainText,int key)
   {
       this.plainText=plainText;
       this.key=key;
   } 
   String Encryption()
   {
       char c[]=plainText.toCharArray();
       for(i=0;i<c.length;i++)
       c[i]=(char)(c[i]+key);
       for(i=0;i<c.length;i++)
       System.out.print(c[i]);
       System.out.println();
       return "/0";
   }
   String Decryption()
   {
       char c[]=plainText.toCharArray();
       for(i=0;i<c.length;i++)
       c[i]=(char)(c[i]+key);
       char a[]=plainText.toCharArray();
       for(i=0;i<a.length;i++)
       a[i]=(char)(c[i]-key);
       for(i=0;i<a.length;i++)
       System.out.print(a[i]);
       return "/0";
   }
   public static void main(String args[])
   {
       Cipher c=new Cipher("MBIT",3);
       c.Encryption();
       c.Decryption();
   }
}