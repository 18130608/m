package plata;
import junit.framework.TestCase;
public class j2Test extends TestCase {
	public void test() throws Exception {
		try{
			plata pl = new plata();
			pl.arrTf[3].setText("7.38");//gas
            pl.arrTf[4].setText("4");//kolichestvo projivayuchih
            pl.arrTf[5].setText("270");//v potrachennogo gasa
            pl.arrTf[9].setText("10");//kommunalnye uslugy
            pl.arrTf[10].setText("0");//dolg
            pl.arrTf[11].setText("497");//pereplata
            pl.arrTf[12].setText("16849");//Cena na cold water
            pl.arrTf[13].setText("12220.95");//Cena na hot water
            pl.arrTf[15].setText("3652.11");//Cena na svet
            pl.kvartira();
            assertEquals("1992,60", pl.arrTf[14].getText());//Cena na gas
        	assertEquals("40,00", pl.arrTf[16].getText());//Cena na kommunalnye uslugy
        	assertEquals("34257,66", pl.arrTf[17].getText());//summa
        	assertEquals(" ", pl.arrTf[0].getText());//cold water
        	assertEquals(" ", pl.arrTf[1].getText());//hot water
        	assertEquals(" ", pl.arrTf[2].getText());//svet
        	assertEquals(" ", pl.arrTf[6].getText());//v potrachennogo hot water
        	assertEquals(" ", pl.arrTf[7].getText());//v potrachennogo cold water
        	assertEquals(" ", pl.arrTf[8].getText());//v potrachennogo svet
        		}catch(Exception e){
		fail("��������� ������������ ������� ��������");
		}}
}
