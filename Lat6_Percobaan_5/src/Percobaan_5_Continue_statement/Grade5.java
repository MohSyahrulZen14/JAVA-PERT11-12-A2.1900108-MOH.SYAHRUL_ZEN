/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan_5_Continue_statement;

/**
 *
 * @author  NIM   : A2.1900108
 *          NAMA  : MOH.SYAHRUL ZEN
 *          KELAS : TI-1A
 *          Deskripsi Program :  Percobaan_5_Continue_statement
 */
public class Grade5 {
    
    public static void main( String[] args )
{
String names[] = {"Beah", "Bianca", "Lance", "Beah"};
int count = 0;
for( int i=0; i<names.length; i++ ){
if( !names[i].equals("Beah") ){
continue; //skip next statement
}
count++;
}
System.out.println("There are " + count + " Beahs in the list");
}
}
