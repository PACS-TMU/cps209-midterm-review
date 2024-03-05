//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class LetterTest {
//    @Test
//    public void testLetter1() {
//        Letter letter = new Letter("001");
//        letter.setSender("William");
//        letter.setReceiver("TMU Students");
//        letter.setSubject("CPS209 Review");
//        letter.setBody("I am writing to inform you that the CPS209 review session will be held on Tuesday, March 5th, 2024 at 6:00pm in ENG-LG06.");
//        letter.setFooter("PACS_TMU");
//
//        assertEquals("001", letter.getId());
//        assertEquals("William", letter.getSender());
//        assertEquals("TMU Students", letter.getReceiver());
//        assertEquals("CPS209 Review", letter.getSubject());
//        assertEquals("Dear TMU Students\n\nI am writing to inform you that the CPS209 review session will be held on Tuesday, March 5th, 2024 at 6:00pm in ENG-LG06.\n\nSincerely,\nWilliam", letter.getBody());
//        assertEquals("PACS_TMU", letter.getFooter());
//    }
//
//    @Test
//    public void testLetter2() {
//        Letter letter = new Letter("002");
//        letter.setSender("John");
//        letter.setReceiver("TMU Faculty");
//        letter.setSubject("Faculty Meeting");
//        letter.setBody("The next faculty meeting will be held on Monday, March 10th, 2024 at 10:00am in ENG-LG06.");
//        letter.setFooter("TMU_Faculty");
//
//        assertEquals("002", letter.getId());
//        assertEquals("John", letter.getSender());
//        assertEquals("TMU Faculty", letter.getReceiver());
//        assertEquals("Faculty Meeting", letter.getSubject());
//        assertEquals("Dear TMU Faculty\n\nThe next faculty meeting will be held on Monday, March 10th, 2024 at 10:00am in ENG-LG06.\n\nSincerely,\nJohn", letter.getBody());
//        assertEquals("TMU_Faculty", letter.getFooter());
//    }
//}