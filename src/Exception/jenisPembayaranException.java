/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author David Wisnu
 */
public class jenisPembayaranException extends Exception{
    public String message(){
        return "Jenis Pembayaran harus dipilih (Cash / Kredit)!";
    }
}
