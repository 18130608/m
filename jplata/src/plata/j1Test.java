package plata;

import junit.framework.TestCase;
public class j1Test extends TestCase {
public void test() throws Exception {
		try{
			plata sc = new plata();
		    sc.arrTf[0].setText("40.6");//cold water
            sc.arrTf[1].setText("39.55");//hot water
            sc.arrTf[2].setText("10.23");//svet
            sc.arrTf[6].setText("309");//v potrachennogo hot water
            sc.arrTf[7].setText("415");//v potrachennogo cold water
            sc.arrTf[8].setText("357");//v potrachennogo svet
            sc.kvartira();
        	assertEquals("16849,00", sc.arrTf[12].getText());//Cena na cold water
        	assertEquals("12220,95", sc.arrTf[13].getText());//Cena na hot water
        	assertEquals("3652,11", sc.arrTf[15].getText());//Cena na svet
        	assertEquals(" ", sc.arrTf[14].getText());//Cena na gas
        	assertEquals(" ", sc.arrTf[16].getText());//Cena na kommunalnye uslug    	
	}catch(Exception e){
		fail("Проверьте правильность входных занчений");
		}}}
