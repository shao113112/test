package core;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;

public class init {

	public static void main(String[] args){
	    // 参数依次为 AppId、AppKey、MasterKey
	    AVOSCloud.initialize("MpolwUmhscbRl3reTw6wfUuo-gzGzoHsz","UUNctBoWK9rt29NYJ0PnB9qV","2VOVpbIK7R2J1vXupD53gaqQ");
	
	    AVObject testObject = new AVObject("TestObject");
	     testObject.put("words","Hello World!");
	     try {
			testObject.save();
		} catch (AVException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
