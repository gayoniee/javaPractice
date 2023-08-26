package testProject;
import java.util.*;

public class Test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

		final String myid = "myId";
		final String mypw = "myPassword12";
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
//		if(id.equals(myid) && pw.equals(mypw)) {
//				System.out.print("비밀번호가 틀렸습니다");
//		  }else {
//			if(!id.equals(myid))
//				System.out.print("아이디가 틀렸습니다");
//			 else if(!pw.equals(mypw)){
//			System.out.print("비밀번호가 틀렸습니다");
//			 }
//		  }
			
		
		switch(id) {
		    case "myId": {
		    	switch(pw) {
		    	    case "myPassword12":{
		    		System.out.print("로그인 성공");
		    	}break;
		    	default:{
		    		System.out.print("비밀번호가 틀렸습니다");
		    	}
		    	}
		    }break;
		    default:{
		    	System.out.print("아이디가 틀렸습니다");
		    }
		    	
		}
	}
}
