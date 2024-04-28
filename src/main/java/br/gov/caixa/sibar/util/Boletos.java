/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.caixa.sibar.util;

import java.security.MessageDigest;
import java.util.Base64;

/**
 * @author martins.santos
 */
public class Boletos {

    private static String CODIGO_DO_BENEFICIARIO = "0729042";
    private static String NOSSO_NUMERO = "14208000000013368";
    //private static String DATA_DE_VENCIMENTO = "00000000";
    private static String DATA_DE_VENCIMENTO = "10102019";
    private static String VALOR = "000000000000000";
    //   private static String VALOR= "000000000001500";
    private static String CPF_OU_CNPJ_DO_BENEFICIARIO = "12884672000439";

    public static String DO_HASHB64(String DADOS) {
        MessageDigest MD;
        byte[] HASH;
        try {
            MD = MessageDigest.getInstance("SHA-256");
            HASH = MD.digest(DADOS.getBytes("ISO8859-1"));

            return Base64.getEncoder().encodeToString(HASH);
        } catch (Exception EX) {
            return null;
        }
    }


    public static void main(String arg[]) {
        //0200400 14000000000012345 00000000000000000000000 00123456789124
        //0729041 14303000000025193 05102016 000000000001500 03783850000100
        //0729041 14303000000025193 20181213 000000000001500 03783850000100
        //0200400 00000000000000000 05102016 000000000150050 00123456789124
        //0729041143030000000251931312201800000000000150003783850000100
        //0729041143030000000252631712201800000000000150003783850000100 - funcionou
        String hash = CODIGO_DO_BENEFICIARIO + NOSSO_NUMERO + DATA_DE_VENCIMENTO + VALOR + CPF_OU_CNPJ_DO_BENEFICIARIO;
        // String hash = "0729041143030000000252631712201800000000000150003783850000100";
        System.out.println(DO_HASHB64(hash));

    }


}
