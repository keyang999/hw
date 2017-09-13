import tsd.jason.services.UserInfoDelegate;
import tsd.jason.services.UserInfoService;


public class WsdlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          UserInfoService UsWs=new UserInfoService();
          UserInfoDelegate UsDel=UsWs.getUserInfoPort();
          System.out.println(UsDel.getUserInfo());
        	  
	}

}
