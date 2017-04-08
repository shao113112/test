package main.java.core;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;

public class init {

	public static void main(String[] args){
	    // 鍙傛暟渚濇涓� AppId銆丄ppKey銆丮asterKey
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
